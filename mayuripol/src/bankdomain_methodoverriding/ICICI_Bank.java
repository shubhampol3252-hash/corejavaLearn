package bankdomain_methodoverriding;

public class ICICI_Bank extends Bank {
	
	public void calculateIntrest(double principal, double time)
	{
		double rate=7;
		
		double interset= (principal * time * rate)/100;
		
		System.out.println("icici Bank Interset:- "+interset);
		
	}
	

}
