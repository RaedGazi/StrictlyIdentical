import java.util.Scanner;
/**
 * 
 */

/**
 * @author korai
 *
 */

public class StrictlyIdentical { 
	public static boolean equals(int[] array1, int[] array2) {
		boolean equal = true;
		
		for(int i = 0; i < 5; i++) {
			
			if (array1[i] != array2[i]) 
				equal= false; 
			// Inserted for loop structure with i < 5 (because prompt), and then set if statement for each array. 
		}
		return equal;
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		int[] list1 = new int[5];
		
		int[] list2 = new int[5]; 
		
		// Scanner Input 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 5 elements of list 1");

		
		//For loops for list 1 and list 2 
		for(int i = 0; i < 5; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter 5 elements of list 2");
		
		for(int i = 0; i < 5; i++) {
			list2[i] = input.nextInt();
		}
		
		if (equals(list1,list2))
			System.out.println("Two list are strictly identical ( Floor Gang!!! )");
		else System.out.println("Two lists are not strictly identical ( Ceiling Gang....cuhrynge )");
			
		
	}

}
