import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DictionaryQuery {

    public static void getTranslations(String englishWord) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT belarusian_word FROM diction WHERE english_word = ?")) {

            pstmt.setString(1, englishWord);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getString("belarusian_word"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}