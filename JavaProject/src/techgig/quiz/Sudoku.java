package techgig.quiz;

import java.util.*;

public class Sudoku{

	//private static int[][] A = new int[9][9];

	static class Node{
		int x=-1,y=-1;
		Node(int x,int y){
			this.x=x;this.y=y;
		}
	}
	
	static class SudokuStatus{
		List<Integer>[][] possibilities;
		int[][] A;
		int status;
		int indexX,indexY;
	}
	
		public static int[][] solveSudoku(int[][] A){
		
		List<Integer>[][] possibilities = new ArrayList[9][9];
		
		int status = 81;
		
		
		//Initialize possibilities of each node as per values in Sudoku A.
		status = initializePossibilities(possibilities,A,status);
		
		A = influencePossibilitiesBySudoku(possibilities,A,status);
		/*printPossibilities(possibilities);
		
		//System.out.println("Final status : "+status);
		*/
		/*//System.out.println("Inside solvePuzzle");
		printSudoku(A);
		*/
		return A;
	} 
	
	
	
	private static int influencePossibilitiesByBoxCheck(List<Integer>[][] possibilities,int[][] A,List<Node> pendingChanges,int status,int x,int y){
		
		int boxX=x/3,boxY=y/3;
		
		for(int boxXX = 0;boxXX<3;boxXX++){
			int placableCount = 0;
			Node placable = null;
			if(boxXX!=boxX){
				for(int row=(boxXX*3),countX=0;countX<3;countX++,row++){
					for(int col=(boxY*3),countY=0;countY<3;countY++,col++){
						////System.out.println("Callling boxXX isPlacable at ("+row+","+col+") for value "+A[x][y]);
						if(isPlacable(possibilities,A,row,col,A[x][y])){
							placableCount++;
							placable=new Node(row,col);
						}
					}
				}
			}
			if(placableCount==1){
				////System.out.println("Placing at ("+placable.x+","+placable.y+") value "+A[x][y]);
				//System.out.println("3:At ("+placable.x+","+placable.y+") putting value "+A[x][y]);
				A[placable.x][placable.y] = A[x][y];
				possibilities[placable.x][placable.y] = new ArrayList<Integer>();
				pendingChanges.add(placable);
				status--;
			}
		}
		//System.out.println(":::::::::::::::::::::::::::::::::::::::");
		for(int boxYY = 0;boxYY<3;boxYY++){
			int placableCount = 0;
			Node placable = null;
			if(boxYY!=boxY){
				for(int row=(boxX*3),countX=0;countX<3;countX++,row++){
					for(int col=(boxYY*3),countY=0;countY<3;countY++,col++){
						////System.out.println("Callling boxYY isPlacable at ("+row+","+col+") for value "+A[x][y]);
						if(isPlacable(possibilities,A,row,col,A[x][y])){
							placableCount++;
							placable=new Node(row,col);
						}
					}
				}
			}
			if(placableCount==1){
				////System.out.println("Placing at ("+placable.x+","+placable.y+") value "+A[x][y]);
				//System.out.println("4:At ("+placable.x+","+placable.y+") putting value "+A[x][y]);
				A[placable.x][placable.y] = A[x][y];
				possibilities[placable.x][placable.y] = new ArrayList<Integer>();
				pendingChanges.add(placable);
				status--;
			}
		}
		
		return status;
	}
	
		
	private static boolean isPlacable(List<Integer>[][] possibilities,int[][] A,int x,int y,int value){
		boolean returnValue = true;
		if(!possibilities[x][y].contains((Integer)value)){
			returnValue = false;
		}
		for(int i=0;i<9;i++){
			if(A[i][y]==value) returnValue = false;
		}
		for(int j=0;j<9;j++){
			if(A[x][j]==value) returnValue = false;
		}
		
		////System.out.println("Checking isPlacable at ("+x+","+y+") - for "+ value + " returning "+returnValue);
		return returnValue;
	}
	
