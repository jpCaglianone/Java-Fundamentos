package POO;



public class HerancaFilho extends HerancaPai {

    //atributo exclusivo da subclasse
    private boolean ativo;


    //construtor herdado do pai mais o proprio atributo
    public HerancaFilho(String nome, int idade, String habilidade, boolean ativo) {
        super(nome, idade, habilidade);
        this.ativo = ativo;
    }

    public HerancaFilho() {}

    @Override
    public void apresentar() {
        String ativado = ativo ? "Ativo" : "Desativado";
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade + "\nHabilidade: " + ativado);
    }
}
