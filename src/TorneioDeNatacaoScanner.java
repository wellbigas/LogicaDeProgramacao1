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