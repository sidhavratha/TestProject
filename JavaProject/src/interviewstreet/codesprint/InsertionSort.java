package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Locale;
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
					
				
				double[] sortedTree = new double[elementCount];
				for(int j=0;j<elementCount;j++){
					sortedTree[j] = -5.0/0;  //initialize to -Infinity
				}
				//Heap Ready
				
				
				int swapCount = 0;
				for(int i=1,location=0;i<elements.length;i++,location=0){
					/*for(int j=i-1;j>=0;j--){
						if(elements[j]>elements[i]){
							swapCount++;
						}
					}*/
					do{
						if(location>=sortedTree.length){
							break;
						}
						else if(sortedTree[location]>elements[i]){
							int rightTreeEle = getTreeElementCount(sortedTree,(2*location)+2);
							swapCount+=rightTreeEle+1;
							location=(2*location)+1;
						}else{
							location=(2*location)+2;
						}
					}while(true);
					
					
					//put current element in sortedMap
					
					
				}
				
				System.out.println(swapCount);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	
	public static int getTreeElementCount(double[] tree,int location){
		int retValue = 0;
		if(location<tree.length && tree[location]!=(-5.0/0)){
			retValue=1;
			if((2*location)+1<tree.length && tree[(2*location)+1]!=(-5.0/0)){
				retValue+=getTreeElementCount(tree, (2*location)+1)+1;
			}
			if((2*location)+2<tree.length && tree[(2*location)+2]!=(-5.0/0)){
				retValue+=getTreeElementCount(tree, (2*location)+2)+1;
			}
		}

		return retValue;
	}
	
	public static void rotateLeft(double[] tree,int location){
		double temp = tree[(location/2)-1];
		//tree[]
	}

}
