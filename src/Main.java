import java.util.Scanner;

public class Main {
    //write code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement studentList = new StudentManagement();
        int choice = 0;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of students to add: ");
                    int numberOfStudent = sc.nextInt();
                    for (int i = 0; i < numberOfStudent; i++) {
                        Student std = new Student();
                        std.inputStudentInfo();
                        studentList.addStudent(std);
                    }
                    break;
                case 2:
                    studentList.printArrList();
                    break;
                case 3:
                    System.out.println("Enter the student's ID want to search: ");
                    String idSearch = sc.next();
                    studentList.searchStudentByID(idSearch);
                    break;
                case 4:
                    studentList.sortByDepartment();
                    break;
            }
        } while (choice > 0 && choice < 5);
    }

    static void showMenu() {
        System.out.println("1: Nhập danh sách các sinh viên\n" +
                "2: Xuất danh sách sinh viên\n" +
                "3: Tìm sinh viên theo mã\n" +
                "4: Sắp xếp danh sách SV theo thuộc tính Department từ A-Z\n" +
                "0: Thoát menu");
    }
}