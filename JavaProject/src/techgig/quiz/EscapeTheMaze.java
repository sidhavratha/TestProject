package techgig.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EscapeTheMaze {
	
	public static int[] output1;
	
	public static void main(String args[]){
		 Escape_Maze(1,"(3,3,{{S,P,E},{P,W,P},{P,P,P}})");
	}
	
	static class Location{
		Node origin;
		Node destination;
		List<Node> exclusion;
		
		public Location(Node origin,Node destination,List<Node> exclusion){
			this.origin = origin;this.destination = destination; this.exclusion = exclusion;
		}
	}
	
	static class Node{
		int x,y;
		public Node(int x,int y){this.x=x;this.y=y;}
		public boolean equals(Object obj){
			if(obj instanceof Node && (((Node)obj).x == this.x) && (((Node)obj).y == this.y)){
				return true;
			}
			return false;
		}
	}
	
	public static void Escape_Maze(int input1,String input2){
		StringTokenizer st = new StringTokenizer(input2,")(");
		int[] output1 = new int[input1];
		int curr = 0;
		while(st.hasMoreTokens()){
			String currentTestCase = st.nextToken();
			if(!currentTestCase.equalsIgnoreCase(",")){
				StringTokenizer st2 = new StringTokenizer(currentTestCase, "{,}");
				int lines = Integer.parseInt(st2.nextToken());
				int chars = Integer.parseInt(st2.nextToken());
				char[][] maze = new char[lines][chars];
				
				Node startPoint = null;
				Node endPoint = null;
				
				for(int i=0;i<lines;i++){
					for(int j=0;j<chars;j++){
						maze[i][j]=st2.nextToken().charAt(0);
						if(maze[i][j]=='S'){
							startPoint = new Node(i,j);
						}
						else if(maze[i][j]=='E'){
							endPoint = new Node(i,j);
						}
					}
				}
				//printMaze(maze);
				
				int sol = solveMaze(maze,startPoint,endPoint);
				
				output1[curr++]=sol;
			}
		}
		for(int i : output1){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static int solveMaze(char[][] maze,Node start,Node end){
		
		Location loc = new Location(start,end,new ArrayList<Node>());
		List<Location> locations = new ArrayList<Location>();
		locations.add(loc);
		
		
		return findOptimal(maze,locations)-1;
	}
	
	public static int findOptimal(char[][] maze,List<Location> locations){
		
		int min = 99999;
		for(int i=0;i<locations.size();i++){
			List<Location> possibleLocations = new ArrayList<Location>();
			
			Node origin = locations.get(i).origin;
			Node destination = locations.get(i).destination;
			
			List exclusions = locations.get(i).exclusion;
			exclusions.add(origin);
			//System.out.println("Exploring location : Origin (" +origin.x+","+origin.y+")  Destination (" + destination.x + "," + destination.y+")");
			
			if((origin.x==destination.x && (origin.y+1==destination.y || origin.y-1==destination.y)) || (origin.y==destination.y && (origin.x+1==destination.x || origin.x-1==destination.x))){
				min = 0;
				break;
			}
			if(origin.x!=0 && maze[origin.x-1][origin.y]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x-1,origin.y))){
				possibleLocations.add(new Location(new Node(origin.x-1,origin.y),locations.get(i).destination,exclusions));
			}
			if(origin.y!=0 && maze[origin.x][origin.y-1]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x,origin.y-1))){
				possibleLocations.add(new Location(new Node(origin.x,origin.y-1),locations.get(i).destination,exclusions));
			}
			if(origin.x+1!=maze.length && maze[origin.x+1][origin.y]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x+1,origin.y))){
				possibleLocations.add(new Location(new Node(origin.x+1,origin.y),locations.get(i).destination,exclusions));
			}
			if(origin.y+1!=maze[0].length && maze[origin.x][origin.y+1]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x,origin.y+1))){
				possibleLocations.add(new Location(new Node(origin.x,origin.y+1),locations.get(i).destination,exclusions));
			}
			
			int tempmin = findOptimal(maze, possibleLocations);
			if(tempmin<min){
				min=tempmin;
			}
		}
		
		
		//System.out.println("Returning "+(min+1));
		return min+1;
	}
	
	
	public static void printMaze(char[][] maze){
		int lines = maze.length;
		int chars = maze[0].length;
		for(int i=0;i<lines;i++){
			for(int j=0;j<chars;j++){
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}

}









/*import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UserMainCode
{
	//Assume following return types while writing the code for this question. 
    public static int[] output1;

	    
    static class Location{
		Node origin;
		Node destination;
		List<Node> exclusion;
		
		public Location(Node origin,Node destination,List<Node> exclusion){
			this.origin = origin;this.destination = destination; this.exclusion = exclusion;
		}
	}
	
	static class Node{
		int x,y;
		public Node(int x,int y){this.x=x;this.y=y;}
		public boolean equals(Object obj){
			if(obj instanceof Node && (((Node)obj).x == this.x) && (((Node)obj).y == this.y)){
				return true;
			}
			return false;
		}
	}
	
	public static void Escape_Maze(int input1,String input2){
		StringTokenizer st = new StringTokenizer(input2,")(");
		output1 = new int[input1];
		int curr = 0;
		while(st.hasMoreTokens()){
			String currentTestCase = st.nextToken();
			if(!currentTestCase.equalsIgnoreCase(",")){
				StringTokenizer st2 = new StringTokenizer(currentTestCase, "{,}");
				int lines = Integer.parseInt(st2.nextToken());
				int chars = Integer.parseInt(st2.nextToken());
				char[][] maze = new char[lines][chars];
				
				Node startPoint = null;
				Node endPoint = null;
				
				for(int i=0;i<lines;i++){
					for(int j=0;j<chars;j++){
						maze[i][j]=st2.nextToken().charAt(0);
						if(maze[i][j]=='S'){
							startPoint = new Node(i,j);
						}
						else if(maze[i][j]=='E'){
							endPoint = new Node(i,j);
						}
					}
				}
				//printMaze(maze);
				
				int sol = solveMaze(maze,startPoint,endPoint);
				
				output1[curr++]=sol;
			}
		}
		
	}
	
	public static int solveMaze(char[][] maze,Node start,Node end){
		
		Location loc = new Location(start,end,new ArrayList<Node>());
		List<Location> locations = new ArrayList<Location>();
		locations.add(loc);
		
		
		return findOptimal(maze,locations)-1;
	}
	
	public static int findOptimal(char[][] maze,List<Location> locations){
		
		int min = 99999;
		for(int i=0;i<locations.size();i++){
			List<Location> possibleLocations = new ArrayList<Location>();
			
			Node origin = locations.get(i).origin;
			Node destination = locations.get(i).destination;
			
			List exclusions = locations.get(i).exclusion;
			exclusions.add(origin);
			//System.out.println("Exploring location : Origin (" +origin.x+","+origin.y+")  Destination (" + destination.x + "," + destination.y+")");
			
			if((origin.x==destination.x && (origin.y+1==destination.y || origin.y-1==destination.y)) || (origin.y==destination.y && (origin.x+1==destination.x || origin.x-1==destination.x))){
				min = 0;
				break;
			}
			if(origin.x!=0 && maze[origin.x-1][origin.y]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x-1,origin.y))){
				possibleLocations.add(new Location(new Node(origin.x-1,origin.y),locations.get(i).destination,exclusions));
			}
			if(origin.y!=0 && maze[origin.x][origin.y-1]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x,origin.y-1))){
				possibleLocations.add(new Location(new Node(origin.x,origin.y-1),locations.get(i).destination,exclusions));
			}
			if(origin.x+1!=maze.length && maze[origin.x+1][origin.y]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x+1,origin.y))){
				possibleLocations.add(new Location(new Node(origin.x+1,origin.y),locations.get(i).destination,exclusions));
			}
			if(origin.y+1!=maze[0].length && maze[origin.x][origin.y+1]=='P' && !locations.get(i).exclusion.contains(new Node(origin.x,origin.y+1))){
				possibleLocations.add(new Location(new Node(origin.x,origin.y+1),locations.get(i).destination,exclusions));
			}
			
			int tempmin = findOptimal(maze, possibleLocations);
			if(tempmin<min){
				min=tempmin;
			}
		}
		
		
		//System.out.println("Returning "+(min+1));
		return min+1;
	}

}*/