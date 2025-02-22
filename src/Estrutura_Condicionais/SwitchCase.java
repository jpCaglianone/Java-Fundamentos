package Estrutura_Condicionais;

import java.util.Scanner;

public class SwitchCase {

    public static void SwitchCaseExemplo() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("inserir");
                break;
            case 2:
                System.out.println("listar");
                break;
            case 3:
                System.out.println("alterar");
                break;
            case 4:
                System.out.println("deletar");
                break;
            case 5:
                System.out.println("sair");
                break;
            default:
                System.out.println("erro");
                break;

        }

    }

}
