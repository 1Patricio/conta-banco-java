package Exercicio3;

// Classe Exercicio3.ContaPoupanca
class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(String numero) {
        super(numero);
    }

    // Método específico para Exercicio3.ContaPoupanca (aplicação de rendimento, etc.)
    @Override
    public void aplicarRegras() {
        // Aplicando um rendimento de 0.5% no saldo
        double rendimento = saldo * 0.005;
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado à poupança.");
    }
}
