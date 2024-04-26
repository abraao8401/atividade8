import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor a ser depositado: ");
            Double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);

            System.out.print("Digite o valor a ser sacado: ");
            Double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);

            System.out.println("Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
