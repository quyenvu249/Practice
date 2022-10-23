package Manage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArraylistStudent listStudent = new ArraylistStudent();
		Scanner sc = new Scanner(System.in);
		int caseInput = 0;

		do {
			System.out.println("1.Enter list of student. \n" + "2.Print list of student. \n" + "3.Find student by ID. \n"
							+ "4.Sort list of student by department from A-Z. \n" + "..................");
			System.out.print("Choose your choice you want: ");
			caseInput = sc.nextInt();
			while(caseInput < 1 || caseInput >4) {
				System.out.println("Enter again your choice !!!");
				caseInput = sc.nextInt();
			}
			switch (caseInput) {
			case 1:
				System.out.println("Enter number of student you want to add:");
				int number = sc.nextInt();
				for (int i = 0; i < number; i++) {
					System.out.print("Enter ID of Student: ");
					String studentID = sc.next();
					System.out.print("Enter Name of Student: ");
					String studentName = sc.next();
					System.out.print("Enter Department of Student: ");
					String department = sc.next();
					System.out.println("..................");
					Student st = new Student(studentID, studentName, department);
					listStudent.addStudent(st);

				}
				break;
			case 2:
				System.out.println("List of student: ");
				listStudent.printArraylistStudent();
				break;
			case 3:
				System.out.println("Enter ID of student you want to find: ");
				String ID = sc.next();
				listStudent.findStudentByID(ID);
				break;
			case 4:
				listStudent.sortByDepartment();
				listStudent.printArraylistStudent();
				break;
			}

		} while (caseInput > 0 || caseInput < 5);

	}
}
