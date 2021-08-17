using MySql.Data.MySqlClient;
using Pizzaria.controlles;
using Pizzaria.model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pizzaria
{
    public partial class Form1 : Form
    {
        //Atributos
        BancoDados dataBaseMySql = new BancoDados("localhost", "pass1386", "bd_pizzaria");
        BancoDados dataBaseMariaDB = new BancoDados("localhost", "root", "pass1386", "bd_pizzaria", 3307);
        /// <summary>
        /// 0 - MySql 
        /// 1 - MariaDB
        /// </summary>
        int qualBD;

        public Form1()
        {
            InitializeComponent();
            qualBD = 0;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            InterfaceBD conexaoBD;
            bool conectado = false;
            try
            {
                if (qualBD == 0)
                {
                    // MySql
                    conexaoBD = new ConectarMySql();
                    conexaoBD.Conectar(dataBaseMySql);
                    conectado = conexaoBD.Conectar(dataBaseMySql);

                    //Insert
                    string sql = "INSERT INTO tb_Pizza(nomePizza,ingredientes,valorBroto,valorMedia)" +
                   "VALUES('" + txtNameP.ToString() + "','" + textIngredientes.ToString() + "','" + intValorB.Value + "','" + intValorM.Value + "')";

                    conexaoBD.Executar(sql);
                }
                else
                {
                    //MariaDB
                    conexaoBD = new ConectarMariaDB();
                    conexaoBD.Conectar(dataBaseMariaDB);
                    conectado = conexaoBD.Conectar(dataBaseMariaDB);
                    MessageBox.Show("O Banco MariaDB ainda não esta pronto!");
                }

                if (conectado)
                {
                    MessageBox.Show("Banco de dados esta conectado!");
                    conexaoBD.Desconectar();
                }
                else
                {
                    MessageBox.Show("Banco de dados esta desconectado!");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao conectar!" + ex.ToString());
            }
        }
    }
}
