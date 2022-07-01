package program;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		ReverseString conversor = new ReverseString();
		String text = "";
		
		while(true) {
				text = JOptionPane.showInputDialog(null, "Insira palavra a ser convertida:");
				JOptionPane.showMessageDialog(null, conversor.getReverseString(text));
		}
	}
}
