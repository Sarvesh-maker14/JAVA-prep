package dateClass;

import java.math.BigDecimal;
import java.math.RoundingMode;
// import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // LocalDate today = LocalDate.now();
        // System.out.println(today);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        // System.out.println(df.format(today));

        //  LocalDate newDate = LocalDate.now();
        //  newDate = newDate.plusYears(45);
        //  System.out.println(newDate);

        // LocalDate today = LocalDate.now();
        // LocalDate newDateObj = today.minusWeeks(39);
        // System.out.println(ChronoUnit.DAYS.between(newDateObj,today));

        // LocalDate today = LocalDate.now();
        // System.out.println(today);

        // LocalTime thisTime = LocalTime.now();
        // System.out.println(thisTime);

        // LocalDateTime currentDateTime = LocalDateTime.now();
        // System.out.println(currentDateTime);

        // LocalDate someDay = LocalDate.of(2019,Month.APRIL,1);
        // System.out.println(someDay);

        // LocalDateTime different = currentDateTime.withMinute(14).withDayOfMonth(3).plusHours(12);
        // System.out.println(different);

        // int year = currentDateTime.getYear();
        // boolean before = currentDateTime.isBefore(different);
        // System.out.println(before);

        // LocalDate today1 = LocalDate.now();
        // System.out.println(today1);
        // LocalDate foolsDay = LocalDate.of(2019,Month.APRIL,1);

        // Instant timeStampA = Instant.now();
        // System.out.println(timeStampA);

        // int nanoSecondFromLastSecond = timeStampA.getNano();
        // System.out.println(nanoSecondFromLastSecond);

        // Duration twoHours = Duration.ofHours(2);
        // System.out.println(twoHours);

        // Period howLong = Period.between(foolsDay,today1);
        // System.out.println(howLong);

        // int days = howLong.getDays();
        // System.out.println(days);

        // ZoneId london = ZoneId.of("Europe/London");
        // System.out.println(london);

        // ZoneId la = ZoneId.of("America/Los_Angeles");
        // System.out.println(la);

        // LocalDateTime currenTime = LocalDateTime.now();

        // ZonedDateTime londonTime = ZonedDateTime.of(currenTime,london);
        // System.out.println(londonTime);

        // ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
        // System.out.println(laTime);
        // System.out.println(ZoneId);

        //Languages 
        // Locale uk = new Locale("en","GB");//.GB --great Britain
        // System.out.println(uk);

        //Format and Parse Numeric Values 
        // BigDecimal price = BigDecimal.valueOf(2.99);
        // Double tax = 0.2;
        // int quantity = 12345;

        // Locale locale = new Locale("en","GB");
        // NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        // System.out.println(currencyFormat);

        // double price = 1.85;
        // double rate = 0.065;
        // price -= price*rate;
        // price = Math.round(price*100)/100.0;
        // System.out.println(price);

        BigDecimal price = BigDecimal.valueOf(1.85);
        System.out.println(price);

        BigDecimal rate = BigDecimal.valueOf(0.065);
        
        price = price.subtract(price.multiply(rate)).setScale(2,RoundingMode.HALF_UP);
        System.out.println();
        System.out.println(price);

        





    }
}
