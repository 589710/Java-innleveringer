package innlevering_1;

//opg 6 fra uke 2//
import static javax.swing.JOptionPane.*;

public class Opg_1 {

	public static void main(String[] args) {

		int brutto = Integer.parseInt(showInputDialog("Tas inn din bruttoinntekt"));

		double sats;

		sats = 0.00;
		if (brutto >= 164100) {

			if (brutto <= 230950 && brutto >= 164101)
				sats = 0.93;
			if (brutto <= 580650 && brutto >= 230951)
				sats = 2.41;
			if (brutto <= 934050 && brutto >= 580651)
				sats = 11.52;
			if (brutto >= 934051)
				sats = 14.52;

		}

		showMessageDialog(null, "Din skattesats er " + sats + "% \n"+
				"Du betaler " + brutto*sats/100 + "kr " + "i skatt.");

	}

}
