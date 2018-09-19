package rojos.leaguedata.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.UUID;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;
import rojos.leaguedata.data.ChampionData.ChampionDto;
import rojos.leaguedata.data.FreeToPlayData.FreeToPlayChampions;
import rojos.leaguedata.data.LeagueData;
import rojos.leaguedata.data.LolStatus.LOLStatusDto;

/**
 * Created by Rodrigo on 5/17/2017.
 */

public interface LeagueRequestAPI {

    int cacheSize = 10 * 1024 * 1024; // 10 MB
    File cacheDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
    Cache cache = null;

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .cache(cache)
            .build();

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    @GET(EndpointsURL.STATIC_DATA)
    Call<LeagueData> getChampions();

    @GET(EndpointsURL.FREE_TO_PLAY)
    Call<FreeToPlayChampions> getFreeToPlay();

    @GET(EndpointsURL.CHAMPION_INFO)
    Call<ChampionDto> getChampInfo(@Path("championID") long id);

    @GET(EndpointsURL.SHARD_STATUS)
    Call<LOLStatusDto> getServerStatus();

    @GET
    Call<LOLStatusDto> getServerStatus(@Url String url);

    @GET
    Call<LeagueData> getChampions(@Url String url);

    @GET
    Call<ChampionDto> getChampInfo(@Url String url);


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ServerURL.baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();
}


