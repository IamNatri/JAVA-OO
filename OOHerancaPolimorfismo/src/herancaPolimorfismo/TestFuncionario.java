package herancaPolimorfismo;

public class TestFuncionario{
	
	public static void main (String[] args) {


		Funcionario g1 = new Gerente();
		g1.setNome("Adoleto");
		
		System.out.println(g1.getNome());
		/*g1.setSenha(1234);*/
		g1.setSalario(1200);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		System.out.println(g1.getBonificacao());
		System.out.println(controle.getSoma());
		

	}
	
	
	
}