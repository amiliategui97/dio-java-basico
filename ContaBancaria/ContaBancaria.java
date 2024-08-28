public class ContaBancaria {
    
    int numeroDaConta;
    double saldo;
    String nomeTitular;

    void depositar(double valor) {
        saldo = saldo+valor;
    }
    
    void sacar(double valor) {
        if(saldo>=valor) {
            saldo = saldo-valor;
        }
        else {
             System.out.println("Saldo Insuficiente");
        }
    }
    void verSaldo() {
        System.out.println("Saldo " + saldo);
    }
}
