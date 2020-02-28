package Utilities;

import okhttp3.MediaType;

public class Constants {
    public static String username = "vms_admin_se";
    public static String password = "password";
    public static String devServer = "liaswf05u";
    public static String loginURL = "http://" + devServer + ":28080/unionvms/#/login";
    public static String usmURL = "http://" + devServer + ":28080/unionvms/usm-administration/rest/authenticate";
    public static MediaType inputContentType = MediaType.parse("application/json");
    public static MediaType outputContentType = MediaType.parse("application/json");
    public static String cacheControl = "no-cache";
    public static String CreateAssetURL = "http://" + devServer + ":28080/unionvms/asset/rest/asset";

}
