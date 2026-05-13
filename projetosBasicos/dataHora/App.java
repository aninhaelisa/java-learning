package projetosBasicos.dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------DATA E HORA----------------");
        System.out.println();

        LocalDate d01 = LocalDate.now(); // Data atual
        System.out.println("DATA ATUAL: " + d01);

        LocalDateTime d02 = LocalDateTime.now(); // Data e hora atual
        System.out.println("DATA E HORA ATUAL: " + d02);

        Instant d03 = Instant.now(); // Data e hora atual em UTC
        System.out.println("DATA E HORA ATUAL EM UTC: " + d03);

        LocalDate d04 = LocalDate.parse("2000-09-19"); // Data a partir de uma string
        System.out.println("DATA A PARTIR DE UMA STRING: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2000-09-19T00:06:54.554"); // Data e hora a partir de uma string
        System.out.println("DATA E HORA A PARTIR DE UMA STRING: " + d05);

        Instant d06 = Instant.parse("2000-09-19T00:06:54.554Z"); // Data e hora em UTC a partir de uma string
        System.out.println("DATA E HORA EM UTC A PARTIR DE UMA STRING: " + d06);

        Instant d07 = Instant.parse("2000-09-19T00:06:54.554-03:00"); // Data e hora a partir de uma string com fuso horário
        System.out.println("DATA E HORA A PARTIR DE UMA STRING COM FUSO HORÁRIO: " + d07);

        //Implicitamente eu estou chamando o to.String() para imprimir o valor do objeto (Instant, LocalDate e LocalDateTime), mas poderia ser feito de forma explícita.
        System.out.println("----".repeat(20));
        System.out.println();

        System.out.println("DATETIMEFORMATTER: ");
        //DATETIMEFORMATTER:
        //LINK: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data personalizado
        LocalDate d08 = LocalDate.parse("19/09/2006", fmt01); // Data a partir de uma string com formato personalizado (dd/MM/yyyy)
        System.out.println("DATA A PARTIR DE UMA STRING COM FORMATO PERSONALIZADO: " + d08);

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato de data e hora personalizado
        LocalDateTime d09 = LocalDateTime.parse("19/09/2006 00:06", fmt02); // Data e hora a partir de uma string com formato personalizado (dd/MM/yyyy HH:mm)
        System.out.println("DATA E HORA A PARTIR DE UMA STRING COM FORMATO PERSONALIZADO: " + d09);

        LocalDate d10 = LocalDate.of(2000, 9, 19); // Data a partir de valores numéricos (ano, mês, dia)
        System.out.println("DATA A PARTIR DE VALORES NUMÉRICOS: " + d10);

        LocalDateTime d11 = LocalDateTime.of(2000, 9, 19, 0, 6); // Data e hora a partir de valores numéricos (ano, mês, dia, hora, minuto)
        System.out.println("DATA E HORA A PARTIR DE VALORES NUMÉRICOS: " + d11);
        System.out.println("----".repeat(20));
        System.out.println();

        //COVERTER PARA OUTRO FORMATO:
        System.out.println("CONVERTER PARA OUTRO FORMATO:");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data personalizado
        System.out.println("DATA ATUAL: " + d01.format(fmt03)); // Converter a data atual para o formato personalizado (dd/MM/yyyy)
        
        DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato de data e hora personalizado
        System.out.println("DATA E HORA ATUAL: " + d02.format(fmt04)); // Converter a data e hora atual para o formato personalizado (dd/MM/yyyy HH:mm)
        
        DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Formato de data e hora personalizado com fuso horário do sistema
        System.out.println("DATA E HORA ATUAL EM UTC: " + fmt05.format(d03)); // Converter a data e hora atual em UTC para o formato personalizado com fuso horário do sistema

        System.out.println("DATA E HORA (string) UTC: " + fmt05.format(d05)); // Converter a data e hora a partir de uma string para o formato personalizado com fuso horário do sistema
        System.out.println("DATA E HORA (string) UTC COM FUSO HORÁRIO: " + fmt05.format(d06)); // Converter a data e hora a partir de uma string com fuso horário para o formato personalizado com fuso horário do sistema

        DateTimeFormatter fmt06 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("DATA E HORA (string) EM FORMATO ISO: " + fmt06.format(d05)); // Converter a data e hora para o formato ISO (yyyy-MM-dd'T'HH:mm:ss) OBS: pode ser encontrado no link anteriormente citado.
        
        DateTimeFormatter fmt07 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("DATA E HORA (string) EM FORMATO ISO INSTANT: " + fmt07.format(d03)); // Converter a data e hora em UTC para o formato ISO INSTANT (yyyy-MM-dd'T'HH:mm:ssZ) OBS: pode ser encontrado no link anteriormente citado.

        System.out.println("----".repeat(20));
        System.out.println();

        System.out.println("CONVERTENDO DATA-HOTA GLOBAL PARA LOCAL: ");
        ZoneId.getAvailableZoneIds(); // Obter os fusos horários disponíveis

        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE 1 PARA VER OS FUSOS HORÁRIOS DISPONÍVEIS: ");
        int op = sc.nextInt();
        if(op == 1){
            for(String zoneId : ZoneId.getAvailableZoneIds()) {
                System.out.println(zoneId); // Imprimir os fusos horários disponíveis
            }
        }
        sc.close();

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Converter a data e hora em UTC para a data local usando o fuso horário do sistema
        System.out.println("DATA LOCAL: " + r1);
       
        LocalDateTime r2 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal")); // Converter a data e hora em UTC para a data e hora local usando o fuso horário de Portugal
        System.out.println("DATA E HORA LOCAL EM PORTUGAL: "+ r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.of("America/Sao_Paulo")); // Converter a data e hora em UTC para a data e hora local usando o fuso horário de São Paulo
        System.out.println("DATA E HORA LOCAL EM SÃO PAULO: "+ r3);

        System.out.println("dia de hoje: " + d01.getDayOfMonth()); // Obter o dia do mês da data atual
        System.out.println("mês de hoje: " + d01.getMonthValue()); // Obter o mês da data atual
        System.out.println("ano de hoje: " + d01.getYear()); // Obter o ano da data atual

        System.out.println("hora atual: " + d02.getHour()); // Obter a hora da data e hora atual
        System.out.println("minuto atual: " + d02.getMinute()); // Obter o minuto da data e hora atual

        System.out.println("----".repeat(20));
        System.out.println();

        System.out.println("CALCULO COM DATA HORA: ");

        LocalDate semanaPassada = d01.minusDays(7); // Subtrair 7 dias da data atual
        System.out.println("DATA DE 7 DIAS ATRÁS: " + semanaPassada);

        LocalDate semanaPassadaString = d04.minusDays(7); // Subtrair 7 dias da data a partir de uma string
        System.out.println("DATA DE 7 DIAS ATRÁS A PARTIR DE UMA STRING: " + semanaPassadaString);

        LocalDate semanaQueVem = d01.plusDays(7);
        System.out.println("DATA DE 7 DIAS A FRENTE: " + semanaQueVem); // Adicionar 7 dias à data atual

        LocalDate semanaQueVemString = d04.plusDays(7);
        System.out.println("DATA DE 7 DIAS A FRENTE A PARTIR DE UMA STRING: " + semanaQueVemString); // Adicionar 7 dias à data a partir de uma string

        LocalDate anoQueVem = d01.plusYears(1); // Adicionar 1 ano à data atual
        System.out.println("DATA DE 1 ANO A FRENTE: " + anoQueVem);

        LocalDate mesesParaFrente = d01.plusMonths(6); // Adicionar 6 meses à data atual
        System.out.println("DATA DE 6 MESES A FRENTE: " + mesesParaFrente);

        LocalDateTime horasParaFrente = d02.plusHours(5); // Adicionar 5 horas à data e hora atual
        System.out.println("DATA E HORA DE 5 HORAS A FRENTE: " + horasParaFrente);

        LocalDateTime minutosParaFrente = d02.plusMinutes(30); // Adicionar 30 minutos à data e hora atual
        System.out.println("DATA E HORA DE 30 MINUTOS A FRENTE CONVERTIDO: " + minutosParaFrente.format(fmt04)); // Converter a data e hora para o formato personalizado (dd/MM/yyyy HH:mm)
    
        Instant semanaPasIns = d03.minus(7, ChronoUnit.DAYS); // Subtrair 7 dias da data e hora atual em UTC usando ChronoUnit
        System.out.println("DATA E HORA DE 7 DIAS ATRÁS EM UTC: " + semanaPasIns);

        Instant semanaQueVemIns = d03.plus(7, ChronoUnit.DAYS); // Adicionar 7 dias à data e hora atual em UTC usando ChronoUnit
        System.out.println("DATA E HORA DE 7 DIAS A FRENTE EM UTC: " + semanaQueVemIns);

        System.out.println("----".repeat(20));
        System.out.println();

        System.out.println("DURATION: ");
        Duration t1 = Duration.between(semanaPasIns, semanaQueVemIns); // Calcular a duração entre duas datas e horas usando Duration
        System.out.println("DURAÇÃO ENTRE 7 DIAS ATRÁS E 7 DIAS A FRENTE EM UTC: " + t1.toDays() + " dias"); // Obter a duração em dias

        Duration t2 = Duration.between(semanaPasIns, d03);
        System.out.println("DURAÇÃO ENTRE 7 DIAS ATRÁS E A DATA ATUAL EM UTC: " + t2.toDays() + " dias"); // Obter a duração em dias entre 7 dias atrás e a data atual em UTC

        
        System.out.println();
    }
}
