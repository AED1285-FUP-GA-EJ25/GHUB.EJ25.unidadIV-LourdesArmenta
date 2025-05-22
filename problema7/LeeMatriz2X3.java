package problema7;
//Proposito: Leer un matriz de orden 2X3
import java.util.Scanner;

public class LeeMatriz2X3 {
    static Scanner sc = new Scanner(System.in);
    public static void leeMatriz2X3(){
        leerMatriz();
    }
    private static void leerMatriz(){
        String x[][]; //declaro
        x = new String[2][3]; //inicializo en null
        System.out.println(x[0][0]);
        for(int i=0;i<x.length;i++){ //x.length regrese el numero de renglones
            for(int j=0;j<x[0].length;j++){ //x[i].length regrese el numero de columnas del renglon 0
                System.out.print("Proporciona valor de elemento x["+i+"]["+j+"]=");
                x[i][j]=sc.nextLine();
            }
        }


    }


}
