/*
Dado um detemrinado numero inteiro
Imprima se ele é impar ou par

Resto da divisao por 2 se for par sempre vai ser 0
senao vai ser impar
 */
public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 15;
        // +, -, /, *, %
        if ( (numero % 2) == 0) {
            System.out.println("PAR: "+ (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }

    }
}
