package rojos.leaguedata.data.LolStatus;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class ServiceDto {

    @SerializedName("status")
    String status;
    @SerializedName("incidents")
    List<IncidentDto> incidents;
    @SerializedName("name")
    String name;
    @SerializedName("slug")
    String slug;

    public ServiceDto() {
    }

    public ServiceDto(String status, List<IncidentDto> incidents, String name, String slug) {
        this.status = status;
        this.incidents = incidents;
        this.name = name;
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<IncidentDto> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<IncidentDto> incidents) {
        this.incidents = incidents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
