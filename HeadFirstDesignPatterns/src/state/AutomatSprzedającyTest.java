package state;

public class AutomatSprzedającyTest {
	public static void main(String[] args) {
		AutomatSprzedający automat = new AutomatSprzedający(5);

		System.out.println(automat);

		automat.włóżMonetę();
		automat.przekręćGałkę();

		System.out.println(automat);

		automat.włóżMonetę();
		automat.zwróćMonetę();
		automat.przekręćGałkę();

		System.out.println(automat);

		automat.włóżMonetę();
		automat.przekręćGałkę();
		automat.włóżMonetę();
		automat.przekręćGałkę();
		automat.zwróćMonetę();

		System.out.println(automat);

		automat.włóżMonetę();
		automat.włóżMonetę();
		automat.przekręćGałkę();
		automat.włóżMonetę();
		automat.przekręćGałkę();
		automat.włóżMonetę();
		automat.przekręćGałkę();

		System.out.println(automat);
	}

}
