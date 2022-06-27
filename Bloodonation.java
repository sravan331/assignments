package basics;

//@author sravan kumar
//prog for blood donation eligibility
import java.util.Scanner;  // calling from the scanner utility package

public class Bloodonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter age ");
Scanner e = new Scanner(System.in);// calling the values 
int age = e.nextInt();
System.out.println("enter weight ");// assigning the values
Scanner w = new Scanner(System.in);
int wet = w.nextInt();
if(age>=25 && wet>=48) // checking the condition
{
	System.out.println("he is eligible");
}
else
{
	System.out.println("he is not eligible");
}
	}

}// execute the program and exit
