import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();

    public static Ads getAdsDao() throws SQLException, ClassNotFoundException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
//        adsDao.insert(new Ad(1, "Coke", "Delicious"));
        return adsDao;
    }


}
