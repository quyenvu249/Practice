import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        StudentManagement arrayList = new StudentManagement();
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách các sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo mã");
            System.out.println("4. Sắp xếp danh sách SV");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("--------------------------------");
                    int numOfStudent;
                    System.out.println("Nhap so luong hoc sinh muon them moi: ");
                    numOfStudent = sc.nextInt();

                    for (int i = 0; i < numOfStudent; i++) {
                       Student student = new Student();
                        student.inputStudentInfo();
                        arrayList.addStudent(student);

                    }
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("Danh sách thông tin sinh viên");
                    arrayList.printStudents();
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("Nhập MSSV");
                    int studentID = sc.nextInt();
                    arrayList.findStudent(studentID);
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    System.out.println("Danh sách sinh viên sau khi đã sắp xếp");
                    arrayList.sortByDepartment();
                    System.out.println("--------------------------------");
                    break;
            }
        }while(choose != 0);
    }
}