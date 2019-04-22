import java.util.Arrays;

class Solution {
    private static int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++) {
            for(int j=0, k=A[i].length-1; j<=A[i].length/2-1; j++, k--) {
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                if(A[i][j]==0)
                    A[i][j]=1;
                else
                    A[i][j]=0;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[][] S = new int[4][4];
        S[0][0]=1;
        S[0][1]=1;
        S[0][2]=0;
        S[0][3]=0;
        S[1][0]=1;
        S[1][1]=0;
        S[1][2]=0;
        S[1][3]=1;
        S[2][0]=0;
        S[2][1]=1;
        S[2][2]=1;
        S[2][3]=1;
        S[3][0]=1;
        S[3][1]=0;
        S[3][2]=1;
        S[3][3]=0;
        System.out.println(Arrays.deepToString(flipAndInvertImage(S)));
    }
}