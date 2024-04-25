import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Banco {
    private Lock lock = new ReentrantLock();

    public synchronized void transferencia(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            if (origem.getSaldo() >= valor) {
                origem.sacar(valor);
                destino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada de " + origem + " para " + destino);
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência de " + origem + " para " + destino);
            }
        } finally {
            lock.unlock();
        }
    }
}
