package ms;

import java.util.StringTokenizer;

public class Number {

	private int base;
	private char[] values;
	private int decimalValue;
	
	private Number(){}
	
	public static Number createNumber(String numberInput){
		Number number = new Number();
		StringTokenizer st = new StringTokenizer(numberInput, " ");
		number.base= Integer.parseInt(st.nextToken());
		String value=st.nextToken();
		number.values = value.toCharArray();
		number.decimalValue = number.decimalValue();
		return number;
	}
	
	public static void printNumber(Number n){
		System.out.println(n.toString());
	}
	
	public String toString(){
		return "("+new String(values)+")"+base;
	}
	
	public static Number convert(Number n,int to_base){
		Number number = new Number();
		int decimalValue = n.decimalValue();
		
		/*String converted = "";
		
		int quotient = decimalValue;
		while(quotient>0){
			if(Base.lookup(quotient % to_base)==null){
				number.base = 10;
				number.decimalValue = decimalValue;
				System.out.println("Base not supported, converted to decimal number");
				return number;
			}
			converted = Base.lookup(quotient % to_base) + converted;
			quotient = decimalValue/to_base;
		}
		number.base = to_base;
		number.values = converted.toCharArray();
		return number;
		*/
		
		
		return createDecimalToNumber(decimalValue,to_base);
	}
	
	
	public static Order compare(Number n1,Number n2){
		if(n1.decimalValue()>n2.decimalValue()) return Order.GREATER;
		else if(n1.decimalValue()==n2.decimalValue()) return Order.EQUAL;
		else return Order.LESSER;
	}
	
	public int decimalValue(){
		if(decimalValue == 0){
			for(int i=0;i<values.length;i++){
				decimalValue += Base.lookup(values[i])*Math.pow(base, values.length-1-i);
			}
		}
		return decimalValue;
	}
	
	
	private static Number createDecimalToNumber(int n,int to_base){
		Number number = new Number();
		String converted = "";
		//System.out.println("N is : "+n+"/"+to_base);
		int quotient = n;
		while(quotient>0){
			if(!Base.isBaseSupported(quotient % to_base)){
				number.base = 10;
				number.decimalValue = n;
				System.out.println("Base not supported, converted to decimal number");
				return number;
			}
			converted = Base.lookup(quotient % to_base) + converted;
			quotient = quotient/to_base;
			//System.out.println("Quotient : "+quotient+"/"+converted);
		}
		number.base = to_base;
		number.values = converted.toCharArray();
		return number;
	}
	
	
	public static int partition(Number[] list,int start,int end){
		//System.out.println("in partition1");
		Number pivotVal = createDecimalToNumber((int)(list[start].decimalValue()+list[(start+((end-start)/4))].decimalValue()+list[(end-((end-start)/4))].decimalValue()+list[(start+((end-start)/2))].decimalValue()+list[end].decimalValue())/5,10);
		//System.out.println("Decimal is : "+pivotVal.decimalValue() );
		int i=start,j=end,maxLoc=start,partition=0;
		while(i<j){
			//System.out.println("in partition");
			if(Number.compare(list[i],pivotVal)==Order.GREATER){
				swap(list,i,j--);
			}else{
				if(Number.compare(list[i],list[maxLoc])==Order.GREATER){
					maxLoc=i;
				}
				i++;
			}
		}
		if(Number.compare(list[i], list[maxLoc])==Order.GREATER) maxLoc = i;
		if(Number.compare(list[i],pivotVal)==Order.GREATER) partition=--i;
		else partition=i;
		swap(list,i,maxLoc);
		//System.out.println("Partition returned"+partition);
		return partition;
	}
	
	public static Number quickSelect(Number[] list,int k){
		int start=0,end=list.length-1,partitionLoc = start;
		do{
			partitionLoc = partition(list,start,end);
			//System.out.println("in quickselect "+start+"/"+end+"/"+k+"/"+partitionLoc);
			
			for(int ii=0;ii<list.length;ii++){
				//System.out.print(" "+list[ii].decimalValue+"/"+list[ii].toString());
			}
			
			if(partitionLoc>k) end=partitionLoc-1;
			else if(partitionLoc<k) start=partitionLoc+1;
		}while(partitionLoc!=k);
		return list[k];
	}

	public static void swap(Number[] list,int from,int to){

		Number temp = list[from];
		list[from]=list[to];
		list[to]=temp;
	}
}
