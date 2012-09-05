package techgig.quiz;

import java.io.*;
import java.util.StringTokenizer;
public class ValentineGift
{
	//Assume following return types while writing the code for this question. 
    public static int[] output1;

    public static void main(String args[]){
    	GetBrightnessValue(2, "(10,{10,6,3,9,7,2,5,8,4,1}),(9,{6,3,9,7,2,5,8,4,1})");
    }
	    
    public static void GetBrightnessValue(int input1,String input2)
    {
    	 StringTokenizer st = new StringTokenizer(input2,")(");
    	 while(st.hasMoreTokens()){
    		 StringTokenizer st2 = new StringTokenizer(st.nextToken(),"},{");
    		 
    		 if(st2.hasMoreTokens()){
    			 int noOfElements = Integer.parseInt(st2.nextToken());
	    		 int[] elements = new int[noOfElements];
	    		 for(int i=0;i<noOfElements;i++){
	    			 elements[i]=Integer.parseInt(st2.nextToken());
	    			 System.out.println(elements[i]);
	    		 }
	    		 
	    		 System.out.println("Brightness : "+solveBrightness(elements));
	    	 }
    	 }
    }
    public static float solveBrightness(int[] brightness){
		 int maxDifference = brightness.length /10;
		 if(maxDifference<3){
			 maxDifference = 3;
		 }
		 
		 float average = 0;
		 
		 for(int ele : brightness){
			 average +=ele;
		 }
		 
		 average /= brightness.length;
		 
		 
		 int largeSize = brightness.length - ((brightness.length - maxDifference + 1) / 2);
		 
		 float maxPossibleBrightness = largeSize*average;
		 
		 
		 return maxPossibleBrightness;
	 }
}