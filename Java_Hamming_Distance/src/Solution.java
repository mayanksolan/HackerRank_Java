class Solution {
    private static int hammingDistance(int x, int y) {
        System.out.println(Integer.bitCount(x^y));
        StringBuilder xx = new StringBuilder();
        StringBuilder yy = new StringBuilder();
        while (x > 0) {
            xx.insert(0,x % 2);
            x = x / 2;
        }
        while (y > 0) {
            yy.insert(0,y % 2);
            y = y / 2;
        }
        int leny = yy.length();
        int lenx = xx.length();
        //System.out.println("yy=" + yy + "-xx=" + xx);
        if (leny > lenx) {
            int add = leny - lenx;
            for (int i = 0; i < add; i++) {
                xx.insert(0, "0");
            }
        } else if (lenx > leny) {
            int add = lenx - leny;
            for (int i = 0; i < add; i++) {
                yy.insert(0, "0");
            }
        }
        //System.out.println("xx=" + xx + "-yy=" + yy);
        int count=0;
        for(int i=0; i<xx.length(); i++){
            if(xx.charAt(i)!=yy.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }
}