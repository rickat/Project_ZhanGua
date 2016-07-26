/**
 * 
 */

/**
 * @author ylh96
 *
 */

import java.util.HashMap;
import  java.util.Random ;



public class Suan_Qian {
	public static final String[] MEANING = {"very good", "good", "okay", "cautious", "very cautious"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			int luck = random.nextInt(5);
			m.put(i, MEANING[luck]);
		}
		int num_sticks = random.nextInt(100);
		String result = m.get(num_sticks);
		System.out.println("Your luck is: " + result);
	}
}
