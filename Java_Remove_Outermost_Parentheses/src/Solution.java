import java.util.Scanner;

class Solution {
    private static String removeOuterParentheses(String S) {
        int a=0, start=0;
        StringBuilder newstr= new StringBuilder();
        if(S.length()<=1000) {
            for(int i=0; i<S.length(); i++) {
                if(S.charAt(i)=='(') {
                    a++;
                }
                if(S.charAt(i)==')') {
                    a--;
                }
                if(a==0) {
                    newstr.append(S, start+1, i);
                    start=i+1;
                }
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println(removeOuterParentheses(S));
        String h = in.nextLine();
        System.out.println(h.toLowerCase());
    }
}

/*public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }*/