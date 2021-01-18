import java.util.Scanner

public class CalculadorDiferencaIdade {
        public static void main(String[] args) {
            int firstAge = 26;
            int secondAge = 22;
            int ageDifferent = firstAge - secondAge;
            System.out.println("A diferença entre as idades é =" + ageDifferent);
             
            /*
              Lendo informações com Scanner
            */
                
            Scanner scanner = new Scanner (System.in);
                double distanciaPercorrida = scanner.nextDouble ();
                scanner.close();
                
                

        }

    }
