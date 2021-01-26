package academy.devdojo.estruturascondicionais.ifselse;/*
&& (AND)  - PARA IMPRIMIR VALOR VERDADEIRO TEM QUE TER O PRIMEITO & TRUE E O SEGUNDO & TRUE - SE NÃO SERÁ FALSE.
VV = V (TRUE)
VF = F (FALSE)
FV = F (FALSE)
FF = F (FALSE)

|| (OR) - BASTA UMA QUE SEJA VERDADEIRA PARA SER EXECUTADA.
 */

import java.util.Scanner;

public class TorneioDeNatacaoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = input.next();
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(name +" Participará da categoria infantil ");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(name +" Participará da categoria Juvenil ");
        } else if (idade >= 16 && idade <= 18 ) {
            System.out.println(name +" Participará da categoria Pré-Adulto ");
        } else {
            System.out.println(name +" Participará da categoria Adulto ");
        }
    }
}