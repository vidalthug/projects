// ac1 - calculo de media final
// rafael baldoni vidal
package amauryac1;

import java.util.Scanner;

public class ac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque a nota da AC1: ");
        double ac1 = scanner.nextDouble();

        System.out.println("Coloque a nota da AC2: ");
        double ac2 = scanner.nextDouble();

        System.out.println("Coloque a nota da AG: ");
        double ag = scanner.nextDouble();

        System.out.println("Coloque a nota da AF: ");
        double af = scanner.nextDouble();

        System.out.println("Coloque a Media: ");
        double mediadousuario = scanner.nextDouble();

        // somando notas
        double media = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        // exibir notas e media final
        System.out.println("Notas digitadas:");
        System.out.println("AC1 = " + ac1 + ", AC2 = " + ac2 + ", AG = " + ag + ", AF = " + af);
        System.out.println("Média escolhida: " + mediadousuario);
        System.out.println("Media = " + media);

        // verificar se passou ou reprovou
        if (media >= mediadousuario) {
            System.out.println("Aluno: Aprovado!");
        } else {
            System.out.println("Aluno: Reprovado!");
        }
    }
}