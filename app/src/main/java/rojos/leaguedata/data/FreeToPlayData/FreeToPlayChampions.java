package rojos.leaguedata.data.FreeToPlayData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/19/2017.
 */

public class FreeToPlayChampions {

    @SerializedName("champions")
    List<FreeToPlayDto> champions;

    public FreeToPlayChampions() {}

    public FreeToPlayChampions(List<FreeToPlayDto> champions) {
        this.champions = champions;
    }

    public List<FreeToPlayDto> getChampions() {
        return champions;
    }

    public void setChampions(List<FreeToPlayDto> champions) {
        this.champions = champions;
    }
}
