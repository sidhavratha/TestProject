package techgig.quiz;

import java.io.*;
import  java.util.*;


public class TollTax2
{
	//Assume following return types while writing the code for this question. 
    public static int output1;

    private static List<String> cities = null;
    private static double[][] roads = null;

    /*public static void main(String[] args){
    	Minimum_TollTax("{AA,AB,C,D,E,F}", 7,"{(AA,AB,4),(AB,C,2),(C,D,3),(AB,D,6),(AB,E,9),(D,F,5),(E,F,4)}","{AA,F}");
    	//Minimum_TollTax("{V1,V2,V3,V4,V5}", 7,"{(AA,AB,4),(AB,C,2),(C,D,3),(AB,D,6),(AB,E,9),(D,F,5),(E,F,4)}","{AA,F}");
    }*/
    
    public static void main (String args[])


    {

    String a, b, c, d;


    a = "Hello1234";


    b = "Hello" + String.valueOf(1234);


    c = "Hello" + "1234";

    	
    d = new String (new char[]
    {'H', 'e', 'l', 'l', 'o', '1', '2', '3', '4'});


    System.out.print (a == b);


    System.out.print (" ");


    System.out.print (a.equals(b));


    System.out.print (" ");


    System.out.print (a == c);


    System.out.print (" ");


    System.out.print (a.equals(c));


    System.out.print (" ");


    System.out.print (a == d);


    System.out.print (" ");


    System.out.print (a.equals(d));


    System.out.print (" ");


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
        	roads[x][y] = distance;
        	roads[y][x] = distance;
        }
        
        StringTokenizer stEndPodoubles = new StringTokenizer(input4,"{,}");
        int startIndex = cities.indexOf(stEndPodoubles.nextToken());
        int endIndex =  cities.indexOf(stEndPodoubles.nextToken());
        
        double minDistance = GetMinDistance(startIndex,endIndex);
        cities=null;
        roads=null;
        output1 = (int)minDistance;
	System.out.println(output1);
    }


public static double GetMinDistance(int startIndex,int endIndex){

	double[][] finalRoads = roads;

int n = cities.size();
for(int k=0;k<n;k++)
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
			finalRoads[i][j] = minimum(finalRoads[i][j],finalRoads[i][k]+finalRoads[k][j]);

printArray(finalRoads);

return finalRoads[startIndex][endIndex];


}

public static void printArray(double[][] A){
	int lines = A.length;
	int chars = A[0].length;
	for(int i=0;i<lines;i++){
		for(int j=0;j<chars;j++){
			System.out.print(A[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("-------------------------------------");
}

public static void printArray(int[][] A){
	int lines = A.length;
	int chars = A[0].length;
	for(int i=0;i<lines;i++){
		for(int j=0;j<chars;j++){
			System.out.print(A[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("-------------------------------------");
}

public static double minimum(double a,double b){return a>b?b:a;}
       
}