package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
	String talltxt = showInputDialog("Skriv inn din bruttoinntekt: ");
	int tall = parseInt(talltxt);
	
    if (tall >=0 && tall <= 184800) { 
    	showMessageDialog(null, "Ingen trinnskatt"); }
	
    else if (tall > 184800 && tall  <=  260100) {
	   showMessageDialog(null, "Det blir " + (tall* 0.017) + "kr i trinnskatt"); }
	   
	   else if (tall > 260000 && tall  <=  651250) {
		   showMessageDialog(null, "Det blir " + (tall* 0.04) + "kr i trinnskatt"); }
   
	   else if (tall > 651250 && tall  <=  1021550) {
		   showMessageDialog(null, "Det blir " + (tall* 0.132) + "kr i trinnskatt"); }
	   
	   else if (tall > 1021550) {
		   showMessageDialog(null, "Det blir " + (tall* 0.162) + "kr i trinnskatt"); 
   }
   
   }
		
	
	}


