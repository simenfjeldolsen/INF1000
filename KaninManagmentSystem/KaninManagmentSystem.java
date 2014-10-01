// Importerer Scanner for innlesning fra bruker.
import java.util.Scanner;

// "Program" klassen hvor main ligger. Det er her vi opretter kaninbur objektet og interagerer med brukeren.
public class KaninManagmentSystem {

	// Static Scannner slik at vi kan bruke den i alle static metoder.
	static Scanner inn = new Scanner(System.in);

	// main metoden. Her starter alltid programmet.
	public static void main(String[] args) {

		// Oprettelse av kaninburet.
		Kaninbur kaninbur = new Kaninbur();

		// Skriver ut en velkomstmelding.
		System.out.println("Velkommen til Kanin Managment System");
		System.out.println("Velg en handling");


		// Setter valg til 1 slik at while loekken blir true foerste gang.
		int valg = 1;

		while (valg != 0) {

			// Skriver ut valgene til brukeren.
			System.out.println("1. Sett inn en kanin");
			System.out.println("2. Ta ut en kanin");
			System.out.println("3. Sett mat i buret");
			System.out.println("4. Vask buret");
			System.out.println("5. Kjoer dagskjoering");

			// Leser valg fra brukeren.
			valg = Integer.parseInt(inn.nextLine());

			// Hvis valget er 1 saa kaller vi getKaninFraBruker() for aa faa en kanin.
			// Deretter setter vi kaninen inn i kaninburet ved hjelp av settInnKanin() metoden.
			if (valg == 1) {
				Kanin k = getKaninFraBruker();
				kaninbur.settInnKanin(k);

			// Hvis valget er 2 saa tar vi ut en kanin fra kaninburet ved hjelp av taUtKanin() metoden.
			} else if (valg == 2) {
				kaninbur.taUtKanin();

			// Hvis valget er 3 saa fyller vi matskaalen ved hjelp av fyllMat() metoden.
			} else if (valg == 3) {
				System.out.println("Hvor mye mat vil du sette inn?");
				int i = Integer.parseInt(inn.nextLine());
				kaninbur.fyllMat(i);

			// Hvis valget er 4 saa vasker vi buret med vaskBur() metoden.
			} else if (valg == 4) {
				kaninbur.vaskBur();

			// Hvis valget er 5 saa gjennomfoerer vi en dagskjoering med dagsKjoering() metoden.
			} else if (valg == 5) {
				kaninbur.dagsKjoering();

			// Hvis valget ikke er 1-5 saa ber vi brukeren aa taste inn 1-5.
			} else {
				System.out.println("Velg 1-5.");
			}
		}
	}

	// Henter info om en kanin fra bruker og opretter en kanin med denne infoen.
	public static Kanin getKaninFraBruker() {

		// Leser inn info fra bruker.
		System.out.println("Hva heter kaninen?");
		String navn = inn.nextLine();
		System.out.println("Hvilken farge har kaninen?");
		String farge = inn.nextLine();

		// Opretter en kanin.
		Kanin k = new Kanin();

		// Setter infoen vi fikk fra bruker inn i den oprettede kaninen.
		k.setNavn(navn);
		k.setFarge(farge);

		// Returnerer den "ferdige" kaninen.
		return k;
	}
}