import javax.swing.*;
/*
Program som bestämmer den högsta temperaturen
Alexander Blom
2017/10/09
*/

public class Ovning3_8{
	public static void main(String[] args) {
		int max;

		JOptionPane.showMessageDialog(null, "Skriv hur manga grader det var varje dag.");

		int mon = Integer.parseInt(JOptionPane.showInputDialog("Mandag"));
		int tis = Integer.parseInt(JOptionPane.showInputDialog("Tisdag"));
		max = Math.max(mon, tis);
		int ons = Integer.parseInt(JOptionPane.showInputDialog("Onsdag"));
		max = Math.max(max, ons);	
		int tor = Integer.parseInt(JOptionPane.showInputDialog("Torsdag"));
		max = Math.max(max, tor);
		int fre = Integer.parseInt(JOptionPane.showInputDialog("Fredag"));
		max = Math.max(max, fre);
		int lor = Integer.parseInt(JOptionPane.showInputDialog("Lordag"));
		max = Math.max(max, lor);
		int son = Integer.parseInt(JOptionPane.showInputDialog("Sondag"));
		max = Math.max(max, son);

		JOptionPane.showMessageDialog(null, "Den högsta temperaturen den har veckan var " + max);
	}
}