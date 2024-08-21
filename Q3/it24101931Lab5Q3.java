import java.util.Scanner;
public class it24101931Lab5Q3{
	public static void main(String[] args){
		final double room_charge_per_day=48000.0;
		final int discount_to_3_to_4_days=10;
		final int discount_to_5_to_more_days=20;

	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter Start date :");
	int startdate=input.nextInt();

	System.out.print("Enter end date :");
	int enddate=input.nextInt();

	if (startdate<1||startdate>31){	
	System.out.print("Error :  days must be between 1 and 31");
	return;}

	if (enddate<1||enddate>31){	
	System.out.print("Error : days must be between 1 and 31");
	return;}

	if (startdate>=enddate){	
	System.out.print("Error : start date must be less than end date");
	return;}

	int numberofdays =enddate-startdate;

	if (numberofdays<1){
	System.out.print("Error : number of days must be grater than 1");}

	int discount=0;
	if (numberofdays<3){discount=0;}
	else if (numberofdays>=3&&numberofdays<=4){discount=discount_to_3_to_4_days;}
	else if (numberofdays>=5){discount=discount_to_5_to_more_days;}

	double totalamount=numberofdays*room_charge_per_day;
	double discountamount= totalamount*(discount/100.0);
	double finalamount= totalamount-discountamount;
	
	System.out.println("Room charge per day :"+room_charge_per_day);
	System.out.println("Number of days reserved : "+numberofdays);
	System.out.printf("Total amount to be paid : "+finalamount);


}
}
