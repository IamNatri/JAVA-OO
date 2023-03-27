package sintaxeVariaveisFluxos;

public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;

		segundo = primeiro;
		primeiro = 10;

		// não guarda referencia guarda valores.

		System.out.println(segundo);

	}
}
