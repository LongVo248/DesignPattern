package DI;
import java.io.*;
public class FactoryDAO {
    public static AbstractDAO getDAO() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("source/config.properties");
            // load a properties file
            prop.load(input);
            // get the database value
            String database = prop.getProperty("database");
            if (database.equals("1")) {
                return new MySQLDAO();
            }
            if (database.equals("2")) {
                return new PostgreDAO();
            }
            if (database.equals("3")) {
                return new MSSQLDAO();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return null;
    }
}