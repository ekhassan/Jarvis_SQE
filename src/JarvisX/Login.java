package JarvisX;
import java.sql.*;
public class Login {
    public static Connection connection;
    public String databaseURL = "jdbc:ucanaccess://Data.accdb";
    public static String sql1;
    public static String sql2;
    public static String sql3;
    ResultSet rs;


    public boolean mgrLogin(String u, String p) {
        boolean n = false;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sql1 = "Select * From Manager";
            PreparedStatement statement = connection.prepareStatement(sql1);
            rs = statement.executeQuery();
            while (rs.next()) {

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if (user.equals(u) && pass.equals(p)) {
                    n = true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;

    }

    public boolean empLogin(String u, String p) {
        boolean r = false;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sql2 = "Select * From Employee";
            PreparedStatement statement = connection.prepareStatement(sql2);
            rs = statement.executeQuery();
            while (rs.next()) {

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if (user.equals(u)) {
                    r = true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;

    }

    public boolean clLogin(String u, String p) {
        boolean c = false;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sql3 = "Select * From Client";
            PreparedStatement statement = connection.prepareStatement(sql3);
            rs = statement.executeQuery();
            while (rs.next()) {

                String user = rs.getString(2);
                String pass = rs.getString(3);

                if (user.equals(u) && pass.equals(p)) {
                    c = true;
                }

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;

    }
}
