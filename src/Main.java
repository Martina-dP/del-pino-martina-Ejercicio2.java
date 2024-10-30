import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int boardGame = 8;
        int boxSize ;
        char pattern ;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el carácter que usar como patrón: ");
        pattern = input.next().charAt(0);

        while (true){
            System.out.print("Introduce  el tamaño de la casilla: ");
            boxSize = input.nextInt();
            if (boxSize >= 1 && boxSize <=15 ) break;
            else System.out.println("Debes introducir un valor mayor o igual a 1 y menor o igual a 15");
        }

        for (int i = 0 ; i < boardGame; i++){
            for (int m = 0 ; m < boardGame; m++){

                if (m % 2 == 0) {
                    System.out.print(pattern);
                } else System.out.print(i);


            }
            System.out.println();
        }

    }
}