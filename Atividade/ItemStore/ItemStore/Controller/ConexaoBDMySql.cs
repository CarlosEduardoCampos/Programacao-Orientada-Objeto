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
    public class ConexaoBDMySql : InterfaceBD
    {
        //Atributos
        MySqlConnection conexao = new MySqlConnection();
        public BancoDados infoData { get; set; }

        //Costrutor
        public ConexaoBDMySql(BancoDados infoData)
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
                    string sql = "Server="      + infoData.host             +";"+
                                 "DataBase="    + infoData.dataBase         +";"+
                                 "Uid="         + infoData.usuario          +";"+
                                 "Pwd="         + infoData.senha            +";"+
                                 "Connection Timeout=900;" +
                                 "Port="        + infoData.porta.ToString() +";";

                    this.conexao = new MySqlConnection(sql);
                    this.conexao.Open();
                    return true;
                }
                catch (Exception ex)
                {
                    MessageBox.Show(
                        "Erro ao conectar ao Banco de Dados(MySql): " + ex.ToString(),//testo da aplicação
                        "Cadastro de Medalhas (MySql)",//titulo da aplicação
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
            try{
                if(conexao.State == System.Data.ConnectionState.Open)
                {
                    this.conexao.Close();
                }
                return true;
            }
            catch(Exception ex)
            {
                MessageBox.Show(
                    "Erro ao desconectar ao Banco de Dados(MySql): " + ex.ToString(),//testo da aplicação
                    "Cadastro de Medalhas (MySql)",//titulo da aplicação
                    MessageBoxButtons.OK, //Botões da aplicação
                    MessageBoxIcon.Error //Icone da aplicação
                );
                return false;
            }
        }
    }//fim class
}
