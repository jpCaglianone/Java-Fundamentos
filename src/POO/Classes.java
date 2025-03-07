package POO;

// Modificadores de acesso
// public - total acesso em qualquer parte do programa
// private - apenas na propria classe e somente onde foi declarado
// protected - acesso na mesma classe, subclasse e pacote e classes-filhas

import java.util.*;

public class Classes {
    // Atributos (variáveis de instância)
    private String nome;
    private int idade;

    // Construtor
    //Podem existir varios construtores
    // eles "obrigam" que os atributos sejam passados hora de instanciar um objeto
    public Classes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Classes() {}

    // Métodos
    // métodos representam ações que o objeto instanciado pode ter
    // objetos privados geralmente tem os atributos publicos get (para buscar o valor do atributo)
    // e set (para registrar um valor no atributo do objeto

    //o encapsulamento refere-se à técnica de proteger os dados dentro de uma classe, controlando o acesso a eles.
    //Declarar os atributos (variáveis) de uma classe como privados
    //Fornecer métodos públicos (getters e setters) para acessar e modificar esses atributos
    //Controlar como os dados são acessados e modificados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, eu sou " + this.nome + " e tenho " + this.idade + " anos.");
    }



}


