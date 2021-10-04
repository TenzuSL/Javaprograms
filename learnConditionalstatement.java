// if , if else , nested if else
// and Switch

package Javabasics;

public class learnConditionalstatement {
	
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("chrome");
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("IE");
		}
		
		else if(browser.equalsIgnoreCase("safari"))
		{
			System.out.println("safari");
		}
		
		else
		{
			System.out.println("firefox");
		}
		
		
		switch (browser)
		{
		
		case "chrome" : System.out.println("chrome");
		break;
		
		case "IE" : System.out.println("IE");
		break;
		
		case "safari" : System.out.println("safari");
		break;
		
		case "firefox" : System.out.println("firefox");
				
		
		}

	}

}
