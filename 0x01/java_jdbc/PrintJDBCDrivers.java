import java.sql.DriverManager;
import java.util.stream.Collectors;

public class PrintJDBCDrivers {
    public static void main(String[] args) {

        var driver = DriverManager.getDrivers().nextElement();
        System.out.println(driver.getClass().getName() + " " + driver.getMajorVersion() + "." + driver.getMinorVersion());
        
    }
}
