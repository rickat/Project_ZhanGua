/**
 * 
 */

/**
 * @author ylh96
 *
 */

import  java.util.Random ;

public class Suan_Qian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
	}
	
	private int choose_stick(){
		Random random = new Random();
		int num_sticks = random.nextInt(100);
		
		return num_sticks;
	}

}
