package kaoshi;
import java.sql.*;
public class DBCon {
    private Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sys", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        DBCon db = new DBCon();
        System.out.println(db.getConnection());
    }

    public static void closeConnection(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
        try{
            if(resultSet!=null)
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            if(preparedStatement!=null)
                preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            if(connection!=null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
