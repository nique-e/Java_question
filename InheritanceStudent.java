
 class student{
    String name;
    int rollNumber;
    float marks;

    void display(){
        System.out.println("Name :" +name);
        System.out.println("Rollnumber :" +rollNumber);
        System.out.println("Marks" +marks);
    }

 }
 
 public class InheritanceStudent{
    public static void main(String[] args) {
        
           student s1 = new student();
        s1.name = "Nitesh";
        s1.rollNumber = 23;
        s1.marks = 93;

        s1.display();
    }
 }