package view;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelSecundario extends JPanel{
	PainelSecundario(){
		
		this.setBackground(new Color(171, 179, 242));
		this.setLayout(new GridLayout(3, 1));
		JPanel ritmos = new JPanel();
		ritmos.setLayout(new GridLayout(4, 1));
		ritmos.setBackground(new Color(171, 179, 242));
		BotaoRock rock = new BotaoRock();
		BotaoReggae reggae = new BotaoReggae();
		BotaoEletronica eletronica = new BotaoEletronica();
		JLabel ritmo = new JLabel("ritmos");
		ritmos.add(ritmo);
		ritmos.add(rock);
		ritmos.add(reggae);
		ritmos.add(eletronica);
		JPanel intensidade = new JPanel();
		intensidade.setLayout(new GridLayout(3, 1));
		intensidade.setBackground(new Color(171, 179, 242));
		intensidade.setSize(300, 700);
		ritmos.setSize(300, 700);
		JLabel intensidadecor = new JLabel("intensidade das cores");
		BotaoForte forte = new BotaoForte();
		BotaoFraca fraca = new BotaoFraca();
		intensidade.add(intensidadecor);
		intensidade.add(forte);
		intensidade.add(fraca);
		JPanel velocidade = new JPanel();
		velocidade.setLayout(new GridLayout(3, 1));
		velocidade.setBackground(new Color(171, 179, 242));
		velocidade.setSize(300, 700);
		JLabel velocidades = new JLabel("velocidades");
		BotaoRapida rapida = new BotaoRapida();
		BotaoLenta lenta = new BotaoLenta();
		velocidade.add(velocidades);
		velocidade.add(rapida);
		velocidade.add(lenta);
		add(ritmos);
		add(intensidade);
		add(velocidade);
		
	}	
}
