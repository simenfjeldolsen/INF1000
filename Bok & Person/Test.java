// Dette programmet opretter en bok og to personer.
// Dette programmet skriver ikke ut noe til terminalen.
public class Test {

	public static void main(String[] args) {

		Bok b = new Bok("Hobbiten", "J.R.R Tolkien", "1937", "Fantasy");
		Person p = new Person("Simen", "8984452584329", 20);
		Person x = new Person("Amund");
	}
}