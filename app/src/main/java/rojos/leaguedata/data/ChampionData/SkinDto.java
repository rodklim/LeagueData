package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class SkinDto implements Serializable{

    @SerializedName("num")
    int num;
    @SerializedName("name")
    String name;
    @SerializedName("id")
    int id;

    public SkinDto() {
    }

    public SkinDto(int num, String name, int id) {
        this.num = num;
        this.name = name;
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
