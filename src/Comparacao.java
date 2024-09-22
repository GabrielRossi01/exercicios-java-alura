import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais");
        } else if (numero1 > numero2){
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
