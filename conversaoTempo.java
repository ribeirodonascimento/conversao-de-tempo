import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int tempoEmSegundos = s.nextInt();
        int horas = tempoEmSegundos / 3600;
        int segundosRestantes = tempoEmSegundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
