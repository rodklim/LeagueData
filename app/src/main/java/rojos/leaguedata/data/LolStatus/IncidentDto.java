package rojos.leaguedata.data.LolStatus;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class IncidentDto {

    @SerializedName("active")
    boolean active;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("id")
    long id;
    @SerializedName("updates")
    List<MessageDto> updates;

    public IncidentDto() {
    }

    public IncidentDto(boolean active, String created_at, long id, List<MessageDto> updates) {
        this.active = active;
        this.created_at = created_at;
        this.id = id;
        this.updates = updates;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<MessageDto> getUpdates() {
        return updates;
    }

    public void setUpdates(List<MessageDto> updates) {
        this.updates = updates;
    }
}
