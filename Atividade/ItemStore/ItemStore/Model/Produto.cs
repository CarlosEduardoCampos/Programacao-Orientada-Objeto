using Medalhas.controller;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ItemStore.Model
{
    class Produto
    {
        private int Codigo { get; set; }
        private string Nome   { get; set; }
        private string Marca  { get; set; }
        private string Valor  { get; set; }

        //Costrutor
        public Produto() { }
        public Produto(string Codigo, string Nome, string Marca, string Valor)
        {
            this.Codigo = int.Parse(Codigo);
            this.Nome   = Nome;
            this.Marca  = Marca;
            this.Valor  = Valor;
        }

        //Métodos
        public bool Gravar(InterfaceBD ConexaoBD)
        {
            //Atributos
            bool Gravado = true;
            MySqlCommand comando;
            string sql = "";

            try
            {
                if (ConexaoBD.Conectar())
                {
                    //Insert ou Update
                    if (this.Codigo == 0)
                    {
                        //Insert
                        sql = "INSERT INTO tb_Produto(nome, marca, valor)" +
                              "VALUES('" + this.Nome + "','" + this.Marca + "','" + this.Valor + "');";
                    }
                    else
                    {
                        //Update
                        sql = "UPDATE tb_Produto SET" +
                              "nome='" + this.Nome + "', " +
                              "marca='" + this.Marca + "', " +
                              "valor='" + this.Valor + "', " +
                              "WHERE codigo=" + this.Codigo + ";";
                    }
                    comando = new MySqlCommand(sql, ConexaoBD.getConexao());
                    comando.ExecuteNonQuery();
                    comando.Dispose();
                    ConexaoBD.Desconectar();
                }
                else
                {
                    Gravado = false;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(
                        "Erro ao executar no Banco de Dados(MySql): " + ex.ToString(),//testo da aplicação
                        "Cadastro de Atleta",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );
                Gravado = false;
            }
            return Gravado;
        }
    }
}
