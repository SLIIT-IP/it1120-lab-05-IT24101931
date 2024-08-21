import java.util.Scanner;
public class IT24101931Lab5Q2
{
	public static void main(String[] args)
	{
	int number;
	Scanner input= new Scanner(System.in); 
	System.out.print(" Enter number of customers introduced :");
	number=input.nextInt();
	if(0>number){System.out.println("Input must be a number 0 or greater");
	return;}
	switch(number)
	{	
	case 0:System.out.print("No prize");
		break;
	case 1:System.out.print("Prize is a :Pen");
		break;
	case 2:System.out.print("Prize is a :Umbrella");
		break;
	case 3:System.out.print("Prize is a :Bag");
		break;
	case 4:System.out.print("Prize is a :Travelling Chair");
		break;
	default:System.out.print("Prize is a :Headphone");
		break;
	}
	}


}