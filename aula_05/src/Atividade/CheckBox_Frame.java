package Atividade;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBox_Frame extends JFrame 
{
	private JTextField textField;
	private JCheckBox  boldJCheckBox;
	private JCheckBox  italicJCheckBox;
	
	//Costrutor da classe
	public CheckBox_Frame()
	{
		super("CheckBox teste");//Titulo do frame
		setLayout(new FlowLayout());
		//
		textField = new JTextField(" Escolha um estilo de fonte ", 25);//configura aparencia do frame
		textField.setFont(new Font("Serif", Font.PLAIN, 14));//configura aparencia da font do frame
		add(textField);// adciona textField ao frame
		//
		boldJCheckBox = new JCheckBox("Negrito");//cria caixa de seleção para negrito
		italicJCheckBox = new JCheckBox("Italico");//cria caixa de seleçãopara itálico
		add(boldJCheckBox);
		add(italicJCheckBox);
		//
		//listeners registradores para JCheckBoxes
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener( (ItemListener) handler);
		italicJCheckBox.addItemListener( (ItemListener) handler);
	}
	//Classe interna private para tratamento de evento
	class CheckBoxHandler implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Font font = null;//armazena anova font
			
			//determina que CheckBoxes estão marcados e cria o font
			if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
			{
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(boldJCheckBox.isSelected())
			{
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(italicJCheckBox.isSelected())
			{
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			//
			textField.setFont(font);//mostra a fonte configurada
		}//fim da class CheckBox
	}
}
