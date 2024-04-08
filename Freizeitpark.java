
import java.util.Scanner;
import java.text.DecimalFormat;

public class Freizeitpark {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		willkommen();
		eintrittBezahlen();
		eisEssen();
		
		achterbahnFahren();
		wcBenutzen();
		sichBetrinken();
		parkVerlassen();
	}
	
	public static void willkommen() {
		System.out.println("Willkommen in unserem Freizeitpark!");
	}
	
	public static void eintrittBezahlen() {
		int preisFuerErwachsene = 20;
		// int preisFuerKinderu14 = 0;
		double preisFuerKinder14u18 = preisFuerErwachsene * 0.75;
		double preisFuerStudenten = preisFuerErwachsene * 0.75;
		
		System.out.println("Ist der Besucher erwachsen, Student, Kind zwischen 14 und 18 oder Kind unter 14?");
		String antwortDesBenutzers = scan.next();
		
		if (antwortDesBenutzers.equalsIgnoreCase("erwachsen")) {
			System.out.println("Sie muessen " + preisFuerErwachsene + " bezahlen.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Kind unter 14 Jahre")) {
			System.out.println("Fuer Kinder unter 14 Jahren ist der Eintritt kostenlos.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Kind zwischen 14 und 18 Jahren")) {
			System.out.println("Fuer Kinder zwischen 14 und 18 Jahren muessen Sie " + preisFuerKinder14u18 + "bezahlen.");
		} else if (antwortDesBenutzers.equalsIgnoreCase("Student")){
			System.out.println("Sie muessen " + preisFuerStudenten + " bezahlen.");
		}
		
		scan.nextLine();
	}
	
	public static void eisEssen() {
		
		System.out.println("Wollen Sie Eis essen?");
		String eisEssen = scan.next();
		
		if (eisEssen.equalsIgnoreCase("ja")) {
			System.out.println("Wie viele Kugeln moechten Sie?");
			int anzahlDerKugeln = scan.nextInt();
			double preisProKugel = 1.20;
			double endpreisFuerEis = anzahlDerKugeln * preisProKugel;
			
			// Runden auf zwei Dezimalstellen
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragEis = df.format(endpreisFuerEis);
			System.out.println("Sie muessen insgesamt " + gerundeterBetragEis + " Euro fuer das Eis bezahlen.");
		}
		
		scan.nextLine();
	}
	
	// TODO
	public static void durchDenParkSchlendern() {
		
	}
	
	public static void achterbahnFahren() {
		System.out.println("Wollen Sie Achterbahn fahren?");
		String achterbahnFahren = scan.next();
		
		if (achterbahnFahren.equalsIgnoreCase("ja")) {
			System.out.println("Wie viele wollen Achterbahn fahren?");
			int anzahlDerAchterbahnfahrenden = scan.nextInt();
			double preisProFahrenden = 2.80;
			double endpreisFuerAchterbahn = anzahlDerAchterbahnfahrenden * preisProFahrenden;
			
			// Runden auf zwei Dezimalstellen
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragAchterbahn = df.format(endpreisFuerAchterbahn);
			
			System.out.println("Sie muessen insgesamt " + gerundeterBetragAchterbahn + " Euro bezahlen.");
			
		}
		
		scan.nextLine();
	}
	
	public static void wcBenutzen() {
		System.out.println("Wollen Sie das WC benutzen?");
		String wcBenutzen = scan.next();
		
		if (wcBenutzen.equalsIgnoreCase("ja")) {
			System.out.println("Wie viele wollen das WC benutzen?");
			int anzahlWCBenutzenden = scan.nextInt();
			double preisWC = 0.70;
			double endpreisFuerWC = anzahlWCBenutzenden * preisWC;
			
			DecimalFormat df = new DecimalFormat("#.##");
			String gerundeterBetragWC = df.format(endpreisFuerWC);
			
			System.out.println("Sie muessen insgesamt " + gerundeterBetragWC + " Euro zahlen.");
		}
	}
	
	public static void sichBetrinken() {
		System.out.println("Wollen Sie sich betrinken?");
		String sichBetrinken = scan.next();
		if (sichBetrinken.equalsIgnoreCase("ja")) {
			System.out.println("Sind Sie volljaehrig?");
			String volljaehrigBetrinken = scan.next();
			if (volljaehrigBetrinken.equalsIgnoreCase("ja")) {
				String weiterTrinken;
				do {
					System.out.println("Wie viele wollen Sie sich betrinken?");
					int anzahlSichBetrinkenden = scan.nextInt();
					int preisAlkohol = 21;
					int endpreisFuerAlkohol = anzahlSichBetrinkenden * preisAlkohol;
					
					System.out.println("Sie muessen insgesamt " + endpreisFuerAlkohol + " Euro bezahlen.");
					
					System.out.println("Wollen Sie noch etwas trinken?");
					weiterTrinken = scan.next();
				} while (weiterTrinken.equalsIgnoreCase("ja"));
				
			}
		} 
	}
	
	public static void parkVerlassen() {
		System.out.println("Wollen Sie den Park verlassen?");
		String parkVerlassen = scan.next();
		
		if (parkVerlassen.equalsIgnoreCase("ja")) {
			System.out.println("Vielen Dank fuer Ihren Besuch in unserem Freizeitpark! Wir hoffen, Sie hatten eine tolle Zeit und freuen uns darauf, Sie bald wieder bei uns begruessen zu duerfen. Auf Wiedersehen!");
		}
	}
	
	// TODO
	public static void wielangeBenutzerBleibt() {
		
	}

}
