public class App {
    public static void main(String[] args) {
        // Criar banco
        Banco banco = new Banco();

        // Criar contas das lojas
        Conta contaLoja1 = new Conta(0);
        Conta contaLoja2 = new Conta(0);

        // Criar contas para os funcionários
        Conta contaFunc1Loja1 = new Conta(0);
        Conta contaFunc2Loja1 = new Conta(0);
        Conta contaFunc1Loja2 = new Conta(0);
        Conta contaFunc2Loja2 = new Conta(0);

        // Criar funcionários
        Funcionario func1Loja1 = new Funcionario(contaFunc1Loja1, new Conta(0));
        Funcionario func2Loja1 = new Funcionario(contaFunc2Loja1, new Conta(0));
        Funcionario func1Loja2 = new Funcionario(contaFunc1Loja2, new Conta(0));
        Funcionario func2Loja2 = new Funcionario(contaFunc2Loja2, new Conta(0));

        // Iniciar threads para funcionários
        func1Loja1.start();
        func2Loja1.start();
        func1Loja2.start();
        func2Loja2.start();

        // Criar lojas
        Loja loja1 = new Loja(contaLoja1, new Funcionario[]{func1Loja1, func2Loja1}, banco);
        Loja loja2 = new Loja(contaLoja2, new Funcionario[]{func1Loja2, func2Loja2}, banco);

        // Criar contas para clientes
        Conta[] contasClientes = new Conta[5];
        Cliente[] clientes = new Cliente[5];
        for (int i = 0; i < 5; i++) {
            contasClientes[i] = new Conta(1000);
            clientes[i] = new Cliente(contasClientes[i], new Loja[]{loja1, loja2}, banco);
        }

        // Iniciar threads para clientes
        for (Cliente cliente : clientes) {
            cliente.start();
        }

        // Aguardar até que todas as threads dos clientes tenham concluído suas operações
        try {
            for (Cliente cliente : clientes) {
                cliente.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Aguardar até que todas as threads dos funcionários tenham concluído suas operações
        try {
            func1Loja1.join();
            func2Loja1.join();
            func1Loja2.join();
            func2Loja2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibir saldos finais das contas
        System.out.println("\nSaldos finais das contas:\n");
        System.out.println("Conta Loja 1: R$" + contaLoja1.getSaldo());
        System.out.println("Conta Loja 2: R$" + contaLoja2.getSaldo());
        System.out.println("\nConta Salário Funcionário 1 (Loja 1): R$" + contaFunc1Loja1.getSaldo());
        System.out.println("Conta Investimentos Funcionário 1 (Loja 1): R$" + func1Loja1.contaInvestimentos.getSaldo());
        System.out.println("Conta Salário Funcionário 2 (Loja 1): R$" + contaFunc2Loja1.getSaldo());
        System.out.println("Conta Investimentos Funcionário 2 (Loja 1): R$" + func2Loja1.contaInvestimentos.getSaldo());
        System.out.println("Conta Salário Funcionário 1 (Loja 2): R$" + contaFunc1Loja2.getSaldo());
        System.out.println("Conta Investimentos Funcionário 1 (Loja 2): R$" + func1Loja2.contaInvestimentos.getSaldo());
        System.out.println("Conta Salário Funcionário 2 (Loja 2): R$" + contaFunc2Loja2.getSaldo());
        System.out.println("Conta Investimentos Funcionário 2 (Loja 2): R$" + func2Loja2.contaInvestimentos.getSaldo() + "\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Conta Cliente " + (i + 1) + ": R$" + contasClientes[i].getSaldo());
        }
        System.out.println("\n");
    }
}