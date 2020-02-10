package calapp;
import java.util.*;
public class Calculator extends CalculatorClass
{
	public static void main(String args[])
	{
		double a,b;
		int choice;
		Scanner s=new Scanner(System.in);
		CalculatorClass c=new CalculatorClass();
		System.out.println("Enter the First number");
		a=s.nextDouble();
		System.out.println("Enter the Second number");
		b=s.nextDouble();
		System.out.println("Enter the choice of operation from 1-4");
		choice=s.nextInt();
		switch(choice)
		{
			case 1:c.addition(a,b);
				   break;
			case 2:c.subtraction(a,b);
				   break;
			case 3:c.multiplication(a,b);
				   break;
			case 4:c.division(a,b);
				   break;
			default:System.out.println("You have choosen wrong number");
				   break;
		}

	}
}