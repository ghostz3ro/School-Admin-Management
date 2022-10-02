package school.management.project;

import java.util.ArrayList;
import java.util.List;

/**
 * School will have many teachers and many students
 * Implements teachers and students using an ArrayList.
 * Created by Zaid September 2022.
 * @author Zaid 
 *
 */

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * New school object is created.
	 * @param teachers list of teachers in the school.
	 * @param students list of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	
	/**
	 * 
	 * @return list of teachers in the school.
	 */
	public List<Teacher> getTeachers() {
		return this.teachers;
	}
	
	/**
	 * Adds teacher to the school
	 * @param teacher to be added
	 */
	public void addTeacher (Teacher teacher) {
		teachers.add(teacher);
	}
	
	/**
	 * 
	 * @return list of students in the school.
	 */
	public List<Student> getStudents(){
		return this.students;
	}
	
	/**
	 * Add student to the school.
	 * @param student to be added.
	 */
	public void addStudent (Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @return the total money earned by the school.
	 */
	public static int  getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * This adds the total money earned by the school.
	 * @param MoneyEarned total money to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	/**
	 * This gets the total amount of money spent by the school.
	 * @return total amount of money spent.
	 */
	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * This updates the total amount of money spent by the 
	 * school which is salary for teachers.
	 * @param totalMoneySpent updates the total amount spent.
	 */
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}
	
	
	
}
