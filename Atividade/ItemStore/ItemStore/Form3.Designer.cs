
namespace ItemStore
{
    partial class Form3
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form3));
            this.lbCodigo = new System.Windows.Forms.Label();
            this.lbCpf = new System.Windows.Forms.Label();
            this.lbNome = new System.Windows.Forms.Label();
            this.lbLogin = new System.Windows.Forms.Label();
            this.lbSenha = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.txtCpf = new System.Windows.Forms.MaskedTextBox();
            this.txtNome = new System.Windows.Forms.TextBox();
            this.txtLogin = new System.Windows.Forms.TextBox();
            this.txtSenha = new System.Windows.Forms.TextBox();
            this.btnAnt = new System.Windows.Forms.Button();
            this.btnLimpar = new System.Windows.Forms.Button();
            this.btnGravar = new System.Windows.Forms.Button();
            this.btnExcluir = new System.Windows.Forms.Button();
            this.btnProx = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbCodigo
            // 
            this.lbCodigo.AutoSize = true;
            this.lbCodigo.Location = new System.Drawing.Point(12, 38);
            this.lbCodigo.Name = "lbCodigo";
            this.lbCodigo.Size = new System.Drawing.Size(46, 15);
            this.lbCodigo.TabIndex = 0;
            this.lbCodigo.Text = "Código";
            // 
            // lbCpf
            // 
            this.lbCpf.AutoSize = true;
            this.lbCpf.Location = new System.Drawing.Point(30, 67);
            this.lbCpf.Name = "lbCpf";
            this.lbCpf.Size = new System.Drawing.Size(28, 15);
            this.lbCpf.TabIndex = 1;
            this.lbCpf.Text = "CPF";
            // 
            // lbNome
            // 
            this.lbNome.AutoSize = true;
            this.lbNome.Location = new System.Drawing.Point(18, 96);
            this.lbNome.Name = "lbNome";
            this.lbNome.Size = new System.Drawing.Size(40, 15);
            this.lbNome.TabIndex = 2;
            this.lbNome.Text = "Nome";
            // 
            // lbLogin
            // 
            this.lbLogin.AutoSize = true;
            this.lbLogin.Location = new System.Drawing.Point(21, 125);
            this.lbLogin.Name = "lbLogin";
            this.lbLogin.Size = new System.Drawing.Size(37, 15);
            this.lbLogin.TabIndex = 3;
            this.lbLogin.Text = "Login";
            // 
            // lbSenha
            // 
            this.lbSenha.AutoSize = true;
            this.lbSenha.Location = new System.Drawing.Point(20, 154);
            this.lbSenha.Name = "lbSenha";
            this.lbSenha.Size = new System.Drawing.Size(39, 15);
            this.lbSenha.TabIndex = 4;
            this.lbSenha.Text = "Senha";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Enabled = false;
            this.txtCodigo.Location = new System.Drawing.Point(64, 35);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(63, 23);
            this.txtCodigo.TabIndex = 5;
            // 
            // txtCpf
            // 
            this.txtCpf.Location = new System.Drawing.Point(64, 64);
            this.txtCpf.Mask = "000.000.000-00";
            this.txtCpf.Name = "txtCpf";
            this.txtCpf.Size = new System.Drawing.Size(154, 23);
            this.txtCpf.TabIndex = 6;
            // 
            // txtNome
            // 
            this.txtNome.Location = new System.Drawing.Point(64, 93);
            this.txtNome.Name = "txtNome";
            this.txtNome.Size = new System.Drawing.Size(154, 23);
            this.txtNome.TabIndex = 7;
            // 
            // txtLogin
            // 
            this.txtLogin.Location = new System.Drawing.Point(64, 122);
            this.txtLogin.Name = "txtLogin";
            this.txtLogin.Size = new System.Drawing.Size(154, 23);
            this.txtLogin.TabIndex = 8;
            // 
            // txtSenha
            // 
            this.txtSenha.Location = new System.Drawing.Point(64, 151);
            this.txtSenha.Name = "txtSenha";
            this.txtSenha.Size = new System.Drawing.Size(154, 23);
            this.txtSenha.TabIndex = 9;
            this.txtSenha.UseSystemPasswordChar = true;
            // 
            // btnAnt
            // 
            this.btnAnt.Location = new System.Drawing.Point(12, 209);
            this.btnAnt.Name = "btnAnt";
            this.btnAnt.Size = new System.Drawing.Size(64, 33);
            this.btnAnt.TabIndex = 10;
            this.btnAnt.Text = "Anterior";
            this.btnAnt.UseVisualStyleBackColor = true;
            this.btnAnt.Click += new System.EventHandler(this.btnAnt_Click);
            // 
            // btnLimpar
            // 
            this.btnLimpar.Location = new System.Drawing.Point(82, 209);
            this.btnLimpar.Name = "btnLimpar";
            this.btnLimpar.Size = new System.Drawing.Size(64, 33);
            this.btnLimpar.TabIndex = 11;
            this.btnLimpar.Text = "Limpar";
            this.btnLimpar.UseVisualStyleBackColor = true;
            this.btnLimpar.Click += new System.EventHandler(this.btnLimpar_Click);
            // 
            // btnGravar
            // 
            this.btnGravar.Location = new System.Drawing.Point(152, 209);
            this.btnGravar.Name = "btnGravar";
            this.btnGravar.Size = new System.Drawing.Size(64, 33);
            this.btnGravar.TabIndex = 12;
            this.btnGravar.Text = "Gravar";
            this.btnGravar.UseVisualStyleBackColor = true;
            this.btnGravar.Click += new System.EventHandler(this.btnGravar_Click);
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(222, 209);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(64, 33);
            this.btnExcluir.TabIndex = 13;
            this.btnExcluir.Text = "Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            this.btnExcluir.Click += new System.EventHandler(this.btnExcluir_Click);
            // 
            // btnProx
            // 
            this.btnProx.Location = new System.Drawing.Point(292, 209);
            this.btnProx.Name = "btnProx";
            this.btnProx.Size = new System.Drawing.Size(64, 33);
            this.btnProx.TabIndex = 14;
            this.btnProx.Text = "Proximo";
            this.btnProx.UseVisualStyleBackColor = true;
            this.btnProx.Click += new System.EventHandler(this.btnProx_Click);
            // 
            // Form3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(368, 254);
            this.Controls.Add(this.btnProx);
            this.Controls.Add(this.btnExcluir);
            this.Controls.Add(this.btnGravar);
            this.Controls.Add(this.btnLimpar);
            this.Controls.Add(this.btnAnt);
            this.Controls.Add(this.txtSenha);
            this.Controls.Add(this.txtLogin);
            this.Controls.Add(this.txtNome);
            this.Controls.Add(this.txtCpf);
            this.Controls.Add(this.txtCodigo);
            this.Controls.Add(this.lbSenha);
            this.Controls.Add(this.lbLogin);
            this.Controls.Add(this.lbNome);
            this.Controls.Add(this.lbCpf);
            this.Controls.Add(this.lbCodigo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form3";
            this.Text = "Novo Colaborador";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbCodigo;
        private System.Windows.Forms.Label lbCpf;
        private System.Windows.Forms.Label lbNome;
        private System.Windows.Forms.Label lbLogin;
        private System.Windows.Forms.Label lbSenha;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.MaskedTextBox txtCpf;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.TextBox txtLogin;
        private System.Windows.Forms.TextBox txtSenha;
        private System.Windows.Forms.Button btnAnt;
        private System.Windows.Forms.Button btnLimpar;
        private System.Windows.Forms.Button btnGravar;
        private System.Windows.Forms.Button btnExcluir;
        private System.Windows.Forms.Button btnProx;
    }
}