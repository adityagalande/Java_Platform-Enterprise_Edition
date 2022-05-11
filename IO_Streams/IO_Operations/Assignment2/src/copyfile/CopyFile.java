package copyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try {
			FileInputStream sourceFile = new FileInputStream("file1.txt");
			FileOutputStream targetFile = new FileOutputStream("file2.txt");
			
			int byteval;
			
			while((byteval = sourceFile.read()) != -1) {
				targetFile.write(byteval);
				System.out.println((char)byteval);
			}
			
			sourceFile.close();
			targetFile.close();
			System.out.println("File copied successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("File closed successfully");
	}

}
