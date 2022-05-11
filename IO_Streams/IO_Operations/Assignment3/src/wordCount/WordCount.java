package wordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCount {

	static String path = "D:\\Java_Platform-Enterprise_Edition\\IO_Streams\\IO_Operations\\Assignment3\\file.txt";
	
	public static void main(String[] args) {		
		
		 HashMap<String, Integer> map = new HashMap<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			
			while((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				for(int i=0; i<arr.length; i++) {
					if(!map.containsKey(arr[i])) {
						map.put(arr[i], 1);
					}else {
						int key = map.get(arr[i]);
						map.put(arr[i], ++key);
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(map);

	}

}
