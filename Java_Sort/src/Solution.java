import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    int getId() {
        return id;
    }
    String getFname() {
        return fname;
    }
    double getCgpa() {
        return cgpa;
    }
}

class Checker implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if(a.getCgpa()==b.getCgpa()) {
            if (a.getFname().compareTo(b.getFname()) == 0)
                return a.getId() - b.getId();
            else
                return a.getFname().compareTo(b.getFname());
        }
        else {
            if(a.getCgpa() - b.getCgpa()>0) return -1;
                else if(a.getCgpa() - b.getCgpa()==0) return 0;
                else return 1;
        }
    }
}


public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        Checker checker = new Checker();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(checker);
        for(Student st: studentList){
            System.out.println(st.getId()+"-"+st.getFname()+"-"+st.getCgpa());
        }
    }
}



