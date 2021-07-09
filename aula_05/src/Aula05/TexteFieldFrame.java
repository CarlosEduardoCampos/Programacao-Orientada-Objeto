package Aula05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TexteFieldFrame extends JFrame {
	//Argumentos
	///Caixas de texto
	private JTextField txtField_00;
	private JTextField txtField_01;
	private JTextField txtField_02;
	//Caixa de texto senha
	private JPasswordField txtPassword;
	//Botoes de intera��o
	private JButton btnEntrar;
	private JButton btnOk;
	private JButton btnSair;
	//Costrutor
	public TexteFieldFrame()
	{
		super(" Teste de formulario ");//Titulo da tela
		//
		setLayout(new FlowLayout());     //setando o layout do frame
		//Adicinando elementos ao frame
		txtField_00 = new JTextField(15);//Criando o objeto txtFiel_00
		add(txtField_00);			     //Colocando o txtField_00 no frame
		//Caixas de texto
		txtField_01 = new JTextField("Entre com seu texto aqui", 15); 
		add(txtField_01); //Colocando o txtField2 no frameaa
		//
		txtField_02 = new JTextField("Campo desabilitado", 15);
		txtField_02.setEnabled(false);//Desabilita a introdu��o de texto
		add(txtField_02);
		//Caixa de text senha
		txtPassword = new JPasswordField("Minha senha", 15);
		add(txtPassword);
		//Botoes de intera��o
		btnEntrar = new JButton(" Entrar ");
		add(btnEntrar);
		//
		btnOk = new JButton("Ok? ");
		add(btnOk);
		//
		btnSair = new JButton(" Sair ");
		add(btnSair);
		//Adicionado eventos aos componentes
		btnEntrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//Cria uma janela de aviso apos click no botao Entrar
				JOptionPane.showMessageDialog(null,"Mensagem do Bot�o");
			}
		});
		//
		btnOk.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				/*
				 	Cria uma janela de aviso apos click no botao ok?
				 	essa op��o mostra uma tela de aviso com botoes 	yes ou no
				 	yes retorna o valor 0
				 	no retorna o valor 1
				*/
				if(JOptionPane.showConfirmDialog
					(
					null,
					" N�o esta ok? ",
					" T�tulo da msg ",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE
					) == 0 )
				{
					//YES
					JOptionPane.showMessageDialog(null, " N�o est� ok :�( ");
				}else {
					//NO
					JOptionPane.showMessageDialog(null, " Est� ok!!! ");
				}
			}
		});
		//
		txtField_00.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//Variavel recebe o valor que esta em txtFild_00
				String txt = String.format("txtField_00: %s", txtField_00.getText());
				//Joga na tela a menssagem quando aperta enter
				JOptionPane.showMessageDialog(null, " O texto do Field_00: " + txt);
			}
		});
		//
		txtPassword.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				//Variavel recebe o valor que esta em txtFild_00
				String txt = String.format("%s", txtPassword.getText());
				//Joga na tela a menssagem quando aperta enter
				JOptionPane.showMessageDialog(null, " O texto do Password: " + txt);
			}
		});
		//
		btnSair.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
	}
}
