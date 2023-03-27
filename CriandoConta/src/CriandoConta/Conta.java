package CriandoConta;

public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Criando metodo de deposito de valores em conta
	void deposita(double valor){
		this.saldo = this.saldo + valor;
		
	}
}
