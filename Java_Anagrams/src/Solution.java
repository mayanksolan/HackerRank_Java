import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int checka = 0;
        for (int i = 0; i < a.length(); i++) {
            int num = (int) a.toLowerCase().charAt(i);
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
            } else {
                checka++;
            }
        }
        int checkb = 0;
        for (int i = 0; i < b.length(); i++) {
            int num = (int) b.toLowerCase().charAt(i);
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
            } else {
                checkb++;
            }
        }
        if(a.length()>=1 && b.length()>=1 && a.length()<=50 && b.length()<=50
                && checka==0 && checkb==0 && a.length()==b.length()) {
            int fin = 0;
            for(int i=0; i<a.length(); i++) {
                char let = a.toLowerCase().charAt(i);
                int numa = 0, numb = 0;
                for(int j=0; j<a.length(); j++) {
                    if(let==a.toLowerCase().charAt(j)) {
                        numa++;
                    }
                    if(let==b.toLowerCase().charAt(j)) {
                        numb++;
                    }
                }
                if(numa==numb) {
                    fin=0;
                } else {
                    return false;
                }
            }
            if(fin==0) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
