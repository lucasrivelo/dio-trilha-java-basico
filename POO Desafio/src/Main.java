public class Main {

    public static void main(String[] args) {
        // Cria uma instância do banco
        Banco meuBanco = new Banco("Digital Innovation Bank");

        // Cria e adiciona clientes ao banco
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        meuBanco.adicionarCliente(venilton);

        Cliente maria = new Cliente();
        maria.setNome("Maria");
        meuBanco.adicionarCliente(maria);
        
        // Novo cliente para a Conta Universitária
        Cliente joao = new Cliente();
        joao.setNome("João");
        meuBanco.adicionarCliente(joao);

        // Testa o método de listar clientes
        meuBanco.listarClientes();
        
        System.out.println("------------------------------------");

        Cliente clienteVenilton = meuBanco.encontrarCliente("Venilton");
        Cliente clienteJoao = meuBanco.encontrarCliente("João");

        Conta cc = new ContaCorrente(clienteVenilton);
        Conta poupanca = new ContaPoupanca(clienteVenilton);
        Conta universitaria = new ContaUniversitaria(clienteJoao);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        universitaria.depositar(200);
        universitaria.sacar(150);
        
        universitaria.sacar(600);
        
        System.out.println("------------------------------------");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        universitaria.imprimirExtrato();
    }
}