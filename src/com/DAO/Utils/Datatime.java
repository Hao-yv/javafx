package src.com.DAO.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datatime {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static String dataToString(Date date){
        return simpleDateFormat.format(date);
    }
}
