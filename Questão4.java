import java.util.Scanner;
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int somaTotal = 0;
        int quantidadeDeNumeros = 0;
        System.out.println("Digite números inteiros maiores ou iguais a zero. Informe um número negativo para finalizar.");
        while (true) {
            System.out.print("Digite um número: ");
            int numeroDigitado = leitor.nextInt();
            if (numeroDigitado < 0) {
                break;
            }
            somaTotal += numeroDigitado;
            quantidadeDeNumeros++;
        }
        if (quantidadeDeNumeros > 0) {
            double media = (double) somaTotal / quantidadeDeNumeros;
            System.out.println("Quantidade de números digitados: " + quantidadeDeNumeros);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        leitor.close();
    }
}
