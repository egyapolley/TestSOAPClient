package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainUtils {


    public static boolean isBefore(String old_date1, String new_date2){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime existing_date = LocalDateTime.from(dateTimeFormatter.parse(old_date1));
        LocalDateTime latest_date = LocalDateTime.from(dateTimeFormatter.parse(new_date2));

        return  existing_date.isBefore(latest_date);

    }


    public static String formatDate(String date){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime main_date = LocalDateTime.from(dateTimeFormatter.parse(date));
        return  main_date.format(dateTimeFormatter2);

    }

}
