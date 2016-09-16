package Player;

import java.util.*;

public class holiday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a ;
		String s;
		System.out.println("\n enter the day ");
		Scanner it = new Scanner(System.in);
	    a = it.nextInt();
	    if(a<=7){
	    if((a==1)||(a==2)||(a==3)||(a==4)||(a==5))
	    {
	    	System.out.println("\n True");
	    }
	    else 
	    {
	    	System.out.println("\n False");
	    }
		
	    }
	    else {
	    	System.out.println("\n enter a valid day");
	    }
		
		}

}
