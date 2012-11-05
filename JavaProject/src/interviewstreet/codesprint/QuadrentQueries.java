package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class QuadrentQueries {

	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input_quadrentqueries.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pointCount = Integer.parseInt(br.readLine());
		int[] quadrents = new int[pointCount];
		
		List<Operation> xOpertaions = new ArrayList<Operation>();
		List<Operation> yOpertaions = new ArrayList<Operation>();
		
		for(int pointIndex=0;pointIndex<pointCount;pointIndex++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int xLoc=Integer.parseInt(st.nextToken());
			int yLoc=Integer.parseInt(st.nextToken());
			int quad = 0;
			if(xLoc>0){
				if(yLoc>0){
					quad=1;
				}else{
					quad=4;
				}
			}else{
				if(yLoc>0){
					quad=2;
				}else{
					quad=3;
				}
			}
			quadrents[pointIndex]=quad;
		}
		
		int queriesCount = Integer.parseInt(br.readLine());
		
		for(int queryIndex=0;queryIndex<queriesCount;queryIndex++){
			StringTokenizer stQuery = new StringTokenizer(br.readLine()," ");
			String queryType = stQuery.nextToken();
			int startIndex = Integer.parseInt(stQuery.nextToken())-1;
			int endIndex = Integer.parseInt(stQuery.nextToken())-1;
			
			if(queryType.equalsIgnoreCase("X")){
				
				Operation currXOpr = new Operation(startIndex, endIndex);
				
				int listCounter = 0;
				for(Operation existingOpr : xOpertaions){
					Operation first = null;
					Operation second = null;
					Operation op1 = null;
					Operation op2 = null;
					int firstStart = 0;
					if(currXOpr.start>existingOpr.start){
						first=existingOpr;
						second=currXOpr;
					}else{
						second=existingOpr;
						first=currXOpr;
					}
					
					if(first.end>second.start){
						op1=new Operation(first.start, second.start-1);
						if(first.end>second.end){
							op2=new Operation(second.end+1, first.end);
						}else{
							op2=new Operation(first.end+1, second.end);
						}
						
					}else{
						op1=new Operation(first.start, first.end);
						op2=new Operation(second.start, second.end);
					}
					existingOpr.start=op1.start;
					existingOpr.end=op1.end;
					currXOpr=op2;
				}
				xOpertaions.add(currXOpr);
				
				
				//xOpertaions.add(new Operation(startIndex, endIndex));
			}else if(queryType.equalsIgnoreCase("Y")){

				Operation currYOpr = new Operation(startIndex, endIndex);
				
				int listCounter = 0;
				for(Operation existingOpr : yOpertaions){
					Operation first = null;
					Operation second = null;
					Operation op1 = null;
					Operation op2 = null;
					int firstStart = 0;
					if(currYOpr.start>existingOpr.start){
						first=existingOpr;
						second=currYOpr;
					}else{
						second=existingOpr;
						first=currYOpr;
					}
					
					if(first.end>second.start){
						op1=new Operation(first.start, second.start-1);
						if(first.end>second.end){
							op2=new Operation(second.end+1, first.end);
						}else{
							op2=new Operation(first.end+1, second.end);
						}
						
					}else{
						op1=new Operation(first.start, first.end);
						op2=new Operation(second.start, second.end);
					}
					existingOpr.start=op1.start;
					existingOpr.end=op1.end;
					currYOpr=op2;
				}
				yOpertaions.add(currYOpr);
				
			}else if(queryType.equalsIgnoreCase("C")){
				System.out.println(xOpertaions.size()+":"+yOpertaions.size());
				System.out.println("X:");
				for(Operation operation :xOpertaions){
					System.out.println(operation.start+"--"+operation.end);
					for(int i=operation.start;i<=operation.end;i++){
						quadrents[i]=((quadrents[i]%2)==0)?(quadrents[i]==2?3:1):(quadrents[i]==1?4:2);
					}
				}
				
				System.out.println("Y:");
				for(Operation operation :yOpertaions){
					System.out.println(operation.start+"--"+operation.end);
					for(int i=operation.start;i<=operation.end;i++){
						quadrents[i]=((quadrents[i]%2)==0)?(quadrents[i]==2?1:3):(quadrents[i]==1?2:4);
					}
				}
				
				xOpertaions = new ArrayList<Operation>();
				yOpertaions = new ArrayList<Operation>();
				
				int[] points = new int[4];
				for(int i=startIndex;i<=endIndex;i++){
					points[quadrents[i]-1]+=1;
				}
				System.out.println(points[0]+" "+points[1]+" "+points[2]+" "+points[3]);
				//System.out.println();
			}
			
		}
	}
	
	static class Operation{
		int start,end;
		public Operation(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	
}
