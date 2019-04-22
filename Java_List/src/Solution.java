import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(tc);
        for(int i=0; i<tc; i++) {
            arr.add(in.nextInt());
        }
        int tcc = in.nextInt();
        for(int i=0; i<tcc; i++) {
            String oper = in.next();
            if(oper.equals("Insert"))
                arr.add(in.nextInt(), in.nextInt());
            if(oper.equals("Delete"))
                arr.remove(in.nextInt());
        }
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+ " ");
        }
    }
}

