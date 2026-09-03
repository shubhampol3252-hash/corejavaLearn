package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parent cp=new Child();
		//call          execute
		
		cp.Op();
		
		cp=new Parent();
		cp.Op();
		
	}

}
