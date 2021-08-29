package CadAlunos;

import  java.awt.event.ActionEvent ;
import  java.awt.event.ActionListener ;

import  javax.swing.GroupLayout ;
import  javax.swing.JButton ;
import  javax.swing.JInternalFrame ;
import  javax.swing.JLabel ;
import  javax.swing.JOptionPane ;
import  javax.swing.JTextField ;
import  javax.swing.LayoutStyle ;

import  modelo.Aluno ;

public class CadAlunos extends JInternalFrame 
{
	/**
	 * Area para cadastro de alunos
	 */
	private static final long serialVersionUID = 1L;
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
	private  JTextField txtIdade;
	
	private  JButton btnNovoRegistro;
	private  JButton btnGravarRegistro;
	private  JButton btnProximo;
	private  JButton btnAnterior;
	//
	//modelo.Aluno alunos [] =  new  modelo.Aluno [ 5 ];
	//int qteAlunos =  - 1 ; // controle de inserções.
	
	private Aluno aluno = null;
	
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
        txtIdade     = new JTextField();
        
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
				if(existeDados()) 
				{
					try {
						aluno = new Aluno(
							txtCodigo.getText(),
							txtNome.getText(),
							txtEmail.getText(),
							txtIdade.getText(),
							txtMatricula.getText()
						);
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, "Erro ao receber dados na classe " + e.getMessage());
					}
					
					if(txtCodigo.getText().length() == 0 || Integer.parseInt(txtCodigo.getText()) == 0)
					{
						if(aluno.salvarDadosForm(0))
						{
							JOptionPane.showMessageDialog(null, "Cadastro de dados completo!");
						}
					}
					else{
						if(aluno.salvarDadosForm(1))
						{
							JOptionPane.showMessageDialog(null, "Cadastro de dados completo!");
						}
					}
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Existem campos sem registro!");
				}
			}
			
		});
        
        btnProximo.addActionListener(new ActionListener() 
        {			
        	@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				//Criar rotina de anterior
				int proximo = 0;
				
				if(txtCodigo.getText().length() == 0 )txtCodigo.setText("1");
				else{
					proximo = Integer.parseInt(txtCodigo.getText());
					//
					aluno.getDadosForm(proximo,0); //busco do BD
					//
					if(aluno != null) 
					{
						txtCodigo    .setText  (String.valueOf(aluno.getCodigo()));
						txtMatricula .setText  (aluno.getMatricula());
						txtNome		 .setText  (aluno.getNome());
						txtEmail	 .setText  (aluno.getEmail());
						txtIdade	 .setText  (String.valueOf(aluno.getIdade()));
					}
					else {
						JOptionPane.showMessageDialog(null, "Este e o fim da lista!");
					}
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
				
				if(txtCodigo.getText().length() == 0 )txtCodigo.setText("1");
				else {
					anterior = Integer.parseInt(txtCodigo.getText());
					
					if(anterior >= 1) 
					{
						aluno.getDadosForm(anterior,1); //busco do BD
						//
						txtCodigo    .setText  (String.valueOf(anterior));
						txtMatricula .setText  (aluno.getMatricula());
						txtNome		 .setText  (aluno.getNome());
						txtEmail	 .setText  (aluno.getEmail());
						txtIdade	 .setText  (String.valueOf(aluno.getIdade()));
					}
					else {
						JOptionPane.showMessageDialog(null, "Este e o inicio da lista!");
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
					txtCodigo.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(null, "Os campos estâo vazios, novo cadastro já é possivel!");
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
		if(txtCodigo.getText().length() == 0 )
		{
			txtCodigo.setText("0");
		}
		//validar a tela.
		if(txtMatricula.getText().length() == 0) 
		{
			resposta = false;
		}		
		if(txtNome.getText().length() == 0 && resposta == true) 
		{
			resposta = false;
		}		
		if(txtEmail.getText().length() == 0 && resposta == true) 
		{
			resposta = false;
		}		
		if((Integer)txtIdade.getText().length() <= 0 && resposta == true) 
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
		txtIdade.setText("");
		txtMatricula.requestFocus();
	}	
}
