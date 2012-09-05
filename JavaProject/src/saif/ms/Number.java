package saif.ms;

import java.util.StringTokenizer;

public class Number {

	private int base;
	private char[] values;
	
	private Number(){}
	
	public static Number createNumber(String numberInput){
		Number number = new Number();
		StringTokenizer st = new StringTokenizer(numberInput, " ");
		number.base= Integer.parseInt(st.nextToken());
		String value=st.nextToken();
		number.values = value.toCharArray();
		return number;
	}
	
	public static void printNumber(Number n){
		System.out.println("("+new String(n.values)+")"+n.base);
	}
	
	public static Number convert(Number n,int to_base){
		Number number = new Number();
		int decimalValue = n.decimalValue();
		
		String converted = "";
		
		int quotient = decimalValue;
		while(quotient>0){
			converted = quotient % to_base + converted;
			quotient = decimalValue/to_base;
		}
		number.base = to_base;
		number.values = converted.toCharArray();
		return number;
	}
	
	
	public static Order compare(Number n1,Number n2){
		if(n1.decimalValue()>n2.decimalValue()) return Order.GREATER;
		else if(n1.decimalValue()==n2.decimalValue()) return Order.EQUAL;
		else return Order.LESSER;
	}
	
	private int decimalValue(){
		int decimalValue = 0;
		for(int i=0;i<values.length;i++){
			decimalValue += Base.lookup(values[i])*Math.pow(base, values.length-1-i);
		}
		return decimalValue;
	}
}
