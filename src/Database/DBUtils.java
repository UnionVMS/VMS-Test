package Database;

import java.sql.*;

public class DBUtils {

    private static String devServer = "lipsql02u";
    private static String devDB = "unionvmsdev";
    private static String devUser = "postgres";
    private static String devPassword = "password";
    private static boolean useSSL = false;


    private static Connection getConnection() {
        String url = "jdbc:postgresql://" + devServer + "/" + devDB + "?user=" + devUser + "&password=" + devPassword + "&ssl=" + useSSL;
        Connection conn;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return conn;
    }

    public static int DeleteAssetBasedOnCFR(String cfr) {
        int result;
        Connection conn = getConnection();

        try {
            PreparedStatement st = conn.prepareStatement("delete from asset.asset where cfr = ?");
            st.setString(1, cfr);
            result = st.executeUpdate();
        } catch (NullPointerException | SQLException ex) {
            ex.printStackTrace();
            return (-1);
        }
        return result;
    }

/*

        while (rs.next())
        {
            System.out.print("Got it! ");
            System.out.println(rs.getString("cfr"));
        }
        rs.close();
        st.close();
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
*/
}
