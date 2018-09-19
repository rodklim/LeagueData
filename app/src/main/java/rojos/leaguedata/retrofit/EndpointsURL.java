package rojos.leaguedata.retrofit;

/**
 * Created by Rodrigo on 5/28/2017.
 */

public class EndpointsURL {
    public static final String SHARD_STATUS = "status/v3/shard-data?api_key=RGAPI-9d6e400f-439e-408a-93b0-fae0026cfea0";
    public static final String STATIC_DATA = "static-data/v3/champions?champListData=image&dataById=true&api_key=RGAPI-9d6e400f-439e-408a-93b0-fae0026cfea0";
    public static final String FREE_TO_PLAY = "platform/v3/champions?freeToPlay=true&api_key=RGAPI-9d6e400f-439e-408a-93b0-fae0026cfea0";
    public static final String CHAMPION_INFO = "static-data/v3/champions/{championID}?champData=all&api_key=RGAPI-9d6e400f-439e-408a-93b0-fae0026cfea0";
    public static final String CHAMPION_ICON = "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/champion/";
    public static final String SPELLS_ART = "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/spell/";
    public static final String PASSIVE_ART = "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/passive/";
    public static final String CHAMPION_SPLASH = "http://ddragon.leagueoflegends.com/cdn/img/champion/splash/";
}
