package exercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ex49 {

    public static void main(String[] args) {

        // Objeto que vai armazenar as propriedades do arquivo
        Properties properties = new Properties();

        try {

            // Abre o arquivo config.properties
            FileInputStream arquivo = new FileInputStream("config.properties");

            // Carrega as informações do arquivo
            properties.load(arquivo);

            // Lê cada propriedade
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            System.out.println("Conectando...");
            System.out.println("URL: " + url);
            System.out.println("Usuário: " + user);

            // Cria a conexão com o banco
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Conexão realizada com sucesso!");

            // Fecha a conexão
            con.close();

            System.out.println("Conexão encerrada.");

        } catch (IOException e) {

            System.out.println("Erro ao ler o arquivo config.properties");
            System.out.println(e);

        } catch (Exception e) {

            System.out.println("Erro ao conectar ao banco.");
            e.printStackTrace();
        }

    }
}