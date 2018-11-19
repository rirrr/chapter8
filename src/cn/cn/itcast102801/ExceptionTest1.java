package cn.cn.itcast102801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionTest1 {
    public static void main(String[] args){
        String URL = "jdbc:mysql://localhost:3306/db_database";
        String DRIVER = "com.mysql.jdbc.Driver";
        String USERNAME = "mr";
        Connection connection = null;
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,"");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
