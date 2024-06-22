
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;


        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta bancária: ");
        numeroConta = entrada.nextInt();

        System.out.print("Por favor, digite o número da agencia: ");
        numeroAgencia = entrada.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = entrada.next();

        System.out.print("Por favor, digite o salo do cliente: ");
        saldo = entrada.nextDouble();


        System.out.println("\nConta: "+numeroConta+"\n"+"Agencia: "+numeroAgencia+"\n"+"Nome do Cliente: "+ nomeCliente+"\n"+"Saldo: "+saldo);


    }
}
