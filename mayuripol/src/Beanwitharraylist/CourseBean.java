package Beanwitharraylist;

public class CourseBean {
	
	private int courseid;
	private String coursename;
	private double coursefees;
	
	//JavaBeans with ArrayList
	
	//a[]={12,4,4,5,6,6,7,8};
	
	// courseID     CourseName   CourseFees
	//0th  101       Java         23000
	//1st  102       python      
	
	//PARAMETERIZED CONSTRUCTURE IS ACTING LIKE A SETTER METHOD
	//             101           JAVA          45565
	CourseBean(int id, String name, double fees)
	{
		this.courseid=id;
		this.coursename=name;
		this.coursefees=fees;
	}
	
	//toString is acting like a getter method
	

	@Override
	public String toString() {
		return "CourseBeen [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
	

	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
