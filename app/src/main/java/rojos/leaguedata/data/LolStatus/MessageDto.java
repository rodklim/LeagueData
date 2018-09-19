package rojos.leaguedata.data.LolStatus;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rodrigo on 5/22/2017.
 */

public class MessageDto {

    @SerializedName("severity")
    String severity;
    @SerializedName("author")
    String author;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("translations")
    List<TranslationDto> translations;
    @SerializedName("updated_at")
    String updated_at;
    @SerializedName("content")
    String content;
    @SerializedName("id")
    String id;

    public MessageDto() {
    }

    public MessageDto(String severity, String author, String created_at, List<TranslationDto> translations,
                      String updated_at, String content, String id) {
        this.severity = severity;
        this.author = author;
        this.created_at = created_at;
        this.translations = translations;
        this.updated_at = updated_at;
        this.content = content;
        this.id = id;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<TranslationDto> getTranslations() {
        return translations;
    }

    public void setTranslations(List<TranslationDto> translations) {
        this.translations = translations;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
