package view;
import java.awt.Color;
import javax.swing.JButton;

import controle.Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BotaoFraca extends JButton implements ActionListener{
	public BotaoFraca() {
		setText("cor fraca");
		setBackground(Color.BLUE);
		Controlador c= new Controlador();}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Controlador.intensidade = "fraca";
		  Controlador.aluno+=";fraca";
	}
}
