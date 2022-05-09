package assignmentfive;

import customException.InvalidAgeException;

public class Solution {
	
	public void checkAge(String name, int age) throws InvalidAgeException{
		if(age<18 || age>60) {
			throw new InvalidAgeException("InvalidAgeException");
		}else {
			System.out.println("You are good to go");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		try {
			s.checkAge("Tim", 10);
		}catch (InvalidAgeException ie) {
			System.out.println(ie);
		}
		
		System.out.println("Exit program.");
	}

}
