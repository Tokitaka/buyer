package shop.mtcoding.buyer.util;

import org.junit.jupiter.api.Test;

public class CookieTest {

    @Test
    public void parse_test() {
        String cookies = "remember=ssar; JSESSIONID=53B6AE0B0721FF9EE9E4C8C76FB7B8EE";
        String arr[] = cookies.split(";");
        String username = arr[0].split("=")[1].trim();
        System.out.println(arr);
    }
}
