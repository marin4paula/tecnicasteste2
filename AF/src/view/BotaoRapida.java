package view;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import controle.Controlador;
public class BotaoRapida extends JButton implements ActionListener{
	public BotaoRapida() {
		setText("rapida");
		setBackground(Color.BLUE);
		Controlador c= new Controlador();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Controlador.velocidade="rapida";
		  Controlador.aluno+=";rapida";
		  
	}
}
