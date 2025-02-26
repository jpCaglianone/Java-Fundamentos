import Estrutura_Dados.Array;
import Estrutura_Dados.DateTime;
import Estrutura_Dados.ListaLinked;
import Excecoes.MinhaExcecao;
import Excecoes.TryCatch;
import POO.Classes;
import POO.HerancaFilho;

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

        HerancaFilho herancaFilho = new HerancaFilho("Joao", 32, "programador", true);
        herancaFilho.apresentar();
        System.out.println(herancaFilho.testeInterface());

    }
}