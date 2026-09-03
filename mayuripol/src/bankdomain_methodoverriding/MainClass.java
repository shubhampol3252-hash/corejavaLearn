package bankdomain_methodoverriding;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the Prinicipal");
	double prinicipal=sc.nextDouble();
	
	System.out.println("Enter time required");
	double time=sc.nextDouble();
	
	Bank b;
	
	b=new SBI_Bank();
	b.calculateIntrest(prinicipal, time);
	
	b=new ICICI_Bank();
	b.calculateIntrest(prinicipal, time);
	
	
	
		
	}

}
