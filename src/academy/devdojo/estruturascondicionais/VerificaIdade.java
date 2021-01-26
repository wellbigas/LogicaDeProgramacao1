package academy.devdojo.estruturascondicionais;

/*
Receba uma idade como entrada
Se idade for maior que 18 imprima "adulto"
Senão imprima "ainda não é adulto"
 */
public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 15;
        // ==, !=, >, >=, <, <=
        if (idade <= 18) {
            System.out.println("Ainda nao e Adulto");
        } else {
            System.out.println("Adulto");
        }

    }
}
