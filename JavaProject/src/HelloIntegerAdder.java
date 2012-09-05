import java.util.ArrayList;
import java.util.List;

import DefaultNamespace.IntAdder;
import DefaultNamespace.IntAdderProxy;

import com.basic.IntegerAdder;
import com.basic.IntegerAdderProxy;
import com.basic.IntegerAdderService;


public class HelloIntegerAdder {

	public int add(int i,int j){
		return i+j;
	}
	
	public static void main(String args[]) throws Exception{
		
		/*IntegerAdder adder = new IntegerAdderProxy();
		System.out.println(adder.add(2, 3));*/
		
		IntAdder adder = new IntAdderProxy();
		System.out.println(adder.add(2, 3));
		
	}
}
