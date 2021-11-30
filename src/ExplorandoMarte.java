
import exploracao.*; //importando todas minhas classes dentro de exploracao
import java.util.Scanner; //Scanner vai ajudar na entrada de dados

public class ExplorandoMarte {

    public static void main(String[] args) {
        int X, Y;

        try (Scanner sc = new Scanner(System.in)) { // objeto do tipo Scanner passando o objeto System.in(passa o que é digitado no teclado)
            System.out.println("Digite o tamanho do campo: ");
            X = sc.nextInt();
            Y = sc.nextInt();
            sc.nextLine(); // le a entrada incluindo o espaço entre as palavras

            // instância do campo com a coordenada
            Campo campo = new Campo(X, Y);
        }
    }

}
