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
			String largeN = "18794630773460178101742670493883191390743597826923079533199667903991430393463990462500322752062869664969026409174076912867222446746310051635510258172105034070506806228555577773599018819952185016092141574603857551738968553782672643049704163674318579695215402562964641111900657274032612661770435202254364177910753450214277150377049334509093906874400306682949871260040370515062243982543271073443613028133844603853807066311479739789908983610180228625059956919930500586048799830730348503994503184106117058";
			int P = 177080341;
			
			String pCount = "";
			int diff = 0;
			
			int counter = 0;
			int currentBiggerNumber = 0;
			while(counter!=largeN.length()){
				currentBiggerNumber=((currentBiggerNumber%P)*10)+((largeN.charAt(counter))-48);
				pCount+=currentBiggerNumber/P;
				currentBiggerNumber=currentBiggerNumber%P;
				counter++;
				/*if(currentBiggerNumber<P){
					if(currentBiggerNumber==0 && ((largeN.charAt(counter))-48)==0){
						pCount+="0";
					}
					currentBiggerNumber=(currentBiggerNumber*10)+((largeN.charAt(counter))-48);
					counter++;
				}
				else{
					pCount+=(currentBiggerNumber/P);
					currentBiggerNumber=(currentBiggerNumber%P);
				}*/
			}
			
			boolean nonZeroFound = false;
			counter=0;
			while(!nonZeroFound){
				if(counter<pCount.length() && pCount.charAt(counter)-48==0){
					counter++;
				}else{
					nonZeroFound=true;
				}
			}
			
			
			
			pCount = pCount.substring(counter==pCount.length()?counter-1:counter, pCount.length());
			diff=currentBiggerNumber;
			System.out.println(pCount+","+diff);
			
			
			String nonZeroCount = multiply(addition(divide(pCount, 2),1+""), diff+1);
			String zeroCount = substract(addition(largeN, 1+""),multiply(nonZeroCount, 2));
			
			System.out.println("Final count os zeros is : "+zeroCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String multiply(String bigNumber,int smallNumber){
		int counter = 0;
		String oldValue = "0";
		for(int i=bigNumber.length()-1;i>=0;i--){
			oldValue = addition(oldValue,(smallNumber*(bigNumber.charAt(i)-48)*(int)Math.pow(10, counter++))+"");
		}
		return oldValue;
	}
	public static String divide(String bigNumber,int smallNumber){
		return "";
	}
	public static String substract(String bigNumber1,String bigNumber2){
		System.out.println("Substract called for : "+bigNumber1+":"+bigNumber2);
		String bigger = (bigNumber1.length()>bigNumber2.length()?bigNumber1:bigNumber2);
		String smaller = (bigNumber1.length()>bigNumber2.length()?bigNumber2:bigNumber1);
		System.out.println("Initially bigger/smaller : "+bigger+"/"+smaller);
		int lengthDifference = bigger.length()-smaller.length();
		if(lengthDifference!=0){
			for(int i=1;i<=lengthDifference;i++){
				smaller="0"+smaller;
			}
		}else{
			for(int i=0;i<bigger.length();i++){
				if(smaller.charAt(i)>bigger.charAt(i)){
					String temp = bigger;
					bigger = smaller;
					smaller = temp;
				}
			}
		}
		System.out.println("Bigger/Smaller:"+bigger+"/"+smaller);
		String finalResult = "";
		for(int i=bigger.length()-1;i>=0;i--){
			int biggerDigit =bigger.charAt(i)-48;
			int smallerDigit = smaller.charAt(i)-48;
			if(biggerDigit<smallerDigit){
				int counter = i-1;
				biggerDigit+=10;
				while(bigger.charAt(counter)-48==0){
					System.out.println(bigger.substring(0, counter)+",9,"+bigger.substring(counter+1,bigger.length()));
					bigger=bigger.substring(0, counter)+"9"+bigger.substring(counter+1,bigger.length());
					System.out.println("Bigger is 1: "+bigger);
					counter--;
				}
				bigger=bigger.substring(0, counter)+(bigger.charAt(counter)-48-1)+bigger.substring(counter+1,bigger.length());
				System.out.println("Bigger is 2: "+bigger);
			}
			System.out.println("Bigger is 3: "+bigger);
			System.out.println(biggerDigit-smallerDigit+","+finalResult);
			finalResult=(biggerDigit-smallerDigit)+finalResult;
		}
		
		System.out.println("Substract result is : "+finalResult);
		boolean nonZeroFound = false;
		int counter=0;
		while(!nonZeroFound){
			if(counter<finalResult.length() && finalResult.charAt(counter)-48==0){
				counter++;
			}else{
				nonZeroFound=true;
			}
		}
		
		
		
		finalResult = finalResult.substring(counter==finalResult.length()?counter-1:counter, finalResult.length());
		
		
		return finalResult;
	}
	public static String addition(String bigNumber1,String bigNumber2){
		//System.out.println("Addition called for : "+bigNumber1+" :: "+bigNumber2);
		String bigger = (bigNumber1.length()>bigNumber2.length()?bigNumber1:bigNumber2);
		String smaller = (bigNumber1.length()>bigNumber2.length()?bigNumber2:bigNumber1);
		int lengthDifference = bigger.length()-smaller.length();
		for(int i=1;i<=lengthDifference;i++){
			smaller="0"+smaller;
		}
		int carry = 0;
		String addValue = "";
		//System.out.println("Bigger length : "+bigger.length()+":"+smaller.length());
		for(int i=bigger.length()-1;i>=0;i--){
			addValue=(((smaller.charAt(i)-48)+(bigger.charAt(i)-48))+carry)%10+addValue;
			carry=(((smaller.charAt(i)-48)+(bigger.charAt(i)-48))+carry)/10;
		}
		
		return (carry>0?carry+"":"")+addValue;
	}

}
