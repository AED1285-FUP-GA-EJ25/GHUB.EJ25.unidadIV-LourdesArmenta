package problema2;
/*
 * Proposito: almacenar 10 numeros enteros en un arreglo unidimensinal
 * Autor: Lourdes Armenta
 * Fecha: 14 de mayo 2025
 */
import java.util.Scanner;
public class LeerArreglo {
    static Scanner sc = new Scanner(System.in);
    public static void leerArreglo() {
        leer();
        
    }
    private static void leer(){
        int x[]; //declaro un arreglo de nombre x de tipo entero
        x = new int[10]; //inicializa un arreglo de tamaño 10
                        // por omision los elementos de arreglo se inicializan en cero
        for(int i=0;i<10;i++){
            System.out.print("Teclaa el valor de x["+i+"]: ");
            x[i]=sc.nextInt();

        }

    }
    
}
