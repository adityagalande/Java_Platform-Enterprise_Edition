package codeSample;

public class sampleArray {
	int[] arr = {23,98,65,51};
	boolean flag = false;
	
	public boolean checkArray() {
		for(int num : arr) {
			if(num==65) {
				flag=true;
			}
		}
		return flag;
	}
}
