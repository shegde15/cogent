package annotation;

import java.util.Date;

public class DateTest {
  @SuppressWarnings(value={"deprecation"})
    public static void main(String[] args) {
        Date date = new Date(2009, 9, 30);
 
        System.out.println("date = " + date);
    }
}
