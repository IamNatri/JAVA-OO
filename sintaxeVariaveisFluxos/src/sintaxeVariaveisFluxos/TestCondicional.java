package sintaxeVariaveisFluxos;

public class TestCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Vocë tem mais de 18 anos" + "\n" +"Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("vocë pode entrar");
			} else
				// sem {} Só funciona caso tenha um único comando
				System.out.println("Vocë não pode entrar.");
		}

	}

}
