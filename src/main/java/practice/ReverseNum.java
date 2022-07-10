package practice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Prime");
		int a=sc.nextInt();
		int b=0;
		
		while(a!=0)
		{
			int n=a%10;
		b=(b*10)+n;
		a=a/10;
		}
		System.out.println(b);

	}

}
