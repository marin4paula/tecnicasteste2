package view;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import controle.Controlador;
public class BotaoEletronica extends JButton implements ActionListener {
	public BotaoEletronica() {
		setText("ELETRONICA");
		setBackground(Color.BLUE);
		Controlador c= new Controlador();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Controlador.ritmo = "eletronica";
		  Controlador.aluno+=";eletronica";}
}
