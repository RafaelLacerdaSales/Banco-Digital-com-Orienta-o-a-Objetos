public  class ContaCorrente extends conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta corrente =====");
        super.imprimirInfoComuns();
    }
}
