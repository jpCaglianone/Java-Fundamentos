package Estrutura_Dados;

//Estrutura FIFO (First In, First Out)
//Interface implementada por várias classes
//Principais implementações: LinkedList, PriorityQueue
//Gerenciamento de processos
//Sistemas de impressão
//Buffers
//Processamento de pedidos
//Gerenciamento de recursos

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void FilaExemplo() {

        Queue<String> fila = new LinkedList<>();
        fila.offer("elemento");    // Adiciona no fim
        fila.poll();                  // Remove e retorna primeiro
        fila.peek();                  // Visualiza primeiro
        fila.size();                  // Tamanho da fila
        fila.isEmpty();               // Verifica se está vazia
        fila.clear();                 // Limpa a fila
        fila.add("novoElemento");     // Adiciona no final, lança exceção se não for possível
        String elementoRemovido = fila.remove();  // Remove e retorna o primeiro elemento
        boolean existe = fila.contains("elemento");  // Verifica se "elemento" está na fila
        fila.forEach(elemento -> System.out.println(elemento));  // Exibe todos os elementos

    }

}
