package Manage;

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

	public void getStudentInfo() {
		System.out.println("StudentID: " + studentID + "    " + "StudentName: " + studentName + "    " + "Department: "
				+ department);
	}

}
