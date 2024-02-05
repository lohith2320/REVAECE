package daytwelve;

import java.util.Arrays;

public class ArrayOfObjectsDem {

	public static void main(String[] args) {
		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student(1, "lohith");
		arr[1] = new Student(2, "manu");
		arr[2] = new Student(3, "siri ma");
		arr[3] = new Student(4, "manoj");
		arr[4] = new Student(5, "mohan");
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}


		// TODO Auto-generated method stub

	}


