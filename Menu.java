import java.util.Scanner;

public class Memu {
    public static void main(String[] args) {
        //Inicio do lupe for infinito.
        for (;;) {
            System.out.println("|************MENU***********|");
            System.out.println("|***********Opcões**********|");
            System.out.println("|           1.Opção         |");
            System.out.println("|           2.Opção         |");
            System.out.println("|           3.Sair          |");

            Scanner menu = new Scanner(System.in);
            System.out.println("  Digite a opção desejada:");
            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    break;
                default:
            }
            System.out.println("----------------------------");
            if (opcao == 3) break;//fim do lupe for.
        }
    }
}
