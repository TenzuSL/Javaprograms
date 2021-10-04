// This keyword is used to denote the variable and methods in the current class
// it is a reserved keyword
// i could invoke all constructors sort of in a chain using this keyword

package Javabasics;

public class learnThiskeyword {

	int x ;
	int y ;
	int sum;
	
	public learnThiskeyword()
	{	
		this("tag1");
		System.out.println("First contructor");
	}
	
	public learnThiskeyword(String x)
	{	
		this(90 , 80);
		System.out.println("second constructor" +x);
	}
	
	public learnThiskeyword(int x , int y)
	{
		System.out.println("third constructor");
		this.x = x;
		this.y = y;
	}
	
	public void add()
	{
		sum = x + y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		learnThiskeyword Ob = new learnThiskeyword();
		Ob.add();
		
		
	}

}
