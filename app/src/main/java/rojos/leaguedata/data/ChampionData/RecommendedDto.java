package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class RecommendedDto implements Serializable{

    @SerializedName("map")
    String map;
    @SerializedName("blocks")
    List<BlockDto> blocks;
    @SerializedName("champion")
    String champion;
    @SerializedName("title")
    String title;
    @SerializedName("priority")
    boolean priority;
    @SerializedName("mode")
    String mode;
    @SerializedName("type")
    String type;

    public RecommendedDto() {
    }

    public RecommendedDto(String map, List<BlockDto> blocks, String champion, String title, boolean priority, String mode, String type) {
        this.map = map;
        this.blocks = blocks;
        this.champion = champion;
        this.title = title;
        this.priority = priority;
        this.mode = mode;
        this.type = type;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public List<BlockDto> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockDto> blocks) {
        this.blocks = blocks;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
