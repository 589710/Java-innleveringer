package prøve.september;

import static javax.swing.JOptionPane.showInputDialog;

public class Opg_4 {

	public static void main(String[] args) {
		// regner med både a og b går innenfor denne

		int x = Integer.parseInt(showInputDialog("Tast inn et heltall"));
		int y = Integer.parseInt(showInputDialog("Tast inn et heltall"));
		int z = Integer.parseInt(showInputDialog("Tast inn et heltall"));

		int m = Math.min(x, y);
		if (m > z) {
			System.out.println(z + " er det minste tallet");
		} else {
			System.out.println(m + " er det minste tallet");
		}

	}

}
