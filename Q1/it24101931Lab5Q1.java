import java.util.Scanner;
public class it24101931Lab5Q1
{
	public static void main(String[] args)
	{
	int n1,n2,n3;
	Scanner input= new Scanner(System.in);
	System.out.print("Enter first integers: ");
	n1 = input.nextInt();

	System.out.print("Enter second integers: ");
	n2 =input.nextInt();
	
	System.out.print("Enter third integers: ");
	n3 =input.nextInt();

	System.out.println("user enter numbers are :"+n1+" "+n2+" "+n3);

	if (n1>n2&& n1>n3)
	{System.out.println("The largest is: "+n1);}
	else if (n2>n3 && n2>n1)
	{System.out.println("The largest is: "+n2);}	
	else
	{System.out.println("The largest is: "+n3);}	

	if (n1<n2 && n1<n3)
	{System.out.println("The Smallest is: "+n1);}
	else if (n1<n3 && n2<n3)
	{System.out.println("The Smallest is: "+n2);}
	else
	{System.out.println("The Smallest is: "+n3);}	

	}
}