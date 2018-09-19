package rojos.leaguedata.data;

import com.google.gson.annotations.SerializedName;

import rojos.leaguedata.data.ChampionData.ImageDto;

/**
 * Created by Rodrigo on 5/17/2017.
 */

public class BasicChampData {

    @SerializedName("title")
    public String title;
    @SerializedName("key")
    public String key;
    @SerializedName("name")
    public String name;
    @SerializedName("id")
    public int id;
    @SerializedName("image")
    public ImageDto imageDto;

    public BasicChampData() {
    }

    public BasicChampData(String title, String key, String name, int id, ImageDto imageDto) {
        this.title = title;
        this.key = key;
        this.name = name;
        this.id = id;
        this.imageDto = imageDto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public ImageDto getImageDto() {
        return imageDto;
    }

    public void setImageDto(ImageDto imageDto) {
        this.imageDto = imageDto;
    }
}
