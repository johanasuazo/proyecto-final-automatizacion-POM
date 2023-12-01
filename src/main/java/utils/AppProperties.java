package utils;

public class AppProperties {

    private AppProperties(){}

    static ConfigFileReader reader = new ConfigFileReader("src/main/resources/configs/config.properties");

    // Credenciales

    public static String getSpreadSheetId(){ return reader.getPropertyByKey("SPREADSHEET_ID"); }
    public static String getNameHoja(){ return reader.getPropertyByKey("NAME_HOJA"); }
    public static String getRange(){
        return reader.getPropertyByKey("RANGE");
    }
    public static String getRangeIncorrect(){
        return reader.getPropertyByKey("RANGEINCORRECT");
    }

    public static String getRangeEmpty(){
        return reader.getPropertyByKey("RANGEEMPTY");
    }
    public static String getRangeNoID(){
        return reader.getPropertyByKey("RANGENOID");
    }
    public static String getRangeNoPassword(){
        return reader.getPropertyByKey("RANGENOPASSWORD");
    }



    // Conexion BD
    public static String getMySqlUrl(){
        return  reader.getPropertyByKey("MYSQL_URL");
    }
    public static String getMySqlUser(){ return  reader.getPropertyByKey("MYSQL_USER"); }
    public static String getMySqlPassword(){ return  reader.getPropertyByKey("MYSQL_PASSWORD"); }

}
