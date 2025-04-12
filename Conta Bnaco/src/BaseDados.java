public class BaseDados {

    int numero;
    String agencia;
    String nome;
    double saldo;
    String opção;
    double deposito;
    double saque;

   
    public void Depositar() {
        saldo = saldo + deposito;
        System.out.println("Você depositou: " + deposito);
        System.out.println("Seu saldo atual é: " + saldo);
    }

    public void Sacar () {
        saldo = saldo - saque;
        System.out.println("Você sacou: " + saque);
        System.out.println("Seu saldo atual é: " + saldo);
        
    }
}
