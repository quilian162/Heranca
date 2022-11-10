package heranca;

public class Heranca {

    public static void main(String[] args) {
        Conta contaNormal = new Conta(1, 1000, "Jair Bolsonaro");
        ContaEspecial contaDiferenciada = new ContaEspecial(2, 2000, "Luis Inácio Da Silva", 500, 10);
        Investimento contaInvestimento = new Investimento(3, 800, "Ciro Gomes");
        contaNormal.depositar(5000);
        contaNormal.sacar(3000);
        contaNormal.resumoExtrato();
        contaDiferenciada.sacar(500);
        contaDiferenciada.fazManutencao();
        contaDiferenciada.resumoExtrato();
        contaInvestimento.fazManutencao();
        contaInvestimento.resumoExtrato();
    }
}
