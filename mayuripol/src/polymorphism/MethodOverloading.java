package polymorphism;

public class MethodOverloading {
	
	//same mulatiple method names with different parameters are
	//called method overloading
	
	public void Arithmetic_Operation(int a,int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
	public void Arithmetic_Operation(double a,double b)
	{
		System.out.println("Sub is"+(a-b));
	}
	
	public void Arithmetic_Operation(float a,float b)
	{
		System.out.println("Myl is"+(a*b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		m.Arithmetic_Operation(12, 2);
		m.Arithmetic_Operation(12.45, 56.6);
		m.Arithmetic_Operation(15.5f, 67.8f);
	}

}
