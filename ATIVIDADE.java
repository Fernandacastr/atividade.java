package atividade01;

import java.util.Scanner;

public class ATIVIDADE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        String nome;
        String curso;
        int periodo;
        float nota1;
        float nota2;
        int faltas;

        System.out.println("Nome completo: ");
        nome = scanner.nextLine();

        System.out.println("Seu curso: ");
        curso = scanner.nextLine();

        System.out.println("Seu período: ");
        periodo = scanner.nextInt();

        System.out.println("Primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Quantidade de faltas: ");
        faltas = scanner.nextInt();

        System.out.println("Nome completo: " + nome + "\nSeu curso: " + curso);
        System.out.println("Seu periodo: " + periodo + "\nPrimeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2 + "\nQuantidade de faltas: " + faltas + "faltas.");

        media = (nota1 + nota2) / 2;

        System.out.println("A media das notas: " + media);
    }
}
