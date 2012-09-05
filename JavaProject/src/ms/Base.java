package ms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Base {
	
	private static Map<Character,Integer> lookupMap = new HashMap<Character, Integer>();
	private static int maxBase = -1;
	
	/*
	Make Base class Singleton so, that only one instance exists per application.
	*/
	private Base(){
		
	}
	
	/*
	Initializes Base class to from the file.
	*/
	public static int initializeBase(File file) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int digit = 0;
		while(st.hasMoreTokens()){
			lookupMap.put(st.nextToken().charAt(0), digit++);
		}
		maxBase = digit;
		return digit;
	}
	
	/*
	Return Integer corresponding to Character passed.
	*/
	public static int lookup(char c){
		return lookupMap.get(c);
	}
	
	/*
	Return character corresponding to Integer passed.
	*/
	public static char lookup(int i){
		for(Character c : lookupMap.keySet()){
			if(lookupMap.get(c)==i){
				return (char)c;
			}
		}
		return " ".toCharArray()[0];
	}
	
	/*
	Checks whether current base is supported or not.
	*/
	public static boolean isBaseSupported(int base){
		if(base>=0 && base<maxBase) return true;
		return false;
	}

}
