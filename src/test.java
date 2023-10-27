import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
class Test {
    public void createSqlConnectionNoncompliant() throws Exception {
    // Noncompliant: password is hardcoded.
    final Connection connection = DriverManager.getConnection("some url",
            "username", "password");
    connection.close();
}
    public static void main(String[] args) {
        return;
    }
}