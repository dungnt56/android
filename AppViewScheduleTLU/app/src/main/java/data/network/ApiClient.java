package data.network;

import com.example.appviewscheduletlu.R;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import utils.ContextApplication;

import java.io.IOException;
import java.util.Map;

public class ApiClient {
    private OkHttpClient client = new OkHttpClient();

    private static final String BASE_URL;

    static {
        // Initialize BASE_URL from strings.xml
        BASE_URL = ContextApplication.getAppContext().getResources().getString(R.string.base_url);
    }
    // Phương thức gọi API GET
    public void get(String url, Callback callback) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(callback);
    }

    // Phương thức gọi API POST
    public void post(String endpoint, RequestBody requestBody, Callback callback) {
        Request request = new Request.Builder()
                .url(BASE_URL + endpoint)
                .post(requestBody)
                .build();

        client.newCall(request).enqueue(callback);
    }

    // Phương thức gọi API với headers
    public void postWithHeaders(String url, RequestBody requestBody, Map<String, String> headers, Callback callback) {
        Request.Builder builder = new Request.Builder().url(url).post(requestBody);

        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }

        Request request = builder.build();
        client.newCall(request).enqueue(callback);
    }
}
