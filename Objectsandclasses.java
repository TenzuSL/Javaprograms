package Javabasics;

public class Objectsandclasses   {
	
	
	
	
	public int x;
	
	public int addtwonos(int a , int b)
	{
	x = a + b;	
	return x;
	
	}
	
	

	public static void main(String[] args) {
		
		Objectsandclasses ob = new Objectsandclasses();
	    ob.addtwonos(2, 4);
	    
	    if(ob.addtwonos(2, 4) > 1)
	    {
	    	System.out.println("Fuck");
	    }
	    
	    else
	    {
	    	System.out.println("You");
	    }
	}

}
