import java.util.Scanner;

public class WeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número inicial: ");
        int start = scanner.nextInt();

        System.out.print("Ingrese el número final: ");
        int end = scanner.nextInt();

        if (start <= 0 || end <= 0 || start >= end) {
            System.out.println("Rango inválido. Se usará el rango por defecto (1 a 200).");
            start = 1;
            end = 200;
        }

        for (int i = start; i <= end; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            boolean boom = i % 7 == 0;

            if (fizz && buzz && boom) {
                System.out.println("FizzBuzzBoom");
            } else if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else if (boom) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
