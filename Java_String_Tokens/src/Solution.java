import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i);
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122) || num==32 || num==33 || num==39 || num==44 ||num==46 ||
                    num==63 || num==95 || num==64) {
            } else {
                check++;
            }
        }
        if(check==0 && s.length()>=1 && s.length()<=400000) {
            String s1 = s.trim();
            if(s1.length()==0) {
                System.out.println(s1.length());
            } else {
                String[] arrStr = s1.split("[ !,?._'@]+");
                System.out.println(arrStr.length);
                for (int i = 0; i < arrStr.length; i++) {
                    System.out.println(arrStr[i]);
                }
            }
        }
        // Write your code here.
        scan.close();
    }
}

