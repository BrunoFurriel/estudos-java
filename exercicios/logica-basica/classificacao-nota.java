public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        if (num1 <= 4 ) {
            System.out.println("Reprovado " + num1);
            }else if (num1 <= 6 ) {
            System.out.println("Recuperação " + num1);
        } else { System.out.println("Aprovado " + num1);

            }
        }
    }
