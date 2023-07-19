package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
public Janela() {
	setTitle("arena aeroporto");
	setSize(900, 700);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	setLayout(new BorderLayout());
	MenuSuperior menusuperior = new MenuSuperior();
	add(BorderLayout.NORTH, menusuperior);
	PainelSecundario secundario = new PainelSecundario();
	add(BorderLayout.EAST, secundario);
	PainelBotao botoes = new PainelBotao();
	add(BorderLayout.CENTER, botoes );
	setVisible(true);
	
	
}

}
