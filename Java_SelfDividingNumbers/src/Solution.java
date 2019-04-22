import java.util.ArrayList;
import java.util.List;

class Solution {
    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nList = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            String lval = Integer.toString(i);
            if (!lval.contains("0")) {
                int count = 0;
                for (int j = 0; j < lval.length(); j++) {
                    if (i % Character.getNumericValue(lval.charAt(j)) != 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    nList.add(i);
                }
            }
        }
        return nList;
    }
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list;
        list = selfDividingNumbers(left,right);
        for (int a: list) {
            System.out.print(a+" ");
        }
    }
}
