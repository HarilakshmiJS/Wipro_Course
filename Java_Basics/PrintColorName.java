import java.util.Scanner;

public class PrintColorName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ob1 = s.next().charAt(0);
	    switch(ob1)
	    {
	        case 'R':
	        System.out.println("Red");
	        break;
	        
	        case 'B':
	        System.out.println("Blue");
	        break;
	        
	        case 'G':
	        System.out.println("Green");
	        break;
	        
	        case 'O':
	        System.out.println("Orange");
	        break;
	        
	        case 'Y':
	        System.out.println("Yellow");
	        break;
	        
	        case 'W':
	        System.out.println("White");
	        break;
	        
	        default:
	        System.out.println("invalid");  
	        
	    }
		

	}

}
