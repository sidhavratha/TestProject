package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class ZombieMarch {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(new File("input_zombie.txt")));
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
			
			int[] zombieDetail = new int[stationCount];
			for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
				zombieDetail[stationIndex] = Integer.parseInt(br.readLine());
			}
			
			
			//Print 
			printStationDetails(stations);
			printZombieDetails(zombieDetail);
			
			int[] zombieDetailClone = null;
			for(int timeStep=0;timeStep<timeStepCount;timeStep++){
				zombieDetailClone = new int[stationCount];
				for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
					int zombieCount = 0;
					boolean extraSpent = false;
					System.out.println("At station : "+stationIndex);
					for(int nghStation : stations.get(stationIndex)){
						zombieCount+=zombieDetail[nghStation]/stations.get(nghStation).size();
						System.out.println(zombieDetail[nghStation]/stations.get(nghStation).size()+" zombie from "+nghStation);
					}
					
					
					zombieDetailClone[stationIndex]+=zombieCount;
					
					int extra = zombieDetail[stationIndex]%stations.get(stationIndex).size();
					if(extra>0){
						
						Set<Integer> given = new HashSet<Integer>();
						
						do{
							int currRand = (int)(Math.random()*stations.get(stationIndex).size());
							while(!given.add(currRand)){
								given.remove(currRand);
								currRand = (int)(Math.random()*stations.get(stationIndex).size());
							}
							zombieDetailClone[stations.get(stationIndex).get(currRand)]++;
							
							System.out.println("1 extra zombie to "+stations.get(stationIndex).get(currRand));
						}while(--extra!=0);
						/*
						for(int nghStation : stations.get(stationIndex)){
							zombieDetailClone[nghStation]++;
							
							if(--extra==0){
								break;
							}
						}*/
					}
					
				}
				zombieDetail=zombieDetailClone;
				printZombieDetails(zombieDetail);
			}
			
			
		}
		

	}
	

	public static void printStationDetails(Map<Integer,List<Integer>> stations){
		for(Integer station : stations.keySet()){
			System.out.print("Neighbour of station "+station+" are : ");
			for(Integer ngh : stations.get(station)){
				System.out.print(" "+ngh);
			}
			System.out.println();
		}
	}
	
	public static void printZombieDetails(int[] zombies){
		System.out.print("Zombies are : ");
		for(Integer zombie : zombies){
			System.out.print(" "+zombie);
		}
		System.out.println();
	}
	

}
