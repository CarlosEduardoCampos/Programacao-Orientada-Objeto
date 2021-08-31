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
        public int Codigo    { get; set; }
        public string Nome   { get; set; }
        public string Marca  { get; set; }
        public int Valor     { get; set; }
        public string codBar { get; set; }

        //Costrutor
        public Produto() { }
        public Produto(string Codigo, string Nome, string Marca, string Valor)
        {
            this.Codigo = int.Parse(Codigo.Trim().ToUpper());
            this.Nome   = Nome.Trim().ToUpper();
            this.Marca  = Marca.Trim().ToUpper();
            this.Valor = int.Parse(Valor.Trim().ToUpper());
            this.codBar = null;
        }

        //Métodos
        /*
         * Grava dados no banco
         **/
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
                              "VALUES('" + this.Nome + "','" + this.Marca + "'," + this.Valor +");";
                    }
                    else
                    {
                        //Update
                        sql = "UPDATE tb_Produto SET" +
                              "nome='" + this.Nome + "', " +
                              "marca='" + this.Marca + "', " +
                              "valor=" + this.Valor + ", " +
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
                        "Erro ao executar Insert ou Update no Banco de Dados" + ex.ToString(),//testo da aplicação
                        "Cadastro de Atleta",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );
                Gravado = false;
            }
            return Gravado;
        }

        /// <summary>
        /// Rotina de busca em banco de dados
        /// </summary>
        /// <param name="codigo">Código presente no txtCodigo.Text()</param>
        /// <param name="tipoBusc"> 0: proximo; 1:anterio </param>
        /// <param name="conexao">Objeto de conexão com o Banco de dados</param>
        /// <returns></returns>
        public Produto Buscar(int codigo, int tipoBusc, InterfaceBD conexao)
        {
            //zero o objeto
            this.Codigo = 0;
            this.Nome   = "";
            this.Marca  = "";
            this.Valor = 0;
            try{
                //Comando de pesquisa
                MySqlCommand comando = null;
                MySqlDataReader dataReader = null;
                string sql = "";
                //
                if (conexao.Conectar())
                {
                    sql = "SELECT * FROM tb_Produto WHERE codigo";
                    if (tipoBusc == 0)
                    {
                        //Proximo
                        sql += " > " + codigo + " ORDER BY codigo ASC LIMIT 1;";
                    }
                    else
                    {
                        //Anterior
                        sql += " < " + codigo + " ORDER BY codigo DESC LIMIT 1;";
                    }
                    //
                    comando = new MySqlCommand(sql, conexao.getConexao());
                    /**
                     * Aplicanco comando no banco de dados eo retorno será
                     * colocado no dataReader que funciona coomo um vetor
                     **/
                    dataReader = comando.ExecuteReader();
                    //
                    if(dataReader.HasRows)//Existe linha
                    {
                        while(dataReader.Read())
                        {
                            this.Codigo = int.Parse(dataReader["codigo"].ToString());
                            this.Nome   = dataReader["nome"].ToString();
                            this.Marca = dataReader["marca"].ToString();
                            this.Valor = int.Parse(dataReader["valor"].ToString());
                        }
                    }
                    //Fechamento dos comandos
                    dataReader.Dispose();
                    dataReader.Close();
                    comando.Dispose();
                    conexao.Desconectar();
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show(
                        "Erro ao executar Select no Banco de Dados" + ex.ToString(),//testo da aplicação
                        "Cadastro de Atleta",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );
            }
            return this;
        }

        public bool Deletar(int codigo, InterfaceBD conexao)
        {
            bool res = false;
            try{
                MySqlCommand comando = null;
                string sql = "";
                //
                if(conexao.Conectar())
                {
                    sql = "DELETE FROM tb_Produto WHERE codigo=" + this.Codigo;
                    //
                    comando = new MySqlCommand(sql,conexao.getConexao());
                    comando.ExecuteNonQuery();
                    comando.Dispose();
                    conexao.Desconectar();
                    //
                    res = true; 
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show(
                        "Erro ao executar Delete no Banco de Dados" + ex.ToString(),//testo da aplicação
                        "Cadastro de Atleta",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Error //Icone da aplicação
                    );
            }
            return res;
        }
    }
}
