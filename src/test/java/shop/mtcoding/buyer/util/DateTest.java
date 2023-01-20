package shop.mtcoding.buyer.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    public void parse_test() {
        // given (데이터 준비)
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        Timestamp stamp = Timestamp.valueOf(current); // Timestamp 으로 타입 변환, timestamp타입을 제일 많이 쓴다?
        // yyyy-MM-dd-hh:mm:ss
        DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 분 : mm

        LocalDateTime nowTime = stamp.toLocalDateTime();
        String nowStr = nowTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