	private static int[][] influencePossibilitiesBySudoku(List<Integer>[][] possibilities,int[][] A,int status){
		
		
		List<Node> pendingChanges = new ArrayList<Node>();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(A[i][j]!=0){
					////System.out.println("Influencing by ("+i+","+j+")");
					status = influencePossibilitiesByLocation(possibilities,A,status,pendingChanges,i,j);
					do{
						List<Node> nextPendingChanges = new ArrayList<Node>();
						for(Node node : pendingChanges){
							status = influencePossibilitiesByLocation(possibilities, A, status, nextPendingChanges, node.x, node.y);
						}
						pendingChanges=nextPendingChanges;
					}while(pendingChanges.size()!=0);
				}
			}
		}
		
		int oldStatus=-1;
		do{
			oldStatus=status;
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					status = influencePossibilitiesByBoxCheck(possibilities,A,pendingChanges,status,i,j);
					do{
						List<Node> nextPendingChanges = new ArrayList<Node>();
						for(Node node : pendingChanges){
							status = influencePossibilitiesByLocation(possibilities, A, status, nextPendingChanges, node.x, node.y);
						}
						pendingChanges=nextPendingChanges;
					}while(pendingChanges.size()!=0);
					
				}
			}
		}while(status!=oldStatus);
		
		printSudoku(A);
		
		Stack<SudokuStatus> sudokuBackups = new Stack<SudokuStatus>();
		while(status>0){ //Invoke assumption
			
			
			
			
			SudokuStatus sudokuBackup = new SudokuStatus();
			sudokuBackup.status=status;							//save old status
			sudokuBackup.possibilities = clonePossibilities(possibilities);	//save old possibility
			sudokuBackup.A = cloneSudoku(A);							//save old sudoku	
			//System.out.println("Backing up : "+status);
			printSudoku(sudokuBackup.A);
			printPossibilities(sudokuBackup.possibilities);
			int length=10,indexX=-1,indexY=-1;
			
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					if(possibilities[i][j].size()<length && possibilities[i][j].size()>0){
						length=possibilities[i][j].size();
						indexX=i;indexY=j;
					}
				}
			}
			
			sudokuBackup.indexX = indexX;
			sudokuBackup.indexY = indexY;
			sudokuBackups.push(sudokuBackup);					//push these values in stack
			
			
			
			List<Integer> values = new ArrayList<Integer>();
			////System.out.println(sudokuBackups.size());
			printPossibilities(possibilities);
			//System.out.println(indexX+":"+indexY);
			for(int value : possibilities[indexX][indexY]){
				values.add(value);
			}
			
			Collections.sort(values, new Comparator<Integer>() {
				public int compare(Integer paramT1, Integer paramT2) {
					return ((int)paramT2)-((int)paramT1);
				}
				public boolean equals(Object paramObject) {
					// TODO Auto-generated method stub
					return super.equals(paramObject);
				}
			});
			
			for(int value : values){
				printSudoku(A);
				
				try{
					//System.out.println("Making assumpution at ("+indexX+","+indexY+") with value "+value);
					//System.out.println("2:At ("+indexX+","+indexY+") putting value "+possibilities[indexX][indexY].get(0));
					A[indexX][indexY] = value;											//make an assumption
					possibilities[indexX][indexY] = new ArrayList<Integer>();
					status--;
																						//solve the assumed sudoku instance and get status or error
					status = influencePossibilitiesByLocation(possibilities,A,status,pendingChanges,indexX,indexY);
					//printPossibilities(possibilities);
					do{
						List<Node> nextPendingChanges = new ArrayList<Node>();
						for(Node node : pendingChanges){
							status = influencePossibilitiesByLocation(possibilities, A, status, nextPendingChanges, node.x, node.y);
						}
						pendingChanges=nextPendingChanges;
					}while(pendingChanges.size()!=0);
		
					
					oldStatus=-1;
					do{
						oldStatus=status;
						for(int i=0;i<9;i++){
							for(int j=0;j<9;j++){
								status = influencePossibilitiesByBoxCheck(possibilities,A,pendingChanges,status,i,j);
								do{
									List<Node> nextPendingChanges = new ArrayList<Node>();
									for(Node node : pendingChanges){
										status = influencePossibilitiesByLocation(possibilities, A, status, nextPendingChanges, node.x, node.y);
									}
									pendingChanges=nextPendingChanges;
								}while(pendingChanges.size()!=0);
								
							}
						}
						//System.out.println("Current Sudoku is : "+status+","+oldStatus);
						printSudoku(A);
						printPossibilities(possibilities);
					}while(status!=oldStatus);
				}catch(Exception ex){
					ex.printStackTrace();											//if error is thrown revert back to old values of status,possibility,sudoku (top of stack).
					SudokuStatus backup = sudokuBackups.pop();
					status=backup.status;
					A=backup.A;
					possibilities=backup.possibilities;
					//System.out.println("Backing down :"+status);
					printSudoku(A);
					printPossibilities(possibilities);
					continue;
				}
				break;
				////System.out.println("Exiting with status value as "+status);
				
			}
			
			
			
			
			
			//make next assumption from remaining values at same location
			
			//if status returned is !=0 
			//repeat from (//Invoke assumption)
		}
		
		return A;
	}
	
	private static int[][] cloneSudoku(int[][] A){
		int[][] temp = new int[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				temp[i][j] = A[i][j];
			}
		}
		return temp;
	}
	
	private static List<Integer>[][] clonePossibilities(List<Integer>[][] possibilities){
		List<Integer>[][] possibilitiesTemp = new ArrayList[9][9];
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				possibilitiesTemp[i][j] = new ArrayList<Integer>();
				for(int value : possibilities[i][j]){
					possibilitiesTemp[i][j].add(value);
				}
			}
		}
		
		return possibilitiesTemp;
	}
	
	private static int influencePossibilitiesByLocation(List<Integer>[][] possibilities, int[][] A,int status,List<Node> pendingChanges,int x,int y){
		if(A[x][y]!=0){
			for(int row=0;row<9;row++){
				////System.out.println("Calling rowwise removal at ("+row+","+y+") for ("+x+","+y+")");
				status = removeFromPossibilities(possibilities,A,row,y,A[x][y],status,pendingChanges);
			}
			for(int col=0;col<9;col++){
				////System.out.println("Calling columnwise removal at ("+x+","+col+") for ("+x+","+y+")");
				status = removeFromPossibilities(possibilities,A,x,col,A[x][y],status,pendingChanges);
			}
			
			int boxX = x/3,boxY = y/3;
			for(int row=boxX*3,countX=0;countX<3;countX++,row++){
				for(int col=boxY*3,countY=0;countY<3;countY++,col++){
					status = removeFromPossibilities(possibilities, A, row, col, A[x][y], status, pendingChanges);
				}
			}
			
			/*status = influencePossibilitiesByBoxCheck(possibilities,A,pendingChanges,status,x,y);*/
		}
		return status;
	}
	
	private static int removeFromPossibilities(List<Integer>[][] possibilities,int[][] A, int x,int y,int value,int status,List<Node> pendingChanges){
		if(possibilities[x][y].remove((Integer)value) && possibilities[x][y].size()==1){
			
			if(!isPlacable(possibilities, A, x, y, possibilities[x][y].get(0))){
				throw new RuntimeException("Sudoku can't be solved");
			}
			
			//System.out.println("_________________________________"+x+"______________"+value+"__________________"+y+"__________________________________________");
			
			printPossibilities(possibilities);
			printSudoku(A);
			
			
			//System.out.println("1:At ("+x+","+y+") putting value "+possibilities[x][y].get(0));
			
			//System.out.println("___________________________________________________________________________________________________________");			
			
			
			A[x][y] = possibilities[x][y].get(0);
			possibilities[x][y] = new ArrayList<Integer>();
			pendingChanges.add(new Node(x,y));
			status--;
		}
		return status;
	}
	
	
	
	private static int initializePossibilities(List<Integer>[][] possibilities, int[][] A,int status){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				possibilities[i][j] = getList(new int[]{1,2,3,4,5,6,7,8,9}); 
				if(A[i][j]!=0){
					possibilities[i][j]=new ArrayList<Integer>();
					status--;
				}
			}
		}
		return status;
	}
	
	private static List<Integer> getList(int[] array){
		List<Integer> list = new ArrayList<Integer>();
		for(int i : array){
			list.add(i);
		}
		return list;
	}
		
	public static void printSudoku(int[][] A){
		//System.out.println("Sudoku is : ");
		for(int i=0;i<9;i++){
			if(i%3==0){
				//System.out.println("-------------------------------------------------------");
			}
			for(int j=0;j<9;j++){
				if(j%3==0){
					//System.out.print("\t");
				}
				//System.out.print(A[i][j]+" ");
			}
			
			//System.out.println("");
		}
	}
	
	public static String returnSudoku(int[][] A){
		
		String sudoku = "{";
		for(int i=0;i<9;i++){
			sudoku+="{";
			for(int j=0;j<9;j++){
				sudoku+=A[i][j];
				if(j!=8) sudoku+=",";
			}
			sudoku+="}";
			if(i!=8) sudoku+=",";
		}
		sudoku+="}";
		System.out.println(sudoku);
		return sudoku;
	}
	
	public static void printPossibilities(List[][] possibilities){
		//System.out.println("Possibilities ......................................................Start ");
		for(int i=0;i<9;i++){
			if(i%3==0){
				//System.out.println("-------------------------------------------------------");
			}
			for(int j=0;j<9;j++){
				if(j%3==0){
					//System.out.print("|");
				}
				////System.out.print(A[i][j]+" ");
				//System.out.print("[");
				for(int k=0;k<possibilities[i][j].size();k++){
					//System.out.print(possibilities[i][j].get(k)+" ");
				}
				//System.out.print("]");
			}
			
			//System.out.println("");
		}
		//System.out.println("Possibilities ......................................................End ");
	}
	
	public static void main(String args[]){
		int[][] easy = {{2,8,0,4,5,1,0,0,0},{0,0,0,3,8,0,4,2,0},{0,0,6,0,7,0,0,0,5},
							{9,0,0,0,0,8,0,6,7},{7,0,0,2,0,4,0,0,3},{3,5,0,6,0,0,0,0,2},
							{8,0,0,0,6,0,3,0,0},{0,7,5,0,4,3,0,0,0},{0,0,0,8,2,5,0,1,6}};
		int[][] medium = {{0,8,2,1,0,0,0,0,0},{1,0,0,3,8,0,0,0,0},{0,7,9,0,0,5,0,0,0},
							{0,0,1,0,0,0,0,0,2},{0,0,0,8,6,3,0,0,0},{4,0,0,0,0,0,3,0,0},
							{0,0,0,6,0,0,5,7,0},{0,0,0,0,5,9,0,0,1},{0,0,0,0,0,2,4,8,0}};
		int[][] hard = {{0,0,8,0,0,0,2,0,0},{0,5,0,0,0,1,0,9,0},{0,9,0,4,3,0,0,0,0},
				{0,0,9,0,0,0,0,7,0},{7,4,0,5,6,8,0,1,9},{0,1,0,0,0,0,6,0,0},
				{0,0,0,0,9,6,0,5,0},{0,6,0,1,0,0,0,3,0},{0,0,3,0,0,0,8,0,0}};
		int[][] puzzle4 = {{7,8,6,0,0,0,0,3,0},{0,0,0,3,0,9,0,7,0},{0,0,0,2,0,0,4,0,0},
				{0,0,3,6,0,0,0,1,5},{0,0,0,0,0,0,0,0,0},{5,2,0,0,0,1,3,0,0},
				{0,0,7,0,0,2,0,0,0},{0,5,0,1,0,6,0,0,0},{0,4,0,0,0,0,1,5,7}};
		
		int[][] evil1 =  {{3,0,0,7,0,0,0,0,0},{0,0,0,0,0,8,3,4,0},{0,0,6,0,1,3,0,2,0},
						{0,1,0,0,0,0,4,6,0},{0,0,0,0,9,0,0,0,0},{0,5,4,0,0,0,0,1,0},
						{0,8,0,5,3,0,6,0,0},{0,9,1,2,0,0,0,0,0},{0,0,0,0,0,6,0,0,8}};
		
		int[][] evil2 =  {{0,0,0,0,3,2,4,0,0},{0,0,0,0,0,0,1,0,0},{0,0,0,4,0,0,0,2,0},
				{0,0,0,8,0,0,0,3,4},{4,0,0,6,2,5,0,0,9},{9,2,0,0,0,4,0,0,0},
				{0,6,0,0,0,7,0,0,0},{0,0,3,0,0,0,0,0,0},{0,0,5,1,9,0,0,4,0}};
		
		int[][] evil3 =  {{2,9,0,0,3,0,0,0,0},{0,0,0,0,0,5,0,0,0},{0,0,4,8,1,0,7,0,0},
				{0,7,0,0,4,0,0,8,0},{8,2,0,0,0,0,0,3,4},{0,1,0,0,8,0,0,2,0},
				{0,0,5,0,9,3,2,0,0},{0,0,0,1,0,0,0,0,0},{0,0,0,0,7,0,0,4,5}};
		
		
		int[][] veryEasy = {{3,0,9,7,5,4,1,8,6},{1,7,5,6,2,8,3,4,9},{8,4,6,9,1,3,7,2,5},
				{9,1,8,3,7,5,4,6,2},{2,6,3,4,9,1,8,5,7},{7,5,4,8,6,2,9,1,3},
				{4,8,2,5,3,9,6,7,1},{6,9,1,2,8,7,5,3,4},{5,3,7,1,4,6,2,9,8}};

		int[][] fullAssumption = {{1,0,0,0,0,0,0,0,3},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{4,0,0,0,0,0,0,0,2}};

		
		int[][][] testCase1 = {{{0,0,0,0,5,8,4,2,0},{0,8,9,2,4,1,6,0,7},{5,4,2,3,0,6,0,8,0},{0,0,0,8,3,0,2,4,0},{0,7,3,0,0,0,0,9,0},{2,0,0,1,9,5,3,7,0},{0,3,0,7,0,0,8,6,9},{0,0,6,0,0,0,0,0,4},{7,9,8,0,6,3,5,1,0}},
				{{4,5,7,2,3,1,0,9,6},{8,6,3,7,0,0,2,0,0},{0,0,1,0,0,8,3,7,4},{0,7,8,5,1,4,9,3,2},{0,1,5,3,9,7,6,4,8},{0,4,9,8,2,6,7,1,5},{0,0,6,4,8,3,5,2,7},{5,8,4,9,7,2,1,6,3},{0,0,0,1,6,5,4,8,9}},
				{{0,0,0,8,0,0,2,0,0},{0,0,0,2,6,7,0,8,0},{2,4,0,3,5,0,0,6,0},{0,7,6,5,3,1,9,0,0},{0,9,0,0,7,0,8,5,1},{0,0,1,0,9,8,0,0,0},{0,8,0,0,4,3,0,2,9},{0,0,0,9,0,0,7,1,6},{0,5,0,7,2,0,4,3,8}},
				{{0,0,9,0,0,4,1,0,7},{0,0,0,2,0,0,8,9,0},{1,3,0,9,7,8,4,0,0},{4,1,0,0,0,0,5,7,9},{0,8,0,0,0,0,3,0,0},{5,2,0,3,4,0,0,8,0},{0,6,5,0,9,1,7,3,8},{7,0,1,0,0,3,2,0,0},{0,4,0,7,6,0,0,0,0}},
				{{0,2,9,8,0,0,5,0,6},{0,0,0,2,3,0,0,0,0},{0,0,8,0,7,6,3,2,0},{7,0,0,4,5,0,0,6,2},{0,0,3,0,0,0,0,0,0},{2,0,0,9,0,7,1,5,3},{6,7,5,1,2,0,9,0,0},{0,0,0,3,9,5,6,0,7},{0,0,0,0,0,8,2,0,0}},
				{{0,0,0,3,0,0,0,7,0},{0,2,0,0,1,0,0,0,8},{0,6,3,2,0,0,0,0,0},{0,5,4,0,0,2,1,0,0},{7,8,0,6,0,0,0,9,0},{1,0,9,8,0,5,6,0,0},{3,0,1,9,2,0,0,5,4},{0,0,8,0,5,3,0,0,6},{0,0,0,0,7,8,2,0,9}},
				{{9,4,0,0,0,8,5,7,0},{6,0,0,9,0,0,1,0,0},{0,0,0,0,0,0,2,4,0},{0,9,6,3,1,0,0,0,0},{0,8,7,0,0,0,4,9,0},{0,5,0,0,0,0,0,2,0},{1,0,9,0,2,5,0,0,0},{0,6,8,4,0,0,0,0,0},{0,0,0,6,9,0,3,8,5}},
				{{0,0,0,4,0,5,0,0,9},{0,5,0,0,0,7,8,0,0},{0,1,0,0,0,0,0,4,0},{0,0,4,8,0,0,2,7,5},{0,0,0,0,0,4,3,0,1},{0,3,0,0,1,0,0,9,0},{0,0,6,0,2,0,1,3,7},{5,0,7,0,0,0,0,0,0},{3,2,0,6,0,0,9,0,0}},
				{{5,0,0,0,0,0,0,9,8},{8,4,0,6,9,0,2,0,0},{0,0,3,0,7,8,0,0,0},{0,7,9,0,0,0,0,1,3},{0,1,0,7,0,0,0,0,0},{0,0,0,5,0,9,0,0,2},{0,0,0,0,6,0,3,0,0},{0,0,0,0,5,0,9,7,0},{4,0,0,2,3,0,0,0,0}}
				};
		String[] solutions1 = {"{{6,1,7,9,5,8,4,2,3},{3,8,9,2,4,1,6,5,7},{5,4,2,3,7,6,9,8,1},{9,5,1,8,3,7,2,4,6},{8,7,3,6,2,4,1,9,5},{2,6,4,1,9,5,3,7,8},{4,3,5,7,1,2,8,6,9},{1,2,6,5,8,9,7,3,4},{7,9,8,4,6,3,5,1,2}}",
				"{{4,5,7,2,3,1,8,9,6},{8,6,3,7,4,9,2,5,1},{9,2,1,6,5,8,3,7,4},{6,7,8,5,1,4,9,3,2},{2,1,5,3,9,7,6,4,8},{3,4,9,8,2,6,7,1,5},{1,9,6,4,8,3,5,2,7},{5,8,4,9,7,2,1,6,3},{7,3,2,1,6,5,4,8,9}}",
				"{{7,6,3,8,1,4,2,9,5},{9,1,5,2,6,7,3,8,4},{2,4,8,3,5,9,1,6,7},{8,7,6,5,3,1,9,4,2},{3,9,4,6,7,2,8,5,1},{5,2,1,4,9,8,6,7,3},{6,8,7,1,4,3,5,2,9},{4,3,2,9,8,5,7,1,6},{1,5,9,7,2,6,4,3,8}}",
				"{{8,5,9,6,3,4,1,2,7},{6,7,4,2,1,5,8,9,3},{1,3,2,9,7,8,4,5,6},{4,1,3,8,2,6,5,7,9},{9,8,6,1,5,7,3,4,2},{5,2,7,3,4,9,6,8,1},{2,6,5,4,9,1,7,3,8},{7,9,1,5,8,3,2,6,4},{3,4,8,7,6,2,9,1,5}}",
				"{{3,2,9,8,4,1,5,7,6},{5,6,7,2,3,9,4,8,1},{4,1,8,5,7,6,3,2,9},{7,9,1,4,5,3,8,6,2},{8,5,3,6,1,2,7,9,4},{2,4,6,9,8,7,1,5,3},{6,7,5,1,2,4,9,3,8},{1,8,2,3,9,5,6,4,7},{9,3,4,7,6,8,2,1,5}}",
				"{{8,1,5,3,6,4,9,7,2},{4,2,7,5,1,9,3,6,8},{9,6,3,2,8,7,5,4,1},{6,5,4,7,9,2,1,8,3},{7,8,2,6,3,1,4,9,5},{1,3,9,8,4,5,6,2,7},{3,7,1,9,2,6,8,5,4},{2,9,8,4,5,3,7,1,6},{5,4,6,1,7,8,2,3,9}}",
				"{{9,4,2,1,3,8,5,7,6},{6,7,5,9,4,2,1,3,8},{8,1,3,5,6,7,2,4,9},{2,9,6,3,1,4,8,5,7},{3,8,7,2,5,6,4,9,1},{4,5,1,7,8,9,6,2,3},{1,3,9,8,2,5,7,6,4},{5,6,8,4,7,3,9,1,2},{7,2,4,6,9,1,3,8,5}}",
				"{{6,8,2,4,3,5,7,1,9},{4,5,9,1,6,7,8,2,3},{7,1,3,9,8,2,5,4,6},{1,6,4,8,9,3,2,7,5},{9,7,8,2,5,4,3,6,1},{2,3,5,7,1,6,4,9,8},{8,4,6,5,2,9,1,3,7},{5,9,7,3,4,1,6,8,2},{3,2,1,6,7,8,9,5,4}}",
				"{{5,6,7,3,4,2,1,9,8},{8,4,1,6,9,5,2,3,7},{9,2,3,1,7,8,6,4,5},{2,7,9,4,8,6,5,1,3},{6,1,5,7,2,3,4,8,9},{3,8,4,5,1,9,7,6,2},{7,5,8,9,6,1,3,2,4},{1,3,2,8,5,4,9,7,6},{4,9,6,2,3,7,8,5,1}}"
				};

		int i=0;
		for(int[][] puzzle : testCase1)
		{
			puzzle=solveSudoku(puzzle);
			if(solutions1[i++].equalsIgnoreCase(returnSudoku(puzzle))) System.out.println("Case#"+i+" : Correct");
			else System.out.println("Case#"+i+" : Incorrect");
		}
	}
}
