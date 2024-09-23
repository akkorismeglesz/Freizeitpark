
import java.util.Scanner;
import java.text.DecimalFormat;

public class Freizeitpark {
	
	public static Scanner scan = new Scanner(System.in);
	public static int vergangeneZeit = 0;
	public static int dauerImPark = 0;
	public static double gesamtausgaben = 0.00;

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		willkommen();
		eintrittBezahlen();
		durchDenParkSchlendern();
		
		/*eisEssen();
		achterbahnFahren();
		wcBenutzen();
		sichBetrinken();
		parkVerlassen(); */
	}
	
	public static void willkommen() {
		System.out.println("Willkommen in unserem Freizeitpark!");
	}
	
	public static void eintrittBezahlen() {
		int preisFuerErwachsene = 20;
		int preisFuerKinderu14 = 0;
		double preisFuerKinder14u18 = preisFuerErwachsene * 0.75;
		double preisFuerStudenten = preisFuerErwachsene * 0.75;
		
		/* System.out.println("Ist der Besucher erwachsen, Student, Kind zwischen 14 und 18 oder Kind unter 14?");
		String antwortDesBenutzers = scan.next();
		
		if (antwortDesBenutzers.equalsIgnoreCase("erwachsen")) {
			System.out.println("Sie muessen " + preisFuerErwachsene + " bezahlen.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Kind unter 14 Jahre")) {
			System.out.println("Fuer Kinder unter 14 Jahren ist der Eintritt kostenlos.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Kind zwischen 14 und 18 Jahren")) {
			System.out.println("Fuer Kinder zwischen 14 und 18 Jahren muessen Sie " + preisFuerKinder14u18 + "bezahlen.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Student")){
			System.out.println("Sie muessen " + preisFuerStudenten + " bezahlen.");
		} */

		System.out.println("Wie viele Eintrittskarten fuer Erwachsene moechten Sie kaufen?");
	    	int anzahlErwachsene = scan.nextInt();
	    	int gesamtpreisErwachsene = anzahlErwachsene * preisFuerErwachsene;

	    	System.out.println("Fuer wie viele Kinder zwischen 14 und 18 Jahren moechten Sie Eintrittskarten kaufen?");
	    	int anzahlKinder14u18 = scan.nextInt();
	    	double gesamtpreisKinder14u18 = anzahlKinder14u18 * preisFuerKinder14u18;

	    	System.out.println("Wie viele Eintrittskarten fuer Studenten moechten Sie kaufen?");
	    	int anzahlStudenten = scan.nextInt();
	    	double gesamtpreisStudenten = anzahlStudenten * preisFuerStudenten;
	    
	    	System.out.println("Fuer wie viele Kinder unter 14 Jahren moechten Sie Eintrittskarte haben?");
	    	int anzahlKinderu14 = scan.nextInt();
	    	int gesamtpreisKinderu14 = preisFuerKinderu14 * anzahlKinderu14;
	    
	    	double gesamtpreis = gesamtpreisErwachsene + gesamtpreisKinder14u18 + gesamtpreisStudenten + gesamtpreisKinderu14;

	   	 // Runden auf zwei Dezimalstellen
	    	DecimalFormat df = new DecimalFormat("#.##");
	    	String gerundeterGesamtpreis = df.format(gesamtpreis);

		gesamtausgaben += gesamtpreis;
		
	    	System.out.println("Gesamtpreis fuer die Eintrittskarten: " + gerundeterGesamtpreis + " Euro.");
		System.out.println();
		
		scan.nextLine();
	}
	
	public static void eisEssen() {
		
		/*System.out.println("Wollen Sie Eis essen?");
		String eisEssen = scan.next();
		
		if (eisEssen.equalsIgnoreCase("ja")) { */
			System.out.println("Wie viele Kugeln moechten Sie?");
			int anzahlDerKugeln = scan.nextInt();
			double preisProKugel = 1.20;
			double endpreisFuerEis = anzahlDerKugeln * preisProKugel;

			gesamtausgaben += endpreisFuerEis;
		
			// Runden auf zwei Dezimalstellen
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragEis = df.format(endpreisFuerEis);
			System.out.println("Sie muessen insgesamt " + gerundeterBetragEis + " Euro fuer das Eis bezahlen.");
		//}
		
		scan.nextLine();
	}
	
	// Zeiterfassung
	public static void durchDenParkSchlendern() {
		System.out.println("Wie lange moechten Sie durch den Park schlendern (in Minuten)?");
		int dauerImPark = scan.nextInt();
		int vergangeneZeit = 0;
		
		System.out.println("Sie beginnen Ihren Spaziergang/Aufenthalt in unserem Park.");
		
		// minutengenaue Erfassung der vergangenen Zeit
		while (vergangeneZeit < dauerImPark) {
			// Aktivitaeten im Park
			System.out.println();
			System.out.println("Was moechten Sie tun? Waehlen Sie eine von den 6 Optionen: ");
			System.out.println("1. Eis kaufen");
			System.out.println("2. Achterbahn fahren");
			System.out.println("3. WC benutzen");
			System.out.println("4. Sich betrinken");
			System.out.println("5. Park verlassen");
			System.out.println();
			
			int aktivitaet = scan.nextInt();
			switch (aktivitaet) {
				case 1:
					eisEssen();
					vergangeneZeit += 5;
					break;
				case 2:
					achterbahnFahren();
					vergangeneZeit += 10;
					break;
				case 3:
					wcBenutzen();
					vergangeneZeit += 5;
					break;
				case 4:
					sichBetrinken();
					vergangeneZeit += 20;
					break;
				case 5:
					parkVerlassen();
					vergangeneZeit += 10;
					break;
				default:
					System.out.println("Ungueltige Benutzereingabe. Bitte waehlen Sie eine der 6 Optionen.");
			}
			
			// vergangeneZeit++;
			System.out.println("Vergangene Zeit: " + vergangeneZeit + " Minuten von " + dauerImPark + " Minuten.");
		}
		
		// nach abgelaufener Zeit
		System.out.println();
		System.out.println("Sie haben keine Zeit mehr.");
		DecimalFormat df = new DecimalFormat("#.##");
		String gerundeteGesamtausgaben = df.format(gesamtausgaben);
		System.out.println("Sie haben insgesamt " + gerundeteGesamtausgaben +" Euro ausgegeben.");
		parkVerlassen();
	}
	
	public static void achterbahnFahren() {
		/* System.out.println("Wollen Sie Achterbahn fahren?");
		String achterbahnFahren = scan.next();
		
		if (achterbahnFahren.equalsIgnoreCase("ja")) { */
			System.out.println("Wie viele wollen Achterbahn fahren?");
			int anzahlDerAchterbahnfahrenden = scan.nextInt();
			double preisProFahrenden = 2.80;
			double endpreisFuerAchterbahn = anzahlDerAchterbahnfahrenden * preisProFahrenden;

			gesamtausgaben += endpreisFuerAchterbahn;
		
			// Runden auf zwei Dezimalstellen
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragAchterbahn = df.format(endpreisFuerAchterbahn);
			
			System.out.println("Sie muessen insgesamt " + gerundeterBetragAchterbahn + " Euro bezahlen.");
			
		//}
		
		scan.nextLine();
	}
	
	public static void wcBenutzen() {
		/* System.out.println("Wollen Sie das WC benutzen?");
		String wcBenutzen = scan.next();
		
		if (wcBenutzen.equalsIgnoreCase("ja")) { */
			System.out.println("Wie viele wollen das WC benutzen?");
			int anzahlWCBenutzenden = scan.nextInt();
			double preisWC = 0.70;
			double endpreisFuerWC = anzahlWCBenutzenden * preisWC;

			gesamtausgaben += endpreisFuerWC;
		
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragWC = df.format(endpreisFuerWC);
			
			System.out.println("Sie muessen insgesamt " + gerundeterBetragWC + " Euro zahlen.");
		// }
	}
	
	public static void sichBetrinken() {
		/*System.out.println("Wollen Sie sich betrinken?");
		String sichBetrinken = scan.next();
		if (sichBetrinken.equalsIgnoreCase("ja")) { */
			System.out.println("Sind Sie volljaehrig?");
			String volljaehrigBetrinken = scan.next();
			if (volljaehrigBetrinken.equalsIgnoreCase("ja")) {
				String weiterTrinken;
				do {
					System.out.println("Wie viele wollen Sie sich betrinken?");
					int anzahlSichBetrinkenden = scan.nextInt();
					int preisAlkohol = 21;
					int endpreisFuerAlkohol = anzahlSichBetrinkenden * preisAlkohol;

					gesamtausgaben += endpreisFuerAlkohol;
					
					System.out.println("Sie muessen insgesamt " + endpreisFuerAlkohol + " Euro bezahlen.");
					
					System.out.println("Wollen Sie noch etwas trinken?");
					weiterTrinken = scan.next();
				} while (weiterTrinken.equalsIgnoreCase("ja"));
				
			}
		//} 
	}
	
	public static void parkVerlassen() {
		/*System.out.println("Wollen Sie den Park verlassen?");
		String parkVerlassen = scan.next();
		
		if (parkVerlassen.equalsIgnoreCase("ja")) { */
			System.out.println("Vielen Dank fuer Ihren Besuch in unserem Freizeitpark!");
			System.out.println("Wir hoffen, Sie hatten eine tolle Zeit und freuen uns darauf, Sie bald wieder bei uns begruessen zu duerfen.");
			System.out.println("Auf Wiedersehen!");
		// }
		
	}

}
