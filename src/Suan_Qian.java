/**
 * 
 */

/**
 * @author ylh96
 *
 */

import java.util.HashMap;
import  java.util.Random ;
import java.util.Scanner;



public class Suan_Qian {
	
	public static final String[] MEANING = {"very good", "good", "okay", "cautious", "very cautious"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//<<<<<<< HEAD
		Scanner scan = new Scanner(System.in);
		System.out.println("Start? Enter \"Quit\" to quit");
		String s = scan.nextLine();
		while (s.charAt(0) != 'Q' && s.charAt(0) != 'q') {
			get_your_luck();
			System.out.println("Continue? Enter \"Quit\" to quit");
			s = scan.nextLine();
		}
//=======
		System.out.println("Hello World");
		
//>>>>>>> branch 'master' of https://github.com/rickat/Project_ZhanGua.git
	}
	
	private static void get_your_luck() {
		Random random = new Random();
		int rand = random.nextInt(5);
		String result = MEANING[rand];
		System.out.println("Your luck is: " + result);
	}
	
	/*private static void get_your_luck() {
		Random random = new Random();
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			int luck = random.nextInt(5);
			m.put(i, MEANING[luck]);
		}
		int num_sticks = random.nextInt(100);
		String result = m.get(num_sticks);
		System.out.println("Your luck is: " + result);
	}*/
}
