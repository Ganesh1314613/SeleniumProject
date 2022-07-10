package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Prime");
		String a=sc.next("");
		int b=a.length();
		System.out.println(b);
		//String d=a.replaceAll("[^a-z]","*");
		System.out.println(a.charAt(5));
		String c= "";
		for(int i=b-1;i>=0;i--)
		{
			c=c+a.charAt(i);
		}
		
System.out.println(c);
	}

}
