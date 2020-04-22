import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitBuilder {
private TrelloApi trelloapi;

    public RetroFitBuilder() {
        Gson gson = new GsonBuilder().create();

        HTTPLogInterceptor interceptor = new HTTPLogInterceptor();
        interceptor.setLevel(HTTPLogInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder().client(client).addConverterFactory(GsonConverterFactory
                .create(gson)).baseUrl("https://api.trello.com").build();

        trelloapi = retrofit.create(TrelloApi.class);
    }

    public TrelloApi getTrelloapi() {
        return trelloapi;
    }
}
