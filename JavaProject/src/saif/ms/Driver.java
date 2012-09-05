package saif.ms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Base.initializeBase(new File("base.txt"));
			BufferedReader br = new BufferedReader(new FileReader(new File("numbers.txt")));
			String s= null;
			List<Number> numbers = new ArrayList<Number>();
			while((s=br.readLine())!=null){
				numbers.add(Number.createNumber(s));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
