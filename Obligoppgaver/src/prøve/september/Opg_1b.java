package prøve.september;

import static javax.swing.JOptionPane.*;

public class Opg_1b {

	public static void main(String[] args) {

		int a = Integer.parseInt(showInputDialog("Tast inn en verdi"));

		if (a >= 5 && a<=8) {
			System.out.println(a + " er innenfor intervallet");
		}
			
			else {
				System.out.println(a + " er utenfor intervallet");
				

		}

	}

}
