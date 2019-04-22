import java.util.Scanner;
class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Solution {
    private static final MyCalculator my_calculator = new MyCalculator();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            System.out.println(my_calculator.power(n, p));
        }
    }
}