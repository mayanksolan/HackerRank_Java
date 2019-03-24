import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid \n" +
                        "Description: "+ ex.getDescription() +
                        "\nMessage: "+ex.getMessage() +
                        "\nPattern: "+ex.getPattern() +
                        "\nIndex: "+ex.getIndex());
            }
            testCases--;
        }
    }
}