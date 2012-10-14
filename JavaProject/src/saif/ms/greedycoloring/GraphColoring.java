package saif.ms.greedycoloring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GraphColoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input_graph_coloring.txt")));
		int nodeCount = Integer.parseInt(br.readLine());
		
		Graph graph = new Graph();
		
	}
	
	static class Graph{
		private Map<Vertex,Set<Vertex>> bag = new HashMap<Vertex,Set<Vertex>>();
		private Graph(){}
		
		public static Graph createGraph(){
			return new Graph();
		}
		
		public static Graph addEdge(Graph g, Vertex v1, Vertex v2){
			if(g==null) g=createGraph();
			Set<Vertex> localBag = null;
			if((localBag=g.bag.get(v1))==null){
				localBag = new HashSet<Vertex>();
			}
			localBag.add(v2);
			g.bag.put(v1, localBag);
			
			//this is for bidirectional graph.
			if((localBag=g.bag.get(v2))==null){
				localBag = new HashSet<Vertex>();
			}
			localBag.add(v1);
			g.bag.put(v2, localBag);
			
			return g;
		}
		
		public static Set<Vertex> getNeighbours(Graph graph, Vertex v){
			return graph.bag.get(v);
		}
		
		public static Graph sortGraphByDegree(Graph graph){
			
			Map<Vertex,Set<Vertex>> bag = new TreeMap<Vertex, Set<Vertex>>();
			
			for(Vertex vertex : graph.bag.keySet()){
				Set<Vertex> sortedBag = new TreeSet<Vertex>();
				for(Vertex bagElement : graph.bag.get(vertex)){
					sortedBag.add(bagElement);
				}
				bag.put(vertex, sortedBag);
			}
			
			Graph newGraph = new Graph();
			newGraph.bag=bag;
			return newGraph;
		}
	}
	
	static class Vertex{
		private String id;
		public Vertex(String id){
			this.id=id;
		}
		public boolean equals(Object vertex){
			if(vertex instanceof Vertex && ((Vertex) vertex).id.equalsIgnoreCase(this.id)){
				return true;
			}
			return false;
		}
	}

}
