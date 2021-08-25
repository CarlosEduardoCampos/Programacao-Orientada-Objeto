CREATE DATABASE bd_aula;

USE bd_aula;

CREATE TABLE tb_Pessoa(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	idade INT NOT NULL
);


CREATE TABLE tb_Aluno(
   matricula VARCHAR(20) NOT NULL,
   codigo INT NOT NULL,
   CONSTRAINT fk_aluno_pessoa FOREIGN KEY (codigo)
	REFERENCES tb_Pessoa (codigo) ON DELETE CASCADE
);

SELECT * FROM tb_Aluno ORDER BY matricula;
SELECT * FROM tb_Pessoa;