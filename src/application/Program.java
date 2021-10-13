package application;

import java.util.Scanner;

public class Program {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 3;
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];
        preenche(nome, nota1, nota2);
        media(nota1, nota2, media);
        imprime(media, nome);
        double mediaTurma = mediaTur(media);
        percentual(media, mediaTurma);

    }

    public static void preenche(String[] nome, double[] nota1, double[] nota2) {
        int i;
        for (i = 0; i < nome.length; i = i + 1) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nome[i] = input.next();
        }
        for (i = 0; i < nome.length; i = i + 1) {
            System.out.println("Digite a primeira nota de " + nome[i] + ": ");
            nota1[i] = input.nextDouble();
        }
        for (i = 0; i < nome.length; i = i + 1) {
            System.out.println("Digite a segunda nota de " + nome[i] + ": ");
            nota2[i] = input.nextDouble();
        }
    }

    public static void media(double[] nota1, double[] nota2, double[] media) {
        int i;
        for (i = 0; i < media.length; i = i + 1) {
            media[i] = (((nota1[i] * 2) + (nota2[i] * 3)) / 5);
        }
    }

    public static void imprime(double[] media, String[] nome) {
        int i;
        for (i = 0; i < media.length; i = i + 1) {
            System.out.println("O aluno " + nome[i] + " obteve média: "
                    + media[i]);
        }
    }

    public static double mediaTur(double[] media) {
        int i;
        double mediaTurma = 0;
        for (i = 0; i < media.length; i = i + 1) {
            mediaTurma = mediaTurma + media[i];
        }
        System.out.println("Média da turma = " + (mediaTurma / media.length));
        return mediaTurma;
    }

    public static void percentual(double[] media, double mediaTurma) {
        int i, j = 0;
        for (i = 0; i < media.length; i = i + 1) {
            if (media[i] > mediaTurma) {
                j = j + 1;
            }
        }
        System.out.println("Valor da turma J: " + mediaTurma);
    }
}