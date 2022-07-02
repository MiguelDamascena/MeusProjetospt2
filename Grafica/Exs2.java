package Grafica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JOptionPane exemplo");
		// Cria o JOptionPane por showMessageDialog
		String Nome = JOptionPane.showInputDialog("Digite seu nome"); 
	    JOptionPane.showMessageDialog(frame,Nome);  
	    System.exit(0);
		
	    
	    
	    
	}

}
