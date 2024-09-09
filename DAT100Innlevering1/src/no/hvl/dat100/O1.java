package no.hvl.dat100;

public class O1 {
	public static void main(String [] args) {

		/* Vi legger inn en for-løkke i starten slik at vi skriver ut valgsetningen 10 ganger og kan taste inn
		10 forskjellige poengsummer. */ 
		
		// Deretter sjekker vi hvor poegsummen faller inn og skriver ut tilsvarende karakter. 
		
		for (int i = 1; i <= 10; i++) {
		int poengsum = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Poengsum: "));
			
		if (poengsum <= 100 && poengsum >= 90) {
			System.out.println("Karakter A");
		
		} else if (poengsum <= 89 && poengsum >= 80) {
			System.out.println("Karakter B");
			
		} else if (poengsum <= 79 && poengsum >= 60) {
			System.out.println("Karakter C");
			
		} else if (poengsum <= 59 && poengsum >= 50) {
			System.out.println("Karakter D");
			
		} else if (poengsum <= 49 && poengsum >= 40) {
			System.out.println("Karakter E");
			
		} else if (poengsum <= 39 && poengsum >= 0) {
			System.out.println("Karakter F");
			
		// Hvis vi taster inn en ugyldig poengsum (mindre enn 0 eller større enn 100) får vi mulighet til å prøve en gang til.
			
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, "Ugyldig poengsum, prøv igjen. ");
			poengsum = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Poengsum: "));
		} 
		
		}
	}
}
