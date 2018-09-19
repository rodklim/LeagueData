package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class ChampionSpellDto implements Serializable{

    @SerializedName("cooldownBurn")
    String cooldownBurn;
    @SerializedName("resource")
    String resource;
    @SerializedName("levelTip")
    LevelTipDto levelTip;
    @SerializedName("vars")
    List<SpellVarsDto> vars;
    @SerializedName("costType")
    String costType;
    @SerializedName("image")
    ImageDto image;
    @SerializedName("sanitizedDescription")
    String sanitizedDescription;
    @SerializedName("sanitizedToolTip")
    String sanitizedToolTip;
    @SerializedName("effect")
    List<List<Double>> effect;
    @SerializedName("tooltip")
    String tooltip;
    @SerializedName("maxrank")
    int maxrank;
    @SerializedName("costBurn")
    String costBurn;
    @SerializedName("rangeBurn")
    String rangeBurn;
    @SerializedName("range")
    Object range;
    @SerializedName("cooldown")
    List<Double> cooldown;
    @SerializedName("cost")
    List<Integer> cost;
    @SerializedName("key")
    String key;
    @SerializedName("description")
    String description;
    @SerializedName("effectBurn")
    List<String> effectBurn;
    @SerializedName("altimages")
    List<ImageDto> altimages;
    @SerializedName("name")
    String name;


    public ChampionSpellDto() {
    }

    public ChampionSpellDto(String cooldownBurn, String resource, LevelTipDto levelTip, List<SpellVarsDto> vars,
                            String costType, ImageDto image, String sanitizedDescription, String sanitizedToolTip,
                            List<List<Double>> effect, String tooltip, int maxrank, String costBurn, String rangeBurn,
                            Object range, List<Double> cooldown, List<Integer> cost, String key, String description,
                            List<String> effectBurn, List<ImageDto> altimages, String name) {
        this.cooldownBurn = cooldownBurn;
        this.resource = resource;
        this.levelTip = levelTip;
        this.vars = vars;
        this.costType = costType;
        this.image = image;
        this.sanitizedDescription = sanitizedDescription;
        this.sanitizedToolTip = sanitizedToolTip;
        this.effect = effect;
        this.tooltip = tooltip;
        this.maxrank = maxrank;
        this.costBurn = costBurn;
        this.rangeBurn = rangeBurn;
        this.range = range;
        this.cooldown = cooldown;
        this.cost = cost;
        this.key = key;
        this.description = description;
        this.effectBurn = effectBurn;
        this.altimages = altimages;
        this.name = name;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public LevelTipDto getLevelTip() {
        return levelTip;
    }

    public void setLevelTip(LevelTipDto levelTip) {
        this.levelTip = levelTip;
    }

    public List<SpellVarsDto> getVars() {
        return vars;
    }

    public void setVars(List<SpellVarsDto> vars) {
        this.vars = vars;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getSanitizedToolTip() {
        return sanitizedToolTip;
    }

    public void setSanitizedToolTip(String sanitizedToolTip) {
        this.sanitizedToolTip = sanitizedToolTip;
    }

    public List<List<Double>> getEffect() {
        return effect;
    }

    public void setEffect(List<List<Double>> effect) {
        this.effect = effect;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public List<ImageDto> getAltimages() {
        return altimages;
    }

    public void setAltimages(List<ImageDto> altimages) {
        this.altimages = altimages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
