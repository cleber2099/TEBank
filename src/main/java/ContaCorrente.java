public class ContaCorrente {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
}
