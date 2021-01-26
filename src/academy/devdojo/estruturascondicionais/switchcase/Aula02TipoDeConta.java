package academy.devdojo.estruturascondicionais.switchcase;
/*
Como gerente eu gostaria que meus usuário pudessem
digitar o tipo da conta e o sistema iprima qual a porcentagem de juros
que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações
Os tipos das contas são
CONTA_PUPANCA 0.05%
CONTA_CORRENTE O.02%
CONTA_INVESTIMENTO 0.1%
Caso a conta não exita, imprima "NÃO EXISTE"
 */
public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_PUPANCA";

        switch (conta){
            case "CONTA_PUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default: {
                System.out.println("NÃO INEXISTENTE");
            }
        }
    }
}
