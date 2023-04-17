import java.util.Scanner;

public class InteradorDeTransacao {

    private SistemaDeTransacao cliente;
    Scanner scanner = new Scanner(System.in);

    public InteradorDeTransacao() {
        System.out.println("Vamos Criar sua conta... ");
        cliente = new SistemaDeTransacao();

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + cliente.getName());
        System.out.println("Tipo conta: " + cliente.getTipoConta());
        System.out.println("Saldo atual: " + cliente.consultarSaldo());
        System.out.println("\n***********************\n\n");

        System.out.println("Gostaria de ir para o menu ? \n 1 - sim \n 2 - nao");
        if (scanner.nextInt() == 1){
            Menu();
        }
    }

    public void Menu() {
        String menu = """
                    Operações
                                    
                    1- Consultar saldos
                    2- Depositar valor
                    3- Transferir valor
                    4- Sair
                                    
                    Digite a opção desejada:
                    """;
        int operacoes = 0;
        while(operacoes != 4){
            System.out.println(menu);
            operacoes = scanner.nextInt();
            if (operacoes == 1){
                this.cliente.consultarSaldo();
            }else if (operacoes == 2){
                System.out.println("Informe o valor a ser depositado:");
                float valorDeposito = scanner.nextFloat();
                this.cliente.depositarValor(valorDeposito);
            }else if (operacoes == 3){
                System.out.println("Informe o valor a ser transferido:");
                float valorTransferencia = scanner.nextFloat();
                this.cliente.transferirValor(valorTransferencia);
            } else if (operacoes > 4){
                System.out.println("Operacao invalida");
            }


        }
    }
}