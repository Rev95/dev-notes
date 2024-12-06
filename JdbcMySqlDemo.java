import java.sql.*;

public class JdbcMySqlDemo {
    public static void main(String[] args) throws Exception {
        String sqlQuery = "select * from users";
        String dbUrl = "jdbc:mysql://localhost:3306/project";
        String username = "root";
        String password = "root@123";

        Connection con = DriverManager.getConnection(dbUrl, username, password);
        Statement st = con.createStatement();
        ResultSet resultSet = st.executeQuery(sqlQuery);

        while(resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " : " + resultSet.getString("name") + " : " + resultSet.getInt("age"));
        }

        con.close();
    }
}
