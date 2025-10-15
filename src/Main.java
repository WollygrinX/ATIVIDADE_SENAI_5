import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //gerando números aletorios
        Random gerador = new Random();

        int numero_maquina = gerador.nextInt(50);
        int tentativa;

        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o número entre 0 e 50: ");
        //leia
        tentativa = entrada.nextInt();

        //enquanto tentativa não for igual a número da máquina
        while (tentativa != numero_maquina){
            //se tentativa for < que maquina
            if (tentativa < numero_maquina) {
                System.out.println("O número é maior!");
                //
            } else {
                System.out.println("O número é menor!");
            }
            System.out.println("Tente novamente: ");
            tentativa = entrada.nextInt();
        }
        System.out.println("Parabéns, você acertou o número!!");

         entrada.close();
    //FIM DO MEU CODIGO
    }
}
