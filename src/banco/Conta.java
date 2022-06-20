package banco;

public class Conta {
    private String NUMEROCONTA;
    private String nomeTitular;
    private double valorDepositoInicial;

    private double saldo;

    public Conta(String NUMEROCONTA, String nomeTitular){
        this.NUMEROCONTA = NUMEROCONTA;
        this.nomeTitular = nomeTitular;

    }

    public String getNUMEROCONTA() {
        return NUMEROCONTA;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getValorDepositoInicial() {
        return valorDepositoInicial;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setValorDepositoInicial(double valorDepositoInicial) {
        this.valorDepositoInicial = valorDepositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double deposito){
        return saldo = saldo + deposito;
    }

    public double sacar(double saque){
        return saldo = saldo - saque;
    }
}
