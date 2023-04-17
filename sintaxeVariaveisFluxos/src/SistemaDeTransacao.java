import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaDeTransacao {
    private String name;
    private Float saldo;
    private String tipoConta;
    Scanner scanner = new Scanner(System.in);


    public SistemaDeTransacao(){
        System.out.println("Informe seu nome completo: ");
        this.name = scanner.nextLine();
        System.out.println("Informe seu valor para primeiro deposito: ");
        this.saldo = scanner.nextFloat();
        System.out.println("""
                Informe seu tipo de conta digite 
                1 - Corrente
                2 - poupanca
                3 - salário
                """);
        setTipoConta(scanner.nextInt());
    }


    public void setTipoConta(int tipoConta) {
        if (tipoConta < 0 || tipoConta >= 4){
            System.out.println("Escolha uma opção valida ");
        }else {
            switch (tipoConta) {
                case 1:
                    this.tipoConta = "Corrente";
                    break;
                case 2:
                    this.tipoConta = "Poupanca";
                    break;
                case 3:
                    this.tipoConta = "Salário";
                    break;


            }
        }
    }

    public void depositarValor(float v){
        this.saldo += v;
        System.out.println("Valor de" + v + " depositado. \n Saldo atual é " + this.saldo);
    }

    public void transferirValor(float v ){
        if(v > this.saldo){
            System.out.println("Operação indisponivel valor de transferencia maior que o saldo.");
        }else {
            this.saldo -= v;
            System.out.println("Valor de" + v + " transferido. \n Saldo atual é " + this.saldo);
        }
        }

    public String getTipoConta() {
        return tipoConta;
    }

    public Float consultarSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }
}
