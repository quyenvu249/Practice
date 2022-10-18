import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> arrayList;

    public StudentManagement() {
        this.arrayList = new ArrayList<Student>();
    }

    public StudentManagement(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public void addStudent(Student std) {
        this.arrayList.add(std);
    }

    public void printArrList() {
        for (int i = 0; i < arrayList.size(); i++) {
            this.arrayList.get(i).getStudentInfo();
        }
    }
}
