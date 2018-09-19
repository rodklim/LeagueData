package rojos.leaguedata.data.LolStatus;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class TranslationDto {

    @SerializedName("locale")
    String locale;
    @SerializedName("content")
    String content;
    @SerializedName("updated_at")
    String updated_at;

    public TranslationDto() {
    }

    public TranslationDto(String locale, String content, String updated_at) {
        this.locale = locale;
        this.content = content;
        this.updated_at = updated_at;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
