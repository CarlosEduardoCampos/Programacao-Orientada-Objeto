package CadAlunos;

import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;

public class CadAlunos extends JInternalFrame {
	public CadAlunos() {
		setClosable(true);
		setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de alunos");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
	}
}
