package ue_3;
import lib.util.Out;

public class ue_02_03 {
    /*    
Eingabe:
ein Feld von ganzen Zahlen, die den y-Werten von Punkten mit
dem Feld-index als x-Wert entsprechen 
Problemstellung:
Gehe alle y-Werte durch, um den größten, also das globale
Maximum zu finden und gib den entsprechenden Punkt aus.
Gibt es mehrere Maxima, gib nur eines davon aus.
Ausgabe:
x- und y-Wert des globalen Maximum-Punktes.

Maximumfinder:
 */
    public static void main(String args[]){

        int[] y = {3, -4, 2, 4, 8, 3, -5, 3, -3};
        int maxY = y[0];
        int maxX = 0;
        for (int i = 1; i < y.length; i++){
            if (y[i] > maxY){
                maxY = y[i];
                maxX = i;
            }
        }
        Out.println("global max: (" + maxX + "|" + maxY + ")"); 
    
    }
}
