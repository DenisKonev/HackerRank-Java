import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cpga;

    public Student(int studentID, String studentName, double studentCGPA) {
        id = studentID;
        name = studentName;
        cpga = studentCGPA;
    }

    public int getId() {
        return id;
    }
    public double getCpga() {
        return cpga;
    }
    public String getName() {
        return name;
    }
}
class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();

        for (String event : events) {
            if (event.startsWith("ENTER")) {
                String[] studentData = event.split(" ");
                int studentID = Integer.parseInt(studentData[3]);
                double studentCGPA = Double.parseDouble(studentData[2]);
                Student student = new Student(studentID, studentData[1], studentCGPA);
                students.add(student);
            } else {
                //TODO
            }
        }
        return students;
    }
}

    public class Solution {
        private final static Scanner scan = new Scanner(System.in);
        private final static Priorities priorities = new Priorities();

        public static void main(String[] args) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();

            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st : students) {
                    System.out.println(st.getName());
                }
            }
        }
}
