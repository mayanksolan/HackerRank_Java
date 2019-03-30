
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line="";
        String[] strArr = new String[10000];
        int i=0;
        while (scanner.hasNextLine()) {
            strArr[i]=scanner.nextLine();
            i++;
        }
        for(int j=0; j<strArr.length; j++) {
            if(strArr[j]!=null) {
                System.out.println(j+1 + " " + strArr[j]);
            }
        }
        scanner.close();
    }
}
