import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int check=0;
        if(A.length()<=50) {
            for(int i=0, j=A.length()-1; i<=A.length()/2; i++, j--) {
                if(A.charAt(i)==A.charAt(j)) {
                } else {
                    System.out.println("No");
                    check++;
                    break;
                }
            }
        }
        if(check==0) {
            System.out.println("Yes");
        }
    }
}



