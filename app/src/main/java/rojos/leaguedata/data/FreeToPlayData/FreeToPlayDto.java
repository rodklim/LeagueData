package rojos.leaguedata.data.FreeToPlayData;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rodrigo on 5/19/2017.
 */

public class FreeToPlayDto {

    @SerializedName("rankedPlayEnabled")
    boolean rankedPlayEnabled;
    @SerializedName("botEnabled")
    boolean botEnabled;
    @SerializedName("botMmEnabled")
    boolean botMmEnabled;
    @SerializedName("active")
    boolean active;
    @SerializedName("freeToPlay")
    boolean freeToPlay;
    @SerializedName("id")
    long id;

    public FreeToPlayDto() {
    }

    public FreeToPlayDto(boolean rankedPlayEnabled, boolean botEnabled, boolean botMmEnabled, boolean active, boolean freeToPlay, long id) {
        this.rankedPlayEnabled = rankedPlayEnabled;
        this.botEnabled = botEnabled;
        this.botMmEnabled = botMmEnabled;
        this.active = active;
        this.freeToPlay = freeToPlay;
        this.id = id;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
