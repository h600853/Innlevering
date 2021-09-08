package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		
		String userinput = showInputDialog("Skriv inn din poengsum");
		int poeng = parseInt(userinput);

		if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Du fekk karakter A");
		}

		else if (poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "Du fekk karakter B");
		}

		else if (poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "Du fekk karakter C");
		}

		else if (poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "Du fekk karakter D");
		}

		else if (poeng >= 40 && poeng <= 49) {
			showMessageDialog(null, "Du fekk karakter E");
		}

		else if (poeng >= 0 && poeng <= 39) {
			showMessageDialog(null, "Du fekk karakter F");
		}

		else if (poeng < 0 || poeng > 100) {
			showMessageDialog(null, "Ugyldig poengsum");
			i--;
			showMessageDialog(null, "Prøv på nytt");
		}

	}
 }
}