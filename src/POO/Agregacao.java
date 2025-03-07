package POO;

//Agregação
//A agregação é um tipo especial de associação que representa um relacionamento "todo-parte" mais fraco.
//Relação "tem-um": Uma classe (o "todo") contém referências a objetos de outra classe (as "partes").
//Independência existencial: As "partes" podem existir sem o "todo" - se o objeto contêiner for destruído, os objetos contidos não são automaticamente destruídos.
//Compartilhamento de objetos: Uma "parte" pode pertencer a múltiplos "todos".
//Relação menos forte: Indica uma dependência mais fraca que a composição.
//Semântica: Representa um relacionamento de "contém" ou "consiste de", mas sem propriedade exclusiva.
// por exemplo:
//Um Curso agrega vários Estudantes
//Os estudantes existem independentemente dos cursos
//Um estudante pode estar matriculado em vários cursos
//Se um curso for cancelado (objeto destruído), os estudantes continuam existindo

import java.util.List;
import java.util.Random;

public class Agregacao {
    private String registro;

    private List<ClasseAuxiliar> classeAuxiliarList;

    public Agregacao(List<ClasseAuxiliar> classeAuxiliarList) {
        setRegistro();
        setClasseAuxiliarList(classeAuxiliarList);
    }

    public String getRegistro() {
        return registro;
    }

    public void removeLista (List<ClasseAuxiliar> lista){
        lista.removeAll(classeAuxiliarList); //remove a lista sem destruir elas, deixando o registro com uma lista vazia
    }

    void setClasseAuxiliarList(List<ClasseAuxiliar> classeAuxiliarList) {
        this.classeAuxiliarList = classeAuxiliarList;
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

    public List<ClasseAuxiliar> getClasseAuxiliarList() {
        return classeAuxiliarList;
    }
}
