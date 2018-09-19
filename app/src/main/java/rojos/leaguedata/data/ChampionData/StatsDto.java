package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class StatsDto implements Serializable {
    @SerializedName("armorperlevel")
    double armorperlevel;
    @SerializedName("hpperlevel")
    double hpperlevel;
    @SerializedName("attackdamage")
    double attackdamage;
    @SerializedName("mpperlevel")
    double mpperlevel;
    @SerializedName("attackspeedoffset")
    double attackspeedoffset;
    @SerializedName("armor")
    double armor;
    @SerializedName("hp")
    double hp;
    @SerializedName("hpregenperlevel")
    double hpregenperlevel;
    @SerializedName("spellblock")
    double spellblock;
    @SerializedName("attackrange")
    double attackrange;
    @SerializedName("movespeed")
    double movespeed;
    @SerializedName("attackdamageperlevel")
    double attackdamageperlevel;
    @SerializedName("mpregenperlevel")
    double mpregenperlevel;
    @SerializedName("mp")
    double mp;
    @SerializedName("spellblockperlevel")
    double spellblockperlevel;
    @SerializedName("crit")
    double crit;
    @SerializedName("mpregen")
    double mpregen;
    @SerializedName("attackspeedperlevel")
    double attackspeedperlevel;
    @SerializedName("hpregen")
    double hpregen;
    @SerializedName("critperlevel")
    double critperlevel;


    public StatsDto() {
    }

    public StatsDto(double armorperlevel, double hpperlevel, double attackdamage, double mpperlevel,
                    double attackspeedoffset, double armor, double hp, double hpregenperlevel,
                    double spellblock, double attackrange, double movespeed, double attackdamageperlevel,
                    double mpregenperlevel, double mp, double spellblockperlevel, double crit,
                    double mpregen, double attackspeedperlevel, double hpregen, double critperlevel) {
        this.armorperlevel = armorperlevel;
        this.hpperlevel = hpperlevel;
        this.attackdamage = attackdamage;
        this.mpperlevel = mpperlevel;
        this.attackspeedoffset = attackspeedoffset;
        this.armor = armor;
        this.hp = hp;
        this.hpregenperlevel = hpregenperlevel;
        this.spellblock = spellblock;
        this.attackrange = attackrange;
        this.movespeed = movespeed;
        this.attackdamageperlevel = attackdamageperlevel;
        this.mpregenperlevel = mpregenperlevel;
        this.mp = mp;
        this.spellblockperlevel = spellblockperlevel;
        this.crit = crit;
        this.mpregen = mpregen;
        this.attackspeedperlevel = attackspeedperlevel;
        this.hpregen = hpregen;
        this.critperlevel = critperlevel;
    }

    public double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public double getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public double getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public double getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(double attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(double spellblock) {
        this.spellblock = spellblock;
    }

    public double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(double attackrange) {
        this.attackrange = attackrange;
    }

    public double getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(double movespeed) {
        this.movespeed = movespeed;
    }

    public double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public double getMpregen() {
        return mpregen;
    }

    public void setMpregen(double mpregen) {
        this.mpregen = mpregen;
    }

    public double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public double getHpregen() {
        return hpregen;
    }

    public void setHpregen(double hpregen) {
        this.hpregen = hpregen;
    }

    public double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(double critperlevel) {
        this.critperlevel = critperlevel;
    }
}
