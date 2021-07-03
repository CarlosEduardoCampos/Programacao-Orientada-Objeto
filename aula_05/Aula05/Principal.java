package Aula05;

import javax.swing.JFrame;

public class Principal {
	
	public static void main(String[] args)
	{
		TexteFieldFrame textFieldFrame = new TexteFieldFrame();
		//
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Comfigura botão de fechar
		textFieldFrame.setSize(250,250);//Largura e Altura
		textFieldFrame.setVisible(true);//Torna a tela visivel
		//
	}

}
