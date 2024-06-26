import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        boolean loop = true;

        while (loop) {
            
            System.out.println("Digite o primeiro valor");
            int valorUm = Integer.parseInt(in.nextLine());
        
            System.out.println("Digite o segundo valor");
            int valorDois = Integer.parseInt(in.nextLine());

            try {
                contar(valorUm, valorDois);
                loop = false;

            } catch (ParametrosInvalidosException e) {
                System.err.println("O valores digitados não estao de acordo");
                System.err.println("Tente novamente...");
            }
        }
    }

    static void contar (int valorUm, int valorDois) throws ParametrosInvalidosException {
        
        if (valorUm > valorDois) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = valorDois - valorUm;

        for (int i = 1; i < contagem; i++) {
            System.out.println(i);
        }
    }
}
