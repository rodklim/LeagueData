package rojos.leaguedata.data.ChampionData;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Rodrigo on 5/18/2017.
 */

public class PassiveDto implements Serializable{

    @SerializedName("image")
    ImageDto image;
    @SerializedName("sanitizedDescription")
    String sanitizedDescription;
    @SerializedName("name")
    String name;
    @SerializedName("description")
    String description;

    public PassiveDto() {
    }

    public PassiveDto(ImageDto image, String sanitizedDescription, String name, String description) {
        this.image = image;
        this.sanitizedDescription = sanitizedDescription;
        this.name = name;
        this.description = description;
    }

    public ImageDto getImageDto() {
        return image;
    }

    public void setImageDto(ImageDto imageDto) {
        this.image = imageDto;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
