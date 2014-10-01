// Klasse som representerer en person.
public class Person {

	// Personens navn.
	private String navn;

	// Personens personnummer.
	private String personnummer;

	// Personens alder.
	private int alder;

	// Konstruktoer som setter personens navn, personnummer og alder til til sine respektive parametere.
	public Person(String navn, String personnummer, int alder) {
		this.navn = navn;
		this.personnummer = personnummer;
		this.alder = alder;
	}

	// Konstruktoer som kun setter personens navn.
	public Person(String navn) {
		this.navn = navn;
	}
}