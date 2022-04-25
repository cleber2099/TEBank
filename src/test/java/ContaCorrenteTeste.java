import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTeste {
    ContaCorrente conta = new ContaCorrente();
    //depositar
    @Test
    public void depositar(){
        conta.depositar(100);
        assertEquals(100, conta.getSaldo());
    }
    //sacar
    @Test
    public void sacar(){
        conta.depositar(100);
        conta.sacar(50);
        assertEquals(50, conta.getSaldo());
    }
    @Test
    //saque com 0
    public void sacarSaldo0(){
        conta.depositar(0);
        conta.sacar(50);
        assertEquals(0, conta.getSaldo());
    }
}


