public class Main {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Uso: java Main <idade> <temCracha> <estaAcompanhado>");
            return;
        }

        int idade = Integer.parseInt(args[0]);
        boolean temCracha = Boolean.parseBoolean(args[1]);
        boolean estaAcompanhado = Boolean.parseBoolean(args[2]);

        boolean ehMaiorDeIdade = idade >= 18;

        boolean podeEntrar = (ehMaiorDeIdade && temCracha) || estaAcompanhado;

        if (podeEntrar) {
            System.out.println("Entrada autorizada");
        } else {
            System.out.println("Entrada negada");
        }
    }
}
