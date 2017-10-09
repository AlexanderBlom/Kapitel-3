import javax.swing.*;
/*
Program som räknar ut timmar, minuter och sekunder.
Alexander Blom
2017/10/09
*/

public class Ovning3_6{
	public static void main(String[] args) {
		int tid, tim, timRest, min, sek;
		
		String tidS = JOptionPane.showInputDialog(null, "Skriv dina sekunder här");
		tid = Integer.parseInt(tidS);

		tim = tid / 3600;
		timRest = tid % 3600;
		min = timRest / 60;
		sek = timRest % 60;

		JOptionPane.showMessageDialog(null, tim + " timmar. " + min + " minuter. " + sek + " sekunder. ");	
	}
}