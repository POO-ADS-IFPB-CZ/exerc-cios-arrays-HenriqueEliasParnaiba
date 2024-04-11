public class Fibonacci {
    public static void main(String[] args) {
        int limite = 30;
        int[] sequenciaFibonacci = fibonacci(limite);

        for (int numero : sequenciaFibonacci) {
            System.out.println(numero);
        }
    }
    public static int[] fibonacci(int limite) {
        int[] sequenciaFibonacci = new int[limite];
        sequenciaFibonacci[0] = 1;
        sequenciaFibonacci[1] = 1;
        for (int i = 2; i < limite; i++) {
            sequenciaFibonacci[i] = sequenciaFibonacci[i - 1] + sequenciaFibonacci[i - 2];
        }
        return sequenciaFibonacci;
    }
}
