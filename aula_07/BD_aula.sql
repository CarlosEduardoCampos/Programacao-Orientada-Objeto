CREATE DATABASE bd_aula;

USE bd_aula;

CREATE TABLE tb_Aluno(
   codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   matricula VARCHAR(20) NOT NULL,
   codigo INT NOT NULL,
   nome VARCHAR(50) NOT NULL,
   email VARCHAR(100) NOT NULL,
   idade INT NOT NULL
);

SELECT * FROM tb_Aluno ORDER BY matricula;