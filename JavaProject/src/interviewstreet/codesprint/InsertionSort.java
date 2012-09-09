package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("input04.txt")));
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCaseCount = Integer.parseInt(br.readLine());
			for(int count=0;count<testCaseCount;count++){
				int elementCount = Integer.parseInt(br.readLine());
				String elementsText = br.readLine();
				StringTokenizer st = new StringTokenizer(elementsText," ");
				int[] elements = new int[elementCount];
				for(int j=0;j<elementCount;j++){
					elements[j] = Integer.parseInt(st.nextToken());
				}
				
				// Data Ready
				int swapCount = 0;
				for(int i=1;i<elements.length;i++){
					for(int j=i-1;j>=0;j--){
						if(elements[j]>elements[i]){
							swapCount++;
						}
					}
				}
				
				System.out.println(swapCount);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
