import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void searchStudentByID(String idSearch) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (this.arrayList.get(i).getStudentID().equalsIgnoreCase(idSearch)) {
                this.arrayList.get(i).getStudentInfo();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Can't find this student.");
        }
    }

    public void sortByDepartment() {
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compare = o1.getDepartment().compareTo(o2.getDepartment());
                if (compare >= 0) {
                    return 1;
                }
                return -1;
            }
        });
        printArrList();

    }
}
