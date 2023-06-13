package exceptionHandling;
import java.util.*;


public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		double n=sc.nextDouble8();
		try {
		System.out.println(100/n);
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
	
       finally {
    	   System.out.println("program execution completed");
       }
}}
