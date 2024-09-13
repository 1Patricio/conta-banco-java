package Exercicio3;

abstract class Conta {
    protected String numero;
    protected double saldo;

    //Constructor
    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0; //Saldo inicial com Zero
    }

    //Depósito
    public void depositar(double valor) {
        if (valor>0){ //Se o valor do deposito não for negativo
            saldo+= valor;
            System.out.println("Depósito de R$ " + valor);
        } else {
            System.out.println("Valor Inválido || Refaça Depósito");
        }
    }

    //Sacar
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) { //Se o valor do deposito não for negativo e se o saldo não for maior que o valor da conta
            saldo -= valor;
            System.out.println("Saque de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }


    // Metodo para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;
    }


    // Metodo abstrato para aplicar regras específicas de cada tipo de conta
    public abstract void aplicarRegras();
}
