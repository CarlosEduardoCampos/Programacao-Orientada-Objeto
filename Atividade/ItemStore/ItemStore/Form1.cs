using Medalhas.controller;
using Medalhas.model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ItemStore
{
    public partial class Form1 : Form
    {
        BancoDados dataBaseMySql = new BancoDados("localhost", "root", "", "bd_itemStore", 3306);
        BancoDados dataBaseMariaDB = new BancoDados("localhost", "root", "", "bd_itemStore", 3306);
        /// <summary>
        /// 0 - MySql 
        /// 1 - MariaDB
        /// </summary>
        int qualBD;
        public InterfaceBD conexao { get; set; }
        public Form1()
        {
            InitializeComponent();
            qualBD = 0;
            if(qualBD == 0)
            {
                //MySql
                conexao = new ConexaoBDMySql(dataBaseMySql);
            }
            else{
                //MariaDB
                conexao = new ConexaoBDMySql(dataBaseMariaDB);
            }
        }

        private void podutoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2(this);
            form2.Show();
        }

        private void colaboradorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form3 form3 = new Form3(this);
            form3.Show();
        }
    }
}
