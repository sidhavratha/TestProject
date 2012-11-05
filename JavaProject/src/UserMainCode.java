import java.io.*;
import  java.util.*;

import techgig.quiz.TollTax;
import techgig.quiz.TollTax2;
public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
    public static int output1;

    private static List<String> cities = null;
    private static double[][] roads = null;
    
    
    public static void main(String args[]){
    	//Minimum_TollTax("{A,B,C,D,E,F}", 7,"{(A,B,4),(B,C,2),(C,D,3),(B,D,6),(B,E,9),(D,F,5),(E,F,4)}","{A,F}");
    	//System.out.println(output1);
    	/*Minimum_TollTax("{V1,V2,V3,V4,V5}", 10,"{(V1,V2,1),(V1,V5,5),(V1,V4,1),(V2,V1,9),(V2,V4,2),(V2,V3,3),(V3,V4,4),(V4,V3,2),(V4,V5,3),(V5,V1,3),}","{V5,V3}");
    	System.out.println(output1);*/
    	String val = "AU\" 30U\"";
    	System.out.println(val);
    	System.out.println(val.indexOf("\""));
    	System.out.println(val.replace("\"", "\\\""));
    	System.out.println(val.replaceAll("A", "B"));
    	
    }
    
    
    
    
    public static void Minimum_TollTax(String input1,int input2,String input3,String input4)
    {
    	
    	cities = new ArrayList<String>();
        StringTokenizer stCities = new StringTokenizer(input1,"{,}");
        while(stCities.hasMoreTokens()){
        	cities.add(stCities.nextToken());
        }
        
        roads = new double[cities.size()][cities.size()];
        for(int i=0;i<cities.size();i++){
        	for(int j=0;j<cities.size();j++){
            	roads[i][j] = (double)(5.0/0);
            	if(i==j) roads[i][j] = 0;
            }
        }
        
        
        
        input3= input3.substring(1);
        input3=input3.substring(0, input3.length()-1);
        System.out.println(input3);
        StringTokenizer stRoads = new StringTokenizer(input3);
        for(int i=0;i<input2;i++){
        	int x=cities.indexOf(stRoads.nextToken("),("));
        	int y=cities.indexOf(stRoads.nextToken("),("));
        	double distance=Double.parseDouble(stRoads.nextToken("),("));
        	if(roads[x][y]<distance) continue;
        	roads[x][y] = distance;
        	roads[y][x] = distance;
        }
        
        /*for(int i=0;i<cities.size();i++){
        	for(int j=0;j<cities.size();j++){
            	if(i!=j && 5.0/roads[i][j]==0.0){
            		roads[i][j] = roads[j][i];
            	}
            }
        }*/

        
        StringTokenizer stEndPodoubles = new StringTokenizer(input4,"{,}");
        int startIndex = cities.indexOf(stEndPodoubles.nextToken());
        int endIndex =  cities.indexOf(stEndPodoubles.nextToken());
        
        double minDistance = GetMinDistance(startIndex,endIndex);
        //TollTax2.printArray(roads);
        cities=null;
        roads=null;
        output1 = (int)minDistance;
	System.out.println(output1);
    }


public static double GetMinDistance(int startIndex,int endIndex){

	double[][] finalRoads = roads;
	int n = cities.size();

	int[][] path = new int[n][n];

	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			path[i][j]=-1;
	
	
	TollTax2.printArray(roads);
	
	for(int k=0;k<n;k++){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(finalRoads[i][k]+finalRoads[k][j] < finalRoads[i][j]){
					path[i][j] = k;
					finalRoads[i][j] = minimum(finalRoads[i][j],finalRoads[i][k]+finalRoads[k][j]);
				}
			}
		}
		System.out.println("Into : "+k);
		TollTax2.printArray(roads);
		TollTax2.printArray(path);
	}

	printPath(path, startIndex, endIndex);
	return finalRoads[startIndex][endIndex];


}

public static void printPath(int[][] path,int startIndex, int endIndex){
	if(path[startIndex][endIndex]!=-1){
		printPath(path,startIndex,path[startIndex][endIndex]);
		System.out.print(cities.get(path[startIndex][endIndex])+"->");
		printPath(path,path[startIndex][endIndex],endIndex);
	}
}

public static double minimum(double a,double b){return a>b?b:a;}
       
}