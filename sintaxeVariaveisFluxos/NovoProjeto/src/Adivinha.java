import java.util.Random;
import java.util.Scanner;
public class Adivinha {

    public void aleatorio(){
        int numeroGerado = new Random().nextInt(100);
        System.out.println("""
                            Adivinhe qual o número aleatório gerado entre 0 e 100.
                            Vocë tem 5 tentativas!!
                            """);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            int valorTentative = scanner.nextInt();
            if (valorTentative > numeroGerado){
               System.out.println("Valor informado é maior que o esperado.");
            } else { if(valorTentative < numeroGerado){
                System.out.println("Valor informado é menor que o esperado.");
            }else{
                System.out.println("Parabéns vocë acertou!!");
            }
            }

        }
    }
}
