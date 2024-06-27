
public class FindAllPrimes {
	 public static void main (String[] args)
	   {		
	       int a = 10;
	       int b = 99;
	       
	       for(int i = a; i <= b; i++)
	       {
	    	   if(i == 0 || i == 1)
	    	   {
	    		   continue;
	    	   }
	    	   boolean isPrime = true;
	    	   for(int j = 2; j<= i/2;j++)
	    	   {
	    		   if(i%j == 0)
	    		   {
	    			   isPrime = false;
	    			   break;
	    		   }
	    	   }
	    	   if(isPrime)
	    	   {
	    		   System.out.println(i);
	    	   }
	       }
	   }

}
