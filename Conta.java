package heranca;

public class Conta {
    protected int numero;
    protected double saldo;
    protected String nome;


    public Conta(int numero, double saldo, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }


    public void depositar(double saldo){
        this.saldo += saldo;
    }


    public boolean sacar(double valorRetirar){
        if (valorRetirar <= this.saldo) {
            this.saldo -= valorRetirar;
            return true;
        } else{
            return false;
        }
    }


    public void resumoExtrato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("O saldo atual da conta é: " + this.saldo);
    }


    public void fazManutencao(){
        
    }
}
