import entities.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Passamos os valores iniciais pelo construtor
        Conversor meuConversor = new Conversor(5.78, 6.36);
        int opcao =-1;

        while(opcao != 0){
            System.out.println("\n --- Conversor de moedas ---");
            System.out.println("Cotação atual -> Dólar: R$: " + meuConversor.getTaxaDolar());
            System.out.println("1. Converter Real para Dólar");
            System.out.println("2. Converter Real para Euro");
            System.out.println("3. Atualizar Cotação do Dólar (Uso do Setter)");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            if(opcao == 0){
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor em reais");
                    Double reaisDolar = scanner.nextDouble();
                    System.out.println("-> Valor em dólar $" + meuConversor.realParaDolar(reaisDolar));
                    break;
                case 2:
                    System.out.println("Digite o valor em reais");
                    Double reaisEuro = scanner.nextDouble();
                    System.out.println("-> Valor em euro €" + meuConversor.realParaDolar(reaisEuro));
                    break;
                case 3:
                    System.out.println("Digite a nova cotação do dólar: ");
                    double novaCotacao = scanner.nextDouble();
                    meuConversor.setTaxaDolar(novaCotacao);
                    System.out.println("Cotação atualizada com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
        scanner.close();
    }
}