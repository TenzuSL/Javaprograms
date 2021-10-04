// its used to convert primitive datatype values into objects 
// Arraylist works with wrapper class objects and not with the primitive data types
// and java works with objects and has many libraries to do various actions on them

package Javabasics;

public class learnWrapperclasses {

	public static void main(String[] args) {
		
		int x = 5 ;
		System.out.println(x);
		
		Integer y = 10;
		System.out.println(y);
		
		
		/*
		 * in selenium we could get the text from web which could be numbers and convert
		 * it to int datatype : and for this conversion we could use the integer wrapped class object 
		 */
		
		String fromWeb = "343";
		int con = Integer.parseInt(fromWeb);
		System.out.println(con);
		
		// Autoboxing
		
		int k = 7;
		Integer a = k;
		System.out.println(a);
		
		// Autounboxing
		Integer z = 100;
		int j = z;
		System.out.println(j);
		
		// Boxing
		char f = 'K';
		Character Box = Character.valueOf(f);
		System.out.println(Box);
		
		// Unboxing
		Double d = 7786.67;
		double r = d.doubleValue();
		System.out.println(r);
		
		

	}

}
