package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.rmi.CORBA.Tie;

public class ZombieMarch {

	public static void main(String[] args) throws Exception{
		
		//BufferedReader br = new BufferedReader(new FileReader(new File("input_zombie_00.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCount = Integer.parseInt(br.readLine());
		for(int testIndex=0;testIndex<testCount;testIndex++){
			
		
			String stationCountDetail = br.readLine();
			StringTokenizer st = new StringTokenizer(stationCountDetail," ");
			int stationCount = Integer.parseInt(st.nextToken());
			int roadCount =  Integer.parseInt(st.nextToken());
			int timeStepCount =  Integer.parseInt(st.nextToken());
			Map<Integer,List<Integer>> stations = new HashMap<Integer,List<Integer>>();
			StringTokenizer stEdge = null;
			int vertexA = -1,vertexB = -1;
			List<Integer> vertexANgh = null;
			List<Integer> vertexBNgh = null;
			for(int roadIndex=0;roadIndex<roadCount;roadIndex++){
				String edge = br.readLine();
				stEdge = new StringTokenizer(edge," ");
				vertexA = Integer.parseInt(stEdge.nextToken());
				vertexB = Integer.parseInt(stEdge.nextToken());
				if((vertexANgh=stations.get(vertexA))==null)stations.put(vertexA,(vertexANgh=new ArrayList<Integer>()));
				if((vertexBNgh=stations.get(vertexB))==null)stations.put(vertexB,(vertexBNgh=new ArrayList<Integer>()));
				vertexANgh.add(vertexB);
				vertexBNgh.add(vertexA);
			}
			
			
			
			double[] zombieDetail = new double[stationCount];
			double[] differenceFromLast = new double[stationCount];
			for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
				zombieDetail[stationIndex] = Integer.parseInt(br.readLine());
				differenceFromLast[stationIndex] = 0;
			}
			
			double[] zombieDetailClone = null;
			
			
			double lastMaxDifference = 5.0/0;
			int timeStep = 0;
			for(timeStep=0;timeStep<timeStepCount && lastMaxDifference>0.005;timeStep++){
				lastMaxDifference=-5.0/0;
				zombieDetailClone = new double[stationCount];
				for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
					double zombieCount = 0;
					for(int nghStation : stations.get(stationIndex)){
						zombieCount+=zombieDetail[nghStation]/stations.get(nghStation).size();
					}
					zombieDetailClone[stationIndex]+=zombieCount;
					differenceFromLast[stationIndex]=zombieDetail[stationIndex]-zombieDetailClone[stationIndex];
					if(lastMaxDifference<differenceFromLast[stationIndex]) lastMaxDifference=differenceFromLast[stationIndex];
					
				}
				zombieDetail=zombieDetailClone;
				//System.out.println("At step count "+timeStep+" max difference is "+lastMaxDifference);
			}
			//printStationDetails(stations);
			//System.out.println("Stopper at timeStep : "+timeStep);
			//printZombieDetails(zombieDetail);
			printZombieDetailsSorted(zombieDetail);
		
		//}
		
		}
		

	}
	
	public static void printStationDetails(Map<Integer,List<Integer>> stations){
		System.out.println("Stations are : ");
		System.out.println();
		for(Integer stationIndex : stations.keySet()){
			System.out.print("For station no. "+stationIndex+" : ");
			for(Integer nghStationIndex : stations.get(stationIndex)){
				System.out.print(" "+nghStationIndex);
			}
			System.out.println();
		}
	}
	
	
	public static void printZombieDetails(double[] zombies){
		for(double zombie : zombies){
			//System.out.print(" "+Math.round(zombie));
			System.out.print(" "+zombie);
		}
		System.out.println();
	}

	public static void printZombieDetailsSorted(double[] zombies){
		Arrays.sort(zombies);
		for(int i=zombies.length-1;i>=zombies.length-5;i--){
			System.out.print(" "+Math.round(zombies[i]));
			//System.out.print(" "+zombies[i]);
		}
		System.out.println();
	}
	

}

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCount = Integer.parseInt(br.readLine());
		for(int testIndex=0;testIndex<testCount;testIndex++){
			
		
			String stationCountDetail = br.readLine();
			StringTokenizer st = new StringTokenizer(stationCountDetail," ");
			int stationCount = Integer.parseInt(st.nextToken());
			int roadCount =  Integer.parseInt(st.nextToken());
			int timeStepCount =  Integer.parseInt(st.nextToken());
			Map<Integer,List<Integer>> stations = new HashMap<Integer,List<Integer>>();
			StringTokenizer stEdge = null;
			int vertexA = -1,vertexB = -1;
			List<Integer> vertexANgh = null;
			List<Integer> vertexBNgh = null;
			for(int roadIndex=0;roadIndex<roadCount;roadIndex++){
				String edge = br.readLine();
				stEdge = new StringTokenizer(edge," ");
				vertexA = Integer.parseInt(stEdge.nextToken());
				vertexB = Integer.parseInt(stEdge.nextToken());
				if((vertexANgh=stations.get(vertexA))==null)stations.put(vertexA,(vertexANgh=new ArrayList<Integer>()));
				if((vertexBNgh=stations.get(vertexB))==null)stations.put(vertexB,(vertexBNgh=new ArrayList<Integer>()));
				vertexANgh.add(vertexB);
				vertexBNgh.add(vertexA);
			}
			
			
			
			double[] zombieDetail = new double[stationCount];
			double[] differenceFromLast = new double[stationCount];
			for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
				zombieDetail[stationIndex] = Integer.parseInt(br.readLine());
				differenceFromLast[stationIndex] = 0;
			}
			
			double[] zombieDetailClone = null;
			
			
			double lastMaxDifference = 5.0/0;
			int timeStep = 0;
			for(timeStep=0;timeStep<timeStepCount && lastMaxDifference>0.005;timeStep++){
				lastMaxDifference=-5.0/0;
				zombieDetailClone = new double[stationCount];
				for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
					double zombieCount = 0;
					for(int nghStation : stations.get(stationIndex)){
						zombieCount+=zombieDetail[nghStation]/stations.get(nghStation).size();
					}
					zombieDetailClone[stationIndex]+=zombieCount;
					differenceFromLast[stationIndex]=zombieDetail[stationIndex]-zombieDetailClone[stationIndex];
					if(lastMaxDifference<differenceFromLast[stationIndex]) lastMaxDifference=differenceFromLast[stationIndex];
					
				}
				zombieDetail=zombieDetailClone;
			}
			printZombieDetailsSorted(zombieDetail);
		
		}
		

	}
	
	public static void printZombieDetailsSorted(double[] zombies){
		Arrays.sort(zombies);
		for(int i=zombies.length-1;i>=zombies.length-5;i--){
			System.out.print(" "+Math.round(zombies[i]));
		}
		System.out.println();
	}
	

}

*/