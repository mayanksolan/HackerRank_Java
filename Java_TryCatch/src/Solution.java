import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            if (b==0)
                throw new ArithmeticException("/ by zero");
            else
                System.out.println(a/b);
            } catch (InputMismatchException e){
                System.out.println(e.getClass().getName());
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
    }
}

