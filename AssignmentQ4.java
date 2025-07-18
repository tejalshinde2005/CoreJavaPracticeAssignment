//Write a jawa program to find the area and perimeter of a rectangle using 
//Arithamatic Operation
public class AssignmentQ4 {
	void Calculate() {
		float length = 10;
		float breadth = 10;
		
		double Area = length*breadth;
		double Perimeter = 2*(length + breadth);
		
		System.out.println("Area of rectangle");
		System.out.println("Area of rectangle is = "+Area );
		System.out.println(" " );
		System.out.println("Perimeter of rectangle" );
		System.out.println("Perimeter of rectangle is = "+Perimeter);	
	}
	public static void main(String[] args) {
		AssignmentQ4 a3 = new AssignmentQ4();
		a3.Calculate();
	}
}
