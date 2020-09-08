package prøve.september;

import static javax.swing.JOptionPane.showInputDialog;

public class Opg_5 {

	public static void main(String[] args) {

		double r= Double.parseDouble(showInputDialog("radius"));
		//skriv inn 1.5 for opg b
		double areal= Math.PI*r*r;
		System.out.println(areal);
	}

}
