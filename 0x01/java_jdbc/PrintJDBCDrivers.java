import java.sql.DriverManager;
import java.util.stream.Collectors;

public class PrintJDBCDrivers {
    public static void main(String[] args) {

        System.out.println(DriverManager.drivers().map(driver -> {
            return driver.getClass().getName() + " " + driver.getMajorVersion() + "." + driver.getMinorVersion();
        }).collect(Collectors.toList()));
    }
}
