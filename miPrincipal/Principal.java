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
                
                default:
                System.out.println("Opcion invalida");
                    break;
            }
        }
        while (opcion !=0);
    }
}