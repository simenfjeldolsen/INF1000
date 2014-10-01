// Klasse for kaninbur.
// Har variabler for grad av skitt, antal kaniner etc.
// Bruker en array for aa ta vare paa kaniner.
// Har metoder for aa sette inn kaniner, ta ut kaniner, fylle mat og vaske buret.
public class Kaninbur {

	// Hvor skittent buret er.
	private int gradAvSkitt;

	// Hvor mange kaniner det er i buret.
	private int antallKaniner;

	// Hvor mange kaniner det maksimalt er plass til i buret.
	private int maxAntallKaniner;

	// Hvor mye mat det er i matskaalen.
	private int matISkaalen;

	// Hvor mye mat det er plass til i matskaalen.
	private int maxMatISkaalen = 20;

	// Array hvor vi kan lagre kaniner.
	private Kanin[] kaninbur;


	// Gjennomfoerer en "dagskjoering" av buret.
	// Mat blir spist og buret blir skittnet til.
	public void dagsKjoering() {

		// Grad av skitt oekes med antall kaniner.
		gradAvSkitt = gradAvSkitt + antallKaniner; // Kunne selvfoelgelig også blitt skrevet "gradAvSkitt += antallKaniner;".

		// Sjekker om kaninene hvil spise opp all maten i skaalen.
		// Hvis de gjoer det, sier vi fra og setter matskaalen til 0 (tom).
		if (matISkaalen - (antallKaniner * 2) < 0) {
			System.out.println("NAA ER DET TOMT FOR MAT!!!");
			matISkaalen = 0;

		// Hvis de ikke gjoer det saa oppdaterer vi mengden mat i matskaalen.
		} else {
			matISkaalen = matISkaalen - (antallKaniner * 2);
		}
	}

	// Metode som tar inn en kanin som parameter og setter den inn i kaninbur-arrayen.
	public void settInnKanin(Kanin k) {

		// Hvis det ikke finnes et kaninbur saa opretter vi et.
		if (kaninbur == null) {
			maxAntallKaniner = 10;
			kaninbur = new Kanin[maxAntallKaniner];
		}

		// Vi sjekker om det er fult.
		if (antallKaniner >= maxAntallKaniner) {
			System.out.println("Her er det fult.");

		// Hvis det ikke er fult saa setter vi inn kaninen og oeker "antallKaniner".
		} else {
			kaninbur[antallKaniner++] = k;
		}
	}

	// Tar ut en kanin fra kaninburet.
	public Kanin taUtKanin() {

		// Hvis det er tomt for kaniner saa skriver vi dette og returnerer "null".
		if (antallKaniner == 0) {
			System.out.println("Det er tomt for kaniner.");
			return null;
		}

		// Vi minsker "antallKaniner" for a reflektere at det er en kanin mindre i buret.
		antallKaniner--;

		// Vi opretter er peker og setter den til aa peke paa den siste kaninen i buret.
		Kanin k = kaninbur[antallKaniner];

		// Vi oppdaterer arrayen til aa ikke inneholde kaninen, men isteden "null".
		kaninbur[antallKaniner] = null;

		// Vi returnerer kaninen vi har tatt ut.
		return k;
	}

	// Vasker buret ved aa sette gradAvSkitt til 0;
	public void vaskBur() {
		gradAvSkitt = 0;
	}

	// Fyller mat i skaalen.
	public void fyllMat(int antallMat) {

		// Hvis vi proever aa legge i for mye mat.
		if (matISkaalen + antallMat > maxMatISkaalen) {

			matISkaalen = maxMatISkaalen;
			System.out.println("Naa proevde vi aa putt i for mye mat.");
			return;
		}

		matISkaalen = matISkaalen + antallMat;
	}

	// Skriver ut info om kaninburet.
	public void skrivUtKaninbur() {

		// Skriver ut alle kaninene.
		for (int i = 0; i < antallKaniner; i++) {
			System.out.println(kaninbur[i].getNavn());
		}

		// SKriver ut mat-mengde og grad av skitt.
		System.out.println("Det er " + matISkaalen + " posjoner mat i skaalen.");
		System.out.println("Det er " + gradAvSkitt + " grader av skitt i buret.");
	}
}