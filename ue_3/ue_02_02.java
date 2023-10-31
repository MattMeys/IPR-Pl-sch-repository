package ue_3;

import lib.util.In;
import lib.util.Out;

public class ue_02_02 {

/*    
Eingabe:
2 Felder von ganzen Zahlen mit jeweils den x- und y-Koordinaten eines Punktes.
Problemstellung:
Gib alle Punkte aus, die im 1. Quadranten liegen, also von denen x und y > 0 sind.
Ausgabe:
alle Punkte, die im 1. Quadranten liegen.

Quadrantenbestimmung:
 */
    public static void main(String args[]){

        int[] x = {3, 4, 5, 13, 53, 1, 4, -3};
        int[] y = {5, 1, 5, -2, 42, 3, 5, 3};

        for (int i = 0; i < x.length; i++){
            if (x[i] > 0 && y[i] > 0){
                Out.println("(" + x[i] + "|" + y[i] +")");
            }
        }
    
    }
}
