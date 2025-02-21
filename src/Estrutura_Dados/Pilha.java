package Estrutura_Dados;
import java.util.Stack;

//Estrutura LIFO (Last In, First Out)
//Baseada em Array ou LinkedList
//Desfazer/refazer em editores
//Avaliação de expressões matemáticas
//Gerenciamento de chamadas de funções
//Navegador web (histórico)
//Verificação de parênteses em expressões

public class Pilha {

    public static void StackExemplo() {

        Stack<Integer> pilha = new Stack<>();
        pilha.push(10);        // Adiciona no topo
        pilha.pop();           // Remove e retorna o topo
        pilha.peek();          // Visualiza o topo
        pilha.empty();         // Verifica se está vazia
        pilha.search(10);      // Busca elemento (retorna posição)
        pilha.add(1, 20); // insere no indice (primeiro parametro) um dado valor (segundo parametro)
        pilha.get(3);       //pega o valor de um dado indice passado como parametro
        pilha.size();       //tamanho da pilha
        pilha.isEmpty();    // retorna true se estiver vazia
        pilha.forEach(System.out::println);


        pilha.clear();  //limpa totalmente a pilha


    }
}
