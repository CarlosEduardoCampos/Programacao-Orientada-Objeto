using Medalhas.model;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Medalhas.controller
{
    public class ConexaoBDMariaDB : InterfaceBD
    {
        //Atributos
        MySqlConnection conexao = new MySqlConnection();
        public BancoDados infoData { get; set; }

        //Costrutor
        public ConexaoBDMariaDB(BancoDados infoData)
        {
            this.infoData = infoData;
        }

        //Metodos
        public bool Conectar()
        {
            if (this.infoData != null)
            {
                try
                {
                    string sql = "Data Source=" + infoData.host      + ";" +
                                 "DataBase=" + infoData.dataBase     + ";" +
                                 "User id=" + infoData.usuario       + ";" +
                                 "Password=" + infoData.senha        + ";" +
                                 "Connection Timeout=900;" +
                                 "Port=" + infoData.porta.ToString() + ";" +
                                 "SSL Mode=none";
                    this.conexao = new MySqlConnection(sql);
                    this.conexao.Open();
                    return true;
                }
                catch (Exception ex)
                {
                    MessageBox.Show(
                        "Erro ao conectar ao Banco de Dados(MariaDB): " + ex.ToString(),//testo da aplicação
                        "Cadastro de Medalhas(MariaDB)",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );
                    return false;
                }
            }//fim do if
            else
            {
                return false;
            }//fim do else
        }//fim função Conectar()
        

        public MySqlConnection getConexao()
        {
            return conexao;
        }

        public bool Desconectar()
        {
            try
            {
                if(conexao.State == System.Data.ConnectionState.Open)
                {
                    this.conexao.Close();
                }
                return true;
            }
            catch(Exception ex){
                MessageBox.Show(
                    "Erro ao desconectar do banco de dados(MariaDB)" + ex.ToString(),
                    "Cadastro de Medalhas(MariaDB)",//titulo da aplicação
                    MessageBoxButtons.OK, //Botões da aplicação
                    MessageBoxIcon.Error //Icone da aplicação
                );
                return false;
            }
        }
    }//fim class
}
