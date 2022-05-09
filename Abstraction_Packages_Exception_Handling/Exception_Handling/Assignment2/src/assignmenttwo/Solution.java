package assignmenttwo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		int a=0, b=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter number : ");
			arr[i]=sc.nextLine();
		}
		
		try {
			a = Integer.parseInt(arr[1]);
			b = Integer.parseInt(arr[3]);
			a = a/b;
		}catch(NumberFormatException ne) {
			System.out.println(ne);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		System.out.println(Arrays.toString(arr));		
	}

}
