package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class BlockDto {

    @SerializedName("items")
    List<BlockItemDto> items;
    @SerializedName("recMath")
    boolean recMath;
    @SerializedName("type")
    String type;

    public BlockDto() {
    }

    public BlockDto(List<BlockItemDto> items, boolean recMath, String type) {
        this.items = items;
        this.recMath = recMath;
        this.type = type;
    }

    public List<BlockItemDto> getItems() {
        return items;
    }

    public void setItems(List<BlockItemDto> items) {
        this.items = items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public void setRecMath(boolean recMath) {
        this.recMath = recMath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
