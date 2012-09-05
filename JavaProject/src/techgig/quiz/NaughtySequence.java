package techgig.quiz;

import java.util.ArrayList;
import java.util.List;

public class NaughtySequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 6;
		boolean solutionFound =false;
		for(int j=1;j<=i;j++){
			List<String> sequneces = getSequences(j,i);
			if(!solutionFound) solutionFound = (sequneces.size()>0)?true:false;
			for(int k=0;k<sequneces.size();k++){
				System.out.print("{"+sequneces.get(k)+"}");
			}
		}
		
		if(!solutionFound){
			System.out.println("-999");
		}
		
	}
	
	public static List<String> getSequences(int k,int i){
		
		List<String> sequences = new ArrayList<String>();
		
		if(i==k){
			
			sequences.add(k+"");
		}
		else{
			if(k-2<i && k-2>0){
				List<String> subSequnece = getSequences(k-2,i-k);
				
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+","+subSeq);
				}
				
			}else{
				//discard the sequence
			}
			
			if(k<i && k>0){
				List<String> subSequnece = getSequences(k, i-k);
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+","+subSeq);
				}
			}else{
				//discard the sequence
			}
			
			if(k+3<i && k+3>0){
				List<String> subSequnece = getSequences(k+3, i-k);
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+","+subSeq);
				}
			}else{
				//discard the sequence
			}
		}
		
		
		return sequences;
	}

}



/*import java.io.*;
public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
    public static String output1;

	    
    public static void Strange_Sequences(int input1)
    {
      
        boolean solutionFound =false;
		for(int j=1;j<=input1;j++){
			List<String> sequneces = getSequences(j,input1);
			if(!solutionFound) solutionFound = (sequneces.size()>0)?true:false;
			for(int k=0;k<sequneces.size();k++){
				output1 += "{"+sequneces.get(k)+"}";
			}
		}
		
		if(!solutionFound){
			output1 = "-999";
		}
    }	
  
  	public static List<String> getSequences(int k,int i){
		
		List<String> sequences = new ArrayList<String>();
		
		if(i==k){
			
			sequences.add(k+"");
		}
		else{
			if(k-2<i && k-2>0){
				List<String> subSequnece = getSequences(k-2,i-k);
				
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+subSeq);
				}
				
			}else{
				//discard the sequence
			}
			
			if(k<i && k>0){
				List<String> subSequnece = getSequences(k, i-k);
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+subSeq);
				}
			}else{
				//discard the sequence
			}
			
			if(k+3<i && k+3>0){
				List<String> subSequnece = getSequences(k+3, i-k);
				for(int j=0;j<subSequnece.size();j++){
					String subSeq = subSequnece.get(j);
					sequences.add(k+subSeq);
				}
			}else{
				//discard the sequence
			}
		}
		
		
		return sequences;
	}

}*/