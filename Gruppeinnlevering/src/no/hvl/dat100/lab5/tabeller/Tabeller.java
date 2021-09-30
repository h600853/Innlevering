package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	// a)
		public static void skrivUt(int[] tabell) {
			System.out.print("{");
			for (int i = 0; i < tabell.length; i++) {
				System.out.print(tabell[i] + ","); }
			System.out.print("}");
		
		}

		// b)
		public static String tilStreng(int[] tabell) {
			String tab = "[";
			for (int i = 0; i < tabell.length; i++) {	
				tab += tabell[i] + ","; }
			tab += "]";
			return tab;
		}

		// c)
		public static int summer(int[] tabell) {

			int sum = 0;
			for (int i = 0; i < tabell.length; i++) {
				sum += tabell[i]; }
				return sum;
		}
//		public static int summer2(int[] tabell) {
	//
//			int sum = 0;
//			int i = 0;
//			while (i < tabell.length ) {
//				sum += tabell[i]; }
//				return sum;
//		}
		
//		public static int summer3(int[] tabell) {
	//
//			int sum = 0;
//			for (int tall : tabell) {
//				sum += tall; }
//				return sum;
//		}

		// d)
		public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int i = 0;
		while (!finnes && i < tabell.length) {
			if (tabell[i] == tall) 
				finnes = true; 
			else 
		    i++;	
		}
		return finnes;
		}

		// e)
		public static int posisjonTall(int[] tabell, int tall) {

			// TODO
			throw new UnsupportedOperationException("posisjonTall ikke implementert");

		}

		// f)
		public static int[] reverser(int[] tabell) {

			// TODO
			throw new UnsupportedOperationException("reverser ikke implementert");
			
		}

		// g)
		public static boolean erSortert(int[] tabell) {

			boolean sortert = true;
			int i = 0;
			
			while(sortert && i < tabell.length) {
				if (tabell[i-1] <= tabell[i])
					i++;
				else
					sortert = false; }
			return sortert;
		}

		// h)
		public static int[] settSammen(int[] tabell1, int[] tabell2) {
			int nyLengde = tabell1.length + tabell2.length;
		    int[] nyTab = new int[nyLengde];
		    for (int i=0; i < tabell1.length; i++) {
		      nyTab[i] = tabell1[i];
		    }
		    for (int j=0; j < tabell2.length; j++) {
		      nyTab[tabell1.length+j] = tabell2[j];
		    }
		    return nyTab ;
		}
	

}
