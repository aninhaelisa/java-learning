package projetosBasicos.jdbcBasico;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class db {


    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
            
        }
    }

    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("config.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
            
        } 
    }
}
