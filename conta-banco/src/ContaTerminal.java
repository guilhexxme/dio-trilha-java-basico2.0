import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Qual o seu banco ?");
                String banco = scanner.next();

                System.out.println("Digite sua agencia:");
                String agencia = scanner.next();

                System.out.println("Digite sua conta:");
                String conta = scanner.next();

                System.out.println("Confirme seu nome");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome");
                String sobrenome =scanner.next();

                System.out.println("Digite o valor do seu salario:");
                double saldo = scanner.nextDouble();

                //System.out.println("Bem vindo ao " + banco);
                //System.out.println("Senhor(a) " + nome + " " + sobrenome);
                //System.out.println("Sua conta e agencia informada são " + agencia + " " + conta);
                //System.out.println("Validamos no sistema que o ano informado de " + idade + " está correto");
                //System.out.println("Seu saldo na conta é de R$ " + saldo);

        //Exibir as mensagens para o nosso usuário
        
        //Exibir a mensagem conta criada

                System.out.println("Olá senhor(a) " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco" + banco + " sua agência é " + agencia + " conta " + conta + " e seu saldo de " + saldo + " já está disponivel para saque." );
    }
}
