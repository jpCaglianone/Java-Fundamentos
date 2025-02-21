package Estrutura_Dados;
import java.util.LinkedList;

//Lista encadeada onde cada elemento (nó) tem referência para o próximo
//Tamanho dinâmico
//Quando precisa inserir/remover frequentemente no início/meio
//Implementação de filas e pilhas
//Quando o tamanho dos dados é dinâmico
//Navegação bidirecional (próximo/anterior)

public class ListaLinked {

    public static void LinkedListExemplo() {

        LinkedList<String> lista = new LinkedList();

        lista.add("elemento");
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
        lista.add("elemento4");
        lista.add("elemento5");
        lista.add("elemento6");
        // Adiciona no fim
        lista.add(3,"adicaoPosicao3"); //adiciona no indice indicado
        lista.addFirst("primeiro");     // Adiciona no início, ou .push
        lista.addLast("último");        // Adiciona no fim, ou .offer
        lista.remove("elemento");       // Remove elemento pelo seu valor
        lista.removeFirst();               // remove o primeiro elemento
        lista.removeLast();                 // remove o ultimo elemento
        lista.get(2);                       // retorna o valor localizado no indice
        lista.getFirst();              // Obtém primeiro
        lista.getLast();               // Obtém último
        lista.indexOf("elemento");      // retorna a primeira ocorrencia do valor passado como parametro
        lista.lastIndexOf("elemento");  //retorna a última ocorrencia do valor passado como parametro
        lista.contains("elemento");     // Verifica se existe
        lista.size();                   // retorna o tamanho da lista
        lista.isEmpty();                //retorna true se a lista tiver vazia

        lista.addFirst("a");
        lista.addLast("b");
        lista.addFirst("c");
        lista.add("z");
        lista.add(1,"x");

    }


}
