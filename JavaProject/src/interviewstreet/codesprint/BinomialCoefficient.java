package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BinomialCoefficient {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("input_binomial.txt")));
			Integer testCaseCount = Integer.parseInt(br.readLine());
			for(int i=0;i<testCaseCount;i++){
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				int n = 12;//Integer.parseInt(st.nextToken());
				int P = Integer.parseInt(st.nextToken());
				if(n==P){
					System.out.println((n+1)-2);
				}
				else if(n>P){
					System.out.println((2*P)-n-1);
				}
				else if(n<P){
					System.out.println(0);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
