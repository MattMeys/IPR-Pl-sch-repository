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
int dezI = In.readInt();
int rmaininDezI;
int binI[];
//joe
rmaininDezI = dezI / 2;
binI[0] = dezI % 2;

Out.println("Please read backwards: " + binI);
}
