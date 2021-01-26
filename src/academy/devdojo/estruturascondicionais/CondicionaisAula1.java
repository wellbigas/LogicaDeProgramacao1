package academy.devdojo.estruturascondicionais;/*
if (true) ou (false) sempre vai ter uma condição sempre sera executada, caso for false não, se o else{} tiver em seguida
sera executada logo em seguida
*/

public class CondicionaisAula1 {
    public static void main(String[] args) {
        boolean condicao = false;
        if (condicao) {
            System.out.println("Dentro do IF");
        } else {
            System.out.println("Dentro do ELSE");
        }
        System.out.println("Fora do IF");
    }
}
