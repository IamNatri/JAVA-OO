package CriandoConta;

public class TestClienteConta {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 4321);
		Conta conta1 = new Conta(1223, 41);
		Conta conta2 = new Conta(1223, 41);
		
		System.out.println(Conta.getQuantidadeClientes());
		
		
		conta.setTitular(new Cliente());
		conta.getTitular().setNome("Matheus"); 
		
		System.out.println(conta.getTitular().getNome());
		
	}
}
