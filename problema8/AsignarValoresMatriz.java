package problema8;

public class AsignarValoresMatriz {
    public static void asignarValorsMatriz(){
        asignar();

    }
    private static void asignar(){
         final int T = 3;
         final int I = 4;
         int num[][];
         num = new int[T][I];
         for (int t=0;t<num.length;t++){
            for (int i=0;i<num[0].length;i++){
                num[t][i]=t*4 + i*1;
            }
         }

         for (int t=0;t<num.length;t++){
            for (int i=0;i<num[0].length;i++){
                System.out.println("num["+i+"]["+i+"]= "+num[t][i]);
            }
         }





    }

}
