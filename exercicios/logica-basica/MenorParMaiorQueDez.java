public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Digite números ");
            return;
        }
        int menorParMaiorQue10 = 0;
        boolean encontrou = false;


        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            boolean ehPar = num % 2 == 0;
            boolean maiorQue10 = num > 10;

            if (ehPar && maiorQue10) {
                if (!encontrou || num < menorParMaiorQue10) {
                    menorParMaiorQue10 = num;
                    encontrou = true;

                }
            }
        }
        if (encontrou) {
            System.out.println("O menor número par maior que dez é: " + menorParMaiorQue10);
        } else {
            System.out.println("Não há números válidos");
        }
    }
}
