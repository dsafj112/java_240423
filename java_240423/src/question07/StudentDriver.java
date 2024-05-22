package question07;

class Student{
	String name,number,department;

//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getNumber() {
//		return number;
//	}
	public void setNumber(String number) {
		this.number = number;
	}
//	public String getDepartment() {
//		return department;
//	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	public String toString() {
//		return ("이름: "+getName()+"\n"+
//				"학번: "+getNumber()+"\n"+
//				"소속학과: "+getDepartment()+"\n"
//				);
//	}
	public String toString() {
		return ("이름: "+name+"\n"+
				"학번: "+number+"\n"+
				"소속학과: "+department+"\n"
				);
	}
}

public class StudentDriver {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("갑돌");
		student1.setNumber("100");
		student1.setDepartment("컴퓨터공학");
		
		student2.setName("갑순");
		student2.setNumber("200");
		student2.setDepartment("건축학과");
		
		System.out.print(student1);
		System.out.print(student2);
		student2.setDepartment("수학과");
		System.out.print(student2);
	}
}
