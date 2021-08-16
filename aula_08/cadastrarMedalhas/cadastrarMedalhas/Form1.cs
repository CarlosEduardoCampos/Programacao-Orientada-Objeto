using cadastrarMedalhas.model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace cadastrarMedalhas
{
    public partial class Form1 : Form
    {
        BancoDados dataBase = new BancoDados("localhost","pass1386","bd_cadMedalhas");
        public Form1()
        {
            InitializeComponent();
        }

        private void btnOk_Click(object sender, EventArgs e)
        {
            
        }
    }
}
