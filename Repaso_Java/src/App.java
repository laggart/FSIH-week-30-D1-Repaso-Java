import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantos Km recorridos?");
        double kilometros = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Cuantas horas necesarias?");
        int horas = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Cuantos minutos necesarios?");
        int minutos = teclado.nextInt();
        teclado.nextLine();

        double totalHoras = horas + (minutos / 60.0);

        double velocidad = kilometros / totalHoras;

        System.out.printf("La velocidad del tren es %.2f Km/h%n", velocidad);
        teclado.close();

    }
}
