package view;
import java.awt.Color;
import javax.swing.JButton;
import controle.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoReggae extends JButton implements ActionListener {
	public BotaoReggae() {
		setText("REGGAE");
		setBackground(Color.BLUE);
		Controlador c= new Controlador();
		
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Controlador.ritmo = "reggae";
		  Controlador.aluno+=";reggae";
	}}
