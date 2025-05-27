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

        //Matrices constantes
        /*
        String nombresDias[]; //declaro
        nombresDias = new String[7]; //inicializo
        nombresDias[0]="domingo";
        nombresDias[1]="lunes";
        nombresDias[2]="martes";
        nombresDias[3]="miercoles";
        nombresDias[4]="jueves";
        nombresDias[5]="viernes";
        nombresDias[6]="sabado";
        */
        String nombresDias [] = {"domingo",
                                 "lunes",
                                 "martes",
                                 "miercoles",
                                 "jueves",
                                 "viernes",
                                 "sabado"};

        int dia = 0;
        do{ 
             System.out.print("Proporciona el dia de la semana:");
             dia = sc.nextInt();
        } while(dia<0 || dia>6);

        System.out.println(nombresDias[dia]);

        //Pidan el numero de mes y les imprima el número dias que tiene el mes
        //validando que el numero de mes este entre 1 y 12

        int numeroDiaMes[] ={31,28,31,30,30,30,31,31,30,31,30,31};
        int diaMes = 0;
        do{
            System.out.print("Proporciona el número de mes (1-12)");
            diaMes = sc.nextInt();
        }while (diaMes<1 || diaMes>12);

        System.out.println("Ese mes tiene :"+numeroDiaMes[diaMes-1]+" dias");

        ///
        /// el renglo representa el vendedor (3) y la columna represente el trimestre(4)
        double ventas[][]={{1234.56, 980.99, 1200.00, 789.14},
                           {2500.00,3000.00,4560.56,898.12},
                           {900,1250.55,5000.00,1250.98}
                          };
        for(int renglon=0;renglon<ventas.length;renglon++){
            System.out.println("Vendedor: ");
            for(int columna = 0;columna<ventas[renglon].length;columna++){
                System.out.print(ventas[renglon][columna]+" ");

            }
            System.out.println();

        }
        
        


    }
    
}
