import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    static final Comparator<Student> CUSTOM_ORDER = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            int cpgaCompRes = Double.compare(s2.getCgpa(), s1.getCgpa());

            if (cpgaCompRes == 0)
                return s1.getFname().compareTo(s2.getFname());
            else
                return cpgaCompRes;
        }
    };

    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, CUSTOM_ORDER);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



