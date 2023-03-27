package sintaxeVariaveisFluxos;

public class TestCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;
		int quantidadePessoas = 3;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas>=2;
		
		
		
		//if (idade >= 18 || quantidadePessoas >= 2 ) {
		//if (idade >= 18 || acompanhado ) {
		if (idade >= 18 && acompanhado ) {	
			System.out.println("\n" +"Seja bem vindo");
		} else 
			// sem {} Só funciona caso tenha um único comando
			System.out.println("Vocë não pode entrar.");

	}

}
