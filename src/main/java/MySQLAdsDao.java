import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private List<Ad> ads;
    private Connection connection;
    private Config config = new Config();
    Statement stmt;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) throws SQLException {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the database would handle this
        String url = config.getUrl();
        String username = config.getUser();
        String password = config.getPassword();
        connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO ads (user_id, title, description) VALUES(?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setFloat(1, 3);
        stmt.setString(2, ad.getTitle());
        stmt.setString(3, ad.getDescription());
        stmt.executeUpdate();
        ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = config.getUrl();
            String username = config.getUser();
            String password = config.getPassword();
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String selectQuery = "SELECT * FROM ads";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
//
//            ads.add(new Ad(
//                    1,
//                    1,
//                    "playstation for sale",
//                    "This is a slightly used playstation"
//            ));
//            ads.add(new Ad(
//                    2,
//                    1,
//                    "Super Nintendo",
//                    "Get your game on with this old-school classic!"
//            ));
//            ads.add(new Ad(
//                    3,
//                    2,
//                    "Junior Java Developer Position",
//                    "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
//            ));
//            ads.add(new Ad(
//                    4,
//                    2,
//                    "JavaScript Developer needed",
//                    "Must have strong Java skills"
//            ));

        }catch(Exception e){
            e.printStackTrace();
        }
        return ads;
    }
}

