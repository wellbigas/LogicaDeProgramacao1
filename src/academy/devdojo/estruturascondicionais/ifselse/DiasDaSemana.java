package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

/*
Receba um numero inteiro do usuario
e imprima o dia da semana correspondente.
Sendo um Segunda-Feira.
 */
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Degite um número inteiro");
        int dia = imput.nextInt();
        int numero = 1;

        if (dia == numero) {
            System.out.println("Segunda-Feira");
        } else if (dia == 2) {
            System.out.println("Terça-Feira");
        } else if (dia == 3) {
            System.out.println("Quarta-Feira");
        } else if (dia == 4) {
            System.out.println("Quinta-Feira");
        } else if (dia == 5) {
            System.out.println("Sexta-Feira");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia Inválido");
        }
    }
}
