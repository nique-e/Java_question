import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        // Creating ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Adding student names
        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");
        students.add("Priya");
        students.add("Nitesh");

        // Displaying student names
        System.out.println("Student Names:");
        for(String name : students) {
            System.out.println(name);
        }
    }
}
