import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        int count=0;
        for(int i=0;i<n;i++){
            if(s[i].length()>300) {
                count++;
            }
        }
        //System.out.println("n="+n+"/count="+count+"/s.length="+s.length);
        if(n>=1 && n<=200 && count==0) {
            for(int k=s.length-2; k>0; k--) {
                for(int j=0; j<s.length-3; j++) {
                    BigDecimal b1 = new BigDecimal(s[j]);
                    //System.out.println(s[j] + "-" + s[j + 1]);
                    BigDecimal b2 = new BigDecimal(s[j + 1]);
                    int i1 = b1.compareTo(b2);
                    if (i1 < 0) {
                        String temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}