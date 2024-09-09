package no.hvl.dat100;

public class O2 {
	public static void main(String [] args) {
	
		// Vi starter med å lese inn bruttoinntekten og deklarere og initiere trinnskatt variabelen. 
		
		int bruttoInntekt = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Bruttoinntekt: "));
		double trinnSkatt = 0;
		
		/* Vi sjekker deretter hvilket trinnskatt-nivå bruttinntekten som ble skrevet inn faller i, regner ut trinnskatten 
		og skriver den ut til skjermen */
	
		if (bruttoInntekt >= 0 && bruttoInntekt <= 208050) {
		System.out.println("Ingen trinnskatt");
		
		} else if (bruttoInntekt >= 208051 && bruttoInntekt <= 292850) {
			trinnSkatt = bruttoInntekt * 0.017;
			System.out.println("Du må betale: " + trinnSkatt + " kr i trinnskatt");
	
		} else if (bruttoInntekt >= 292851 && bruttoInntekt <= 670000) {
			trinnSkatt = bruttoInntekt * 0.04;
			System.out.println("Du må betale: " + trinnSkatt + " kr i trinnskatt");
	
		} else if (bruttoInntekt >= 670001 && bruttoInntekt <= 937900) {
			trinnSkatt = bruttoInntekt * 0.136;
			System.out.println("Du må betale: " + trinnSkatt + " kr i trinnskatt");
	
		} else if (bruttoInntekt >= 937901 && bruttoInntekt <= 1350000) {
			trinnSkatt = bruttoInntekt * 0.166;
			System.out.println("Du må betale: " + trinnSkatt + " kr i trinnskatt");
	
		} else if (bruttoInntekt >= 1350001) {
			trinnSkatt = bruttoInntekt * 0.176;
			System.out.println("Du må betale " + trinnSkatt + " kr i trinnskatt");
	
		// Hvis brukeren skriver inn et negativt tall skriver vi ut en feilmelding fordi vi ikke kan ha en inntekt under 0.
			
		} else {
			System.out.println("Bruttoinntekten kan ikke være et negativt tall, prøv på nytt");
		}
	}
}
