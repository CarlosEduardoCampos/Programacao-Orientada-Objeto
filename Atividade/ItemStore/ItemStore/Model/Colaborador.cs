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
    class Colaborador
    {
        //Atributo
        public int Codigo;
        public string Cpf;
        public string Nome;
        public string Login;
        public string Senha;

        //Costrutores
        public Colaborador() { }
        //
        public Colaborador(string Codigo, string Cpf, string Nome, string Login, string Senha)
        {
            this.Codigo = int.Parse(Codigo);
            this.Cpf    = Cpf;
            this.Nome   = Nome;
            this.Login  = Login;
            this.Senha  = Senha;
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
                        sql = "INSERT INTO tb_Colaborador(cpf,nome,login,senha)" +
                              "VALUES('" + this.Cpf + "','"+ this.Nome + "','" + this.Login + "','" + this.Senha+ "');";
                    }
                    else
                    {
                        //Update
                        sql = "UPDATE tb_Colaborador SET" +
                              "cpf='"   + this.Cpf    +"', "+
                              "nome='"  + this.Nome   +"', "+
                              "login='" + this.Login  +"', "+
                              "senha='" + this.Senha  +"', "+
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
        public Colaborador Buscar(int codigo, int tipoBusc, InterfaceBD conexao)
        {
            //zero o objeto
            this.Codigo = 0;
            this.Cpf    = "";
            this.Nome   = "";
            this.Login  = "";
            this.Senha  = "";
            try
            {
                //Comando de pesquisa
                MySql.Data.MySqlClient.MySqlCommand comando = null;
                MySqlDataReader dataReader = null;
                string sql = "";
                //
                if (conexao.Conectar())
                {
                    sql = "SELECT * FROM tb_Colaborador WHERE codigo";
                    if (tipoBusc == 0)
                    {
                        //Proximo
                        sql += ">" + codigo + "ORDER BY codigo ASC limit 1";
                    }
                    else
                    {
                        //Anterior
                        sql += "<" + codigo + "ORDER BY codigo DESC limit 1";
                    }
                    //
                    comando = new MySqlCommand(sql, conexao.getConexao());
                    /**
                     * Aplicanco comando no banco de dados eo retorno será
                     * colocado no dataReader que funciona coomo um vetor
                     **/
                    dataReader = comando.ExecuteReader();
                    //
                    if (dataReader.HasRows)//Existe linha
                    {
                        while (dataReader.Read())
                        {
                            this.Codigo = int.Parse(dataReader["codigo"].ToString());
                            this.Cpf    = dataReader["cpf"].ToString();
                            this.Nome   = dataReader["nome"].ToString();
                            this.Login  = dataReader["login"].ToString();
                            this.Senha  = dataReader["senha"].ToString();
                        }
                    }
                    //Fechamento dos comandos
                    dataReader.Dispose();
                    dataReader.Close();
                    comando.Dispose();
                    conexao.Desconectar();
                }
            }
            catch (Exception ex)
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
            try
            {
                MySqlCommand comando = null;
                string sql = "";
                //
                if (conexao.Conectar())
                {
                    sql = "DELETE FROM tb_Colaborador WHERE codigo=" + this.Codigo;
                    //
                    comando = new MySqlCommand(sql, conexao.getConexao());
                    comando.ExecuteNonQuery();
                    comando.Dispose();
                    conexao.Desconectar();
                    //
                    res = true;
                }
            }
            catch (Exception ex)
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
