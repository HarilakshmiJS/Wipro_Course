
public class Interest {

	public static void main(String args[]) {
		
		 String gender = args[0];
	        int age = Integer.parseInt(args[1]);

	        if (gender.equals("female") && age >= 1 && age <= 58) {
	            System.out.println("Interest is 8.2%");
	        } else if (gender.equals("female") && age >= 59 && age <= 100) {
	            System.out.println("Interest is 9.2%");
	        } else if (gender.equals("male") && age >= 1 && age <= 58) {
	            System.out.println("Interest is 8.4%");
	        } else if (gender.equals("male") && age >= 59 && age <= 100) {
	            System.out.println("Interest is 10.5%");
	        } else {
	            System.out.println("Invalid input");
	        }

	}

}
