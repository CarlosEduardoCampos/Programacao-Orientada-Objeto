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
    public partial class Form3 : Form
    {
        Form1 form1 = new Form1();
        //
        public Form3(Form1 form1)
        {
            InitializeComponent();
            this.form1 = form1;
        }

        //Limpa entrada de dados
        private void limpar()
        {
            txtCodigo.Clear();
            txtCpf.Clear();
            txtNome.Clear();
            txtLogin.Clear();
            txtSenha.Clear();
        }

        //Verifica se existe texto em entrada de dados
        private bool ExisteTexto()
        {
            if (string.IsNullOrWhiteSpace(txtCodigo.Text)) return false;
            else if (string.IsNullOrWhiteSpace(txtCpf.Text)) return false;
            else if (string.IsNullOrWhiteSpace(txtNome.Text)) return false;
            else if (string.IsNullOrWhiteSpace(txtLogin.Text)) return false;
            else if (string.IsNullOrWhiteSpace(txtSenha.Text)) return false;
            else return true;
        }

        /// <summary>
        /// Repassa os dados do objeto para os campos de digitação
        /// </summary>
        /// <param name="colab"> Objeto abastecido com dados</param>
        private void ColaboradorTela(Colaborador colab)
        {
            if (colab.Codigo != 0)
            {
                txtCodigo.Text = colab.Codigo.ToString();
                txtCpf.Text    = colab.Cpf;
                txtNome.Text   = colab.Nome;
                txtLogin.Text  = colab.Login;
                txtSenha.Text  = colab.Senha;
            }
            else
            {
                MessageBox.Show
                    (
                        " Não ouve retorno de dados ",
                        " Entrada de dados ",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Exclamation
                    );
            }
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

        private void btnGravar_Click(object sender, EventArgs e)
        {
            //Faz entrada de dados no codigo de controle
            if (txtCodigo.Text.Length == 0) txtCodigo.Text = "0";

            if (ExisteTexto())
            {
                //Cria Objeto
                Colaborador Item = new Colaborador(txtCodigo.Text, txtCpf.Text, txtNome.Text, txtLogin.Text, txtSenha.Text);

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

        private void btnAnt_Click(object sender, EventArgs e)
        {
            if (txtCodigo.Text.Length != 0 && txtCodigo.Text != "0")
            {
                try
                {
                    Colaborador colab = new Colaborador();//Cria objeto
                    colab.Buscar(int.Parse(txtCodigo.Text), 1, form1.conexao);//Abastece objetos com banco de dados
                    ColaboradorTela(colab);//Repassa dados do objeto para tela
                }
                catch (Exception ex)
                {
                    MessageBox.Show
                    (
                        " Erro ao buscar dados " + ex.ToString(),
                        " Entrada de dados ",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Error
                    );
                }
            }
            else
            {
                MessageBox.Show
                    (
                        " Este e o inicio, não exite anteriores ",
                        " Entrada de dados ",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Exclamation
                    );
            }
        }

        private void btnProx_Click(object sender, EventArgs e)
        {
            if (txtCodigo.Text.Length == 0) txtCodigo.Text = "0";
            //
            try
            {
                Colaborador colab = new Colaborador();//Cria objeto
                colab.Buscar(int.Parse(txtCodigo.Text), 0, form1.conexao);//Abastece objetos com banco de dados
                ColaboradorTela(colab);//Repassa dados do objeto para tela
            }
            catch (Exception ex)
            {
                MessageBox.Show
                (
                    " Erro ao buscar dados " + ex.ToString(),
                    " Entrada de dados ",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Error
                );
            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (txtCodigo.Text.Length != 0 && int.Parse(txtCodigo.Text) > 0)
            {
                if (MessageBox.Show("Deseja realmente excluir o Produto" +
                    txtNome.Text + ", " + txtLogin.Text + "?",
                    "Deletar Produto",
                    MessageBoxButtons.YesNo,
                    MessageBoxIcon.Question) == DialogResult.Yes
                  )
                {
                    Colaborador colab = new Colaborador();
                    colab.Codigo = int.Parse(txtCodigo.Text);
                    if (colab.Deletar(colab.Codigo, form1.conexao))
                    {
                        MessageBox.Show
                       (
                           " Dados deletadodos com sucesso! ",
                           " Entrada de dados ",
                           MessageBoxButtons.OK,
                           MessageBoxIcon.Information
                       );
                        limpar();
                    }
                    else
                    {
                        MessageBox.Show
                      (
                          "Não foi possivel deletar os dados! ",
                          " Entrada de dados ",
                          MessageBoxButtons.OK,
                          MessageBoxIcon.Information
                      );
                    }
                }
            }
        }
    }
}
