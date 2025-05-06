public class Main {
    public static void main(String[] args) {
        Cliente rafael =new Cliente();
        rafael.setNome("Rafael");
    conta cc = new ContaCorrente(rafael);
    conta Poupanca  = new ContaPoupanca(rafael);
    cc.depositar(100);

    cc.transferir(75, Poupanca);

        Poupanca.imprimirExtrato();
        cc.imprimirExtrato();

    }
}
