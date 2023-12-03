package utils;


public class UtilConstants {

    public UtilConstants utilConstants(){ return new UtilConstants();}
//    Archivo credenciales mision match
    public static final String SPREADSHEET_ID = AppProperties.getSpreadSheetId();
    public static final String NAME_HOJA = AppProperties.getNameHoja();
    public static final String RANGE = AppProperties.getRange();
    public static final String RANGEINCORRECT = AppProperties.getRangeIncorrect();
    public static final String RANGEEMPTY = AppProperties.getRangeEmpty();
    public static final String RANGENOID = AppProperties.getRangeNoID();
    public static final String RANGENOPASSWORD = AppProperties.getRangeNoPassword();

//    Conexion BD

    public static final String MYSQL_URL = AppProperties.getMySqlUrl();
    public static final String MYSQL_USER = AppProperties.getMySqlUser();
    public static final String MYSQL_PASSWORD = AppProperties.getMySqlPassword();

}
