import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(-(long)Math.pow(2,63)-1);
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if ((x >= (-(int)Math.pow(2,31)-1) && x <= ((int)Math.pow(2,31))) || (x >= 0 && x <= ((int)Math.pow(2,32))-1)) System.out.println("* int");
                if ((x >= (-(long)Math.pow(2,63)-1) && x <= ((long)Math.pow(2,63))) || (x >= 0 && x <= ((long)Math.pow(2,64))-1)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
