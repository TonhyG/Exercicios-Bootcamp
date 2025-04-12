import java.util.Scanner;

public class UsuarioTerminal {
    
        public static void main(String[] args) {
            
            BaseDados bd = new BaseDados();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor me diga o seu nome: ");
            bd.nome = scanner.nextLine();

            System.out.println("Por favor me diga o seu número de conta: ");
            bd.numero = scanner.nextInt();

            System.out.println("Por favor me diga o número da sua agência: ");
            bd.agencia = scanner.nextLine();
            bd.agencia = scanner.nextLine(); // Adicionando esta linha para capturar o número da agência corretamente

            bd.saldo = 1500.99;
            System.out.println("Bem-vindo " + bd.nome + " ao sistema de banco!");
            System.out.println("Seu saldo atual é: " + bd.saldo);

            System.out.println("Escolha uma opção: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Sair");
            System.out.print("Digite sua opção: ");
            bd.opção = scanner.nextLine(); // Adicionando esta linha para capturar a opção corretamente

            switch (bd.opção) {
                case "1":
                    System.out.println("Quanto você deseja depositar? ");
                    bd.deposito = scanner.nextDouble();
                    bd.Depositar();
                    break;
                case "2":
                    System.out.println("Quanto você deseja sacar? ");
                    bd.saque = scanner.nextDouble();
                    bd.Sacar();
                    break;
                case "3":
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(bd.nome + ", seu saldo atual é: " + bd.saldo);
            System.out.println("Obrigado por usar nosso sistema!");
            
    }    
}
