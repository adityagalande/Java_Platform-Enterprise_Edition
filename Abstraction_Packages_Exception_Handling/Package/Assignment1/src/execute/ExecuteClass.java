package execute;

import test.Foundation;

public class ExecuteClass {

	public static void main(String[] args) {
		Foundation f = new Foundation();
		
		f.defaultNum=10;
		f.privateNum=20;
		f.protectedNum=30;
		f.publicNum=40;
		
		System.out.println(f.defaultNum);
		System.out.println(f.privateNum);
		System.out.println(f.protectedNum);
		System.out.println(f.publicNum);

	}

}