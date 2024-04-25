class Loja {
    private Conta conta;
    private Funcionario[] funcionarios;
    private Banco banco;

    public Loja(Conta conta, Funcionario[] funcionarios, Banco banco) {
        this.conta = conta;
        this.funcionarios = funcionarios;
        this.banco = banco;
    }

    public synchronized void pagarSalarios() {
        if (conta.getSaldo() >= Funcionario.salario) {
            banco.transferencia(conta, funcionarios[0].getContaSalario(), Funcionario.salario);
            funcionarios[0].investir();
            System.out.println("Salário pago a " + funcionarios[0].getName());

            Funcionario temp = funcionarios[0];
            funcionarios[0] = funcionarios[1];
            funcionarios[1] = temp;
        } else {
            System.out.println("A loja não possui saldo suficiente para pagar os salários dos funcionários.");
        }
    }

    public Conta getConta() {
        return conta;
    }
}