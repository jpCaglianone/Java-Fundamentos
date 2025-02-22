package Estrutura_Condicionais;

public class While_ {

    public static void WhileExemplo() {

        boolean condicao = true;
        int i = 0;

        while (condicao) {
            System.out.println(i);
            i++;
            if (i == 11){
                condicao = false;
            }
        }

        do {
            System.out.println(i);
            i--;
        }while (i > 3);

    }

}
