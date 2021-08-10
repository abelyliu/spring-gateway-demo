import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    static OkHttpClient client = new OkHttpClient.Builder().readTimeout(1, TimeUnit.MILLISECONDS).build();
    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            try {
                post("http://127.0.0.1:10000/test?i="+i++,
                        "  {\n" +
                                "    \"name\" : \"Jack Man\",\n" +
                                "    \"age\" : 29,\n" +
                                "    \"secretIdentity\" : \"Dan Jukes\"\n" +
                                "  }")
                ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
