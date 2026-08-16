package projetosBasicos.helpDesk.entities.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Config {
    private final Properties properties = new Properties();
    
    public Config(){
        try(FileInputStream input = new FileInputStream("config.properties")){
            properties.load(input);
        }catch (IOException e) {
            throw new RuntimeException("ERRO AO CARREGAR AS CONFIGURAÇÕES DE SENHA E EMAIL :(");
        }
    }

    public String get(String key){
        return properties.getProperty(key);
    }
}
