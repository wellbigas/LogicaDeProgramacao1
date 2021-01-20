/*
Crie uma variavél que irá guardar o valor de um salário
Calcule a porcentagem desse salário, os valores da porcentagem serão
*30%
*15%
*5%
a cada vez que você calcular guarde o resultado e muma variavel
imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo.
*/

public class ReutilizandoVariavel {
    public static void main(String[] args){
    double salario = 1500.00;
    double resultado = salario * 0.3;

    System.out.println("30% eh:  = " + resultado);
    resultado = salario * 0.15;
    System.out.println("15% eh: = " + resultado);
    resultado = salario * 0.05;
    System.out.println("5% eh: = " + resultado);
}
 }
