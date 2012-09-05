package facebook.hackercup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BillBoards {


	
	public static void main(String[] args) {
		int testCaseCount = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("billboards.txt")));
			
			FileWriter fw = new FileWriter(new File("billboards-output.txt"));
			if(br.ready()){
				testCaseCount = Integer.parseInt(br.readLine());
			}
			
			for(int i=0;i<testCaseCount;i++){
				String currentTestCase = br.readLine();
				
				StringTokenizer stokenizer = new StringTokenizer(currentTestCase," ");
				int width = Integer.parseInt(stokenizer.nextToken());
				int height = Integer.parseInt(stokenizer.nextToken());
				String testCaseText = "";
				List<Integer> wordLengthList = new ArrayList<Integer>();
				while(stokenizer.hasMoreTokens()){
					if(!testCaseText.equalsIgnoreCase("")) testCaseText+=" ";
					String currToken =stokenizer.nextToken();
					testCaseText+=currToken;
					wordLengthList.add(currToken.length());
				}
				
				//Everything is ready.....................
				int[] wordLengths = new int[wordLengthList.size()];
				int counter=0;
				int totalLength = 0;
				for(int word : wordLengthList){
					wordLengths[counter++] = word;
					if(totalLength!=0)totalLength++;
					totalLength+=word;
				}
				
				int fontUpperLimit  = (int)Math.sqrt((height*width)/totalLength);
				int font = checkFissibilityForFont(wordLengths, width, height, fontUpperLimit);
				
				fw.write((i!=0?"\n":"")+"Case #"+(i+1)+": "+font);
				
				System.out.println("For case : "+testCaseText+"\nFound font is : "+font);
				System.out.println("------------------------------------------------------------------------");
				
			}
			
			fw.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public static int checkFissibilityForFont(int[] wordLengths,int width,int height,int font){
		
		int lines=1;
		int words = 0;
		int lineSum = 0;
		boolean fissible = true;
		
		if(font<1){
			return 0;
		}
		while(words!=wordLengths.length){
			lineSum=0;
			boolean wordsFinished = false;
			while(lineSum<width){
				if(words<wordLengths.length){
					if(lineSum!=0) lineSum+=font;
					lineSum+=(wordLengths[words++]*font);
				}
				else{
					wordsFinished = true;
					break;
				}
			}
			
			if(!wordsFinished && --words<wordLengths.length)++lines;
			
			if((lines)*font > height){
				fissible= false;
				break;
			}
		}
		
		if(!fissible){
			font = checkFissibilityForFont(wordLengths, width, height, font-1);
		}
		
		return font;
	}
	
}
