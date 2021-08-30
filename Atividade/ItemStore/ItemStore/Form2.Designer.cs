
namespace ItemStore
{
    partial class Form2
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form2));
            this.lbCodigo = new System.Windows.Forms.Label();
            this.lbNome = new System.Windows.Forms.Label();
            this.lbMarca = new System.Windows.Forms.Label();
            this.lbValor = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.txtNome = new System.Windows.Forms.TextBox();
            this.txtMarca = new System.Windows.Forms.TextBox();
            this.txtValor = new System.Windows.Forms.TextBox();
            this.btnAnterior = new System.Windows.Forms.Button();
            this.btnLimpar = new System.Windows.Forms.Button();
            this.btnGravar = new System.Windows.Forms.Button();
            this.btnProximo = new System.Windows.Forms.Button();
            this.btnExcluir = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbCodigo
            // 
            this.lbCodigo.AutoSize = true;
            this.lbCodigo.Location = new System.Drawing.Point(18, 31);
            this.lbCodigo.Name = "lbCodigo";
            this.lbCodigo.Size = new System.Drawing.Size(46, 15);
            this.lbCodigo.TabIndex = 0;
            this.lbCodigo.Text = "Código";
            // 
            // lbNome
            // 
            this.lbNome.AutoSize = true;
            this.lbNome.Location = new System.Drawing.Point(24, 62);
            this.lbNome.Name = "lbNome";
            this.lbNome.Size = new System.Drawing.Size(40, 15);
            this.lbNome.TabIndex = 1;
            this.lbNome.Text = "Nome";
            // 
            // lbMarca
            // 
            this.lbMarca.AutoSize = true;
            this.lbMarca.Location = new System.Drawing.Point(24, 92);
            this.lbMarca.Name = "lbMarca";
            this.lbMarca.Size = new System.Drawing.Size(40, 15);
            this.lbMarca.TabIndex = 2;
            this.lbMarca.Text = "Marca";
            // 
            // lbValor
            // 
            this.lbValor.AutoSize = true;
            this.lbValor.Location = new System.Drawing.Point(31, 122);
            this.lbValor.Name = "lbValor";
            this.lbValor.Size = new System.Drawing.Size(33, 15);
            this.lbValor.TabIndex = 3;
            this.lbValor.Text = "Valor";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Cursor = System.Windows.Forms.Cursors.Default;
            this.txtCodigo.Enabled = false;
            this.txtCodigo.Location = new System.Drawing.Point(70, 28);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(79, 23);
            this.txtCodigo.TabIndex = 4;
            this.txtCodigo.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtNome
            // 
            this.txtNome.Location = new System.Drawing.Point(70, 59);
            this.txtNome.Name = "txtNome";
            this.txtNome.Size = new System.Drawing.Size(202, 23);
            this.txtNome.TabIndex = 5;
            // 
            // txtMarca
            // 
            this.txtMarca.Location = new System.Drawing.Point(70, 89);
            this.txtMarca.Name = "txtMarca";
            this.txtMarca.Size = new System.Drawing.Size(202, 23);
            this.txtMarca.TabIndex = 6;
            // 
            // txtValor
            // 
            this.txtValor.Location = new System.Drawing.Point(70, 119);
            this.txtValor.Name = "txtValor";
            this.txtValor.Size = new System.Drawing.Size(79, 23);
            this.txtValor.TabIndex = 7;
            // 
            // btnAnterior
            // 
            this.btnAnterior.Location = new System.Drawing.Point(12, 188);
            this.btnAnterior.Name = "btnAnterior";
            this.btnAnterior.Size = new System.Drawing.Size(63, 29);
            this.btnAnterior.TabIndex = 8;
            this.btnAnterior.Text = "Anterior";
            this.btnAnterior.UseVisualStyleBackColor = true;
            this.btnAnterior.Click += new System.EventHandler(this.btnAnterior_Click);
            // 
            // btnLimpar
            // 
            this.btnLimpar.Location = new System.Drawing.Point(81, 188);
            this.btnLimpar.Name = "btnLimpar";
            this.btnLimpar.Size = new System.Drawing.Size(63, 29);
            this.btnLimpar.TabIndex = 9;
            this.btnLimpar.Text = "Limpar";
            this.btnLimpar.UseVisualStyleBackColor = true;
            this.btnLimpar.Click += new System.EventHandler(this.btnLimpar_Click);
            // 
            // btnGravar
            // 
            this.btnGravar.Location = new System.Drawing.Point(150, 188);
            this.btnGravar.Name = "btnGravar";
            this.btnGravar.Size = new System.Drawing.Size(63, 29);
            this.btnGravar.TabIndex = 10;
            this.btnGravar.Text = "Gravar";
            this.btnGravar.UseVisualStyleBackColor = true;
            this.btnGravar.Click += new System.EventHandler(this.btnGravar_Click);
            // 
            // btnProximo
            // 
            this.btnProximo.Location = new System.Drawing.Point(288, 188);
            this.btnProximo.Name = "btnProximo";
            this.btnProximo.Size = new System.Drawing.Size(63, 29);
            this.btnProximo.TabIndex = 11;
            this.btnProximo.Text = "Proximo";
            this.btnProximo.UseVisualStyleBackColor = true;
            this.btnProximo.Click += new System.EventHandler(this.btnProximo_Click);
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(219, 188);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(63, 29);
            this.btnExcluir.TabIndex = 12;
            this.btnExcluir.Text = "Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            this.btnExcluir.Click += new System.EventHandler(this.btnExcluir_Click);
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.ClientSize = new System.Drawing.Size(365, 229);
            this.Controls.Add(this.btnExcluir);
            this.Controls.Add(this.btnProximo);
            this.Controls.Add(this.btnGravar);
            this.Controls.Add(this.btnLimpar);
            this.Controls.Add(this.btnAnterior);
            this.Controls.Add(this.txtValor);
            this.Controls.Add(this.txtMarca);
            this.Controls.Add(this.txtNome);
            this.Controls.Add(this.txtCodigo);
            this.Controls.Add(this.lbValor);
            this.Controls.Add(this.lbMarca);
            this.Controls.Add(this.lbNome);
            this.Controls.Add(this.lbCodigo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form2";
            this.Text = "Novo Produto";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbCodigo;
        private System.Windows.Forms.Label lbNome;
        private System.Windows.Forms.Label lbMarca;
        private System.Windows.Forms.Label lbValor;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.TextBox txtMarca;
        private System.Windows.Forms.TextBox txtValor;
        private System.Windows.Forms.Button btnAnterior;
        private System.Windows.Forms.Button btnLimpar;
        private System.Windows.Forms.Button btnGravar;
        private System.Windows.Forms.Button btnProximo;
        private System.Windows.Forms.Button btnExcluir;
    }
}