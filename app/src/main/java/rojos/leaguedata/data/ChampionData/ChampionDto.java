package rojos.leaguedata.data.ChampionData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class ChampionDto implements Serializable {
    InfoDto info;
    List<String> enemytips;
    StatsDto stats;
    String name;
    String title;
    ImageDto image;
    List<String> tags;
    String partype;
    List<SkinDto> skins;
    PassiveDto passive;
    List<RecommendedDto> recommended;
    List<String> allytips;
    String key;
    String lore;
    int id;
    String blurb;
    List<ChampionSpellDto> spells;

    public ChampionDto() {}

    public ChampionDto(InfoDto info, List<String> enemyTips, StatsDto stats, String name, String title,
                       ImageDto image, List<String> tags, String partype, List<SkinDto> skins,
                       PassiveDto passive, List<RecommendedDto> recommended, List<String> allytips,
                       String key, String lore, int id, String blurb, List<ChampionSpellDto> spells) {
        this.info = info;
        this.enemytips = enemyTips;
        this.stats = stats;
        this.name = name;
        this.title = title;
        this.image = image;
        this.tags = tags;
        this.partype = partype;
        this.skins = skins;
        this.passive = passive;
        this.recommended = recommended;
        this.allytips = allytips;
        this.key = key;
        this.lore = lore;
        this.id = id;
        this.blurb = blurb;
        this.spells = spells;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    public List<String> getEnemyTips() {
        return enemytips;
    }

    public void setEnemyTips(List<String> enemyTips) {
        this.enemytips = enemyTips;
    }

    public StatsDto getStats() {
        return stats;
    }

    public void setStats(StatsDto stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public List<SkinDto> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinDto> skins) {
        this.skins = skins;
    }

    public PassiveDto getPassive() {
        return passive;
    }

    public void setPassive(PassiveDto passive) {
        this.passive = passive;
    }

    public List<RecommendedDto> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedDto> recommended) {
        this.recommended = recommended;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<ChampionSpellDto> getSpells() {
        return spells;
    }

    public void setSpells(List<ChampionSpellDto> spells) {
        this.spells = spells;
    }
}
