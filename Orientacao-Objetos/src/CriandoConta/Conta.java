package CriandoConta;

public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	//referenciado classe cliente
	private Cliente titular;
	//calculo de quantidade de objetos gerados
	private static int quantidadeClientes;
	
	
	


	//pedindo valores de inicializacao dos atributos no construtor
	public Conta(int agencia, int numero) {
		quantidadeClientes++;
		System.out.println("Quantidade total de contas: " + quantidadeClientes);
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Conta criada de " + "Agencia: " + agencia + ". numero: " + numero);
		
		
	}
	
	
	//Criando metodo de deposito de valores em conta
	void deposita(double valor){
		this.saldo += valor;		
	}
	
	
	//Saca valor da conta retornado true or false
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
								
	}
	
	//Transferecia de valor entre contas
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor)	{
			saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getQuantidadeClientes() {
		return quantidadeClientes;
	}
	
}
