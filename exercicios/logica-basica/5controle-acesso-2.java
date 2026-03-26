public class Main {
    public static void main(String[] args) {
        int idade = Integer.parseInt(args[0]);
        int doc = Integer.parseInt(args[1]);
        int acompanhante = Integer.parseInt(args[2]);
        if ((idade >= 18 && doc == 1 ) || acompanhante == 1){
            System.out.println("Acesso liberado!");}
        else { System.out.println("Acesso bloqueado");}


        }

    }
