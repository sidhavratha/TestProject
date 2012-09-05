package techgig.quiz;

import java.io.*;
import  java.util.*;
public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
    public static String output1;

	    
    public static void rolling_dice(String input1,String input2)
    {
        //Write code here
    	
    	int[] outcomeCount = new int[11];
    	
    	StringTokenizer stPerson1= new StringTokenizer(input1.substring(input1.indexOf("{")+1,input1.lastIndexOf("}")),",");
    	StringTokenizer stPerson2= new StringTokenizer(input2.substring(input2.indexOf("{")+1,input2.lastIndexOf("}")),",");
    	boolean tokenExistPerson1 = true;
    	boolean tokenExistPerson2 = true;
    	while((tokenExistPerson1=stPerson1.hasMoreTokens()) & (tokenExistPerson2=stPerson2.hasMoreTokens())){
    		int currentOutcome = 0;
    		try{
    			currentOutcome = Integer.parseInt(stPerson1.nextToken().trim());
    		}catch(Exception ex){
    			continue;
    		}
    		outcomeCount[currentOutcome-2]++;
    		currentOutcome = 0;
    		try{
    			currentOutcome = Integer.parseInt(stPerson2.nextToken().trim());
    		}catch(Exception ex){
    			continue;
    		}
    		outcomeCount[currentOutcome-2]--;
    	}
    	if(!tokenExistPerson1 && !tokenExistPerson2){
    		for(int i : outcomeCount){
    			if(i!=0){
    				output1 = "Unlucky";
    				return;
    			}
    		}
    	}else{
    		output1 = "Unlucky";
    		System.out.println("Input not same");
			return;
    	}
    	output1 = "Lucky";
		return;
    }	
}