
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 * This is the model of Suan Qian GUI
 * 
 * @author Shen Wang, Yilun Hua
 *
 */
public class Qian {

	public static final String[] MEANING = { "very good", "good", "okay", "cautious", "very cautious" };

	private String wish;

	public Qian(String wish) {
		this.wish = wish;
	}

	// return your luck
	String return_message() {
		return fortune_teller();
	}

	private String fortune_teller() {
		Random random = new Random();
		int rand = random.nextInt(5);
		String result = MEANING[rand];
		return "Your wish was:\n" + this.wish + "\nAnd your luck is:\n" + result;
	}

}
