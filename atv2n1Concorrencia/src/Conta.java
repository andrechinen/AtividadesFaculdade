import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Conta {
    private double saldo;
    private Lock lock = new ReentrantLock();

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        lock.lock();
        try {
            saldo += valor;
        } finally {
            lock.unlock();
        }
    }

    public void sacar(double valor) {
        lock.lock();
        try {
            saldo -= valor;
        } finally {
            lock.unlock();
        }
    }

    public void transferir(Conta destino, double valor) {
        lock.lock();
        try {
            sacar(valor);
            destino.depositar(valor);
        } finally {
            lock.unlock();
        }
    }
}