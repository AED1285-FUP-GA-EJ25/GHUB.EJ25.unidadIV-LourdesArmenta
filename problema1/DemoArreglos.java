package problema1;

public class DemoArreglos {
    public static void demoArreglos() {
        //declaracion de arreglos
        int c[] = new int[10]; //declara un arreglo de tamaño 10 de nombre c;
        //los elementos de un arreglo de tipo int se inicializan en cero
        //recorrer los elementos del arreglo
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println(c[4]);
        System.out.println(c[5]);
        System.out.println(c[6]);
        System.out.println(c[7]);
        System.out.println(c[8]);
        System.out.println(c[9]);

        //vamos a darle valores a los elementos
        c[1]=100;
        c[3]=300;
        c[5]=500;
        c[7]=700;
        c[9]=900;

        System.out.println("Recorro el arreglo mediante el ciclo for:");

        //iterra un arreglo
        for(int i=0;i<10;i++){
            System.out.println("c["+i+"]="+c[i]);
        }

        System.out.println(c); //Esto es un error porque esto se refiere al objeto y 
                               // al elemento del arreglo

       
        
    }
    
}
