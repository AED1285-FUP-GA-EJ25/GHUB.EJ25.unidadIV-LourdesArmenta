package miPrincipal;
import java.util.Scanner;

public class DemoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar matriz entera de orden 3X3 
        int x[][];
        //inicializacion de la matriz
        x = new int[3][3];
        System.out.println(x[2][2]); //demostrado que todos los elementos del arreglo se inicializan en cero

        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;

        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

        System.out.println("x[2][2] = "+x[2][2]);

        /*
        System.out.print("Proporciona valor:");
        x[0][0] = sc.nextInt();
        x[0][1] = sc.nextInt();
        x[0][2] = sc.nextInt();
        x[1][0] = sc.nextInt();
        x[1][1] = sc.nextInt();
        x[1][2] = sc.nextInt();
        x[2][0] = sc.nextInt();
        x[2][1] = sc.nextInt();
        x[2][2] = sc.nextInt();
        */
        /*
        System.out.println("x[0][0] = "+x[0][0]);
        System.out.println("x[0][1] = "+x[0][1]);
        System.out.println("x[0][2] = "+x[0][2]);

        System.out.println("x[1][0] = "+x[1][0]);
        System.out.println("x[1][1] = "+x[1][1]);
        System.out.println("x[1][2] = "+x[1][2]);

        System.out.println("x[2][0] = "+x[2][0]);
        System.out.println("x[2][1] = "+x[2][1]);
        System.out.println("x[2][2] = "+x[2][2]);
        */

        //lee una matriz de orden 3X3
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print("Proporciona el valor del x["+i+"]["+j+"]=");
                x[i][j]=sc.nextInt();
            }
        }
        //imprime una matriz de orden 3xx
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println("valor del x["+i+"]["+j+"]="+x[i][j]);
               
            }
        }



    }
    
}
