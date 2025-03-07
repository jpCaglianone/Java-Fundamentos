import Estrutura_Dados.Array;
import Estrutura_Dados.DateTime;
import Estrutura_Dados.ListaLinked;
import Excecoes.MinhaExcecao;
import Excecoes.TryCatch;
import POO.Associacao;
import POO.ClasseAuxiliar;
import POO.Classes;
import POO.HerancaFilho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws MinhaExcecao {

        //Array.ExemploArray1();
        //ListaLinked.LinkedListExemplo();
        //System.out.println(Estrutura_Dados.Primitivos.variavelEstatica);
        //Estrutura_Dados.Primitivos.PrimitivosExemplo();
        //DateTime.DateTimeExemplo();

        //Estrutura_Condicionais.IfElse.IfElseExemplo();
        //Estrutura_Condicionais.SwitchCase.SwitchCaseExemplo();
        //Estrutura_Condicionais.For_.For_();
        //Estrutura_Condicionais.While_.WhileExemplo();

        //TryCatch.TryCatchExemplo2();

        //<editor-fold desc="Classes">
//            Classes classe = new Classes("joao" , 31); //exemplo com constructor que obriga instancia
//            Classes classe2 = new Classes(); //exemplo com constructor sem parametros
//
//            classe2.setNome("Ana");
//            classe2.setIdade(25);
//            classe.apresentar();
//            classe2.apresentar();
        //</editor-fold>

        //<editor-fold desc="Heranca">

//        HerancaFilho herancaFilho = new HerancaFilho("Joao", 32, "programador", true);
//        herancaFilho.apresentar();
//        System.out.println(herancaFilho.testeInterface());

//        </editor-fold>

        //<editor-fold desc="Associacao">

//        Associacao associacao = new Associacao(popularList());
//        associacao.getClasseAuxiliarList().forEach(o -> System.out.println(o.getDescricao()));
//        System.out.println(associacao.getRegistro());

        //</editor-fold>

//<editor-fold desc="Associacao">



    }




































    private static List<ClasseAuxiliar> popularList(){

        List<ClasseAuxiliar> lista = new ArrayList<>(){};

        ClasseAuxiliar ca1 = new ClasseAuxiliar(3,"teste 1", true, 35.23);
        lista.add(ca1);
        ClasseAuxiliar ca2 = new ClasseAuxiliar(4, "teste teste 2", true, 98.04);
        lista.add(ca2);
        ClasseAuxiliar ca3 = new ClasseAuxiliar(14, "teste teste teste 3", false, 286.74);
        lista.add(ca3);

        return lista;
    }

}