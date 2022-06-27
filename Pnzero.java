package basics;

//@ author sravan kumar
// prog for positive and negative value checking
import java.util.Scanner;
 // import java utilities from the package
public class Pnzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter value for checking ");
Scanner x = new Scanner(System.in); // taking the values from utilities from scanner
int a = x.nextInt(); // assigning values
if(a<0)  // checking the condition for the prog
{
	System.out.println("the value is negative");
	
}

else
{
	System.out.println("the value is positive");
	
}
	}

}// finally execute and terminate from the prog
