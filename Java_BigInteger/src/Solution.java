import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        BigInteger bn1 = new BigInteger(n1);
        BigInteger bn2 = new BigInteger(n2);
        if(bn1.compareTo(BigInteger.valueOf(0))>=0 && bn2.compareTo(BigInteger.valueOf(0))>=0
                && n1.length()<=200 && n2.length()<=200) {
            System.out.println(bn1.add(bn2));
            System.out.println(bn1.multiply(bn2));
        }
    }
}

