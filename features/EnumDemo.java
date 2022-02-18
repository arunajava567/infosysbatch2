enum Apple
{
	A, B, C, D, E 
} 
 
public class EnumDemo 
{
	public static void main(String args[])  
	{ 
		Apple ap; 
	 
		ap = Apple.C; 
	 
		// Output an enum value. 
		System.out.println("Value of ap: " + ap); 
		System.out.println(); 
	 
		ap = Apple.B; 
	 
		// Compare two enum values. 
		if(ap == Apple.B)  
		  System.out.println("ap conatins GoldenDel.\n"); 
	 
		// Use an enum to control a switch statement. 
		switch(ap)
		{ 
		  case A:	System.out.println("A is red."); 
					break; 
		  case B:	System.out.println("B is yellow."); 
					break; 
		  case C:	System.out.println("C is red."); 
					break;
		  case D: 	System.out.println("D is red."); 
					break; 
		  case E: 	System.out.println("E is red."); 
					break; 
		} 
	} 
}