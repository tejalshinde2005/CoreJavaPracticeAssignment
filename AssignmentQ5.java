//Q5) Write a Program to convert Temperature From Celsius to Fahrenheit 
//Using The Formula

public class AssignmentQ5 {
	
	void Calculate(){
		double TempCesius = 25;
		double Farenheit = (TempCesius * (9 / 5) + 32);
		System.out.println("Temperature of Farenheit is = "+TempCesius);
	}
	public static void main(String[] args) {
		AssignmentQ5 a4 = new AssignmentQ5();
		a4.Calculate();
	}
 
}
