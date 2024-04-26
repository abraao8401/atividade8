import java.util.InputMismatchException;
import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;

        try {
            // Solicitando e lendo os números do usuário
            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();

            // Realizando a divisão
            double resultado = dividir(numero1, numero2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } finally {
            scanner.close();
        }
    }

    // Método para realizar a divisão e lançar a exceção ArithmeticException se ocorrer divisão por zero
    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return numero1 / numero2;
    }
}
