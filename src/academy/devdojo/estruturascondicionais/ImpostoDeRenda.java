package academy.devdojo.estruturascondicionais;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
&& (AND)  - PARA IMPRIMIR VALOR VERDADEIRO TEM QUE TER O PRIMEITO & TRUE E O SEGUNDO & TRUE - SE NÃO SERÁ FALSE.
VV = V (TRUE)
VF = F (FALSE)
FV = F (FALSE)
FF = F (FALSE)
 */

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 4000;
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5% ="+ (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15% ="+ (salario * 0.15));
        } else if (salario >=3751.06 && salario <= 4664.68) {
            System.out.println("22.5% ="+ (salario * 0.225));
            } else {
            System.out.println("27.5% ="+ (salario * 0.275));
            }

    }
}
