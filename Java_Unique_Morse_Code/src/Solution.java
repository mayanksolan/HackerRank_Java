import java.util.Arrays;

class Solution {
    private static int uniqueMorseRepresentations(String[] words) {
        String[] newS = new String[words.length];
        for(int i=0; i<words.length; i++) {
            newS[i]="";
            for(int j=0; j<words[i].length(); j++) {
                switch(words[i].charAt(j)) {
                    case 'a':
                        newS[i]+=".-";
                        break;
                    case 'b':
                        newS[i]+="-...";
                        break;
                    case 'c':
                        newS[i]+="-.-.";
                        break;
                    case 'd':
                        newS[i]+="-..";
                        break;
                    case 'e':
                        newS[i]+=".";
                        break;
                    case 'f':
                        newS[i]+="..-.";
                        break;
                    case 'g':
                        newS[i]+="--.";
                        break;
                    case 'h':
                        newS[i]+="....";
                        break;
                    case 'i':
                        newS[i]+="..";
                        break;
                    case 'j':
                        newS[i]+=".---";
                        break;
                    case 'k':
                        newS[i]+="-.-";
                        break;
                    case 'l':
                        newS[i]+=".-..";
                        break;
                    case 'm':
                        newS[i]+="--";
                        break;
                    case 'n':
                        newS[i]+="-.";
                        break;
                    case 'o':
                        newS[i]+="---";
                        break;
                    case 'p':
                        newS[i]+=".--.";
                        break;
                    case 'q':
                        newS[i]+="--.-";
                        break;
                    case 'r':
                        newS[i]+=".-.";
                        break;
                    case 's':
                        newS[i]+="...";
                        break;
                    case 't':
                        newS[i]+="-";
                        break;
                    case 'u':
                        newS[i]+="..-";
                        break;
                    case 'v':
                        newS[i]+="...-";
                        break;
                    case 'w':
                        newS[i]+=".--";
                        break;
                    case 'x':
                        newS[i]+="-..-";
                        break;
                    case 'y':
                        newS[i]+="-.--";
                        break;
                    case 'z':
                        newS[i]+="--..";
                        break;
                }
            }
        }
        newS = Arrays.stream(newS).distinct().toArray(String[]::new);
        return newS.length;
    }
    public static void main(String[] args) {
        String[] S = new String[4];
        S[0]="gin";
        S[1]="zen";
        S[2]="gig";
        S[3]="msg";
        System.out.println(uniqueMorseRepresentations(S));
    }
}
/*
String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String word : words) {
            String code = "";
            for (char c : word.toCharArray()) code += d[c - 'a'];
            s.add(code);
        }
        return s.size();
 */