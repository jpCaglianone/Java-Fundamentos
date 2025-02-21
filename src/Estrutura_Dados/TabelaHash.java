package Estrutura_Dados;

//Estrutura chave-valor que usa função hash para armazenamento
//Thread-safe (synchronized)
//Não permite null como chave ou valor
//Cache de dados
//Contagem de frequência
//Ambientes multi-thread
//Mapeamento de configurações
//Dicionários

import java.util.Enumeration;
import java.util.Hashtable;

public class TabelaHash {

        public static void TabelaHashExemplo() {

            Hashtable<String, Integer> tabela = new Hashtable<>();
            tabela.put("chave", 10);           // Adiciona par chave-valor
            tabela.get("chave");               // Obtém valor pela chave
            tabela.remove("chave");            // Remove par
            tabela.containsKey("chave");       // Verifica se existe chave
            tabela.containsValue(10);          // Verifica se existe valor
            tabela.keys();                     // Retorna todas as chaves
            tabela.isEmpty();                  // Verifica se está vazia
            tabela.replace("chave", 10, 30);  // Substitui 10 por 30 se o valor for 10
            Hashtable<String, Integer> copiaTabela = (Hashtable<String, Integer>) tabela.clone(); //faz um clone em outra hashtable
            int tamanho = tabela.size();  // Retorna o número de elementos na tabela
            Enumeration<Integer> valores = tabela.elements();  // Retorna os valores da tabela
            Enumeration<String> chaves = tabela.keys();  // Retorna as chaves da tabela


            tabela.clear();  // Remove todos os pares chave-valor


        }

}
