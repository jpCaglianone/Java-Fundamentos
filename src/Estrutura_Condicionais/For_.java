package Estrutura_Condicionais;

public class For_ {

    public static void For_(){

        //start, range, increment
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 40; i > 10; i--)
        {
            if(i % 2 == 0){
               continue;  //o continue interrompe o codigo nesse ponto e faz ele retornar ao for
            }
            if(i  == 23){
                break; //o break interrompe totalmente o laço de repetiçao, saindo dele
            }
            System.out.println(i);
        }
    }

}
