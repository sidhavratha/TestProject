package techgig.quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
public class TollTax
{
	//Assume following return types while writing the code for this question. 
    public static int output1;

    private static List<String> cities = null;
    private static int[][] roads = null;
    public static void main(String args[]){
    	Minimum_TollTax("{A,B,C,D,E,F}", 7,"{(A,B,4),(B,C,2),(C,D,3),(B,D,6),(B,E,9),(D,F,5),(E,F,4)}","{B,A}");
    }
    
    public static void Minimum_TollTax(String input1,int input2,String input3,String input4)
    {
    	
    	cities = new ArrayList<String>();
        StringTokenizer stCities = new StringTokenizer(input1,"{,}");
        while(stCities.hasMoreTokens()){
        	cities.add(stCities.nextToken());
        }
        
        roads = new int[cities.size()][cities.size()];
        for(int i=0;i<cities.size();i++){
        	for(int j=0;j<cities.size();j++){
            	roads[i][j] = -1;
            }
        }
        
        
        
        input3= input3.substring(1);
        input3=input3.substring(0, input3.length()-1);
        System.out.println(input3);
        StringTokenizer stRoads = new StringTokenizer(input3);
        for(int i=0;i<input2;i++){
        	//System.out.print(+" ");
        	int x=cities.indexOf(stRoads.nextToken("),("));
        	int y=cities.indexOf(stRoads.nextToken("),("));
        	int distance=Integer.parseInt(stRoads.nextToken("),("));
        	roads[x][y] = distance;
        	roads[y][x] = distance;
        }
        
        StringTokenizer stEndPoints = new StringTokenizer(input4,"{,}");
        int startIndex = cities.indexOf(stEndPoints.nextToken());
        int endIndex =  cities.indexOf(stEndPoints.nextToken());
        
        //printArray(roads);
        int minDistance = GetMinDistance(startIndex,endIndex,new HashSet<Integer>());
        cities=null;
        roads=null;
        output1 = minDistance;
        System.out.println("Minimum distance  is "+minDistance);
    }
    
    
    
    public static int GetMinDistance(int startIndex,int endIndex,Set<Integer> exclusion){
    	
    	int min = -1;
    	Set<Integer> enhancedExclusion = cloneSet(exclusion);
    	
    	enhancedExclusion.add(startIndex);
    	System.out.println("From "+cities.get(startIndex)+" to "+cities.get(endIndex));
    	if(startIndex==endIndex) return 0;
    	
    	for(int i=0;i<cities.size();i++){
    		if(exclusion.contains(i)||roads[startIndex][i]==-1){
    			continue;
    		}
    		
    		int currValue = GetMinDistance(i, endIndex, enhancedExclusion);
    		if((min==-1 && currValue!=-1) || min>currValue+roads[startIndex][i]){
    			min = currValue+roads[startIndex][i];
    		}
    	}
    	
    	System.out.println("From "+cities.get(startIndex)+" to "+cities.get(endIndex)+" returning minimum distnace : "+min);
    	
    	return min;
    }
    
    private static Set<Integer> cloneSet(Set<Integer> list){
    	Set<Integer> newList = new HashSet<Integer>();
    	Iterator<Integer> itr = list.iterator();
    	while(itr.hasNext()){
    		newList.add(itr.next());
    	}
    	return newList;
    }
        
}




/*
import java.io.*;
import  java.util.*;
public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
    public static int output1;

    private static List<String> cities = null;
    private static int[][] roads = null;
    
    public static void Minimum_TollTax(String input1,int input2,String input3,String input4)
    {
    	
    	cities = new ArrayList<String>();
        StringTokenizer stCities = new StringTokenizer(input1,"{,}");
        while(stCities.hasMoreTokens()){
        	cities.add(stCities.nextToken());
        }
        
        roads = new int[cities.size()][cities.size()];
        for(int i=0;i<cities.size();i++){
        	for(int j=0;j<cities.size();j++){
            	roads[i][j] = -1;
            }
        }
        
        
        
        input3= input3.substring(1);
        input3=input3.substring(0, input3.length()-1);
        System.out.println(input3);
        StringTokenizer stRoads = new StringTokenizer(input3);
        for(int i=0;i<input2;i++){
        	int x=cities.indexOf(stRoads.nextToken("),("));
        	int y=cities.indexOf(stRoads.nextToken("),("));
        	int distance=Integer.parseInt(stRoads.nextToken("),("));
        	roads[x][y] = distance;
        	roads[y][x] = distance;
        }
        
        StringTokenizer stEndPoints = new StringTokenizer(input4,"{,}");
        int startIndex = cities.indexOf(stEndPoints.nextToken());
        int endIndex =  cities.indexOf(stEndPoints.nextToken());
        
        int minDistance = GetMinDistance(startIndex,endIndex,new HashSet<Integer>());
        cities=null;
        roads=null;
        output1 = minDistance;
    }


public static int GetMinDistance(int startIndex,int endIndex){

	int[][] finalRoads = roads;

int n = cities.size();
for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
		finalRoads[i][j] = roads[i][j];

for(int i=0;i<n;i++)
	for(int j=0;j<cities.size();j++)
		for(int k=0;k<cities.size();k++)
			finalRoads[i][j] = minimum(finalRoads[i][j],finalRoads[i][k]+finalRoads[k][j];


return finalRoads[startIndex][endIndex];


}
       
}
*/
