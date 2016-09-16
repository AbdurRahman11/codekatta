package Player;

import java.util.*;

public class arrayShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			System.out.println("\n enter the numbers in array ");
		Scanner it = new Scanner(System.in);
		int a = it.nextInt();
		int arr[]=new int[a];
		System.out.println("\n enter the number to be shifted");
		int b = it.nextInt();
		
			for(int i=0;i<a;i++){
		
			 arr[i] =it.nextInt();
			}
			rotate(arr,b);
		}catch(Exception e){System.out.println("\n error occured");}
		
		
	}public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
	}
	}

}
