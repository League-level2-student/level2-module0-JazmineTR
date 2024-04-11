package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		Random ran = new Random();
		String[] yuh = new String[5];
		//2. print the third element in the array
		System.out.println(yuh[2]);
		//3. set the third element to a different value
		yuh[2] = "bruh";
		//4. print the third element again
		System.out.println(yuh[2]);
		//5. use a for loop to print all the values in the array
		for(int i = 0;i<yuh.length;i++) {
			System.out.println(yuh[i]);
		}
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//6. make an array of 50 integers
		int[] nuh = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0;i<nuh.length;i++) {
			nuh[i] = ran.nextInt(0, 50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int max = nuh[0];
		for(int i = 1;i<nuh.length;i++) {
			if(nuh[i]< max) {
				max = nuh[i];
			}
		}
		System.out.println(max);
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
