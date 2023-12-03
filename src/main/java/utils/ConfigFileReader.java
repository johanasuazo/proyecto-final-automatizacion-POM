package utils;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigFileReader {
    static Logger logger = Logger.getLogger(ConfigFileReader.class.getName());
    private Properties properties;
    private final String propertyFilePath;

    public ConfigFileReader(String filePath){
        propertyFilePath = filePath;
        try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
            properties = new Properties();
            properties.load(reader);
        } catch (IOException e) {
            throw new MissingPropertyExceptions(propertyFilePath);
        }
    }
    public class MissingPropertyExceptions extends RuntimeException {

        public MissingPropertyExceptions(String propertyFilePath) {
            super("Properties file not found at path : " + propertyFilePath);
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public String getPropertyByKey(String key) {
        String p = properties.getProperty(key);
        if (p != null){
            if (p.contains("${")) {
                String envVarValueInProp= p.substring(p.indexOf("{")+1,p.indexOf(":"));
                String envVarValue = System.getenv(envVarValueInProp);
                if(envVarValue != null){
                    p=envVarValue;
                }else{
                    p= p.substring(p.indexOf(":")+1,p.indexOf("}"));
                }
            }
        return p;
        }else
            throw new MissingPropertyException(propertyFilePath, key);

    }

    public class MissingPropertyException extends RuntimeException {

        public MissingPropertyException(String propertyFilePath, String key) {
            super("Property not specified in the " + propertyFilePath + " file for the Key: " + key);
        }
    }

    public static void changeProperty(String filename, String key, String value) throws IOException {
        Properties prop =new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filename)){
            prop.load(fileInputStream);
        } catch (IOException e){
            logger.info(e.toString());
        }
        prop.setProperty(key, value);
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)){
            prop.store(fileOutputStream,null);
        } catch (IOException e){
            logger.info(e.toString());
        }
    }

    public void setProperties(String filename,String key, String value) throws IOException {
        properties.setProperty(key, value);
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)){
            properties.store(fileOutputStream,null);
        } catch (IOException e){
            logger.info(e.toString());
        }
    }
}
