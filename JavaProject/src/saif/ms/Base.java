package saif.ms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Base {
	
	private static Map<Character,Integer> lookup = new HashMap<Character, Integer>();
	
	private Base(){
		
	}
	
	public static int initializeBase(File file) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int digit = 0;
		while(st.hasMoreTokens()){
			lookup.put(st.nextToken().charAt(0), digit++);
		}
		return digit;
	}
	
	public static int lookup(char c){
		return lookup.get(c);
	}

}
