package basics;

//@ author sravan kumar

import java.util.Scanner; // we call the scanner values from the java utility package

public class Votelegible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter person's age  ");
		Scanner x = new Scanner(System.in); // import the values using scanner
		int a = x.nextInt();   // assign variable
		if(a>=18) // logic we are using for eligibility
		{
			System.out.println("he is eligible");
		}
		else 
		{
			System.out.println("he is not eligible");
			
		}  // getting the desired out put by the sop statements
		
	}

}
