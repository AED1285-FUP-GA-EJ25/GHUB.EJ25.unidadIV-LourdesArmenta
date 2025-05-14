package miPrincipal;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
        seleccionarMenu();
        
    }
     public static void menu(){
        System.out.println();
        System.out.println("*************************** Menu de Opciones ************************");
        System.out.println("*\t                                                             *");
        System.out.println("*\t 1) Demostración de un arreglo unidimensional                *");
        System.out.println("*\t 2) Leer un arreglo unidimensional de entero de tamaño 10    *");
        System.out.println("*\t 3) Leer un arreglo unidimensional de doubles de tamaño 10   *");
        System.out.println("*\t 4) Leer un arreglo unidimensional de cadenas de tamaño 5 \n e imprimirla en orden inverso   *");

        System.out.println("*\t                                                             *");
        System.out.println("*\t\t0) Salir                                             *");
        System.out.println("**********************************************************************");
        System.out.print("Seleccione Opcion:");

    }
    public static void seleccionarMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion ;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    problema1.DemoArreglos.demoArreglos();
                    break;
                case 2:
                    problema2.LeerArreglo.leerArreglo();
                    break;
                case 3:
                    problema3.LeerArreglo.leerArreglo();
                    break;
                case 4:
                    problema4.LeerArreglo.leerArreglo();

                
                default:
                System.out.println("Opcion invalida");
                    break;
            }
        }
        while (opcion !=0);
    }
}