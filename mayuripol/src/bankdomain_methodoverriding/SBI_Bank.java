package bankdomain_methodoverriding;

public class SBI_Bank extends Bank {
	
	public void calculateIntrest(double principal, double time)
	{
		double rate=5.6;
		
		double interset= (principal * time * rate)/100;
		
		System.out.println("sbi Bank Interset:- "+interset);
		
	}

}
