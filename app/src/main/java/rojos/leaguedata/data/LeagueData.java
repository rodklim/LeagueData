package rojos.leaguedata.data;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by Rodrigo on 5/17/2017.
 */

public class LeagueData {

    @SerializedName("type")
    String type;
    @SerializedName("version")
    String version;
    @SerializedName("data")
    Map<String, BasicChampData> data;

    public LeagueData() {}

    public LeagueData(String type, String version, Map<String, BasicChampData> data) {
        this.type = type;
        this.version = version;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, BasicChampData> getData() {
        return data;
    }

    public void setData(Map<String, BasicChampData> data) {
        this.data = data;
    }
}
