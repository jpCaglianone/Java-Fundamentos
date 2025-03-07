package POO;


//Associação
//A associação é o relacionamento mais básico e genérico entre classes.
// Representa simplesmente que objetos de uma classe se relacionam com objetos de outra classe de alguma forma.
//Relação "usa-um": Uma classe conhece a outra e interage com ela.
//Independência de ciclo de vida: Os objetos relacionados possuem ciclos de vida independentes.
//Pode ser unidirecional ou bidirecional:
//Unidirecional: apenas uma classe conhece a outra
//Bidirecional: ambas as classes se conhecem mutuamente
//Pode ser de um-para-um, um-para-muitos ou muitos-para-muitos.
//Implementação: Normalmente implementada através de atributos, parâmetros de métodos ou variáveis locais.

import java.util.List;
import java.util.Random;

public class Associacao {

    private String registro;

    private List<ClasseAuxiliar> classeAuxiliarList;

    public Associacao(List<ClasseAuxiliar> classeAuxiliarList) {
        setRegistro();
        setClasseAuxiliarList(classeAuxiliarList);
    }

    public String getRegistro() {
        return registro;
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
