
/**
 * This class will calculate your luck depend on your wish you entered
 * @author Shen Wang, Yilun Hua
 *
 */

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/*
 * Demo class without GUI function
 * In other words, it is a skeleton of Suan_Qian program
 */
public class Suan_Qian {

	public static final String[] MEANING = { "very good", "good", "okay", "cautious", "very cautious" };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Start? Enter \"Quit\" to quit");
		String s = scan.nextLine();
		while (s.charAt(0) != 'Q' && s.charAt(0) != 'q') {
			get_your_luck();
			System.out.println("Continue? Enter \"Quit\" to quit");
			s = scan.nextLine();
		}
	}

	private static void get_your_luck() {
		Random random = new Random();
		int rand = random.nextInt(5);
		String result = MEANING[rand];
		System.out.println("Your luck is: " + result);
	}
}
