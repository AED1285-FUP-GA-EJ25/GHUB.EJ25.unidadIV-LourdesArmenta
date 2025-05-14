package problema4;
import java.util.Scanner;

public class LeerArreglo {
    static Scanner sc = new Scanner(System.in);
    public static void leerArreglo(){
        leer();

    }
    private static void leer(){
        String c[];
        c = new String[5];
        for(int i=0;i<5;i++){
            System.out.print("proporciona el valor de c["+i+"]: ");
            c[i]=sc.nextLine();

        }
        for(int i=4;i>=0;i--){
            System.out.println("c["+i+"]: "+c[i]);
        }


    }
    
}
