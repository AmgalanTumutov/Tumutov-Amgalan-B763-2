import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DictionaryModifier {

    public static void addTranslation(String englishWord, String belarusianWord) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO diction (english_word, belarusian_word) VALUES (?, ?)")) {

            pstmt.setString(1, englishWord);
            pstmt.setString(2, belarusianWord);
            pstmt.executeUpdate();

            System.out.println("Перевод успешно добавлен!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}