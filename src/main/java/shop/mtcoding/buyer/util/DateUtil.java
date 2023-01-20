package shop.mtcoding.buyer.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String format(Timestamp stamp) {
        // Timestamp -> LocalDateTime -> 파싱하기
        LocalDateTime nowTime = stamp.toLocalDateTime();
        String nowStr = nowTime.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        return nowStr;
    }
}
