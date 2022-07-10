package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Prime");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			int c=a%i;
			if(c==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number"+a+"is a prime");
		}
		else
			System.out.println("Number is not a prime");

	}

}
