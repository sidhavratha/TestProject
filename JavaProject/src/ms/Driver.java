package ms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=4){
			System.out.println("Wrong no. of arguments");
			System.out.println("Usages :\njava ms.Driver <base_file_location> <numbers_file_location> <quickIndex> <output_file_location>");
		}else{
			
			System.out.println(args[0]);
			String baseFile = args[0];
			String numbersFile = args[1];
			String quickIndex = args[2];
			String outputFile = args[3];
			
			int quickIndexInt = -1;
			
			String fileOutputData = "";
			if(baseFile==null || baseFile.equalsIgnoreCase("")){
				fileOutputData="Base file name/location incorrect";
			}else if(numbersFile==null || numbersFile.equalsIgnoreCase("")){
				fileOutputData="Numbers file name/location incorrect";
			}else if(quickIndex==null || quickIndex.equalsIgnoreCase("")){
				fileOutputData="Invalid index";
			}else if(outputFile==null || outputFile.equalsIgnoreCase("")){
				fileOutputData="Output file name incorrect";
			}else{
				try{
					quickIndexInt = Integer.parseInt(quickIndex)-1;
					try{
						File base = new File(baseFile);
						if(!base.exists()){
							fileOutputData="Specified base file doesn't exists";
						}else{
							Base.initializeBase(base);
							File numbersFileRef = new File(numbersFile);
							
							if(!numbersFileRef.exists()){
								fileOutputData="Specified numbers file doesn't exists";
							}else{
							
								BufferedReader br = new BufferedReader(new FileReader(numbersFileRef));
								String s= null;
								List<Number> numbers = new ArrayList<Number>();
								while((s=br.readLine())!=null){
									Number tempNumber = Number.createNumber(s);
									System.out.println(tempNumber.decimalValue()+"::"+tempNumber.toString());
									numbers.add(tempNumber);
								}
								
								Number[] numberArray = new Number[numbers.size()];
								int i=0;
								for(Number num : numbers){
									numberArray[i++]=num;
								}
								
								/*for(int ii=0;ii<6;ii++){
									Number tempo = Number.quickSelect(numberArray, ii);
									System.out.println("At location "+ii+" : "+tempo.decimalValue()+"/"+tempo.toString());
								}
								*/
								/*for(int ii=0;ii<6;ii++){
									Number tempo = Number.quickSelect(numberArray, ii);
									System.out.println("At location "+ii+" : "+tempo.decimalValue()+"/"+tempo.toString());
								}
								*/
								
								if(quickIndexInt<0){
									fileOutputData = "Quick index cannot be less than 1";
								}else if(quickIndexInt>numberArray.length-1){
									fileOutputData = "Quick index cannot be greater than "+numberArray.length;
								}else{
									fileOutputData = Number.quickSelect(numberArray, quickIndexInt).toString();
								}
								
							}
						}
						
					}
					catch(IOException ex){
						fileOutputData = "File IO Failed";
					}
				}
				catch(NumberFormatException e){
					fileOutputData="Index is not integer";
				}
			}
			
			System.out.println("Output is "+fileOutputData);
			try{
				FileWriter fw = new FileWriter(new File(outputFile));
				fw.write(fileOutputData);
				fw.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		/*
		try {
			Base.initializeBase(new File("base.txt"));
			BufferedReader br = new BufferedReader(new FileReader(new File("numbers.txt")));
			String s= null;
			List<Number> numbers = new ArrayList<Number>();
			while((s=br.readLine())!=null){
				numbers.add(Number.createNumber(s));
			}
			
			Number[] numberArray = new Number[numbers.size()];
			int i=0;
			System.out.println();
			for(Number num : numbers){
				System.out.print(num.decimalValue()+" ");
				numberArray[i++]=num;
			}
			System.out.println();
			
			
			
			System.out.println(Number.quickSelect(numberArray, 7).decimalValue());
			//System.out.println(Number.quickSelect(numberArray, 1).decimalValue());
			//System.out.println(Number.quickSelect(numberArray, 0).decimalValue());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
