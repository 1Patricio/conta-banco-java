package Exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contCorrente = new ContaCorrente("123-FF");
        ContaPoupanca contPoupanca = new ContaPoupanca("456-YY");
        ContaSalario contSalario = new ContaSalario("369-BB");

        contCorrente.depositar(1000);
        contCorrente.sacar(500);
        System.out.println("Saldo Exercicio3.Conta Corrente: " + contCorrente.consultarSaldo());

        contPoupanca.depositar(2000);
        contPoupanca.sacar(400);
        System.out.println("Saldo Exercicio3.Conta Poupança: " + contPoupanca.consultarSaldo());

        contSalario.depositar(2500);
        contSalario.sacar(100);
        contSalario.consultarSaldo();
        contSalario.aplicarRegras(); // Normalmente sem regras adicionais
    }
}
