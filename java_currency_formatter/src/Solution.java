import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.
        double round = Math.round(payment*100.00)/100.00;
        System.out.println(round);
        System.out.println(Double.toString(round).contains("."));
        System.out.println(NumberFormat.getInstance(Locale.US).format(round));
        String usnum = NumberFormat.getInstance(Locale.US).format(round);
        String indnum = NumberFormat.getInstance(Locale.ENGLISH).format(round);
        String chinum = NumberFormat.getInstance(Locale.CHINESE).format(round);
        String franum = NumberFormat.getInstance(Locale.FRENCH).format(round);
        String us, india, china, france;
        if(payment>=0 && payment<=1000000000) {
            if(usnum.endsWith(".0") || !usnum.contains(".")) {
                us = (char) 36 + usnum + ".00";
                india = "Rs." + indnum + ".00";
                china = "￥" + chinum + ".00";
                france = franum + ",00"+" €";
            }  else {
                us = (char) 36 + usnum;
                india = "Rs." + indnum;
                china = "￥" + chinum;
                france = franum +" €";
            }

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
            //(char) 165
            //+ (char) 8364
        }
    }
}

