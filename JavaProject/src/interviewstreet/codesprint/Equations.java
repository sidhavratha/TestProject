package interviewstreet.codesprint;

public class Equations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination(34482, 34482);
	}
	
	public static int combination(int N,int K){
		
		double numerator = 1;
		long denominator = 1;
		while(K>0){
			numerator*=(N-(K-1))/(double)K;
			K--;
			System.out.println("("+N+"-"+K+")* num/den : "+numerator+"/"+denominator);
		}
		System.out.println("Numerator : "+numerator+" Denominator : "+denominator);
		
		return -1;
	}

}
