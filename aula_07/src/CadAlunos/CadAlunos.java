package CadAlunos;

import  java.awt.event.ActionEvent ;
import  java.awt.event.ActionListener ;
import java.sql.Connection;

import  javax.swing.GroupLayout ;
import  javax.swing.JButton ;
import  javax.swing.JInternalFrame ;
import  javax.swing.JLabel ;
import  javax.swing.JOptionPane ;
import  javax.swing.JSpinner ;
import  javax.swing.JTextField ;
import  javax.swing.LayoutStyle ;

import controllers.ConexaoBD;
import  modelo.Aluno ;
import modelo.BancoDados;

public class CadAlunos extends JInternalFrame 
{
	// Atributos
	private  JLabel lblMatricula;
	private  JLabel lblCodigo;
	private  JLabel lblNome;
	private  JLabel lblEmail;
	private  JLabel lblIdade;
	
	private  JTextField txtMatricula;
	private  JTextField txtCodigo;
	private  JTextField txtNome;
	private  JTextField txtEmail;	
	private  JSpinner txtIdade;
	
	private  JButton btnNovoRegistro;
	private  JButton btnGravarRegistro;
	private  JButton btnProximo;
	private  JButton btnAnterior;
	//
	modelo.Aluno alunos [] =  new  modelo.Aluno [ 5 ];
	int qteAlunos =  - 1 ; // controle de inserções.	
	
