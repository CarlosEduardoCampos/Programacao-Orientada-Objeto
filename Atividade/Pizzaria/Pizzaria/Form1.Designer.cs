
namespace Pizzaria
{
    partial class Form1
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
            this.btnLimpar = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.textIngredientes = new System.Windows.Forms.TextBox();
            this.txtNameP = new System.Windows.Forms.TextBox();
            this.lbValorPM = new System.Windows.Forms.Label();
            this.lbValorPB = new System.Windows.Forms.Label();
            this.lbIngredientes = new System.Windows.Forms.Label();
            this.lbNomeP = new System.Windows.Forms.Label();
            this.intValorB = new System.Windows.Forms.TextBox();
            this.IntValorM = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btnLimpar
            // 
            this.btnLimpar.Location = new System.Drawing.Point(104, 150);
            this.btnLimpar.Name = "btnLimpar";
            this.btnLimpar.Size = new System.Drawing.Size(74, 31);
            this.btnLimpar.TabIndex = 19;
            this.btnLimpar.Text = "Limpar";
            this.btnLimpar.UseVisualStyleBackColor = true;
            this.btnLimpar.Click += new System.EventHandler(this.btnLimpar_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(24, 150);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(74, 31);
            this.button1.TabIndex = 18;
            this.button1.Text = "Cadastrar";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // textIngredientes
            // 
            this.textIngredientes.Location = new System.Drawing.Point(184, 36);
            this.textIngredientes.Name = "textIngredientes";
            this.textIngredientes.Size = new System.Drawing.Size(244, 23);
            this.textIngredientes.TabIndex = 17;
            // 
            // txtNameP
            // 
            this.txtNameP.Location = new System.Drawing.Point(24, 36);
            this.txtNameP.Name = "txtNameP";
            this.txtNameP.Size = new System.Drawing.Size(154, 23);
            this.txtNameP.TabIndex = 16;
            // 
            // lbValorPM
            // 
            this.lbValorPM.AutoSize = true;
            this.lbValorPM.Location = new System.Drawing.Point(142, 75);
            this.lbValorPM.Name = "lbValorPM";
            this.lbValorPM.Size = new System.Drawing.Size(98, 15);
            this.lbValorPM.TabIndex = 15;
            this.lbValorPM.Text = "Valor Pizza Media";
            // 
            // lbValorPB
            // 
            this.lbValorPB.AutoSize = true;
            this.lbValorPB.Location = new System.Drawing.Point(24, 75);
            this.lbValorPB.Name = "lbValorPB";
            this.lbValorPB.Size = new System.Drawing.Size(94, 15);
            this.lbValorPB.TabIndex = 14;
            this.lbValorPB.Text = "Valor Pizza Broto";
            // 
            // lbIngredientes
            // 
            this.lbIngredientes.AutoSize = true;
            this.lbIngredientes.Location = new System.Drawing.Point(184, 18);
            this.lbIngredientes.Name = "lbIngredientes";
            this.lbIngredientes.Size = new System.Drawing.Size(72, 15);
            this.lbIngredientes.TabIndex = 13;
            this.lbIngredientes.Text = "Ingredientes";
            // 
            // lbNomeP
            // 
            this.lbNomeP.AutoSize = true;
            this.lbNomeP.Location = new System.Drawing.Point(24, 18);
            this.lbNomeP.Name = "lbNomeP";
            this.lbNomeP.Size = new System.Drawing.Size(69, 15);
            this.lbNomeP.TabIndex = 12;
            this.lbNomeP.Text = "Nome Pizza";
            // 
            // intValorB
            // 
            this.intValorB.Location = new System.Drawing.Point(24, 93);
            this.intValorB.Name = "intValorB";
            this.intValorB.Size = new System.Drawing.Size(94, 23);
            this.intValorB.TabIndex = 20;
            // 
            // IntValorM
            // 
            this.IntValorM.Location = new System.Drawing.Point(142, 93);
            this.IntValorM.Name = "IntValorM";
            this.IntValorM.Size = new System.Drawing.Size(98, 23);
            this.IntValorM.TabIndex = 21;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(473, 208);
            this.Controls.Add(this.IntValorM);
            this.Controls.Add(this.intValorB);
            this.Controls.Add(this.btnLimpar);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.textIngredientes);
            this.Controls.Add(this.txtNameP);
            this.Controls.Add(this.lbValorPM);
            this.Controls.Add(this.lbValorPB);
            this.Controls.Add(this.lbIngredientes);
            this.Controls.Add(this.lbNomeP);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnLimpar;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox textIngredientes;
        private System.Windows.Forms.TextBox txtNameP;
        private System.Windows.Forms.Label lbValorPM;
        private System.Windows.Forms.Label lbValorPB;
        private System.Windows.Forms.Label lbIngredientes;
        private System.Windows.Forms.Label lbNomeP;
        private System.Windows.Forms.TextBox intValorB;
        private System.Windows.Forms.TextBox IntValorM;
    }
}