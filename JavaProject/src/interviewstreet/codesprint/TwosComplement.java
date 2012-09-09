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
			return (32L*(-number))-(numberOfOnesFromZero(-(number+1)));
		}
		
		long startTime = System.currentTimeMillis();
		int count = number+1;
		long total = 0;
		int location = 1;
		long group = (int)Math.pow(2, location);
		long groupCount = (int)(count/group);
		
		while(groupCount>0){
			int curr = (int)(groupCount*(group/2));
			int left = (int)((count-(groupCount*(group)))-(group/2));
			//System.out.println("At "+location+" left "+left);
			total+=(curr+(left>0?left:0));
			//System.out.println("At location "+location+" found "+curr);
			group=(long)Math.pow(2,++location);
			groupCount=(long)(count/group);
		}
		//System.out.println("after loop group : "+group+" groupcount : "+groupCount);
		long left = count - (group/2);
		long endTime = System.currentTimeMillis();
		
		//System.out.println(endTime-startTime);
		
		//System.out.println("Left found "+left+" total "+total);
		//System.out.println("Final total "+(total+left));
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




/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwosComplement {

	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input01.txt")));
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
		int A = -1548535525;
		int B = 662630637;
		
		System.out.println(numberOfOnesBetween(A, B));
		
		System.out.println(noOfOne(A)+"::"+noOfOne(B));
		total=0;
		for(int i=B;i>=A;i--){
			//System.out.println(i+":"+noOfOne(i));
			total+= noOfOne(i);
		}
		System.out.println(total);
		
		
		
		//System.out.println(numberOfOnesFromZero(A));
	}
	
	public static long numberOfOnesBetween(int A,int B){
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
		return total;
	}
	
	public static long numberOfOnesFromZero(int number){
		
		if(number<0){
			long finalResult = (32L*(-number))-(numberOfOnesFromZero(-(number+1)));
			//System.out.println("Negative "+number+" result : "+finalResult);
			return finalResult;
		}
		
		long startTime = System.currentTimeMillis();
		int count = number+1;
		long total = 0;
		int location = 1;
		long group = (int)Math.pow(2, location);
		long groupCount = (int)(count/group);
		
		while(groupCount>0){
			int curr = (int)(groupCount*(group/2));
			int left = (int)((count-(groupCount*(group)))-(group/2));
			//System.out.println("At "+location+" left "+left);
			total+=(curr+(left>0?left:0));
			//System.out.println("At location "+location+" found "+(curr+(left>0?left:0))+" including left "+(left>0?left:0)+" current group "+group+" number "+number);
			group=(long)Math.pow(2,++location);
			//System.out.println("Group : "+group+" location : "+location);
			groupCount=(long)(count/group);
		}
		//System.out.println("after loop group : "+group+" groupcount : "+groupCount);
		//System.out.println("Count : "+count+" Group/2 : "+(group/2)+" Group : "+group);
		long left = (long)(count - (group/2));
		long endTime = System.currentTimeMillis();
		
		//System.out.println(endTime-startTime);
		
		//System.out.println("Left found "+left+" total "+total);
		//System.out.println("Final total for "+number+" is "+(total+left)+" with left as "+left);
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
*/



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
		//System.out.println(numberOfOnesFromZero(A));
	}
	
	public static long numberOfOnesFromZero(int number){
		
		if(number<0){
			return (32L*(-number))-(numberOfOnesFromZero(-(number+1)));
		}
		
		long startTime = System.currentTimeMillis();
		int count = number+1;
		long total = 0;
		int location = 1;
		long group = (int)Math.pow(2, location);
		long groupCount = (int)(count/group);
		
		while(groupCount>0){
			int curr = (int)(groupCount*(group/2));
			int left = (int)((count-(groupCount*(group)))-(group/2));
			//System.out.println("At "+location+" left "+left);
			total+=(curr+(left>0?left:0));
			//System.out.println("At location "+location+" found "+curr);
			group=(long)Math.pow(2,++location);
			groupCount=(long)(count/group);
		}
		//System.out.println("after loop group : "+group+" groupcount : "+groupCount);
		long left = count - (group/2);
		long endTime = System.currentTimeMillis();
		
		//System.out.println(endTime-startTime);
		
		//System.out.println("Left found "+left+" total "+total);
		//System.out.println("Final total "+(total+left));
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



*/