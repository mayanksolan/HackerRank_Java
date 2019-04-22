//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        ArrayList<Person> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            Person p = new Person(name, phone);
            arr.add(p);
            in.nextLine();
        }
        /*for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i).getName()+"+"+arr.get(i).getPhone());
        }*/
        ArrayList<String> arr2 = new ArrayList<>();
        while(in.hasNextLine())
        {
            String s=in.nextLine();
            if(s.equals("")) {
                break;
            } else {
                arr2.add(s);
            }
        }

        /*for(int i=0; i<arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }*/
        for(int i=0; i<arr2.size(); i++) {
            int found = 0;
            for(Person d : arr) {
                if(d.getName().contains(arr2.get(i))) {
                    System.out.println(d.getName()+"="+d.getPhone());
                    found++;
                }
            }
            if(found==0) {
                System.out.println("Not Found");
            }
        }
    }
}
class Person {
    private String name;
    private int phone;
    Person(String name, int phone) {
        this.name=name;
        this.phone=phone;
    }
    String getName() {
        return this.name;
    }
    int getPhone() {
        return this.phone;
    }
}



