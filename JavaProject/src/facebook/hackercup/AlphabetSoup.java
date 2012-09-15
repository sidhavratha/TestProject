package facebook.hackercup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AlphabetSoup {

	/**
	 * @param args
	 */
	
	private static String commonText = "HACKERCUP";
	
	private static long commonTextLCM = 1;
	
	private static int[] alphabetLocations = new int[commonText.length()];
	private static int[] alphabetRepetition = new int[26];
	private static int[] alphabetCount = new int[26];
	
	static{
		

		/*System.out.println((byte)'A');
		System.out.println((byte)'Z');
		*/
		for(int i=0;i<commonText.length();i++){
			int currChar = (byte)commonText.charAt(i);
			if(alphabetRepetition[currChar-65]++==0){
				alphabetLocations[i]=(byte)currChar-64;
				commonTextLCM = findLCM(commonTextLCM,currChar);
				System.out.println(currChar+":"+commonTextLCM);
			}
		}
		
		/*printArray(alphabetLocations);
		printArray(alphabetRepetition);
		*/
		System.out.println(commonTextLCM);
	}
	
	private static long findLCM(long a,long b){
		long num1, num2;
		if (a > b) {
			num1 = a;
			num2 = b;
		} else {
			num1 = b;
			num2 = a;
		}
		for (long i = 1; i <= num2; i++) {
			if ((num1 * i) % num2 == 0) {
				return i * num1;
			}
		}
		
		return -1;
	}
	
	public static void printArray(int[] array){
		for(int ele : array){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			//br = new BufferedReader(new FileReader(new File("alphabetsoup.txt")));
			br = new BufferedReader(new FileReader(new File("alphabetsoup.txt")));
			fw = new FileWriter(new File("alphabetsoup-output.txt"));
			if(br.ready()){
				int testCaseCount = Integer.parseInt(br.readLine());
				for(int i=0;i<testCaseCount;i++){
					String testCaseText = br.readLine();
					
					String solution = solveTestCase(testCaseText);
					System.out.println("For test case : "+testCaseText+" \nsolution is : "+solution);
					fw.write((i!=0?"\n":"")+"Case #"+(i+1)+": "+solution);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static String solveTestCase(String testCaseText){
		//System.out.println("Solving test case : "+testCaseText);
		alphabetCount = new int[26];
		for(int i=0;i<testCaseText.length();i++){
			char currentChar = testCaseText.charAt(i);
			/*if(commonTextLCM % (byte)currentChar == 0){
				System.out.println("Matching letter at "+i+" : "+currentChar);
			}*/
			
			if(currentChar!=' '){
					if(alphabetRepetition[(byte)currentChar-65]!=0){
						alphabetCount[(byte)currentChar-65]++;
					}
			}
		}
		
		/*printArray(alphabetRepetition);
		printArray(alphabetCount);
		*/
		int minCount = (int)(5.0/0);
		
		for(int i=0;i<alphabetLocations.length;i++){
			if(alphabetLocations[i]!=0){
				int currCount = alphabetCount[alphabetLocations[i]-1]/alphabetRepetition[alphabetLocations[i]-1];
				if(currCount<minCount){
					minCount = currCount;
				}
			}
		}
		
		return minCount+"";
	}

}
