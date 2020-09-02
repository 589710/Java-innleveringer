package innlevering_1;

import static javax.swing.JOptionPane.*;

public class Opg_2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int poeng = Integer.parseInt(showInputDialog("Din poengsum"));
			while (poeng < 0 || poeng > 100) {
				poeng=Integer.parseInt(showInputDialog("Poengsum må være mellom 100 og 0"));

			}
			char karakter;
			karakter = 'p';

			if (poeng <= 100 && poeng >= 90) {
				karakter = 'A';
			}
			if (poeng <= 89 && poeng >= 80) {
				karakter = 'B';
			}
			if (poeng <= 79 && poeng >= 60) {
				karakter = 'C';
			}
			if (poeng <= 59 && poeng >= 50) {
				karakter = 'D';
			}
			if (poeng <= 49 && poeng >= 40) {
				karakter = 'E';
			}
			if (poeng <= 39 && poeng >= 0) {
				karakter = 'F';
			}

			System.out.println("Din karakter er " + karakter);
		}
	}
}
