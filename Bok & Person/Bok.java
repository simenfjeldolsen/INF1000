// Klasse som representerer en bok.
public class Bok {

	// Bokens tittel.
	private String tittel;

	// Bokesn forfatter.
	private String forfatter;

	// Bokens utgivelsesdato.
	private String utgittDato;

	// Bokens sjanger.
	private String sjanger;

	// Konstruktoer som setter de ulike variabelene til de respektive parameterene.
	public Bok(String t, String f, String u, String s) {

		tittel = t;
		forfatter = f;
		utgittDato = u;
		sjanger = s;
	}
}