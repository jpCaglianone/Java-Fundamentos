package Estrutura_Dados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {

    public static void DateTimeExemplo() {

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data Atual: " + dataAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora Atual: " + dataHoraAtual);

        // Formatando a data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHoraAtual.format(formatter);
        System.out.println("Data Formatada: " + dataFormatada);

        //adicionando ou subtraindo dias
        LocalDate hoje = LocalDate.now();

        LocalDate proximaSemana = hoje.plusWeeks(1);
        System.out.println("Data daqui a uma semana: " + proximaSemana);

        LocalDate mesPassado = hoje.minusMonths(1);
        System.out.println("Data do mês passado: " + mesPassado);

        //comparando datas
        LocalDate data1 = LocalDate.of(2024, 5, 20);
        LocalDate data2 = LocalDate.of(2024, 6, 10);

        if (data1.isBefore(data2)) {
            System.out.println("Data1 é antes de Data2");
        } else if (data1.isAfter(data2)) {
            System.out.println("Data1 é depois de Data2");
        } else {
            System.out.println("As datas são iguais");
        }


        //calculando diferença de dias
        LocalDate dataA = LocalDate.of(2024, 5, 1);
        LocalDate dataB = LocalDate.of(2024, 6, 1);

        long diasEntre = ChronoUnit.DAYS.between(dataA, dataB);
        System.out.println("Diferença em dias: " + diasEntre);

        long mesesEntre = ChronoUnit.MONTHS.between(dataA, dataB);
        System.out.println("Diferença em meses: " + mesesEntre);

    }

}
