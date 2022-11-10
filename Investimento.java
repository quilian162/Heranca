package heranca;


public class Investimento extends Conta {
    protected double taxaRendimento;

    public Investimento(int numero, double saldo, String nome) {
        super(numero, saldo, nome);
    }
    @Override
    public void fazManutencao(){
        this.saldo = this.saldo + (this.saldo * this.taxaRendimento);
    }
    @Override
    public void resumoExtrato(){
        System.out.println("Nome do cliente: " + this.nome +
        "\nSaldo atual: " + this.saldo + 
        "\nPorcentagem de rendimento: " + this.taxaRendimento);
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

}
