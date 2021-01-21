/*
Eu como usuario gostaria de ter o nome e a idade de participantes de
um torneio de natacao e que o sistema imrpimisse da segunte forma
Menor que 10 anos: <nome> Participará da categoria infantil
Entre 11 e 15 anos: <nome> Participará da categoria Juvenil
Entre 16 e 18 anos: <nome> Participará da categoria Pré-Adulto
Acuma de 20 anos: <nome> Participará da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes

Leitura Complementar:
Processo de desenvolvimento de software
metodologias ageis
SCRUM
 */
public class TorneioDeNatacao {
    public static void main(String[] args) {
        String name ="Gabriel";
        int idade = 17;
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