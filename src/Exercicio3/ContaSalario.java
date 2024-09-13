package Exercicio3;

class ContaSalario extends Conta{

    //Constructor
    public ContaSalario(String numero) {
        super(numero);
    }

    @Override
    public void aplicarRegras() {
        System.out.println("Nenhuma regra expecífica para a conta salário");
    }

    //Sobrescrevendo metodo sacar

    @Override
    public void sacar(double valor) {
        double limiteSaque = 1000.0; //Valor de exemplo
        if ((valor > 0) && (valor <= limiteSaque) && (saldo >= valor) ) { //Se não for zero, se o valor for menor ou igual que o saque, se tiver saldo
            saldo -= valor;
            System.out.println("Saque de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
