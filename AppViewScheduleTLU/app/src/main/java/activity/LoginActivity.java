package activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appviewscheduletlu.R;

import data.network.ApiClient;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private ApiClient apiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login_button);

        apiClient = new ApiClient();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        RequestBody requestBody = new FormBody.Builder()
                .add("client_id", "education_client")
                .add("grant_type", "password")
                .add("username", username)
                .add("password", password)
                .add("client_secret", "password")
                .build();

        apiClient.post("/education/oauth/token", requestBody, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(() -> Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    // Parse the response data
                    runOnUiThread(() -> {
                        // Save information and navigate to MainActivity
                        saveLoginInfo(responseData);
                        navigateToMainActivity();
                    });
                } else {
                    runOnUiThread(() -> Toast.makeText(LoginActivity.this, "Dang nhap that bai", Toast.LENGTH_SHORT).show());
                }
            }
        });
    }

    private void saveLoginInfo(String responseData) {
        // Parse responseData and save tokens or user info in SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        // Example: Save the response data or extract and save specific info
        editor.putString("user_info", responseData);
        editor.apply();
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Close the LoginActivity
    }
}
