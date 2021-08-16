
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.lbNomeP = new System.Windows.Forms.Label();
            this.lbIngredientes = new System.Windows.Forms.Label();
            this.lbValorPB = new System.Windows.Forms.Label();
            this.lbValorPM = new System.Windows.Forms.Label();
            this.txtNameP = new System.Windows.Forms.TextBox();
            this.textIngredientes = new System.Windows.Forms.TextBox();
            this.intValorB = new System.Windows.Forms.NumericUpDown();
            this.intValorM = new System.Windows.Forms.NumericUpDown();
            this.button1 = new System.Windows.Forms.Button();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.cadastroToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.novoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.editarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.sairToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            ((System.ComponentModel.ISupportInitialize)(this.intValorB)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.intValorM)).BeginInit();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lbNomeP
            // 
            this.lbNomeP.AutoSize = true;
            this.lbNomeP.Location = new System.Drawing.Point(15, 53);
            this.lbNomeP.Name = "lbNomeP";
            this.lbNomeP.Size = new System.Drawing.Size(69, 15);
            this.lbNomeP.TabIndex = 0;
            this.lbNomeP.Text = "Nome Pizza";
            // 
            // lbIngredientes
            // 
            this.lbIngredientes.AutoSize = true;
            this.lbIngredientes.Location = new System.Drawing.Point(12, 96);
            this.lbIngredientes.Name = "lbIngredientes";
            this.lbIngredientes.Size = new System.Drawing.Size(72, 15);
            this.lbIngredientes.TabIndex = 1;
            this.lbIngredientes.Text = "Ingredientes";
            // 
            // lbValorPB
            // 
            this.lbValorPB.AutoSize = true;
            this.lbValorPB.Location = new System.Drawing.Point(10, 142);
            this.lbValorPB.Name = "lbValorPB";
            this.lbValorPB.Size = new System.Drawing.Size(94, 15);
            this.lbValorPB.TabIndex = 2;
            this.lbValorPB.Text = "Valor Pizza Broto";
            // 
            // lbValorPM
            // 
            this.lbValorPM.AutoSize = true;
            this.lbValorPM.Location = new System.Drawing.Point(6, 185);
            this.lbValorPM.Name = "lbValorPM";
            this.lbValorPM.Size = new System.Drawing.Size(98, 15);
            this.lbValorPM.TabIndex = 3;
            this.lbValorPM.Text = "Valor Pizza Media";
            // 
            // txtNameP
            // 
            this.txtNameP.Location = new System.Drawing.Point(90, 50);
            this.txtNameP.Name = "txtNameP";
            this.txtNameP.Size = new System.Drawing.Size(116, 23);
            this.txtNameP.TabIndex = 4;
            // 
            // textIngredientes
            // 
            this.textIngredientes.Location = new System.Drawing.Point(90, 93);
            this.textIngredientes.Name = "textIngredientes";
            this.textIngredientes.Size = new System.Drawing.Size(180, 23);
            this.textIngredientes.TabIndex = 5;
            // 
            // intValorB
            // 
            this.intValorB.Location = new System.Drawing.Point(110, 140);
            this.intValorB.Name = "intValorB";
            this.intValorB.Size = new System.Drawing.Size(69, 23);
            this.intValorB.TabIndex = 6;
            // 
            // intValorM
            // 
            this.intValorM.Location = new System.Drawing.Point(110, 183);
            this.intValorM.Name = "intValorM";
            this.intValorM.Size = new System.Drawing.Size(69, 23);
            this.intValorM.TabIndex = 7;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(134, 330);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(85, 30);
            this.button1.TabIndex = 8;
            this.button1.Text = "Cadastrar";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.cadastroToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(327, 24);
            this.menuStrip1.TabIndex = 9;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // cadastroToolStripMenuItem
            // 
            this.cadastroToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.novoToolStripMenuItem,
            this.editarToolStripMenuItem,
            this.toolStripSeparator1,
            this.sairToolStripMenuItem});
            this.cadastroToolStripMenuItem.Name = "cadastroToolStripMenuItem";
            this.cadastroToolStripMenuItem.Size = new System.Drawing.Size(66, 20);
            this.cadastroToolStripMenuItem.Text = "Cadastro";
            // 
            // novoToolStripMenuItem
            // 
            this.novoToolStripMenuItem.Name = "novoToolStripMenuItem";
            this.novoToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.novoToolStripMenuItem.Text = "Novo";
            // 
            // editarToolStripMenuItem
            // 
            this.editarToolStripMenuItem.Name = "editarToolStripMenuItem";
            this.editarToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.editarToolStripMenuItem.Text = "Editar";
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(177, 6);
            // 
            // sairToolStripMenuItem
            // 
            this.sairToolStripMenuItem.Name = "sairToolStripMenuItem";
            this.sairToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.sairToolStripMenuItem.Text = "Sair";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(327, 372);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.intValorM);
            this.Controls.Add(this.intValorB);
            this.Controls.Add(this.textIngredientes);
            this.Controls.Add(this.txtNameP);
            this.Controls.Add(this.lbValorPM);
            this.Controls.Add(this.lbValorPB);
            this.Controls.Add(this.lbIngredientes);
            this.Controls.Add(this.lbNomeP);
            this.Controls.Add(this.menuStrip1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Pizzaria";
            ((System.ComponentModel.ISupportInitialize)(this.intValorB)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.intValorM)).EndInit();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbNomeP;
        private System.Windows.Forms.Label lbIngredientes;
        private System.Windows.Forms.Label lbValorPB;
        private System.Windows.Forms.Label lbValorPM;
        private System.Windows.Forms.TextBox txtNameP;
        private System.Windows.Forms.TextBox textIngredientes;
        private System.Windows.Forms.NumericUpDown intValorB;
        private System.Windows.Forms.NumericUpDown intValorM;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem cadastroToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem novoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem editarToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem sairToolStripMenuItem;
    }
}