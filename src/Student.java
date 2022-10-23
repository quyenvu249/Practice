import java.util.Scanner;

public class Student {
    public  int studentID;
    public String studentName;
    private String department;

    public Student(){

    }

    public Student(int studentID, String studentName, String department) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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

    public void inputStudentInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------- Them sinh vien --------------");
        System.out.println("Insert student's ID ");
        studentID = sc.nextInt();
        System.out.println("Insert student's name" );
        studentName = sc.next();
        System.out.println("Insert student's department ");
        department = sc.next();



    }
    public void getStudentInfo(){
        System.out.println(studentID  + " " + studentName  + " "  + " " + " " +department);
    }
}
