package elevador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Elevador r = new Elevador(0 ,0, 0, 0);
            System.out.println("Digite o numero maximo de andares:");
            r.setLim(scan.nextInt());
            System.out.println("Digite a capacidade maxima de pessoas:");
            r.setCapacidade(scan.nextInt());
            r.menu();
    }
}