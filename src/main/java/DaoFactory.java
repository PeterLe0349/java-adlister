import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        Config config = new Config();
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        adsDao.insert(new Ad(1, "Coke", "Delicious"));
        return adsDao;
    }


}
