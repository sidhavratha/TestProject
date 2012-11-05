package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StockChart {

	public static void main(String[] args) throws Exception{
		
		//BufferedReader br = new BufferedReader(new FileReader(new File("input_stock_chart.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		
		Point startPoint = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		Point endPoint = new Point(startPoint.x,startPoint.y);
		
		Point maxY = new Point(startPoint.x,startPoint.y);
		Point minY = new Point(startPoint.x,startPoint.y);
		
		List<Line> lines = new ArrayList<Line>();
		lines.add(new Line(startPoint,endPoint,maxY,minY));
		
		for(int i=0;i<N-1;i++){
			st = new StringTokenizer(br.readLine()," ");
			Point currPoint = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			
			boolean newPointProcessed = false;
			int changeIndex = -2;
			boolean replace=false;
			List<Line> newLines = new ArrayList<Line>();
			for(Line line : lines){
				if(currPoint.x<line.pStart.x){
					//perform new startPoint logic
					// perform actual  new startPoint logic
					
					//Perform startPoint update validation logic
					if(verticalDistance(currPoint, line.pEnd, line.pMax)>D || verticalDistance(currPoint, line.pEnd, line.pMin)>D){
						//next lines have to be updated
						changeIndex = 0;
						
						newLines.add(new Line(currPoint,line.pStart,yDistance(currPoint, line.pStart)>0?line.pStart:currPoint,yDistance(currPoint, line.pStart)<0?line.pStart:currPoint));
					}else{
						changeIndex = lines.indexOf(line);
						replace=true;
						newLines.add(new Line(currPoint,line.pEnd,line.pMax,line.pMin));
					}
					newPointProcessed=true;
					break;
				}else if(currPoint.x>line.pEnd.x){
					//perform new endPoint logic
					continue;
				}else{
					if(currPoint.y>line.pMax.y){
						//perform new max Logic
						//line.pMax = currPoint;
						Point horzMin = null,horzMax = null;
						
						if(line.pMin.equals(line.pStart)){
							//newLines.add(new Line(line.pStart,currPoint,yDistance(line.pStart, currPoint)>0?horzMin:line.pStart,yDistance(line.pStart, currPoint)<=0?currPoint:line.pStart));
							horzMin=currPoint;
						}else{
							if(line.pMax.x<line.pMin.x && line.pMax.x<currPoint.x) horzMin = line.pMax;
							else if(line.pMax.x<line.pMin.x) horzMin = currPoint;
							else if(line.pMin.x<line.pMax.x &&  line.pMin.x<currPoint.x) horzMin = line.pMin;
							else if(line.pMin.x<line.pMax.x) horzMin = currPoint;
						}
						newLines.add(new Line(line.pStart,horzMin,yDistance(line.pStart, horzMin)>0?horzMin:line.pStart,yDistance(line.pStart, horzMin)<=0?horzMin:line.pStart));
						
						if(line.pMax.equals(line.pEnd)){
							horzMax=line.pMax;
						}else{
							if(line.pMax.x>line.pMin.x && line.pMax.x>currPoint.x) horzMax = line.pMax;
							else if(line.pMax.x>line.pMin.x) horzMax = currPoint;
							else if(line.pMin.x>line.pMax.x &&  line.pMin.x>currPoint.x) horzMax = line.pMin;
							else if(line.pMin.x>line.pMax.x) horzMax = currPoint;
						}
						newLines.add(new Line(horzMin,horzMax,yDistance(horzMin, horzMax)>0?horzMax:horzMin,yDistance(horzMin, horzMax)<=0?horzMin:horzMax));
						
						
						
						changeIndex = lines.indexOf(line);
						replace=true;
						/*
						if(horzMin!=line.pStart){
							newLines.add(new Line(line.pStart,horzMin,yDistance(line.pStart, horzMin)>0?horzMin:line.pStart,yDistance(line.pStart, horzMin)<=0?horzMin:line.pStart));
						}else{
							newLines.add(new Line(line.pStart,horzMin,yDistance(line.pStart, horzMin)>0?horzMin:line.pStart,yDistance(line.pStart, horzMin)<=0?horzMin:line.pStart));
						}
						newLines.add(new Line(horzMin,horzMax,yDistance(horzMin, horzMax)>0?horzMin:horzMax,yDistance(horzMin, horzMax)<=0?horzMin:horzMax));
						if(horzMax!=line.pEnd)newLines.add(new Line(horzMax,line.pEnd,yDistance(horzMax, line.pEnd)>0?line.pEnd:horzMax,yDistance(horzMax, line.pEnd)<=0?horzMin:horzMax));
						*/
					}else if(currPoint.y<line.pMin.y){
						//perform new min logic
						line.pMin = currPoint;
						Point horzMin = null,horzMax = null;
						if(line.pMax.x>line.pMin.x && line.pMax.x>currPoint.x) horzMax = line.pMax;
						else if(line.pMax.x>line.pMin.x) horzMax = currPoint;
						else if(line.pMin.x>line.pMax.x &&  line.pMin.x>currPoint.x) horzMax = line.pMin;
						else if(line.pMin.x>line.pMax.x) horzMax = currPoint;
						
						if(line.pMax.x<line.pMin.x && line.pMax.x<currPoint.x) horzMin = line.pMax;
						else if(line.pMax.x<line.pMin.x) horzMin = currPoint;
						else if(line.pMin.x<line.pMax.x &&  line.pMin.x<currPoint.x) horzMin = line.pMin;
						else if(line.pMin.x<line.pMax.x) horzMin = currPoint;
						
						changeIndex = lines.indexOf(line);
						replace=true;
						newLines.add(new Line(line.pStart,horzMin,yDistance(line.pStart, horzMin)>0?horzMin:line.pStart,yDistance(line.pStart, horzMin)<=0?horzMin:line.pStart));
						newLines.add(new Line(horzMin,horzMax,yDistance(horzMin, horzMax)>0?horzMin:horzMax,yDistance(horzMin, horzMax)<=0?horzMin:horzMax));
						newLines.add(new Line(horzMax,line.pEnd,yDistance(horzMax, line.pEnd)>0?line.pEnd:horzMax,yDistance(horzMax, line.pEnd)<=0?horzMin:horzMax));
					}
					newPointProcessed=true;
					break;
				}
			}
			if(!newPointProcessed){
				//perform actual new endPoint logic
				changeIndex = lines.size();
				Line lastLine = lines.get(changeIndex-1);
				Point pEnd = lines.get(changeIndex-1).pEnd;
				Point pStart = lines.get(changeIndex-1).pStart;
				
				if(pStart.equals(pEnd)) replace=true;
				
				if(verticalDistance(pStart, currPoint, lastLine.pMax)<=D && verticalDistance(pStart, currPoint, lastLine.pMin)<=D){
					//next lines have to be updated
					changeIndex = changeIndex-1;
					replace=true;
					newLines.add(new Line(pStart,currPoint,yDistance(currPoint, lastLine.pMax)>0?lastLine.pMax:currPoint,yDistance(currPoint, lastLine.pMin)<=0?lastLine.pMin:currPoint));
				}
				else{
					newLines.add(new Line(pEnd,currPoint,yDistance(currPoint, pEnd)>0?pEnd:currPoint,yDistance(currPoint, pEnd)<=0?pEnd:currPoint));
				}
			}
			
			
			if(changeIndex>=0 && changeIndex<=lines.size()){
				if(replace){
					lines.remove(changeIndex);
				}
				lines.addAll(changeIndex, newLines);
			}
			
		}
		System.out.println(lines.size()+1);
		for(Line line : lines){
			//System.out.println("Current line is : ("+line.pStart.x+","+line.pStart.y+") -> ("+line.pEnd.x+","+line.pEnd.y+") -> ");
			System.out.println((int)line.pStart.x+" "+(int)line.pStart.y);
		}
		System.out.println((int)lines.get(lines.size()-1).pEnd.x+" "+(int)lines.get(lines.size()-1).pEnd.y);

	}
	
	public static double verticalDistance(Point pStart, Point pEnd, Point pNew){
		double m =(pEnd.y-pStart.y)/(pEnd.x-pStart.x);
		double b = pStart.y - (m*pStart.x);
		double y = pNew.y - (m*pNew.x + b);
		if(y<0){
			y=-y;
		}
		//System.out.println("("+pStart.x+","+pStart.y+") -- ("+pEnd.x+","+pEnd.y+") :::== ("+pNew.x+","+pNew.y+") :="+y);
		return y;
	}
	
	public static double xDistance(Point p1,Point p2){
		return p2.x-p1.x;
	}
	
	public static double yDistance(Point p1,Point p2){
		return p2.y-p1.y;
	}
	
	static class Point{
		double x = 5.0/0;
		double y = 5.0/0;
		
		public Point(){}
		
		public Point(double x,double y){
			this.x=x;
			this.y=y;
		}
		
		public boolean equals(Object point){
			if(point instanceof Point && ((Point) point).x==this.x && ((Point) point).y==this.y){
				return true;
			}
			return false;
		}
	}
	
	static class Line{
		Point pStart;
		Point pEnd;
		Point pMax;
		Point pMin;
		public Line(){}
		public Line(Point pStart,Point pEnd,Point pMax,Point pMin){
			this.pStart=pStart;this.pEnd=pEnd;this.pMax=pMax;this.pMin=pMin;
		}
	}

}
