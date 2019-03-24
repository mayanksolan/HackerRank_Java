import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i);
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
            } else {
                check++;
            }
        }
        if (s.length() >= 1 && s.length() <= 1000 && check == 0) {
            smallest = s.substring(0, k);
            for (int i = 0; i < s.length() - k + 1; i++) {
                for (int j = 0; j < s.length() - k + 1; j++) {
                    //System.out.println(s.substring(i,k+i) + "[]" + s.substring(j,k+j));

                    if (s.substring(i, k + i).compareTo(s.substring(j, k + j)) < 0) {
                        if(s.substring(i,i+k).compareTo(smallest)<0) {
                            smallest = s.substring(i, k + i);
                        }
                    }
                    if (s.substring(i, k + i).compareTo(s.substring(j, k + j)) >= 0) {
                        if (s.substring(i, k + i).compareTo(largest) >= 0) {
                            largest = s.substring(i, k + i);
                        }
                    }
                    //System.out.println(s.substring(i,k+i) + "[]" + s.substring(j,k+j) + "[] smallest: "+ smallest + "[] largest: "+ largest);
                }
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}