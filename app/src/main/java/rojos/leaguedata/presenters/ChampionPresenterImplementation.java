package rojos.leaguedata.presenters;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rojos.leaguedata.retrofit.EndpointsURL;
import rojos.leaguedata.retrofit.LeagueRequestAPI;
import rojos.leaguedata.retrofit.ServerURL;
import rojos.leaguedata.data.BasicChampData;
import rojos.leaguedata.data.ChampionData.ChampionDto;
import rojos.leaguedata.data.FreeToPlayData.FreeToPlayChampions;
import rojos.leaguedata.data.LeagueData;
import rojos.leaguedata.data.LolStatus.LOLStatusDto;
import rojos.leaguedata.datamodels.ChampionDataModel;
import rojos.leaguedata.utils.StringUtils;

/**
 * Created by Rodrigo on 5/23/2017.
 */

public class ChampionPresenterImplementation implements LeagueContract.Actions {

    private LeagueContract.View leagueView;
    private LeagueContract.ChampionView championView;
    private HashMap<String, BasicChampData> responseMap = new HashMap<>();
    private static HashMap<String, ChampionDataModel> championMap = new HashMap<>();
    private LeagueRequestAPI leagueRequestAPI = LeagueRequestAPI.retrofit.create(LeagueRequestAPI.class);

    public ChampionPresenterImplementation(LeagueContract.View leagueView) {
        this.leagueView = leagueView;
    }

    public ChampionPresenterImplementation(LeagueContract.ChampionView championView) {
        this.championView = championView;
    }

    @Override
    public void loadChampions(String url) {
        Call<LeagueData> call = leagueRequestAPI.getChampions(StringUtils.buildUrl(url, EndpointsURL.STATIC_DATA));
        call.enqueue(new Callback<LeagueData>() {
            @Override
            public void onResponse(Call<LeagueData> call, Response<LeagueData> response) {
                Log.d("wooo", response.message());
                convertResponseToMap(response.body().getData());
                loadFreeToPlayAndInactiveChampions();
            }

            @Override
            public void onFailure(Call<LeagueData> call, Throwable t) {
                Log.d("rlim", t.getMessage());
            }
        });
    }

    @Override
    public void loadChampionClicked(long id) {
        String endpoint = EndpointsURL.CHAMPION_INFO.replace("{championID}", String.valueOf(id));
        Call<ChampionDto> call = leagueRequestAPI.getChampInfo(StringUtils.buildUrl(ServerURL.baseUrl,endpoint));
        call.enqueue(new Callback<ChampionDto>() {
            @Override
            public void onResponse(Call<ChampionDto> call, Response<ChampionDto> response) {
                processChampionInfo(response);
            }

            @Override
            public void onFailure(Call<ChampionDto> call, Throwable t) {
                Log.d("rlim", "loss");
                championView.showNoChampionDataAvailable();
            }
        });
    }

    @Override
    public void loadServerStatus(String url) {
        Call<LOLStatusDto> call = leagueRequestAPI.getServerStatus(StringUtils.buildUrl(url,EndpointsURL.SHARD_STATUS));
        call.enqueue(new Callback<LOLStatusDto>() {
            @Override
            public void onResponse(Call<LOLStatusDto> call, Response<LOLStatusDto> response) {
                processServerStatus(response.body());
            }

            @Override
            public void onFailure(Call<LOLStatusDto> call, Throwable t) {
                Log.d("rlim", t.getMessage());
            }
        });

    }

