public class TestEmployee{
	public static void main (String[] args){
		Date hireDate = new Date();
		Date birthDate = new Date(1980,3,8);
		Employee name = new Employee("Brown","Morris",40000.0,birthDate,hireDate);
		System.out.print(name.toString());
	

	}




} 
