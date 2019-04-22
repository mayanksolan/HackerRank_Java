import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        int fa = tc;
        int[] arr = new int[tc];
        while(fa>0) {
            int num = in.nextInt();
            arr[tc-fa] = num;
            fa--;
        }
        in.close();
        int sum = 0, count = 0;
        for(int i=0; i<tc; i++) {
            for(int j=i; j<tc; j++) {
                sum = sum + arr[j];
                if(sum<0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}

//5
//1 -2 4 -5 1