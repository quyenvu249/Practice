package Manage;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistStudent {
	private ArrayList<Student> list;

	public ArraylistStudent(ArrayList<Student> list) {
		this.list = list;
	}

	public ArraylistStudent() {
		this.list = new ArrayList<Student>();
	}

	public void addStudent(Student st) {
		this.list.add(st);
	}

	public void printArraylistStudent() {
		for (int i = 0; i < list.size(); i++) {
			this.list.get(i).getStudentInfo();
		}

	}

	public void findStudentByID(String ID) {
		for (int i = 0; i < list.size(); i++) {
			if (this.list.get(i).getStudentID().indexOf(ID) >= 0) {
				this.list.get(i).getStudentInfo();
			}
			if (this.list.get(i).getStudentID().indexOf(ID) != 0) {
				System.out.println("Student is not in list");
			}

		}

	}

	public void sortByDepartment() {
		Collections.sort(list, (a, b) -> a.getDepartment().compareTo(b.getDepartment()));

	}

}
