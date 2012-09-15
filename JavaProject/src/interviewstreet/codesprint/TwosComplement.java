package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwosComplement {

	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(br.readLine());
		for(int i=0;i<testCount;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			long total=0;
			if(A<=B){
				if(A>0){
					total = numberOfOnesFromZero(B)-numberOfOnesFromZero(A-1);
				}else if(B>=0){
					total = numberOfOnesFromZero(B)+numberOfOnesFromZero(A);
				}else{
					total = numberOfOnesFromZero(A)-numberOfOnesFromZero(B+1);
				}
			}
			System.out.println(total);
		}
		//System.out.println(numberOfOnesFromZero(A));
	}
	
	public static long numberOfOnesFromZero(int number){
		
		if(number<0){
			long returnResult = (32L*((long)-((long)number)))-(numberOfOnesFromZero(-(number+1)));//(-number>0?(32L*((long)-number)):32)-(numberOfOnesFromZero(-(number+1)));
			System.out.println("Returning negative value as : "+ returnResult + " : "+(32L*((long)-(number-1))));
			return returnResult;
		}
		long startTime = System.currentTimeMillis();
		long count = number+1L;
		long total = 0;
		int location = 1;
		long group = (long)Math.pow(2, location);
		long groupCount = (long)(count/group);
		
		if(count<0){
			return 32L;
		}
		
		while(groupCount>0){
			int curr = (int)(groupCount*(group/2));
			int left = (int)((count-(groupCount*(group)))-(group/2));
			//System.out.println("At "+location+" left "+left);
			total+=(curr+(left>0?left:0));
			System.out.println("At location "+location+" found "+curr);
			group=(long)Math.pow(2,++location);
			groupCount=(long)(count/group);
		}
		//System.out.println("after loop group : "+group+" groupcount : "+groupCount);
		long left = count - (group/2);
		long endTime = System.currentTimeMillis();
		
		//System.out.println(endTime-startTime);
		
		System.out.println("Left found "+left+" total "+total);
		System.out.println("Final total "+(total+left));
		return (total+left);
	
	}
	public static int noOfOne(int number){
		int count = 0;
		while(number != 0){
			if((number & 1) == 1){
				count++;
			}
			number = number >>> 1; 
		}
		return count;
	}

}
/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(br.readLine());
		for(int i=0;i<testCount;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			long total=0;
			if(A<=B){
				if(A>0){
					total = numberOfOnesFromZero(B)-numberOfOnesFromZero(A-1);
				}else if(B>=0){
					total = numberOfOnesFromZero(B)+numberOfOnesFromZero(A);
				}else{
					total = numberOfOnesFromZero(A)-numberOfOnesFromZero(B+1);
				}
			}
			System.out.println(total);
		}
	}
	
	public static long numberOfOnesFromZero(int number){
		
		if(number<0){
			return (32L*((long)-((long)number)))-(numberOfOnesFromZero(-(number+1)));
		}
		long startTime = System.currentTimeMillis();
		long count = number+1L;
		long total = 0;
		int location = 1;
		long group = (long)Math.pow(2, location);
		long groupCount = (long)(count/group);
		
		if(count<0){
			return 32L;
		}
		
		while(groupCount>0){
			int curr = (int)(groupCount*(group/2));
			int left = (int)((count-(groupCount*(group)))-(group/2));
			total+=(curr+(left>0?left:0));
			group=(long)Math.pow(2,++location);
			groupCount=(long)(count/group);
		}
		long left = count - (group/2);
		long endTime = System.currentTimeMillis();
		return (total+left);
	
	}
}

 */

*/