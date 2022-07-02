package Grafica;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada =new Scanner(System.in);
		JFrame frame = new JFrame("JOptionPane exemplo");
		String nome = JOptionPane.showInputDialog("Digite seu nome"); 
	    JFrame frame1 = new JFrame("JOptionPane exemplo");
		String idade = JOptionPane.showInputDialog("Digite sua idade"); 
	    JFrame frame2 = new JFrame("JOptionPane exemplo");
		String salario = JOptionPane.showInputDialog("Digite seu salario"); 
	    JOptionPane.showMessageDialog(frame2,"Ola " + nome + " você tem " + idade + " anos" + " e o seu salario é : " + salario);
	    
	    JOptionPane.showConfirmDialog(null, " Voce gostou? "," Escolha um ",JOptionPane.YES_NO_OPTION);
	    
	    
	    System.exit(0);
		
		
	}
	

}