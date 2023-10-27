import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
class Test {
    public void createSqlConnectionNoncompliant() throws Exception {
        // Bad practice: Hardcoded database connection parameters.
        final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                "root", "insecure_password");
        connection.close();
    }

    public static void main(String[] args) {
        // Bad practice: Empty main method, does nothing.
        return;
    }

}
