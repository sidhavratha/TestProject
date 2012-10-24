package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MeetingPoint {

	public static void main(String[] args) throws Exception{
		
		
		//BufferedReader br = new BufferedReader(new FileReader(new File("input_meetingpoint.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int houseCount = Integer.parseInt(br.readLine());
		House[] houses = new House[houseCount];
		double xAvg = 0;
		double yAvg = 0;
		for(int houseIndex=0;houseIndex<houseCount;houseIndex++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			House newHouse = new House(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
			xAvg+=(newHouse.xLoc)/houseCount;
			yAvg+=(newHouse.yLoc)/houseCount;
			houses[houseIndex]=newHouse;
		}
		
		double minDis = (5.0/0);
		int index = 0;
		
		House avgHouse = new House((long)xAvg, (long)yAvg);
		for(int houseIndex=0;houseIndex<houseCount;houseIndex++){
			double distance = avgHouse.distanceFrom(houses[houseIndex]);
			if(distance<minDis){
				minDis=distance;
				index=houseIndex;
			}
		}
		
		avgHouse = houses[index];
		long totalDistance = 0;
		for(int houseIndex=0;houseIndex<houseCount;houseIndex++){
			totalDistance += avgHouse.distanceFrom(houses[houseIndex]);
		}
		
		//System.out.println(index);
		System.out.println(totalDistance);
	}
	
	static class House{
		double xLoc;
		double yLoc;
		long distance;
		public House(long xLoc,long yLoc){
			this.xLoc=xLoc;
			this.yLoc=yLoc;
		}
		public House(double xLoc,double yLoc){
			this.xLoc=xLoc;
			this.yLoc=yLoc;
		}
		public double distanceFrom(House house){
			double xDis = this.xLoc-house.xLoc;
			if(xDis<0) xDis=-xDis;
			double yDis = this.yLoc-house.yLoc;
			if(yDis<0) yDis=-yDis;
			return xDis>yDis?xDis:yDis;
		}
	}
	
}
