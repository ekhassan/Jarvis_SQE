package JarvisX;
import java.sql.*;
public class DataBase {

    public static Connection connection;
    public String databaseURL = "jdbc:ucanaccess://Data.accdb";
    public static String sql1;
    public static String sql2;
    public static String sql3;
    ResultSet rs;
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;

    public String[] dbprojects = new String[100];
    public String[] dbemps = new String[100];
    public static String[] dbemppros = new String[100];
    public static String[] dbclpros = new String[100];

    public void showproDetails(String proname) {

        PreparedStatement statement;
        ResultSet rs;

        try {
            connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Project";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                String name = rs.getString(3);

                if (name.equals(proname)) {


                    a = rs.getString("proid");
                    b = rs.getString("proname");
                    c = rs.getString("prosource");
                    d = rs.getString("profrom");
                    e = rs.getString("proto");
                    f = rs.getString("prostatus");
                    g = rs.getString("prorev");
                    h = rs.getString("prorate");


                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void showProjects() {
        PreparedStatement statement;
        ResultSet rs;
        int i = 0;
        int a = 0;
        try {
            connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Project";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                for (int x = 0; x < 100; x++) {
                    if (dbprojects[x] == rs.getString("proname")) {
                        i = 0;
                        break;
                    } else {
                        i = 1;
                    }
                }
                if (i == 1) {
                    dbprojects[a] = rs.getString("proname");
                }
                ++a;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showEmps() {
        PreparedStatement statement;
        ResultSet rs;
        int i = 0;
        int a = 0;
        try {
            connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Employee";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                for (int x = 0; x < 100; x++) {
                    if (dbemps[x] == rs.getString("name")) {
                        i = 0;
                        break;
                    } else {
                        i = 1;
                    }
                }
                if (i == 1) {
                    dbemps[a] = rs.getString("name");
                }
                ++a;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void AssignTo(String prname, String assignedTo) {
        PreparedStatement statementC;
        PreparedStatement statement;
        ResultSet rs;
        String sql;
        String idNo;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Project";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (prname.equals(rs.getString("proname"))) {
                    idNo = rs.getString("id");
                    sql = "UPDATE Project" +
                            " SET proto = '" + assignedTo + "' WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SetStatus(String prname, String status) {
        PreparedStatement statementC;
        PreparedStatement statement;
        ResultSet rs;
        String sql;
        String idNo;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Project";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (prname.equals(rs.getString("proname"))) {
                    idNo = rs.getString("id");
                    sql = "UPDATE Project" +
                            " SET prostatus = '" + status + "' WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rate(String prname, String rate) {
        PreparedStatement statementC;
        PreparedStatement statement;
        ResultSet rs;
        String sql;
        String idNo;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Project";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (prname.equals(rs.getString("proname"))) {
                    idNo = rs.getString("id");
                    sql = "UPDATE Project" +
                            " SET prorate = '" + rate + "' WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rev(String prname, String rev) {
        PreparedStatement statementC;
        PreparedStatement statement;
        ResultSet rs;
        String sql;
        String idNo;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Project";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (prname.equals(rs.getString("proname"))) {
                    idNo = rs.getString("id");
                    sql = "UPDATE Project" +
                            " SET prorev = '" + rev + "' WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void status(String prname) {
        PreparedStatement statementC;
        PreparedStatement statement;
        ResultSet rs;
        String sql;
        String idNo;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Project";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (prname.equals(rs.getString("proname"))) {
                    idNo = rs.getString("id");
                    sql = "UPDATE Project" +
                            " SET prostatus = 'Closed' WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addDBPro(String a, String b, String c, String d, String e) {
        try {
            connection = DriverManager.getConnection(databaseURL);

            String sql;
            sql = "INSERT INTO Project (proid, proname, prosource, profrom, proto, prostatus, prorev, prorate) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a);
            statement.setString(2, b);
            statement.setString(3, c);
            statement.setString(4, d);
            statement.setString(5, e);
            statement.setString(6, "Incomplete");
            statement.setString(7, "Pending");
            statement.setString(8, "Pending");

            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException n) {
            n.printStackTrace();
        }
    }

    public void addDBEmp(String u, String p, String n) {
        try {
            connection = DriverManager.getConnection(databaseURL);

            String sql;
            sql = "INSERT INTO Employee (username, password, name) VALUES (?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, u);
            statement.setString(2, p);

            statement.setString(3, n);


            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException r) {
            r.printStackTrace();
        }
    }

    public void addDBCl(String u, String p, String n) {
        try {
            connection = DriverManager.getConnection(databaseURL);

            String sql;
            sql = "INSERT INTO Client (username, password, name) VALUES (?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, u);
            statement.setString(2, p);

            statement.setString(3, n);


            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException r) {
            r.printStackTrace();
        }
    }

    public void delDBEmp(String emp) {
        PreparedStatement statement;
        PreparedStatement statementC;
        String idNo;
        ResultSet rs;
        String sql;
        String sqlC;
        try {
            connection = DriverManager.getConnection(databaseURL);
            sqlC = "SELECT * FROM Employee";
            statementC = connection.prepareStatement(sqlC);
            rs = statementC.executeQuery();

            while (rs.next()) {
                if (emp.equals(rs.getString("name"))) {
                    idNo = rs.getString("ID");
                    sql = "DELETE FROM Employee WHERE id in (" + idNo + ")";
                    statement = connection.prepareStatement(sql);
                    statement.executeUpdate();
                    statement.close();
                    break;
                }
            }
            statementC.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showEmpPro(String emp) {
        PreparedStatement statement;
        ResultSet rs;
        int i = 0;
        int a = 0;
        try {
            connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Project";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                String uname = rs.getString(6);
                if (uname.equals(emp)) {
                    for (int x = 0; x < 100; x++) {
                        if (dbemppros[x] == rs.getString("proname")) {
                            i = 0;
                            break;
                        } else {
                            i = 1;
                        }
                    }
                    if (i == 1) {
                        dbemppros[a] = rs.getString("proname");
                    }
                    ++a;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showClPro(String cli) {
        PreparedStatement statement;
        ResultSet rs;
        int i = 0;
        int a = 0;
        try {
            connection = DriverManager.getConnection(databaseURL);
            String sql = "SELECT * FROM Project";
            statement = connection.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                String uname = rs.getString(5);
                if (uname.equals(cli)) {
                    for (int x = 0; x < 100; x++) {
                        if (dbclpros[x] == rs.getString("proname")) {
                            i = 0;
                            break;
                        } else {
                            i = 1;
                        }
                    }
                    if (i == 1) {
                        dbclpros[a] = rs.getString("proname");
                    }
                    ++a;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
