import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private static Connection connection;
    private DBConnection() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DICTION", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка создания соединения с БД.", e);
        }
    }
    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
    public static Connection getConnection() {
        return connection;
    }
}
