import java.sql.Connection;
import java.util.Date;
import java.util.logging.Logger;

public class promo {

    private String promoCode;
    private String details;
    private String shortCode;
    private Date startDate;
    private Date endDate;

    private static Connection con;
    final private static Logger logger = Logger.getLogger(promo.class.getName());

}
