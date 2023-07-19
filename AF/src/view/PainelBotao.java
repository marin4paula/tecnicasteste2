package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;

import javax.swing.JPanel;

import controle.Controlador;


public class PainelBotao extends JPanel{
	public JButton azul;
	public JButton vermelho;
	public JButton verde;
	public JButton rosa;
	public JButton roxo;
	public JButton amarelo;
public PainelBotao(){
	this.setLayout(new GridLayout(1, 6));
    BotaoAzul bazul = new BotaoAzul();
    BotaoVermelho bvermelho = new BotaoVermelho();
    BotaoVerde bverde = new BotaoVerde();
    BotaoRosa brosa = new BotaoRosa();
    BotaoRoxo broxo = new BotaoRoxo();
    BotaoAmarelo bamarelo = new BotaoAmarelo();
    this.azul=bazul;
    this.vermelho=bvermelho;
    this.verde=bverde;
    this.rosa=brosa;
    this.roxo=broxo;
    this.amarelo=bamarelo;
    add(azul);
    add(vermelho);
    add(verde);
    add(rosa);
    add(roxo);
    add(amarelo);
    if(Controlador.sair==false) {
    	festa();
    }
}
public void festa() {
if(Controlador.ritmo!=null && Controlador.sair==false) {
	if(Controlador.ritmo=="rock")
		Controlador.endarquivo= new File("C:\\Users\\amand\\OneDrive\\Documentos\\marina\\AF\\src\\documentos\\rock");
	if(Controlador.ritmo=="reggae")
		Controlador.endarquivo = new File ("C:\\Users\\amand\\OneDrive\\Documentos\\marina\\AF\\src\\documentos\\reggae");	
	if(Controlador.ritmo=="eletro")
		Controlador.endarquivo= new File ("C:\\Users\\amand\\OneDrive\\Documentos\\marina\\AF\\src\\documentos\\eletronica");
	try {
		BufferedReader arquivo = new BufferedReader(new FileReader(Controlador.endarquivo));
		while (arquivo.ready()) {
			String linha = arquivo.readLine();
			String[] aux=linha.split(";");
			if(aux[0]=="1") {
				azul.setBackground(Color.WHITE);
				dormir();
				azul.setBackground(Color.BLUE);
			}	
			if(aux[1]=="1") {
				vermelho.setBackground(Color.WHITE);
				dormir();
				vermelho.setBackground(Color.RED);}
			if(aux[2]=="1") {
				verde.setBackground(Color.WHITE);
				dormir();
				verde.setBackground(Color.GREEN);}
			if(aux[3]=="1") {
				rosa.setBackground(Color.WHITE);
				dormir();
				rosa.setBackground(Color.PINK);}
			if(aux[4]=="1") {
				roxo.setBackground(Color.WHITE);
				dormir();
				roxo.setBackground(new Color(36, 27, 83));}
			if(aux[5]=="1") {
				amarelo.setBackground(Color.WHITE);
				dormir();
				amarelo.setBackground(Color.YELLOW);}
			
        }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}}


public void dormir() {
	try {
		Thread.sleep(500);
	}
	catch(Exception e) {
		e.printStackTrace();}
}
}
