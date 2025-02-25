package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

//Separar o código de tratamento de erros do código principal
//Propagar erros para níveis superiores do programa
//Manter o programa funcionando mesmo quando ocorrem erros

//Error: problemas graves no ambiente de execução (não devem ser capturados)
//Exception: problemas que um programa pode tratar
//RuntimeException: exceções não verificadas (unchecked)
//Outras exceções: exceções verificadas (checked)

//getMessage(): retorna a mensagem de erro
//printStackTrace(): imprime a pilha de chamadas
//getCause(): retorna a causa da exceção

public class TryCatch  {

    public static void TryCatchExemplo() {

        Scanner sc = new Scanner(System.in);

        try { // o bloco try abre o bloco em que um codigo tentara ser executado
            System.out.print("Digite um numero: ");
            sc.nextInt();
        }
        catch (Exception e) { //caso alguma linha do codigo try de erro fatal que
                              // poderia travar o programa, o bloco catch é executado
                              // O Excepction pega erros gerais, mas tem outros como
                              // ArithmeticException
            System.out.println("Erro fatal: " + e);
        }
        finally {  //este bloco é opcional e sempre sera executado ao fim de tudo
            sc.close();
            System.out.println("Fim do programa");
        }

    }

    public static void TryCatchExemplo2 () throws MinhaExcecao {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Digite um numero: ");
            sc.nextInt();
            throw new MinhaExcecao("Ocorreu um erro personalizado!");
        }
        catch (InputMismatchException e){
            throw new MinhaExcecao("Ocorreu um erro personalizado!");
        }
        catch (MinhaExcecao e) {
            System.out.println("Erro fatal: " + e);
        }



    }

}
