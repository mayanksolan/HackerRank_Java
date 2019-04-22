import java.util.HashSet;

class Solution {
    private static int numUniqueEmails(String[] emails) {
        HashSet<String> s = new HashSet<>();
        for (String email : emails) {
            String start;
            start = email.substring(0, email.indexOf("@")).replace(".","");
            if (start.contains("+")) {
                start = start.substring(0, start.indexOf("+"));
            }
            start += email.substring(email.indexOf("@"));
            s.add(start);
        }
        return s.size();
    }
    public static void main(String[] args) {
        String[] S = new String[3];
        S[0]="test.email+alex@leetcode.com";
        S[1]="test.e.mail+bob.cathy@leetcode.com";
        S[2]="testemail+david@lee.tcode.com";
        System.out.println(numUniqueEmails(S));
    }
}