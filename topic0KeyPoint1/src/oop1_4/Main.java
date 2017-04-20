package oop1_4;

public class Main {

	public static void main(String[]args){
		
		Employee employee0 =new Employee(0001, "Leandro", "Dal Bó", 18000);
		Employee employee1 =new Employee(0002, "Johan", "wilson", 100);
		
		System.out.println("E0 annual salary ="+employee0.getAnnualSalary());
		
		System.out.println("E1 raise salar ="+employee1.raiseSalary(20));
		
		System.out.println(employee0.toString());
		System.out.println(employee1.toString());
	}
}
