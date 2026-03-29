public class Main{
    public static void main(String[] args){
        if ( args.length < 3){
            System.out.println("Digite a renda e situação financeira (0 para nome sujo e 1 para nome limpo) e o score");
            System.out.println("EX: java Main 2000 1 200");
            return;
        }
        double renda = Double.parseDouble(args[0]);
        int statusFinanceiro = Integer.parseInt(args[1]);
        int score = Integer.parseInt(args[2]);

        boolean rendaMinima = renda >= 2000.00;
        boolean rendaAlta = renda >= 8000.00;
        boolean nomeLimpo = statusFinanceiro == 1;
        boolean scoreMinimo = score >= 700;
        boolean emprestimoLiberado = (rendaMinima && nomeLimpo && scoreMinimo) || rendaAlta;

        if (emprestimoLiberado){
            System.out.println("Empréstimo liberado");}
        else{ System.out.println( "Empréstimo não disponível");
        }
    }
}
