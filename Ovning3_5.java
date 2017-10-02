import javax.swing.*;
/*
Program som räknar ut momsen på en vara
Alexander Blom
2017/10/02
*/

public class Ovning3_5{
	public static void main(String[] args) {
		String pris, moms;
		int momsSats;
		double pris2, prisUtanMoms, moms2, endastMoms;

		pris = JOptionPane.showInputDialog(null,"Hur mycket kostar varan?");
		pris2 = Double.parseDouble(pris);

		moms = JOptionPane.showInputDialog(null,"Hur manga procent ar momsen?");
		momsSats = Integer.parseInt(moms);

		moms2 = momsSats / 100.0;
		endastMoms = pris2 * moms2;
		prisUtanMoms = pris2 - endastMoms;

		JOptionPane.showMessageDialog(null,"Momsen på varan ar " + endastMoms + " kr." + 
										"\nPriset på varan utan moms ar " + prisUtanMoms + " kr.");
	}
}