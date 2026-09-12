import java.util.Scanner;

public class Exercicio {
    static double notas[] = new double[3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome =  input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade =  input.nextInt();

        System.out.println("Digite sua 1º nota: ");
        notas[0] =  input.nextDouble();

        System.out.println("Digite sua 2º nota: ");
        notas[1] =  input.nextDouble();

        System.out.println("Digite sua nota: ");
        notas[2] =  input.nextDouble();


        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = calcularMedia(notas[0], notas[1], notas[2] );
        boolean aprovado = verificarAprovacao(media);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Aprovado: " + aprovado);
        if (aprovado) {
            System.out.println("Situação: Aprovado");
        }else {
            System.out.println("Situação: Reprovado");
        }
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static boolean verificarAprovacao(double media) {
        if (media >= 7.0) {
            return true;
        }else  {
            return false;
        }
    }

}
