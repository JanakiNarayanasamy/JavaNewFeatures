package programs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeOfPerson {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2010, 9, 03);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay,now));

    }
}
