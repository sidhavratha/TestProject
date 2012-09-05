package techgig.quiz;


public class MissionOkaba {

	
	public static int output1;
	
	public static void GetBuildingCount(int input1,int[][] input2)
	{
	    int rowsSecured = 0;
	    int colsSecured = 0;
	    
	    int[] rows = {-1,-1,-1,-1,-1,-1,-1,-1};
	    int[] cols = {-1,-1,-1,-1,-1,-1,-1,-1};
	    
	    for(int i=0;i<input1;i++){
	    	int row=0;
	    	boolean skipRow = false;
	    	while(row<8 && rows[row]!=-1){
	    		if(rows[row]==input2[i][0]){
	    			skipRow = true;
	    			break;
	    		}else{
	    			row++;
	    			continue;
	    		}
	    	}
	    	int col=0;
	    	boolean skipCol = false;
	    	while(col<8 && cols[col]!=-1){
	    		if(cols[col]==input2[i][1]){
	    			skipCol = true;
	    			break;
	    		}else{
	    			col++;
	    			continue;
	    		}
	    	}
	    	
	    	if(!skipRow){
	    		rowsSecured++;
	    		rows[row]=input2[i][0];
	    	}
	    	if(!skipCol){
	    		colsSecured++;
	    		cols[col]=input2[i][1];
	    	}
	    	
	    }
	    output1+=(rowsSecured*8)+(colsSecured*8)-(rowsSecured*colsSecured);
	}
	
	
	
	public static void main(String[] args) {
		int[][] input2 = {{5,5},{5,3},{2,4}};
		GetBuildingCount(3, input2);
		System.out.println(output1);
	}

}
