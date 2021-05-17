package Utilities;

import okhttp3.MediaType;

public class Constants {
    public static String username = "vms_admin_se";
    public static String password = "password";
//    public static String devServer = "liaswf05u";
    public static String devServer = "localhost";
//    public static String loginURL = "http://" + devServer + ":28080/unionvms/#/login";
    public static String loginURL = "http://" + devServer + ":28080/login";
    public static String usmURL = "http://" + devServer + ":28080/unionvms/usm-administration/rest/authenticate";
    public static String tokenKey = "jwtoken";
    public static MediaType inputContentType = MediaType.parse("application/json");
    public static MediaType outputContentType = MediaType.parse("application/json");
    public static String cacheControl = "no-cache";

    public static int pageLoadTimeout = 20;
    public static int sleepBeforeTestMethod = 450;
    public static int lazyWebTimeout = 20;
    public static String APIURLPrefix = "http://";
    public static String APIURLPort = ":28080";
    public static String APIURLBase = "/unionvms";

    public static String createAssetURL = APIURLPrefix + devServer + APIURLPort + APIURLBase + "/asset/rest/asset";
    public static InvocationType createAssetInvocationType = InvocationType.POST;
    public static String createContactURL = APIURLPrefix + devServer + APIURLPort + APIURLBase + "/asset/rest/asset/contacts";
    public static InvocationType createContactInvocationType = InvocationType.POST;

    public enum InvocationType { GET, PUT, DELETE, POST }
    public enum MenuItem { ASSETS, MYSETTINGS, REALTIMEMAP, REPORTSMAP }
    public enum MapVisibilityOptionsEnum { SHOWFLAGS, SHOWTRACKS, SHOWNAMES, SHOWSPEEDS, SHOWFORECASTS }
    public enum ShipColourLogic { SHIPTYPESGROUPED, SHIPTYPE, FLAGSTATE, SIZE }
    public enum AssetSearchOptions { SWEDISHASSETS, VMSASSETS, FLAGSTATE }

}
