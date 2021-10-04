// variable is a name of a memory location to store values
// below are some non primitive data types
// class, string , aarrays , interfaces are all non primitive data types

package Javabasics;

public class learnDatatypes {
	
	boolean a = true;
	char x = 'z'; // char works with unicode not ascii
	char y = 65; // it will print the unicode value of 65
	byte b = 1; // would not accept greater than 128 or -127
	short c = 2;
	int d = 3;
	long e = 687533333; 
	float f = 1.3f; // java will always consider every fractional value as a double as it does not want to lose data
					// to enter f after the no to specify its a float value
	float i = (float) 1.3; // we are casting here
	double g = 4654654587654654654.65465465465465465465465465464;
	

	public static void main(String[] args) {
		
		learnDatatypes Ob = new learnDatatypes ();
		System.out.println(Ob.y);
		
		int u = (int)3.4; // here we are forcefully type casting a fractional value into an INT variable
						  // so normally any java takes any decimal value as float by default which would utilise 8 byte of memory space
						  // int variable take only 4 byte for memory allocation
						  // so below statement will ignore the decimal value and print only 3
						  // this is called down casting as we are casting from a higher datatype to a lower datatype(memory)
		System.out.println(u);
			
		}
		
	}


