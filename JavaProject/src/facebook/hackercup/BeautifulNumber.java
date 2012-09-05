package facebook.hackercup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulNumber {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCount = Integer.parseInt(br.readLine());
			for(int testIndex = 0;testIndex < testCount ; testIndex++){
				int number = Integer.parseInt(br.readLine());
				boolean player1Winner = isPlayer1Winner(number);
				if(player1Winner)System.out.println("First Player");
				else System.out.println("Second Player");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static boolean isPlayer1Winner(int number){
		boolean player1 = true;
		int possibilities = 0;
		
		do{
			int oneCount = noOfOnes(number);
			String binary = toBinary(number);
			int optimum = -1;
			possibilities=0;
			for(int i=binary.length()-1;i>=0;i--){
				int currNum = number -((number>>(binary.length()-1))<<i);
				if((number-currNum)<number && oneCount==noOfOnes(currNum)){
					if(optimum==-1)optimum=currNum;
					possibilities++;
				}
			}
			number = optimum;
			player1=!player1;
		}while(possibilities!=0);//
		return player1;
	}
	
	public static String toBinary(int number){
		String binary = "";
		while(number>0){
			binary=number % 2 + binary;
			number = number/2;
		}
		return binary;
	}
	
	public static int noOfOnes(int number){
		int i=0;
		while(number>0){
			if(number % 2 == 1) i++;
			number = number/2;
		}
		return i;
	}

}
