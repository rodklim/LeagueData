package rojos.leaguedata.utils;

/**
 * Created by Rodrigo on 5/29/2017.
 */

public class StringUtils {
    public static String buildUrl(String url, String endpoint) {
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        builder.append(endpoint);
        return builder.toString();
    }
}
