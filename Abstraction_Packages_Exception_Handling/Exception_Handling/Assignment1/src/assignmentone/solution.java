package assignmentone;

import java.util.Arrays;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		sc.nextLine();
		
		
		try {
			
			for(int i=0; i<n; i++) {
				System.out.println("Enter number:");
				arr[i]=sc.nextInt();
				sc.nextLine();
			}
			
			System.out.println("Which index");
			System.out.println(arr[sc.nextInt()-1]);
		}catch(Exception e) {
			System.out.println("wrong :"+e);
		}
		System.out.println(Arrays.toString(arr));

	}

}
