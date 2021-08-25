using ItemStore.Model;
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
    public partial class Form2 : Form
    {
        Form1 form1 = new Form1();
        public Form2(Form1 form1)
        {
            InitializeComponent();
            this.form1 = form1;
        }

        //Limpa entrada de dados
        private void limpar()
        {
            txtCodigo.Clear();
            txtNome.Clear();
            txtMarca.Clear();
            txtValor.Clear();
        }

        //Verifica se existe texto em entrada de dados
        private bool ExisteTexto()
        {
            if (string.IsNullOrWhiteSpace(txtCodigo.Text))     return false;
            else if (string.IsNullOrWhiteSpace(txtNome.Text))  return false;
            else if (string.IsNullOrWhiteSpace(txtMarca.Text)) return false;
            else if (string.IsNullOrWhiteSpace(txtValor.Text)) return false;
            else return true;
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            //Faz entrada de dados no codigo de controle
            if (txtCodigo.Text.Length == 0) txtCodigo.Text = "0";

            if (ExisteTexto())
            {
                //Cria Objeto
                Produto Item = new Produto(txtCodigo.Text, txtNome.Text, txtMarca.Text, txtValor.Text);

                if (Item.Gravar(form1.conexao))
                {
                    MessageBox.Show(
                        "Dados gravados com sucesso!",//testo da aplicação
                        "Ausência de dados",//titulo da aplicação
                        MessageBoxButtons.OK, //Botões da aplicação
                        MessageBoxIcon.Exclamation //Icone da aplicação
                    );
                }
                else
                {
                    MessageBox.Show(
                            "Os Dados não foram cadastrados.",//testo da aplicação
                            "Ausência de dados",//titulo da aplicação
                            MessageBoxButtons.OK, //Botões da aplicação
                            MessageBoxIcon.Exclamation //Icone da aplicação
                        );
                }
            }
            else MessageBox.Show
            (
                " Existem espaços que ainda estão vazios ",
                " Entrada de dados vazia ",
                MessageBoxButtons.OK,
                MessageBoxIcon.Exclamation
            );
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            if (!ExisteTexto())
            {
                limpar();
            }
            else MessageBox.Show
            (
                " Os espaços ainda estão vazios ",
                " Entrada de dados vazia ",
                MessageBoxButtons.OK,
                MessageBoxIcon.Exclamation
            );
        }
    }
}
