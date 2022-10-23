import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentManagement {
    private ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<Student>();
    }

    public StudentManagement(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        if (student == null) {
            System.out.println("Dữ liệu không hợp lệ hoặc đã tồn tại");
        }
        this.studentList.add(student);
        System.out.println("Added ");
    }
    public void printStudents() {
        for (int i = 0; i < studentList.size(); i++)
            studentList.get(i).getStudentInfo();

    }

    public void findStudent(int studentID) {
        if(this.studentList.size() == 0) {
            System.out.println("Không có học sinh!");

            return;
        }

        for(int i = 0; i<studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == studentID) {
                studentList.get(i).getStudentInfo();
            }
        }
    }

    public void sortByDepartment() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //Cài đặt chỉ tiêu để so sánh trong đây
                return o1.getDepartment().compareTo(o2.getDepartment());
            }
        });
        System.out.println("Danh sách sắp xếp theo tên: ");

        printStudents();

    }


}
