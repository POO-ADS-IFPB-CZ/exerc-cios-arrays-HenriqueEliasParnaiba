import java.util.Scanner;
public class MediaNotasAlunos {
    public static void main(String[] args) {
        int quantidadeAlunos = 10;
        double[] notas = new double[quantidadeAlunos];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as notas dos 10 alunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / quantidadeAlunos;
        System.out.println("A média das notas é: " + media);
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            } else if (nota < media) {
                abaixoDaMedia++;
            }
        }
        System.out.println("Total de notas acima da média: " + acimaDaMedia);
        System.out.println("Total de notas abaixo da média: " + abaixoDaMedia);
        scanner.close();
    }
}
