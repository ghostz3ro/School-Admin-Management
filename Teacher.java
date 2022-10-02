package school.management.project;

/**
 * Made by Zaid September 202
 * This class is responsible for keeping track of:
 * Teachers id, name, and salary.
 * @author zaid
 *
 */

public class Teacher {

	private int id;
	private int salary;
	private String name;
	private static int salaryEarned;
	
	
	
	/**
	 * Creates a new teacher object.
	 * @param id this is the id for the teacher.
	 * @param salary this is the salary of the teacher.
	 * @param name this is the salary of the teacher.
	 */
	public Teacher(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.salaryEarned = 0;
		
	}
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return the salary of the teacher.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * 
	 * @return the name of the teacher.
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * Sets the salary.
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * Adds to the salary.
	 * Removes from the total money earned to School.
	 * @param salary
	 */
	public static void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Teacher's name is " + name + 
				". Their salary earned so far is: $"
				+ salary;
	}
	
	
	
	

}
