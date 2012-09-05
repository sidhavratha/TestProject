package google.codejam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Googlerese {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		args = new String[6];
		args[0]="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		args[1]="our language is impossible to understand";
		args[2]="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		args[3]="there are twenty six factorial possibilities";
		args[4]="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		args[5]="so it is okay if you want to just give up";
		Map<Character, Character> mapping = new HashMap<Character, Character>(); 
		initializeMapping(mapping);
		putHintData(args,mapping);
		
		mapping.put('z', 'q');
		mapping.put('q', 'z');
		
		solveAndPrint(new File("A-small-practice.in.txt"),mapping);
		
		printMapping(mapping);
		
	}
	
	public static void solveAndPrint(File file,Map<Character, Character> mapping) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = null;
		
		while((str=br.readLine())!=null){
			String finalString = "";
			for(char c : str.toCharArray()){
				finalString += ""+(mapping.get(c)==null?"_":mapping.get(c));
			}
			System.out.println(str+" = "+finalString);
		}
	}
	
	public static void initializeMapping(Map mapping){
		
	}
	
	public static void putHintData(String[] args,Map<Character, Character> mapping){
		
		for(int i=0;i<args.length;){
			String problem = args[i++];
			String solution = args[i++];
			char[] problemSet = problem.toCharArray();
			char[] solutionSet = solution.toCharArray();
			for(int j=0;j<solutionSet.length;j++){
				mapping.put(problemSet[j],solutionSet[j]);
			}
		}
	}
	
	/*public static void returnNormalText(String str){
		String m = "yhesocvxduiglbkrztnwjpfmaq";
		String ret = "";
		for(int i=0;i<str.length();i++){
			ret+=m.toCharArray()[(int)(str[i])-(int)'a'];
		}
	}*/
	
	public static void printMapping(Map<Character, Character> mapping){
		System.out.print("Mapping is [");
		for(char ele : mapping.keySet()){
			System.out.println(ele+"="+mapping.get(ele));
		}
		System.out.print("]");
	}

}
