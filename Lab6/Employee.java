// an employee calss that inherits from the Person class.
// Written by <Xinxin Chen>

public class Employee extends Person{

	private double salary;
	private Date hireDate;
	
	public Employee (String lastName, String firstName, double salary, Date birthDate, Date hireDate){
		
		super(lastName,firstName, birthDate);	
		this.salary = salary;
		this.hireDate = hireDate;

	}

	public double getSalary(){
		return salary;
	}

	public Date getHireDate(){
		return hireDate;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setHireDate(){
		this.hireDate = hireDate;
	}

	public String toString (){
		
		return 
			"name = " + getLastName() + ", " + getFirstName() + "\n" +
			"salary = " + getSalary() + "\n" +
			"birth = " + getBirthDate() + "\n" +
			"hired = " + getHireDate() + "\n" ;	
			 
		
	}

}
