package rojos.leaguedata.data.LolStatus;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class LOLStatusDto {

    @SerializedName("name")
    String name;
    @SerializedName("region_tag")
    String region_tag;
    @SerializedName("hostname")
    String hostname;
    @SerializedName("services")
    List<ServiceDto> services;
    @SerializedName("slug")
    String slug;
    @SerializedName("locales")
    List<String> locales;

    public LOLStatusDto() {
    }

    public LOLStatusDto(String name, String region_tag, String hostname,
                        List<ServiceDto> services, String slug, List<String> locales) {
        this.name = name;
        this.region_tag = region_tag;
        this.hostname = hostname;
        this.services = services;
        this.slug = slug;
        this.locales = locales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion_tag() {
        return region_tag;
    }

    public void setRegion_tag(String region_tag) {
        this.region_tag = region_tag;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<ServiceDto> getServices() {
        return services;
    }

    public void setServices(List<ServiceDto> services) {
        this.services = services;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }
}
