package view;
import java.awt.Color;
import javax.swing.JButton;

import controle.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BotaoRock extends JButton implements ActionListener  {
	public BotaoRock() {
		setText("ROCK");
		setBackground(Color.BLUE);
		Controlador c= new Controlador();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Controlador.ritmo = "rock";
		  Controlador.aluno+=";rock";
	}
}
