public class ContaBancaria {
    private Double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }
}
