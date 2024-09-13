package Exercicio3;

class ContaCorrente extends Conta{ //Recebendo herança conta
    public ContaCorrente(String numero){
        super(numero);
    }

    // Metodo específico para Exercicio3.ContaCorrente (aplicação de regras, tarifas, etc.)
    @Override
    public void aplicarRegras() {
        // Exemplificando uma tarifa mensal (apenas uma simulação)
        double tarifa = 10.0;
        if (saldo >= tarifa) {
            saldo -= tarifa;
            System.out.println("Tarifa de manutenção de R$ " + tarifa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para a tarifa de manutenção.");
        }
    }

}
