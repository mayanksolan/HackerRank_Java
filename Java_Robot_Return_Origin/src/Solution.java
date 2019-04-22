class Solution {
    private static boolean judgeCircle(String moves) {
        int x=0, y=0;
        for(char ch : moves.toCharArray()) {
            switch(ch) {
                case 'L':
                    x--;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
}