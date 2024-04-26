import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.print("Digite um valor inteiro (ou 0 para sair): ");
                int valor = scanner.nextInt();
                
                if (valor == 0) {
                    vetor[indice] = valor;
                    break;
                }

                if (indice == 10) {
                    throw new ArrayIndexOutOfBoundsException("Você inseriu mais que 10 valores.");
                }

                vetor[indice] = valor;
                indice++;
            }

            System.out.println("Valores digitados:");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você inseriu mais que 10 valores.");
        } finally {
            scanner.close();
        }
    }
}
