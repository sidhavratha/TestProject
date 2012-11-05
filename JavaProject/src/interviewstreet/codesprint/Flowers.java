package interviewstreet.codesprint;

import java.util.Arrays;
import java.util.Scanner;

public class Flowers {

	public static void main(String[] args) throws Exception{
		
		//Scanner scanner = new Scanner(new java.io.File("input_flowers.txt"));
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int[] flowerCosts = new int[N];
		
		for(int i=0;i<N;i++){
			flowerCosts[i] = scanner.nextInt();
		}
		
		Arrays.sort(flowerCosts);
		
		long sum=0;
		int counter=0;
		int remainder=N%K;
		int divisor=N/K;
		for(;counter<remainder;counter++) sum+=flowerCosts[counter];
		sum*=(divisor+1);
		while(divisor!=0){
			long localSum = 0;
			for(int i=0;i<K;i++,counter++) localSum+=flowerCosts[counter];
			sum+=(localSum*(divisor--));
		}
		
		
		System.out.println(sum);
		
		
	}

}
