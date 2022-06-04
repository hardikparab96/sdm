import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		 
		Circle c1=new Circle(1,1);
		
		Circle c2=new Circle(2, 3, 1);
		
		Circle c3=new Circle();
		
	//	c3.changeCenter(2,5);
		
		if(c3.getCenter().getX()>c2.getCenter().getX())
			System.out.println("c3 X is bigger");
		else
			System.out.println("c2 X is bigger");
		
		
	}
}
