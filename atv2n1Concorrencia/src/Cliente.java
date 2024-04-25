class Cliente extends Thread {
    private static final double[] valoresCompras = {100.0, 200.0}; // Valores das compras possíveis
    private Conta conta;
    private Loja[] lojas;
    private Banco banco;

    public Cliente(Conta conta, Loja[] lojas, Banco banco) {
        this.conta = conta;
        this.lojas = lojas;
        this.banco = banco;
    }

    public void run() {
        while (conta.getSaldo() > 0) {
            double valorCompra = valoresCompras[(int) (Math.random() * valoresCompras.length)];
    
            synchronized (conta) { // Sincronização para garantir operações seguras
                realizarCompra(valorCompra, lojas[0].getConta());
            }
    
            lojas[0].pagarSalarios();

            Loja temp = lojas[0];
            lojas[0] = lojas[1];
            lojas[1] = temp;
        }
    }
    
    public Conta getConta() {
        return conta;
    }

    public synchronized void realizarCompra(double valor, Conta contaDestino) {
        if (conta.getSaldo() >= valor) {
            banco.transferencia(conta, contaDestino, valor);
            System.out.println(Thread.currentThread().getName() + " realizou uma compra de R$" + valor + ".");
        } else {
            System.out.println(Thread.currentThread().getName() + " não possui saldo suficiente para realizar a compra de R$" + valor + ".");
        }
    }    
    
}