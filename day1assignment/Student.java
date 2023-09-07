package week1.day1assignment;

public class Student {
	public void studentName(String Name) {
		System.out.println("Student Name is:"+Name);
	}
	public void rollNo(long rollNo) {
		System.out.println("Roll Number is:"+rollNo);
	}
	public void collegeName(String Name) {
		System.out.println("College Name is:"+Name);
	}
	public void markScored(int markScored) {
		System.out.println("Mark Scored:"+markScored);
	}
	public void cgpa(float cgpa) {
		System.out.println("CGPA:"+cgpa);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName("Iswarya");
		s.rollNo(12359l);
		s.collegeName("Vins Eng College");
		s.markScored(75);
		s.cgpa(7.9f);
	}
}
