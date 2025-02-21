package Estrutura_Dados;

import java.io.Console;
import java.util.Arrays;

//São estruturas de tamanho fixo que armazenam elementos do mesmo tipo
//Acesso direto aos elementos por índice (muito rápido) - O(1)
//Usar quando se sabe o tamanho exato dos dados
//Quando precisa de acesso rápido por índice
//Implementação de matrizes e tabelas
//Armazenamento de dados sequenciais fixos

public class Array {

    public static void ExemploArray1() {

        int arrayA[] = new int[5]; //criaçao de um arary com 5 posiçoes do tipo int
        arrayA[0] = 10; //declarando o valor 10 para a primeira poisição
        System.out.println("Array A:  "  + arrayA[0]);

        String arrayB[] = {"a","b","c","d","e","f"}; //declarando um array "sem tamanho"definido, mas inserindo os elementos apos
        for (String elemento : arrayB) {
            System.out.println(elemento); //imprimindo cada elemento do array
        }

        arrayA[1] = 20;
        arrayA[2] = 30;
        arrayA[3] = 21;
        arrayA[4] = 22;

        System.out.println("Tamanho do array A: " + arrayA.length);

        Arrays.sort(arrayA); //Ordena de modo crescente o array

        System.out.println("Posicao 30 por busca binaria A: " + Arrays.binarySearch(arrayA,30)); //busca um valor (segundo parametro) por busca binaria

        System.out.println(Arrays.toString(arrayA)); //conversao para string

        Arrays.asList(arrayB);//	Converte array em lista imutável
        Arrays.stream(arrayB);//	Converte array em Stream
        int soma = Arrays.stream(arrayA).sum(); // converte e soma todos os elementos do array inteiro
        int min = Arrays.stream(arrayA).min().getAsInt(); // converte e pega o menor numero do array
        int max = Arrays.stream(arrayA).max().getAsInt(); // converte e pega o maior numero do array
        int[] maioresQue21 = Arrays.stream(arrayA).filter(n -> n > 21).toArray(); //converte e filtra os elementos, pegando os maiores que 21
        System.out.println(Arrays.toString(maioresQue21));

    }

    public static void ExemploArray2() {

        int[][] matriz = new int[3][3];
        // matriz 3x3
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Exibindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
