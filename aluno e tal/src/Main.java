import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do Global Solution (GS): ");
        double gs = scanner.nextDouble();

        System.out.print("Digite a nota dos Challenges: ");
        double challenges = scanner.nextDouble();

        System.out.print("Digite a nota do Checkpoint: ");
        double checkpoint = scanner.nextDouble();

        Aluno aluno = new Aluno(gs, challenges, checkpoint);

        System.out.printf("Média final: %.2f\n", aluno.calcularMedia());


        scanner.close();
    }
}