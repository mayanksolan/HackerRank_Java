import java.util.HashSet;

class Solution {
    private static int repeatedNTimes(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for(int a : A) {
            if(hs.contains(a)) {
                return a;
            } else {
                hs.add(a);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] S = new int[6];
        S[0]=2;
        S[1]=1;
        S[2]=2;
        S[3]=5;
        S[4]=3;
        S[5]=2;
        System.out.println(repeatedNTimes(S));
    }
}
/*int out=0;
        for(int i=0; i<A.length; i++) {
            int count=0;
            for(int j=i+1; j<A.length; j++) {
                if(A[i]==A[j]) {
                    count++;
                }
            }
            if(count>0) {
                out= A[i];
            }
        }
        return out;*/