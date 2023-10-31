package ue_3;
import java.util.ArrayList;
import java.util.List;
import lib.util.In;
import lib.util.Out;

public class ue_02_01 {
    // Eingabe:
    // eine positive, ganze Zahl
    // Problemstellung:
    // die Zahl soll in binärer Schriftweise (rückwärts) ausgegeben werden.
    // Ausgabe:
    // die Zahl in binärer Schriftweise (rückwärts).

    // Binärifizierung:
    public static void main(String args[]){

        int dezI = In.readInt();
        List<String> binString = new ArrayList<String>();
        
        
        if (dezI == 0){
            binString.add("0");
        }
        while (dezI > 0){

            if (dezI % 2 == 0){
                binString.add("0");
            }
            else {
                binString.add("1");
            }

            dezI = dezI / 2;

        }

        Out.println("Please read backwards: " + binString);
        
    }

}
