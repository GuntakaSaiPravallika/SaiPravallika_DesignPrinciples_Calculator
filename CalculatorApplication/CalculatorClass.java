package calapp;
public class CalculatorClass implements CalculatorInterface
{
	double a,b;
	public void addition(double a,double b)
	{
		System.out.println("Sum of the numbers "+a+" and "+b+" is "+(a+b));
	}
	public void subtraction(double a,double b)
	{
		System.out.println("Difference of the numbers "+a+" and "+b+" is "+(a-b));
	}
	public void multiplication(double a,double b)
	{
		System.out.println("Product of the numbers "+a+" and "+b+" is "+(a*b));
	}
	public void division(double a,double b)
	{
		System.out.println("Quotient of the numbers "+a+" and "+b+" is "+(a/b));
	}
}