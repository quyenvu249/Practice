import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private String department;

    public Student() {

    }

    public Student(String studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputStudentInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert student's ID: ");
        studentID = input.nextLine();
        System.out.println("Insert student's name: ");
        studentName = input.nextLine();
        System.out.println("Insert student's department: ");
        department = input.nextLine();
    }


    public void getStudentInfo() {
        System.out.println("StudentID: " + studentID + "\n" + "Student Name: " + studentName + "\n" + "Department: " + department + "\n");
    }


}
