package school.management.project;

/**
 * Created by Zaid Al-Ansari in September 2022.
 * This class is responsible for keeping track of Student's
 * ID, name, grade, and fees paid, and total fees.
 * 09/2022
 * @author Zaid
 *
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int totalFees;
	
	
	 //Not going to alter student's name or the id.
	
	/**
	 * To create a new student object by initializing the values.
	 * Fees for every student will be $40,000.
	 * Fees paid initially will be $0.
	 * 
	 * @param id id for the student: a unique value.
	 * @param name name of the student.
	 * @param grade grade of the student.
	 */
	public Student(int id, String name, int grade) {
		
		this.feesPaid = 0;
		this.totalFees = 40000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	
	/**
	 * Keep adding the fees to feesPaid Field.
	 * Add the fees to the fees paid.
	 * The school is going to receive the funds.
	 * 
	 * @param feesPaid is the new amount paid by student.
	 */
	public void paysFees(int fees) {
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	
	
	/**
	 * Used to update student's grade.
	 * @param grade is the new grade for the student.
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * 
	 * @return id of the student.
	 */
	
	public int getId() {
		return id = this.id;
	}
	/**
	 * 
	 * @return name of the student.
	 */
	public String getName() {
		return name = this.name;
	}
	/**
	 * 
	 * @return grade of the student.
	 */
	public int getGrade() {
		return grade = this.grade;
	}
	/**
	 * 
	 * @return fees paid by the student.
	 */
	public int feesPaid() {
		return feesPaid = this.feesPaid;
	}
	/**
	 * 
	 * @return total fees required by the student.
	 */
	public int totalFees() {
		return totalFees = this.totalFees;
	}
	
	/**
	 * 
	 * @return the remaining amount of fees left to be paid.
	 */
	public int getRemainingFees() {
		return totalFees -= feesPaid;
	}


	@Override
	public String toString() {
		return "Student's name is " + name + ". Total fees paid so far $" + feesPaid;
		}
	
	
		
}
