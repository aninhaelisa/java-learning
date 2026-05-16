package projetosBasicos.dateCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class App {
    public static void main(String[] args) throws ParseException{
        System.out.println("DATE E CALENDAR EM JAVA"); //somente em sistemas antigos
        // LINK: https://docs.oracle.com/javase/8/docs/api/java/sql/Date.
        System.out.println();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //definindo o fuso horário para GMT (Greenwich Mean Time)    

        Date x1 = new Date(); //data, hora atual
        Date x2 = new Date(System.currentTimeMillis()); //data, hora atual
        Date x3 = new Date(0L); //01/01/1970 00:00:00 GMT
        Date x4 = new Date(1000L * 60L * 60L * 5L); //01/01/1970 05:00:00 GMT
        Date x5 = Date.from(Instant.parse("2019-06-20T19:53:07Z")); //Data definida no horario UTC -> Por isso imprime com 3 horas de atraso.
                                                                        // convertida para o fuso horário local, que no caso é o horário de Brasília (GMT-3).
        Date y1 = sdf1.parse("19/09/2006");
        Date y2 = sdf2.parse("25/05/2026 15:42:07"); 

        System.out.println("---------------SEM SIMPLEDATEFORMAT------------------");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println();


        System.out.println("HORA E DATA ATUAL x1: " + x1);
        System.out.println("HORA E DATA ATUAL x2: " + x2);
        System.out.println();

        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("x5: " + x5);
        System.out.println();

        System.out.println("---------------SDF2------------------");


        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println();


        System.out.println("HORA E DATA ATUAL x1: " + sdf2.format(x1));
        System.out.println("HORA E DATA ATUAL x2: " + sdf2.format(x2));
        System.out.println();

        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("x5: " + sdf2.format(x5));
        System.out.println();

  
        System.out.println("---------------SDF3------------------");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println();

        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println();


        System.out.println("HORA E DATA ATUAL x1: " + sdf3.format(x1));
        System.out.println("HORA E DATA ATUAL x2: " + sdf3.format(x2));
        System.out.println();

        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("x5: " + sdf3.format(x5));
        System.out.println();

        //Define o timezone usado na formatação para GMT, independentemente do sistema
        System.out.println();
        System.out.println("--------------------Calendar--------------------------");
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();
        System.out.println("Data atual: " + sdf4.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        System.out.print("Quantas horas deseja adcionar? ");
        int n1 = new java.util.Scanner(System.in).nextInt(); //Não recomendado fazer esse tipo de chamada dentro do código, mas para estudo é tranquilo
        cal.add(Calendar.HOUR_OF_DAY, n1); //adiciona n1 horas
        System.out.println("Data atual + "+ n1 +" horas: " + sdf4.format(cal.getTime()));
        System.out.println();

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutos);
        int horas = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Horas: " + horas);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia: " + dia);
        int mes = cal.get(Calendar.MONTH) + 1; //O mês é indexado a partir de 0, então é necessário adicionar 1 para obter o número correto do mês.
        System.out.println("Mês: " + mes);
        int ano = cal.get(Calendar.YEAR);
        System.out.println("Ano: " + ano);

        System.out.println();
    
    }
}
