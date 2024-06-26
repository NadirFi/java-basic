
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        boolean loop = true;

        while (loop) {
            System.out.println("Digite o primeiro valor");
            int valorUm = Integer.parseInt(in.nextLine());
        
            System.out.println("Digite o segundo valor");
            int valorDois = Integer.parseInt(in.nextLine());
        }
        

    }
}
