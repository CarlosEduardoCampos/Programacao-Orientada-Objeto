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
        public bool ExisteTexto()
        {
            if(string.IsNullOrWhiteSpace(txtNameP.Text))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public Form1()
        {
            InitializeComponent();
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            if(ExisteTexto())
            {
                MessageBox.Show("ok");
            }
        }
    }
}
