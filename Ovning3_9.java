import javax.swing.*;
/*
Programs som skriver ett slumpmässigt tal mellan 0 till 99
Alexander Blom
2017/10/09
*/

public class Ovning3_9{
	public static void main(String[] args) {
		double s = Math.random();
		s = s * 100;

		int i = (int)s;

		JOptionPane.showMessageDialog(null, i);
	}
}