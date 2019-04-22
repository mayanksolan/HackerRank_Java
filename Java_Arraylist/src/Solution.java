import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        ArrayList[] arr = new ArrayList[tc];
        for(int i=0; i<tc; i++) {
            int tcc = in.nextInt();
            arr[i] = new ArrayList<>();
            for(int j=0; j<tcc; j++) {
                int num = in.nextInt();
                arr[i].add(num);
            }
        }

        int newtc = in.nextInt();
        ArrayList<String> arr1 = new ArrayList<>(newtc);
        for(int i=0; i<newtc; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(arr[a-1].size()>b-1) {
                arr1.add(arr[a-1].get(b-1).toString());
            } else {
                arr1.add("ERROR!");
            }
        }
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}

/*5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5*/