package daytwelve;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };

		// To print the elements in one line
		System.out.println("Array is : "+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		System.out.println("after sorting" );
		System.out.println("Array is : "+Arrays.toString(intArr));
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
		int intArr1[]= {10,20,30};
		System.out.println("Array is : "+Arrays.toString(intArr1));
		System.out.println("to compare between arrays");
		
		if (Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 20);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));
	
				Arrays.fill(intArr, intKey);
			
				System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));

			
		
		
	}
}