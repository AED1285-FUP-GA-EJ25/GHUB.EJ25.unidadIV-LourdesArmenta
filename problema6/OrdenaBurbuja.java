package problema6;
import java.util.Scanner;

public class OrdenaBurbuja {
    public static void ordenaBurbuja(){
        ordenar();
    }
    private static void ordenar(){
        Scanner sc = new Scanner(System.in);// declarado a nivel de metodo.
        int i, k;
        double aux;
        double x[];
        x = new double[10];
        //Leemos lo elementos del arreglo
        for (i=0;i<10;i++){
            System.out.print("Proporciona valor de x["+i+"]= ");
            x[i]=sc.nextDouble();

        }
        //ordenamos en base a burbuja
        for(k=0;k<10;k++){
            for(i=0;i<9;i++){
                if (x[i]>x[i+1]){
                    aux = x[i];
                    x[i]=x[i+1];
                    x[i+1]=aux;
                }
            }
        }
        //imprimimos el arreglo
        System.out.println("Arreglo Ordenado");
         for (i=0;i<10;i++){
            System.out.println("x["+i+"]= "+x[i]);      
        }

    }

}
