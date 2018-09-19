package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class LevelTipDto {

    @SerializedName("effect")
    List<String> effect;
    @SerializedName("label")
    List<String> label;

    public LevelTipDto() {
    }

    public LevelTipDto(List<String> effect, List<String> label) {
        this.effect = effect;
        this.label = label;
    }

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public List<String> getLabel() {
        return label;
    }

    public void setLabel(List<String> label) {
        this.label = label;
    }
}
