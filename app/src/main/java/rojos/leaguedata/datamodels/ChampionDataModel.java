package rojos.leaguedata.datamodels;

import java.util.List;

import rojos.leaguedata.data.ChampionData.ChampionSpellDto;
import rojos.leaguedata.data.ChampionData.ImageDto;
import rojos.leaguedata.data.ChampionData.InfoDto;
import rojos.leaguedata.data.ChampionData.PassiveDto;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class ChampionDataModel {

    boolean rankedPlayEnabled;
    boolean active;
    boolean freeToPlay;
    long id;
    String name;
    String title;
    ImageDto imageDto;
    PassiveDto passiveDto;
    List<ChampionSpellDto> championSpellDtos;
    InfoDto infoDto;
    String blurb;
    List<String> enemyTips;
    List<String> allytips;

    public ChampionDataModel() {
    }

    public ChampionDataModel(boolean rankedPlayEnabled, boolean active, boolean freeToPlay,
                             long id, String name, String title, ImageDto imageDto,
                             PassiveDto passiveDto, List<ChampionSpellDto> championSpellDtos,
                             InfoDto infoDto, String blurb,List<String> enemyTips, List<String> allytips) {
        this.rankedPlayEnabled = rankedPlayEnabled;
        this.active = active;
        this.freeToPlay = freeToPlay;
        this.id = id;
        this.name = name;
        this.title = title;
        this.imageDto = imageDto;
        this.passiveDto = passiveDto;
        this.championSpellDtos = championSpellDtos;
        this.infoDto = infoDto;
        this.blurb = blurb;
        this.enemyTips = enemyTips;
        this.allytips = allytips;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
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

    public ImageDto getImageDto() {
        return imageDto;
    }

    public void setImageDto(ImageDto imageDto) {
        this.imageDto = imageDto;
    }

    public PassiveDto getPassiveDto() {
        return passiveDto;
    }

    public void setPassiveDto(PassiveDto passiveDto) {
        this.passiveDto = passiveDto;
    }

    public List<ChampionSpellDto> getChampionSpellDtos() {
        return championSpellDtos;
    }

    public void setChampionSpellDtos(List<ChampionSpellDto> championSpellDtos) {
        this.championSpellDtos = championSpellDtos;
    }

    public InfoDto getInfoDto() {
        return infoDto;
    }

    public void setInfoDto(InfoDto infoDto) {
        this.infoDto = infoDto;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<String> getEnemyTips() {
        return enemyTips;
    }

    public void setEnemyTips(List<String> enemyTips) {
        this.enemyTips = enemyTips;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }
}
