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

public class ZombieMarch {

	public static void main(String[] args) throws Exception{
		
		long startTime = System.currentTimeMillis();
		for(int timeStep=0;timeStep<10000000;timeStep++){
			double[] zombieDetailClone = new double[1000000];
			for(int stationIndex=0;stationIndex<1000000;stationIndex++){
				double zombieCount = 0;
				for(int nghStationIndex = 0;nghStationIndex<999999;nghStationIndex++){
					zombieCount+=zombieDetailClone[nghStationIndex]/999999;
				}
				zombieDetailClone[stationIndex]+=zombieCount;
				System.out.println(timeStep+"/"+stationIndex);
			}
			//zombieDetail=zombieDetailClone;
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken to execute 1 test case of 100000 stations for 10000000 timesteps is : "+(endTime-startTime)/1000);
		System.exit(0);
		
		
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input_zombie_00.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
				zombieDetail[stationIndex] = Integer.parseInt(br.readLine());
			}
			double[] zombieDetailClone = null;
			for(int timeStep=0;timeStep<timeStepCount;timeStep++){
				zombieDetailClone = new double[stationCount];
				for(int stationIndex=0;stationIndex<stationCount;stationIndex++){
					double zombieCount = 0;
					for(int nghStation : stations.get(stationIndex)){
						zombieCount+=zombieDetail[nghStation]/stations.get(nghStation).size();
					}
					zombieDetailClone[stationIndex]+=zombieCount;
					
				}
				zombieDetail=zombieDetailClone;
				
			}
			printStationDetails(stations);
			printZombieDetails(zombieDetail);
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
			System.out.print(" "+Math.round(zombie));
		}
		System.out.println();
	}

	public static void printZombieDetailsSorted(double[] zombies){
		Arrays.sort(zombies);
		for(int i=zombies.length-1;i>=zombies.length-5;i--){
			System.out.print(" "+Math.round(zombies[i]));
		}
		System.out.println();
	}
	

}
