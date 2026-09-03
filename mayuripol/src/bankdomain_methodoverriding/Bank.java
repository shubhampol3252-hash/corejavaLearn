package bankdomain_methodoverriding;

public class Bank {
	
	
	public void calculateIntrest(double principal, double time)
	{
		double rate=5;
		
		double interset= (principal * time * rate)/100;
		
		System.out.println("Bank Interset:- "+interset);
		
	}
	
	
}
