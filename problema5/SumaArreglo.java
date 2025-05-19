package problema5;
import java.util.Scanner;
public class SumaArreglo{
    static Scanner sc = new Scanner(System.in);
    public static void sumaArreglo(){
        int suma = sumArr();
        System.out.println("La suma ="+suma);

    }
    private static int sumArr(){
        int []x; //declaro la variale
        x = new int[10]; //inicializo variable
        for(int i=0; i<10;i++){
            System.out.print("Teclaa el valor de x["+i+"]= ");
            x[i]= sc.nextInt();
        }
        int suma = 0;
        for(int i=0;i<10;i++){
            //suma = suma +x[i];
            suma += x[i];
        }
        return suma;

    }
    
}