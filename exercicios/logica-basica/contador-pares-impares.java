public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Digite pelo menos um número");
            return;
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < args.length; i++) {

            int numero = Integer.parseInt(args[i]);
            // Pega o valor digitado (texto) e transforma em número inteiro
            // args[i] é o que o usuário digitou

            boolean ehPar = numero % 2 == 0;

            if (ehPar) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
