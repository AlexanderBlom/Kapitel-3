import javax.swing.*;
/*
Program som räknar ut en cirkels area och omkrets
Alexander Blom
2017/10/02
*/

public class Ovning3_3{
	public static void main(String[] args) {
		String radie;
		int radie2;
		double pi, area, omkrets;


		pi = 3.1415926536;
		radie = JOptionPane.showInputDialog(null, "Skriv radien pa din cirkel");
		radie2 = Integer.parseInt(radie);
		
		area = radie2 * radie2 * pi;
		omkrets = radie2 * 2 * pi;

		JOptionPane.showMessageDialog(null,"Arean ar " + area + "\nOmkretsen ar " + omkrets);

	}
}