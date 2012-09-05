package google.codejam;

import java.io.File;
import java.io.FileWriter;

public class Test
{
	public static void main (String args[]) throws Exception
	{
		File file = new File("hadoop-input.txt");
		FileWriter fw = new FileWriter(file);
		String[] possibleWords = {"This","That","What","Possible","Nobody","Hello","dramatically","Wassaypur","Happy","Flower","How"};
		long totalBytes = 0;
		int reset = 0;
		while(totalBytes<73400320){
			String currLine = "";
			int words = (int)(Math.random()*20+1);
			for(int j=0;j<words;j++){
				int currRandom = (int)((Math.random()*(possibleWords.length-1))+1);
				//System.out.print("Current random : "+currRandom);
				currLine += possibleWords[currRandom]+" ";
			}
			//System.out.println();
			currLine=currLine.trim();
			totalBytes+=(currLine+"\n").getBytes().length;
			reset+=(currLine+"\n").getBytes().length;
			if(reset>100000){
				System.out.println("Written : "+totalBytes);
				reset=0;
			}
			//System.out.println(currLine+"\n");
			fw.write(currLine+"\n");
		}
		System.out.println("Total Bytes : "+totalBytes);
		fw.close();
	}
}