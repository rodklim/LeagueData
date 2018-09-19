package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class InfoDto implements Serializable{
    @SerializedName("difficulty")
    int difficulty;
    @SerializedName("attack")
    int attack;
    @SerializedName("defense")
    int defense;
    @SerializedName("magic")
    int magic;

    public InfoDto() {
    }

    public InfoDto(int difficulty, int attack, int defense, int magic) {
        this.difficulty = difficulty;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
