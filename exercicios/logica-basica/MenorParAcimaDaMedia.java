public class Main {
    public static void main(String[] args) {
        int[] numeros = {7, 12, 18, 5, 9, 20};
        int somaPares = 0;
        int contadorPares = 0;
        int menorPar = Integer.MAX_VALUE;
        boolean encontrou = false;
        double mediaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            boolean ehPar = numero % 2 == 0;

            if (ehPar) {
                contadorPares++;
                somaPares += numero;

            }

        }
        if (contadorPares > 0) {
            mediaPares = (double) somaPares / contadorPares;
            System.out.println("Média dos pares: " + mediaPares);
        } else {
            System.out.println("Não há pares");

        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            boolean ehPar = numero % 2 == 0;

            if (ehPar && numero > mediaPares) {
                if (!encontrou || numero < menorPar) {
                    menorPar = numero;
                    encontrou = true;
                }
            }
        }
        if (encontrou) {
            System.out.println("Menor par acima da média é " + menorPar);
        } else {
            System.out.println("Não há par acima da média");

        }
    }
}
