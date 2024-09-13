package com.example.testnewactivity2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NewActivity extends AppCompatActivity{

    private OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);

        // Khai báo Button từ layout
        Button postButton = findViewById(R.id.postButton);

        // Gắn sự kiện click cho Button
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOpenMain = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intentOpenMain);

//                callApiPost();
            }
        });
    }


    // API
    private void callApiPost() {
        Log.d("CheckCallApi", "Api login");
        // request body
        RequestBody requestBody = new FormBody.Builder()
                .add("client_id", "education_client")
                .add("grant_type", "password")
                .add("username", "2051063702")
                .add("password", "56obama02")
                .add("client_secret", "password")
                .build();

        // Init request
        Request request = new Request.Builder()
                .url("https://sinhvien1.tlu.edu.vn/education/oauth/token")
                .post(requestBody)
                .build();

        // send request
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String responseData = response.body().string();

                    Gson gson = new Gson();
                    ResponseLoginDTO apiResponse = gson.fromJson(responseData, ResponseLoginDTO.class);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Log.d("CheckCallApi", "Access Token: " + apiResponse.getAccessToken());
                            Log.d("CheckCallApi", "Token Type: " + apiResponse.getTokenType());
                            Log.d("CheckCallApi", "Expires In: " + apiResponse.getExpiresIn());

                            TextView resultView = findViewById(R.id.resultView);
                            resultView.setText("Access Token: " + apiResponse.getAccessToken() +
                                    "\nToken Type: " + apiResponse.getTokenType() +
                                    "\nExpires In: " + apiResponse.getExpiresIn());
                        }
                    });
                } else {
                    Log.d("CheckCallApi", "Lỗi: " + response.code());
                }
            }
        });
    }

}
