package rojos.leaguedata.presenters;

import java.util.ArrayList;
import java.util.List;

import rojos.leaguedata.data.ChampionData.ChampionDto;
import rojos.leaguedata.data.LolStatus.LOLStatusDto;
import rojos.leaguedata.data.LolStatus.ServiceDto;
import rojos.leaguedata.datamodels.ChampionDataModel;

/**
 * Created by Rodrigo on 5/24/2017.
 */

public class LeagueContract {

    public interface View {
        void showFreeToPlayChampions(ArrayList<ChampionDataModel> championDataModelArrayList);
        void showServerStatus(LOLStatusDto lolStatusDto);
        void showInactiveChampions(List<ChampionDataModel> championDataModelList);
    }

    public interface Actions {
        void loadChampions(String url);
        void loadChampionClicked(long id);
        void loadServerStatus(String url);
    }

    public interface Repository {

    }

    public interface ChampionView {
        void showChampionData(ChampionDto championDto);
        void showNoChampionDataAvailable();
    }
}
