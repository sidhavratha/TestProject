package techgig.quiz;

public class RollingDice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode.rolling_dice(" { 12, 11, 5, 2, 7, 5, 11}", "{ 5, 12, 5, 7, 11, 2, 11}");
		System.out.println(UserMainCode.output1);
		UserMainCode.rolling_dice(" { 12, 11, 5, 2, 7, 5}", "{ 5, 12, 5, 7, 11, 2, 11}");
		System.out.println(UserMainCode.output1);
	}

}

