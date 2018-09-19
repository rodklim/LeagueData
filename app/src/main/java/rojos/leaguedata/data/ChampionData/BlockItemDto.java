package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class BlockItemDto {

    @SerializedName("count")
    int count;
    @SerializedName("id")
    int id;

    public BlockItemDto() {
    }

    public BlockItemDto(int count, int id) {
        this.count = count;
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
