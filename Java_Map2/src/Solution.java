//Complete this code or write your own from scratch
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name,phone);
            in.nextLine();
        }
        //System.out.println(map);
        ArrayList<String> arr = new ArrayList<>();
        while(in.hasNextLine())
        {
            String s=in.nextLine();
            if(s.equals("")) {
                break;
            } else {
                arr.add(s);
            }
        }
        //System.out.println(arr);
        for (String s : arr) {
            if (map.containsKey(s)) {
                int a = map.get(s);
                System.out.println(s + "=" + a);
            } else {
                System.out.println("Not found");
            }
        }
    }
}



