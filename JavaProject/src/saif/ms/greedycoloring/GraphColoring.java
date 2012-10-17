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
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class GraphColoring {

	/**
	 * @param args
	 */
	
	private static List<Color> colors = new ArrayList<Color>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input_graph_coloring.txt")));
		int nodeCount = Integer.parseInt(br.readLine());
		Graph graph = Graph.createGraph();
		StringTokenizer st = null;
		String currConnection = null;
		while((currConnection=br.readLine())!=null){
			st = new StringTokenizer(currConnection," ");
			Vertex v1 = new Vertex(st.nextToken());
			Vertex v2 = new Vertex(st.nextToken());
			Graph.addEdge(graph, v1, v2);
		}

		int colorused = Graph.assignColor(graph);
		Graph.printGraph(graph,colorused,"output_graph_coloring.txt");
		
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
		
		public static Color chooseColor(Graph graph,Vertex vertex){
			List<Color> possibleColors = new ArrayList<Color>();
			for(Color avlColor : colors){
				possibleColors.add(avlColor);
			}
			for(Vertex currNghVertex : graph.bag.get(vertex)){
				if(null!=currNghVertex.color){
					possibleColors.remove(currNghVertex.color);
				}
			}
			
			if(possibleColors.isEmpty()){
				return requestNewColor();
			}
			
			return possibleColors.get(0);
		}
		
		public static int assignColor(Graph graph){
			int totalColors = 0;
			for(Vertex vertex : graph.bag.keySet()){
				int oldColorsSize = colors.size();
				vertex.color=chooseColor(graph, vertex);
				int newColorsSize = colors.size();
				totalColors+=(newColorsSize-oldColorsSize);
			}
			
			return totalColors;
		}
		
		public static void printGraph(Graph graph, int colorsUsed, String outputFile){
			System.out.println(colorsUsed);
			for(Vertex vertex : graph.bag.keySet()){
				System.out.print("("+vertex.id+","+vertex.color.name+"):");
				boolean first=true;
				for(Vertex childVertex : graph.getNeighbours(graph, vertex)){
					if(!first){
						System.out.print(",");
					}else first=false;
					
					System.out.print(childVertex.id);
				}
				System.out.println();
			}
		}
		
		private static Color requestNewColor(){
			Color newColor = new Color(colors.size()+"");
			colors.add(newColor);
			return newColor;
		}
		
		
	}
	
	static class Vertex{
		public String id;
		public Color color;
		public Vertex(String id){
			this.id=id;
		}
		public boolean equals(Object vertex){
			if(vertex instanceof Vertex && ((Vertex) vertex).id.equalsIgnoreCase(this.id)){
				return true;
			}
			return false;
		}
		
		public int hashCode(){
			return (id.charAt(0)+(20*id.charAt(0)))%7;
		}
	}
	
	static class Color{
		public String id;
		public String name;
		
		public Color(String id){
			this.id=id;
			this.name="Color-"+id;
		}
		
		public boolean equals(Object color){
			if(color instanceof Color && ((Color) color).id.equalsIgnoreCase(this.id)){
				return true;
			}
			return false;
		}
	}

}
