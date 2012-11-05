package saif.ms.greedycoloring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Driver {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException{
		
		if(args.length<2){
			System.out.println("Wrong number of inputs - \n Correct format is - \n java GraphColoring <input-file-name> <output-file-name>");
		}
		
		BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
		int nodeCount = Integer.parseInt(br.readLine());
		Header graph = Header.createGraph();
		StringTokenizer st = null;
		String currConnection = null;
		while((currConnection=br.readLine())!=null){
			st = new StringTokenizer(currConnection,",");
			Header.Vertex v1 = new Header.Vertex(st.nextToken());
			Header.Vertex v2 = new Header.Vertex(st.nextToken());
			Header.addEdge(graph, v1, v2);
		}

		int colorused = Header.assignColor(graph);
		Header.printGraph(graph,colorused,args[1]);
		
	}
	
	
}
