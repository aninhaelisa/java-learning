package projetosBasicos.jdbcBasico;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class App {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            FileInputStream lerfs = new FileInputStream("config.properties");

            properties.load(lerfs);

            String user = properties.getProperty("db.user");
            String passwd = properties.getProperty("db.password");

            Connection conn = db.getConnection();
            db.closeConnection();

            System.out.println(conn);
            System.out.println("USUARIO: " + user);
            System.out.println("SENHA: " + (passwd != null ? passwd : "Não definida"));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
