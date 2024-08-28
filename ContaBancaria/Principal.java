public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        double valor = 2000;
        conta.depositar(valor);
    
        valor = 500;
        conta.sacar(valor);
        
        conta.verSaldo();
    }
}
