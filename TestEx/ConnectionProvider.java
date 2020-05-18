
import java.sql.*;

class ConnectionProvider {

    public static void main(String a[]) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String pass = "santosh";

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
            String sql = "insert into test124 values(?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
