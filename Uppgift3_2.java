import javax.swing.*;
/*
Program som räknar exakt hur många grader Fahrenheit är i celsius.
Alexander Blom
2017/10/09
*/
public class Uppgift3_2{
	public static void main(String[] args) {
		String fahS = JOptionPane.showInputDialog(null, "Skriv dina grader i Fahrenheit");
		double fah = Double.parseDouble(fahS);

		Double cel = ((fah - 32) * 5 / 9);

		JOptionPane.showMessageDialog(null, fahS + " grader Fahrenheit = " + cel + " grader Celsius.");	
	}
}