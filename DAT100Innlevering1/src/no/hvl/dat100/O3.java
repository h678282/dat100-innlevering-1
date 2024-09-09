package no.hvl.dat100;

public class O3 {
	public static void main(String [] args) {
		
		// Vi starter med å deklarere variabelen n - tallet som skal leses inn, og fakultet - variabelen som skal holde på fakultet-verdien.
		
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Skriv inn et heltall: "));
		int fakultet = 1;
		
		/* For-løkka kjøres så lenge i er mindre enn eller lik tallet brukeren tastet inn. 
		 Vi lagrer og oppdaterer verdien fra kjøringene i "fakultet". */
		
		for (int i = 1; i <= n; i++) {
			fakultet *= i;
		}
		
		// Til slutt skriver vi ut svaret som er lagret i fakultet-variabelen i konsollen. 
		
		String melding = (n + "! = " + fakultet);
		System.out.println(melding);
	}
}