    public void loadFreeToPlayAndInactiveChampions() {
        Call<FreeToPlayChampions> call = leagueRequestAPI.getFreeToPlay();
        call.enqueue(new Callback<FreeToPlayChampions>() {
            @Override
            public void onResponse(Call<FreeToPlayChampions> call, Response<FreeToPlayChampions> response) {
                for(int i = 0; i < response.body().getChampions().size(); i++) {
                    championMap.get(String.valueOf(response.body().getChampions().get(i).getId())).setActive(response.body().getChampions().get(i).isActive());
                    championMap.get(String.valueOf(response.body().getChampions().get(i).getId())).setFreeToPlay(response.body().getChampions().get(i).isFreeToPlay());
                }
                processFreeToPlayChampions(convertChampionMapToList(championMap));
                processInactiveChampions(convertChampionMapToList(championMap));
            }

            @Override
            public void onFailure(Call<FreeToPlayChampions> call, Throwable t) {
                Log.d("rlim", t.getMessage());
            }
        });
    }

    private HashMap<String, ChampionDataModel> convertResponseToMap(Map<String,BasicChampData> champDataHashMap) {
        responseMap.putAll(champDataHashMap);
        for(Map.Entry<String, BasicChampData> map : responseMap.entrySet()) {
            ChampionDataModel championDataModel = new ChampionDataModel();
            championDataModel.setName(map.getValue().getName());
            championDataModel.setId(map.getValue().getId());
            championDataModel.setTitle(map.getValue().getTitle());
            championDataModel.setImageDto(map.getValue().getImageDto());
            championMap.put(String.valueOf(championDataModel.getId()), championDataModel);
        }
        return championMap;
    }

    private ArrayList<ChampionDataModel> convertChampionMapToList(HashMap<String, ChampionDataModel> championMap) {
       return new ArrayList<ChampionDataModel>(championMap.values());
    }

    private void processChampionInfo(Response<ChampionDto> response) {
        replaceBRWithNewLine(response.body());
        championView.showChampionData(response.body());

    }

    private void replaceBRWithNewLine(ChampionDto championDto) {
        String lore = championDto.getLore().replace("<br>","\n");
        championDto.setLore(lore);
        String spellsDescription = "";

        if(championDto.getPassive().getSanitizedDescription().contains("<br>")) {
            championDto.getPassive().setSanitizedDescription(championDto.getPassive().getSanitizedDescription().replace("<br>", "\n"));
        }
        for(int i = 0; i < championDto.getSpells().size(); i++) {
            if(championDto.getSpells().get(i).getSanitizedDescription().contains("<br>")) {
                spellsDescription = championDto.getSpells().get(i).getSanitizedDescription().replace("<br>", "\n");
                championDto.getSpells().get(i).setSanitizedDescription(spellsDescription);
            }
        }
        for(int i = 0; i < championDto.getAllytips().size(); i ++) {
            if(championDto.getAllytips().get(i).contains("<br>")) {
                championDto.getAllytips().get(i).replace("<br>", "\n");
            }
        }
        for(int i = 0; i < championDto.getEnemyTips().size(); i ++) {
            if(championDto.getEnemyTips().get(i).contains("<br>")) {
                championDto.getAllytips().get(i).replace("<br>", "\n");
            }
        }
    }

    private void processServerStatus(LOLStatusDto shardStatus) {
        leagueView.showServerStatus(shardStatus);
    }

    private void processInactiveChampions(ArrayList<ChampionDataModel> championDataModelArrayList) {
        ArrayList<ChampionDataModel> inactiveChampions = new ArrayList<ChampionDataModel>();
        for(int i = 0; i < championDataModelArrayList.size(); i++) {
            if(!championDataModelArrayList.get(i).isActive()) {
                inactiveChampions.add(championDataModelArrayList.get(i));
            }
        }
        leagueView.showInactiveChampions(inactiveChampions);
    }

    private void processFreeToPlayChampions(ArrayList<ChampionDataModel> championDataModelArrayList) {
        ArrayList<ChampionDataModel> ftpArrayList = new ArrayList<ChampionDataModel>();
        for(int i = 0; i < championDataModelArrayList.size(); i++) {
            if(championDataModelArrayList.get(i).isFreeToPlay()) {
                ftpArrayList.add(championDataModelArrayList.get(i));
            }
        }
        leagueView.showFreeToPlayChampions(ftpArrayList);
    }
}
