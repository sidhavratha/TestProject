package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Toffees {

	
	public static void main(String[] args) {
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer studentCount = Integer.parseInt(br.readLine());
			int prevStudentRank = -1;
			int currStudentRank = -1;
			int lastToffeeCount = 1;
			int toffeeCount = 0;
			int decreases = 0;
			int deepFallCount = 0;
			for(int i=0;i<studentCount;i++){
				currStudentRank = Integer.parseInt(br.readLine());
				//16387

				if(prevStudentRank==-1){
				}
				else if(currStudentRank>prevStudentRank){
					lastToffeeCount++;
					decreases=0;
					deepFallCount=0;
				}
				else if(currStudentRank<prevStudentRank){
					
					if(lastToffeeCount-1>1){
						decreases=0;
						deepFallCount = lastToffeeCount-2;
						//System.out.println("Decrease set to 0*************************with deep fall count as "+deepFallCount);
					}else{
						decreases++;
					}
					if(lastToffeeCount==1) {
						if(deepFallCount!=0 && decreases>deepFallCount) {
							deepFallCount=0;
							decreases++;
						}
						toffeeCount+=decreases;
						//System.out.println("Increase previous by "+decreases);
					}
					lastToffeeCount=1;
				}
				else if(currStudentRank==prevStudentRank){
					decreases=0;
					lastToffeeCount=1;
					deepFallCount=0;
					//System.out.println("This is equal################################################################################");
				}
				toffeeCount+=lastToffeeCount;
				prevStudentRank=currStudentRank;
				//System.out.println("Current Rank : "+currStudentRank+" toffees : "+lastToffeeCount);
			}
			System.out.println(toffeeCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
