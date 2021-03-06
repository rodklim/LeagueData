package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class SpellVarsDto {

    @SerializedName("ranksWith")
    String ranksWith;
    @SerializedName("dyn")
    String dyn;
    @SerializedName("link")
    String link;
    @SerializedName("coeff")
    List<Double> coeff;
    @SerializedName("key")
    String key;

    public SpellVarsDto() {
    }

    public SpellVarsDto(String ranksWith, String dyn, String link, List<Double> coeff, String key) {
        this.ranksWith = ranksWith;
        this.dyn = dyn;
        this.link = link;
        this.coeff = coeff;
        this.key = key;
    }

    public String getRanksWith() {
        return ranksWith;
    }

    public void setRanksWith(String ranksWith) {
        this.ranksWith = ranksWith;
    }

    public String getDyn() {
        return dyn;
    }

    public void setDyn(String dyn) {
        this.dyn = dyn;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Double> getCoeff() {
        return coeff;
    }

    public void setCoeff(List<Double> coeff) {
        this.coeff = coeff;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