	public CadAlunos() {
		setClosable    (true);
		setMaximizable (true);
        setResizable   (true);
        setTitle       ("Cadastro de alunos");
        
      //instanciar atributos:
        lblMatricula = new JLabel();
        lblCodigo    = new JLabel();
        lblNome      = new JLabel();
        lblEmail     = new JLabel();
        lblIdade     = new JLabel();
        
        txtMatricula = new JTextField();
        txtCodigo    = new JTextField();
        txtNome      = new JTextField();
        txtEmail     = new JTextField();
        txtIdade     = new JSpinner();
        
        btnNovoRegistro   = new JButton();
        btnGravarRegistro = new JButton();
        btnProximo        = new JButton();
        btnAnterior       = new JButton();
        
        lblMatricula.setText("Matrícula:");
        lblCodigo.setText("Código:");
        lblNome.setText("Nome:");
        lblEmail.setText("E-mail:");
        lblIdade.setText("Idade:");
        
        btnNovoRegistro.setText("Novo registro");
        btnGravarRegistro.setText("Gravar registro");
        btnProximo.setText("Próximo");
        btnAnterior.setText("Anterior");
        
        txtCodigo.setEnabled(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            //.addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            	.addContainerGap()
            	.addGroup
            	(
            		layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
            			.addGap(0, 0, Short.MAX_VALUE)
            			.addComponent(btnNovoRegistro)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(btnGravarRegistro)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(btnProximo)
            		)
            		.addGroup(layout.createSequentialGroup()
            			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
            				.addGroup(layout.createSequentialGroup()
            					.addComponent(lblNome)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            					.addComponent(txtNome,GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
            				)
            				.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            					.addComponent(lblMatricula)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
            					.addComponent(txtMatricula,GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
            				)
            				.addGroup(layout.createSequentialGroup()
            					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            						.addComponent(lblEmail)
            						.addComponent(lblIdade)
            					)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE,  48, GroupLayout.DEFAULT_SIZE)
            						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.DEFAULT_SIZE)
            					)
            				)
            			)
            			.addGap(0, 0, Short.MAX_VALUE)
            		)
            	)
            	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
            			.addComponent(lblCodigo)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
            		)
            		.addComponent(btnAnterior)
            	)
            	.addContainerGap()
            )
        );
        layout.setVerticalGroup
        (
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            //.addGap(0, 274, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoRegistro)
                    .addComponent(btnGravarRegistro)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        //ações de botões:
        btnGravarRegistro.addActionListener(new ActionListener() 
        {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				//validar a tela				
				if(!existeDados()) 
				{	
					//verificar posição do vetor
					if(qteAlunos <= 3) 
					{
						qteAlunos++; //incrementa em +1						
						//gravar
						Aluno aluno = new modelo.Aluno(
							txtNome.getText(),
							txtEmail.getText(),
							Integer.parseInt(txtIdade.getValue().toString()),
							txtMatricula.getText()
						);
						//INSERT OU UPDATE
						if(txtMatricula.getText().length() == 0)aluno.salvarDadosForm(0);//INSERT
						else aluno.salvarDadosForm(1);//UPDATE
						//
						alunos[qteAlunos] = aluno; //BD
						JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
						//limpar a tela
						limparTela();
					}else 
					{
						JOptionPane.showMessageDialog(null, "Não existe mais espaço para novos alunos!");
					}
				}
				
			}
		});
        
        btnProximo.addActionListener(new ActionListener() 
        {			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				int proximo = 0;
				//verificar se a qte de alunos é >= 0	
				if(qteAlunos >= 0) 
				{
					//limparTela();
					if(txtCodigo.getText().length() == 0) 
					{
						txtCodigo.setText("0");
					}else 
					{
						proximo = Integer.parseInt(txtCodigo.getText()) + 1;
						if(proximo <= qteAlunos) 
						{
							txtCodigo.setText(String.valueOf(proximo));
						}
					}
					//pesquisar no vetor:
					if(Integer.parseInt(txtCodigo.getText()) <= qteAlunos) 
					{
						int codigo = Integer.parseInt(txtCodigo.getText());
						modelo.Aluno aluno = alunos[codigo]; //busco do BD
						txtMatricula.setText(aluno.getMatricula());
						txtNome.setText(aluno.getNome());
						txtEmail.setText(aluno.getEmail());
						txtIdade.setValue(aluno.getIdade());
					}
				}else {
					JOptionPane.showMessageDialog(null, "Sua lista ainda esta vazia!");
				}
			}
		});
        
        btnAnterior.addActionListener(new ActionListener() 
        {			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				//Criar rotina de anterior
				int anterior = 0;
				if(Integer.parseInt(txtCodigo.getText()) <= 0)
				{
					JOptionPane.showMessageDialog(null, "Você já chegou ao inicio!");
				}
				else if(txtCodigo.getText().length() == 0 ){
					JOptionPane.showMessageDialog(null, "Lista não iniciada!");
				}
				else {
					anterior = Integer.parseInt(txtCodigo.getText()) - 1;
					if(anterior <= qteAlunos) 
					{
						txtCodigo.setText(String.valueOf(anterior));
					
					}
					//pesquisar no vetor:
					if(Integer.parseInt(txtCodigo.getText()) >= 0) 
					{
						int codigo = Integer.parseInt(txtCodigo.getText());
						modelo.Aluno aluno = alunos[codigo]; //busco do BD
						txtMatricula.setText(aluno.getMatricula());
						txtNome.setText(aluno.getNome());
						txtEmail.setText(aluno.getEmail());
						txtIdade.setValue(aluno.getIdade());
					}
				}
			}
		});
        btnNovoRegistro.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent e) {
				// testa se a informações nos campos
				if(existeDados())
				{
					limparTela();//limpas as informações
					txtCodigo.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "Os campos estâo vazios, novo cadastro ja e possivel!");
				}
				
			}
        });
        pack();
	}
	
	/**
	 * Verifica se exite algum campo digitado
	 * @return true ou false
	 */
	private boolean existeDados() 
	{
		boolean resposta = true;
		//validar a tela.
		if(txtMatricula.getText().length() == 0) 
		{
			resposta = false;
		}		
		if(txtNome.getText().length() == 0 && resposta == false) 
		{
			resposta = false;
		}		
		if(txtEmail.getText().length() == 0 && resposta == false) 
		{
			resposta = false;
		}		
		if((Integer)txtIdade.getValue() <= 0 && resposta == false) 
		{
			resposta = false;
		}
		return resposta;
	}
	
	/**
	 * Rotina para limpar a tela, zerando os campos digitados
	 */
	private void limparTela() 
	{
		txtMatricula.setText("");
		txtNome.setText("");
		txtEmail.setText("");
		txtIdade.setValue(0);
		txtMatricula.requestFocus();
	}	
}
