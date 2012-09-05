package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class TwosComplement {

	
	public static void main(String[] args) throws Exception{
		
		/*BufferedReader br = new BufferedReader(new FileReader(new File("input01.txt")));
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
		*/
		int A = -1548535525;
		int B = 662630637;
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
		int group = (int)Math.pow(2, location);
		int groupCount = (int)(count/group);
		
		while(groupCount>0){
			int curr = (groupCount*(group/2));
			int left = ((count-(groupCount*(group)))-(group/2));
			System.out.println("At "+location+" left "+left);
			total+=(curr+(left>0?left:0));
			System.out.println("At location "+location+" found "+curr);
			group=(int)Math.pow(2,++location);
			groupCount=(int)(count/group);
		}
		System.out.println("after loop group : "+group+" groupcount : "+groupCount);
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
