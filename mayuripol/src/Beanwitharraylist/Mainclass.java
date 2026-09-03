package Beanwitharraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Course ID, Course Name, Course Fees");
	
	CourseBean cb=new CourseBean(sc.nextInt(),sc.next(),sc.nextDouble());
	
	ArrayList<CourseBean> a=new ArrayList<CourseBean>();
	
	System.out.println("Enter Course ID, Course Name, Course Fees");
	
	a.add(new CourseBean(sc.nextInt(),sc.next(),sc.nextDouble()));
	System.out.println("Enter Course ID, Course Name, Course Fees");
	
	a.add(new CourseBean(sc.nextInt(),sc.next(),sc.nextDouble()));
	a.add(cb);
	
	Iterator<CourseBean> iter=a.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
