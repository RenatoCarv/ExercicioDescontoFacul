import java.util.Random;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        int option = 0;

        System.out.println();
        System.out.println("1- Desconto de 20% para o turno da manhã.");
        System.out.println("2- Desconto de 13% para o turno da tarde.");
        System.out.println("3- Valor integral para o turno da noite.");
        System.out.println();
        System.out.print("Escolha uma opção: ");

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        double valor = 352.87;
        double desconto = 0;
        boolean vencido = new Random().nextBoolean();

        switch (option) {
            case 1:
                desconto = (valor * 0.20);
                if (!vencido)
                    desconto += valor * 0.05;

                System.out.printf("Valor total com desconto: %.2f", (valor - desconto));
                break;
            case 2:
                desconto = (valor * 0.13);
                if (!vencido)
                    desconto += valor * 0.05;

                System.out.printf("Valor total com desconto: %.2f", (valor - desconto));
                break;
            case 3:
                if (!vencido)
                    desconto += valor * 0.05;

                System.out.printf("Valor total com desconto: %.2f", (valor - desconto));
                break;

            default:
                System.out.println("Você selecionou a opção errada!");
                break;
        }
    }
}
