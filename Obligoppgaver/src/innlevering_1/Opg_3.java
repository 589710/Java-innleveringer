package innlevering_1;

import static javax.swing.JOptionPane.*;

public class Opg_3 {

	public static void main(String[] args) {

		double n = Double.parseDouble(showInputDialog("Tast inn et positivt heltall over 0!"));
		double x = 1;

		while (n <= 0) {
			n = Double.parseDouble(showInputDialog(null, "Tallet må være positivt og større enn 0"));
		}
		while (n > 1) {
			x *= n;

			n--;
			
			
		}
		System.out.println(x);
	}

}
