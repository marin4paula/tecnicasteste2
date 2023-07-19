package view;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controle.Controlador;

public class MenuSuperior extends JPanel  {
	public MenuSuperior() {
		this.setBackground(new Color(171, 179, 242));
		setLayout(new FlowLayout());
		JLabel nome = new JLabel("tecnico de palco");
		JTextField tecnico = new JTextField(25);
	    JButton iniciar = new JButton("iniciar");
	    BotaoRelatorio relatorio = new BotaoRelatorio();
	    BotaoSair sair = new BotaoSair();
	    Controlador c= new Controlador();
	   
	    iniciar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 Controlador.aluno= tecnico.getText();
			}
	    	
	    	
	    });
	    add(nome);
	    add(tecnico);
	    add(iniciar);
	    add(relatorio);
	    add(sair);
	
	}
	
}
