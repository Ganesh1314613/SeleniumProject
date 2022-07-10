package practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Prime");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Number "+ a +" is an Even number");
		}
		else
			System.out.println("Number "+ a + " is an ODD Number");
		
	}

}
