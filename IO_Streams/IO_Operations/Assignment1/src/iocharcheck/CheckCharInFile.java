package iocharcheck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckCharInFile {

	static String path = "D:\\Java_Platform-Enterprise_Edition\\IO_Streams\\IO_Operations\\Assignment1\\file.txt";
	
	public static void main(String[] args) {
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter char you want to count");
//		If we write word instead if char then it will read only first character of that word.
		char ch = sc.nextLine().charAt(0);
		int low = (int) Character.toLowerCase(ch);
		int high = (int) Character.toUpperCase(ch);
		
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(path));
			int readFile = br.read();
			while(readFile != -1) {
			
				if(readFile == low || readFile== high) {
					count++;
//					System.out.println(readFile);
				}
				
				readFile = br.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(count);
	}

}
