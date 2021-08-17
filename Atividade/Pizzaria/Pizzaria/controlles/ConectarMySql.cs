using MySql.Data.MySqlClient;
using Pizzaria.model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pizzaria.controlles
{
    class ConectarMySql : InterfaceBD
    {
        MySqlConnection conexao = null;
        public bool Conectar(BancoDados infoData)
        {
            if (infoData != null)
            {
                try{
                    string sql = "Server=" + infoData.host           + ";" +
                                 "DataBase=" + infoData.dataBase     + ";" +
                                 "Uid=" + infoData.usuario           + ";" +
                                 "Pwd=" + infoData.senha             + ";" +
                                 "Connection Timeout=900;" +
                                 "Port=" + infoData.porta.ToString() + ";";

                    conexao = new MySqlConnection(sql);
                    conexao.Open();
                    return true;
                }//fim try
                catch (Exception ex)
                {
                    MessageBox.Show(
                        "Erro ao conectar ao Banco de Dados(MySql): " + ex.ToString(), //testo da aplicação
                        "Cadastro de Medalhas (MySql)", //titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );//fim MessageBox
                    return false;
                }//fim catch
            }//fim do if
            else
            {
                return false;
            }//fim do else
        }//fim função Conectar()

        public bool Desconectar()
        {
            try{
                if (conexao.State == System.Data.ConnectionState.Open)
                {
                    conexao.Close();
                }//fim if
                return true;
            }//fim try
            catch (Exception ex)
            {
                MessageBox.Show(
                    "Erro ao desconectar ao Banco de Dados(MySql): " + ex.ToString(),//testo da aplicação
                    "Cadastro de Medalhas (MySql)",//titulo da aplicação
                    MessageBoxButtons.OK, //Botões da aplicação
                    MessageBoxIcon.Error //Icone da aplicação
                );//fim MensegeBox
                return false;
            }//fim catch
        }//fim função Desconectar()

        public MySqlConnection Executar(string sql)
        {
            MySqlCommand command = new MySqlCommand(sql, conexao);
            command.ExecuteNonQuery();
            return conexao;
        }//fim função Executar()
    }
}
