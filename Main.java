package school.management.project;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Teacher Zaid = new Teacher(1,500,"Zaid");
		Teacher Bobby = new Teacher(2,600,"Bobby");
		Teacher Mary = new Teacher(3, 700, "Mary");
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Zaid);
		teacherList.add(Bobby);
		teacherList.add(Mary);
		
		Student Ahmed = new Student(1,"Ahmed", 3);
		Student Laith = new Student(2, "Laith",3);
		Student Ali = new Student(3,"Ali",5);
			
		List<Student> studentList = new ArrayList<>();
		studentList.add(Ahmed);
		studentList.add(Laith);
		studentList.add(Ali);
		
		
		
		School IAA = new School(teacherList, studentList);
		
		Teacher Ziyad = new Teacher(4, 900, "Ziyad");
		IAA.addTeacher(Ziyad);
		
		
		Ahmed.paysFees(6000);
		Laith.paysFees(5000);
		
		System.out.println("IAA has earned: " + "$" + IAA.getTotalMoneyEarned());
		System.out.println(" ");
		System.out.println("------ Making SCHOOL PAY SALARY ------");
		
		Zaid.receiveSalary(Zaid.getSalary());
		System.out.println(" IAA has paid salary to " + Zaid.getName() + " and now has $" + IAA.getTotalMoneyEarned());
		
		Bobby.receiveSalary(Bobby.getSalary());
		System.out.println(" IAA has paid salary to " + Bobby.getName() + " and now has $" + IAA.getTotalMoneyEarned());
		
		Mary.receiveSalary(Mary.getSalary());
		System.out.println(" IAA has paid salary to " + Mary.getName() + " and now has $" + IAA.getTotalMoneyEarned());
		
		System.out.println(" ");

		System.out.println(Zaid);
		System.out.println(Bobby);
		System.out.println(Mary);
		
		System.out.println("\n");
		
		System.out.println(Laith);
		System.out.println(Ali);
		System.out.println(Ahmed);
		
		
		
		
	}


}
