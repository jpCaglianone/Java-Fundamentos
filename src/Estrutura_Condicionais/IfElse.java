package Estrutura_Condicionais;

import java.util.Scanner;

public class IfElse {

    static Scanner entrada = new Scanner(System.in);

    public static void IfElseExemplo() {

        System.out.println("Digite um valor: ");
        double numero = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo");
        }
        else if (numero < 0) {
            System.out.println("O número é negativo");
        }
        else {
            System.out.println("O numero e zero");
        }

    }


}
