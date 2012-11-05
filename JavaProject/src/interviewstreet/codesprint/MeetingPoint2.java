package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MeetingPoint2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(new File("input_meetingpoint.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int houseCount = Integer.parseInt(br.readLine());
		House[] houses = new House[houseCount];
		for(int houseIndex=0;houseIndex<houseCount-1;houseIndex++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			House newHouse = new House(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
			
			for(int prevHouseIndex=0;prevHouseIndex<houseIndex;prevHouseIndex++){
				House oldHouse = houses[prevHouseIndex];
				long distance = oldHouse.distanceFrom(newHouse);
				oldHouse.distance+=distance;
				newHouse.distance+=distance;
			}
			houses[houseIndex]=newHouse;
		}
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		House newHouse = new House(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
		long minDis = Long.MAX_VALUE;
		for(int prevHouseIndex=0;prevHouseIndex<houseCount-1;prevHouseIndex++){
			House oldHouse = houses[prevHouseIndex];
			long distance = oldHouse.distanceFrom(newHouse);
			oldHouse.distance+=distance;
			newHouse.distance+=distance;
			if(oldHouse.distance<minDis){
				minDis=oldHouse.distance;
			}
		}
		if(newHouse.distance<minDis){
			minDis=newHouse.distance;
		}
		
		System.out.println(minDis);
	}
	
	static class House{
		long xLoc;
		long yLoc;
		long distance;
		public House(long xLoc,long yLoc){
			this.xLoc=xLoc;
			this.yLoc=yLoc;
		}
		public long distanceFrom(House house){
			long xDis = this.xLoc-house.xLoc;
			if(xDis<0) xDis=-xDis;
			long yDis = this.yLoc-house.yLoc;
			if(yDis<0) yDis=-yDis;
			return xDis>yDis?xDis:yDis;
		}
	}
	
}
