import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR,2019);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DATE,21);
        System.out.println(cal.toString());
        System.out.println(cal.getTime());
        String[] strDays = new String[]{
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };
        System.out.println("Current day is : " +
                strDays[cal.get(Calendar.DAY_OF_WEEK)-1]
        );
    }
}
