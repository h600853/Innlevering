package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
	
		int fakultet = 1;
  
	String userinput = showInputDialog("Skriv inn eit tall: ");
	int n = parseInt(userinput);
	
	for (int i=1; i<=n; i++) {
		 fakultet = fakultet * i; }
		
		showMessageDialog(null,"Fakultet av " + n + " = " + fakultet);
	
	

	}

}
