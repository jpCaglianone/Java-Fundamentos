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


    //override é uma anotação, sendo a sobrecarga de um metodo, ou seja,
    // refere-se à capacidade de objetos de classes diferentes responderem ao mesmo método de maneiras distintas.
    // nao so o override como tambem varios metodos com o mesmo nome podem ser polimorficos
    @Override
    public void apresentar() {
        String ativado = ativo ? "Ativo" : "Desativado";
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade + "\nHabilidade: " + ativado);
    }

    //ambos metodos abaixo tambem sao polimorficos
    public Double salario(double valor, int horas) {
        return valor * horas;
    }
    public Double salario(double valor, int horas, double fatorDesempenho) {
        return valor * horas * fatorDesempenho;
    }

}
