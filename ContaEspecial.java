package heranca;

public class ContaEspecial extends Conta {

    protected double limite;
    protected double taxaManutencao;

     public ContaEspecial(int numero, double saldo, String nome, double limite, double taxaManutencao) {
        super(numero, saldo, nome);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }
    @Override
    public boolean sacar(double valorRetirar) {
        if(super.saldo >= valorRetirar){
            super.saldo -= valorRetirar;
            return true;
        }
        else if(super.saldo + this.limite >= valorRetirar){
            double aux = valorRetirar - super.saldo;
            this.limite = this.limite - aux;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void fazManutencao(){
        this.saldo = this.saldo - this.taxaManutencao;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    @Override
    public void resumoExtrato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("O saldo atual da conta é: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Taxa de manutenção " + this.taxaManutencao);
    }
}
