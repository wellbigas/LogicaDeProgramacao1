package academy.devdojo.estruturascondicionais.ifselse;

/*
Dado um determinado salario
se o salario for maior que 4500 imprima 30% do valor
senao imprima 15% do valor
Desafio: utilize apenas uma variavel para guardar o resultado e imprimir no final.
Desafio2: diga na impressao se é 30% ou 15%

 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 3200F;
        float resultado = 0F;
        String porcentagem ="";

        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O valor final em porcentagem de "+porcentagem+" é de "+resultado);
    }
}
