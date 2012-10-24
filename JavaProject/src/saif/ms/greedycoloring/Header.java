package saif.ms.greedycoloring;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Header{
	
	private static List<Color> colors = new ArrayList<Color>();
	
	private Map<Vertex,Set<Vertex>> bag = new HashMap<Vertex,Set<Vertex>>();
	private Header(){}
	
	public static Header createGraph(){
		return new Header();
	}
	
	public static Header addEdge(Header g, Vertex v1, Vertex v2){
		if(g==null) g=createGraph();
		Set<Vertex> localBag = null;
		if(g.bag.containsKey(v1)){
			for(Vertex v : g.bag.keySet()){
				if(v.equals(v1)){
					v1=v;
				}
			}
		}
		if(g.bag.containsKey(v2)){
			for(Vertex v : g.bag.keySet()){
				if(v.equals(v2)){
					v2=v;
				}
			}
		}
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
	
	public static Set<Vertex> getNeighbours(Header graph, Vertex v){
		return graph.bag.get(v);
	}
	
	public static Header sortGraphByDegree(Header graph){
		
		Map<Vertex,Set<Vertex>> bag = new TreeMap<Vertex, Set<Vertex>>();
		
		for(Vertex vertex : graph.bag.keySet()){
			Set<Vertex> sortedBag = new TreeSet<Vertex>();
			for(Vertex bagElement : graph.bag.get(vertex)){
				sortedBag.add(bagElement);
			}
			bag.put(vertex, sortedBag);
		}
		
		Header newGraph = new Header();
		newGraph.bag=bag;
		return newGraph;
	}
	
	public static Color chooseColor(Header graph,Vertex vertex){
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
	
	public static int assignColor(Header graph){
		int totalColors = 0;
		for(Vertex vertex : graph.bag.keySet()){
			int oldColorsSize = colors.size();
			vertex.color=chooseColor(graph, vertex);
			int newColorsSize = colors.size();
			totalColors+=(newColorsSize-oldColorsSize);
		}
		
		return totalColors;
	}
	
	public static void printGraph(Header graph, int colorsUsed, String outputFile){
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File(outputFile));
			fw.write(colorsUsed+"\n");
			System.out.println(colorsUsed);
			for(Vertex vertex : graph.bag.keySet()){
				fw.write("("+vertex.id+","+vertex.color.name+"):");
				System.out.print("("+vertex.id+","+vertex.color.name+"):");
				boolean first=true;
				for(Vertex childVertex : graph.getNeighbours(graph, vertex)){
					if(!first){
						fw.write(",");
						System.out.print(",");
					}else first=false;
					fw.write(childVertex.id);
					System.out.print(childVertex.id);
				}
				fw.write("\n");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private static Color requestNewColor(){
		Color newColor = new Color(colors.size()+"");
		colors.add(newColor);
		return newColor;
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
		return (20*id.charAt(0))%7;
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