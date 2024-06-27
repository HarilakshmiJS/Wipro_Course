
public class ConvertCharacterCase {

	public static void main(String[] args) {
		char ob1 = 'f';
	    if(Character.isLowerCase(ob1))
	    {
	        System.out.println(Character.toUpperCase(ob1));
	    }
	    else if(Character.isUpperCase(ob1))
	    {
	        System.out.println(Character.toLowerCase(ob1));
	    }
	    else
	    {
	        System.out.println("invalid");
	    }
		

	}

}
