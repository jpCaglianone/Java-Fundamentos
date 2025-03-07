package POO;

//Composição
//A composição é o tipo mais forte de relacionamento "todo-parte" e representa um relacionamento de posse ou contenção.
//Características detalhadas da Composição:
//Relação "contém-um" forte: O objeto contêiner (todo) é responsável pelo ciclo de vida dos objetos contidos (partes).
//Dependência existencial: As "partes" não podem existir sem o "todo" - se o objeto contêiner for destruído, os objetos contidos também serão destruídos.
//Propriedade exclusiva: Uma "parte" pertence exclusivamente a um único "todo" - não há compartilhamento.
//Relação mais forte: Indica uma dependência forte e existencial.
//Implementação: Geralmente implementada criando os objetos das partes dentro do construtor do todo.
//Semântica: Representa um relacionamento "é parte de" onde a parte forma um componente integral do todo.


import java.util.List;
import java.util.Random;

public class Composicao {

    private String registro;

    private final ClasseAuxiliar classeAuxiliar;

    public Composicao(String registro, ClasseAuxiliar classeAuxiliar) {
        this.registro = registro;
        this.classeAuxiliar = classeAuxiliar;
    }

    public String getRegistro() {
        return registro;
    }


    private void setRegistro() {
        this.registro = gerarRegistroAleatorio();
    }

    public String gerarRegistroAleatorio() {
        // Caracteres permitidos: letras maiúsculas, minúsculas e números
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder registro = new StringBuilder(5);
        Random random = new Random();

        // Gera 5 caracteres aleatórios
        for (int i = 0; i < 5; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            registro.append(caracteresPermitidos.charAt(indice));
        }
        return registro.toString();
    }

    public ClasseAuxiliar getClasseAuxiliar() {
        return classeAuxiliar;
    }

}
