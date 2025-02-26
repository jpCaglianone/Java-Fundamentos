package POO;


// obs, uma classe abstrata apenas pode ser herdade, ela nao pode ter objetos instanciados
// isso nao significa que toda classe que tem herdeiros precisa ser abstrata

public abstract  class HerancaPai {

    protected String nome;
    protected int idade;
    protected String habilidade;

    public HerancaPai(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public HerancaPai() {}

    protected void apresentar() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade);
    }

}
