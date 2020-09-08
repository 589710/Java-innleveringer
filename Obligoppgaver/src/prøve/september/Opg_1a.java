package prøve.september;

import static javax.swing.JOptionPane.*;

public class Opg_1a {
	

	public static void main(String[] args) {
		int a= Integer.parseInt(showInputDialog("Tast inn en verdi"));
		
		if (a>0) {System.out.println("Verdien er større enn null");
		
		}
		else if (a==0) {System.out.println("Verdien er lik null");
		
		}
		else {System.out.println("Verdien er mindre enn null");
		
		}
		
	}

}
