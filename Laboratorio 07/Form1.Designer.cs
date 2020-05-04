namespace Laboratorio_07
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
            this.label1 = new System.Windows.Forms.Label();
            this.buttonRed = new System.Windows.Forms.Button();
            this.buttonBlue = new System.Windows.Forms.Button();
            this.buttonGreen = new System.Windows.Forms.Button();
            this.buttonChangeText = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.buttonDataBox1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Showcard Gothic", 20.25F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.label1.Location = new System.Drawing.Point(12, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(500, 54);
            this.label1.TabIndex = 0;
            this.label1.Text = "Presiona un boton";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // buttonRed
            // 
            this.buttonRed.BackColor = System.Drawing.Color.White;
            this.buttonRed.Location = new System.Drawing.Point(26, 320);
            this.buttonRed.Name = "buttonRed";
            this.buttonRed.Size = new System.Drawing.Size(128, 48);
            this.buttonRed.TabIndex = 1;
            this.buttonRed.Text = "Rojo";
            this.buttonRed.UseVisualStyleBackColor = false;
            this.buttonRed.Click += new System.EventHandler(this.buttonRed_Click);
            // 
            // buttonBlue
            // 
            this.buttonBlue.BackColor = System.Drawing.Color.White;
            this.buttonBlue.Location = new System.Drawing.Point(196, 320);
            this.buttonBlue.Name = "buttonBlue";
            this.buttonBlue.Size = new System.Drawing.Size(128, 48);
            this.buttonBlue.TabIndex = 2;
            this.buttonBlue.Text = "Azul";
            this.buttonBlue.UseVisualStyleBackColor = false;
            this.buttonBlue.Click += new System.EventHandler(this.button2_Click);
            // 
            // buttonGreen
            // 
            this.buttonGreen.BackColor = System.Drawing.Color.White;
            this.buttonGreen.Location = new System.Drawing.Point(359, 320);
            this.buttonGreen.Name = "buttonGreen";
            this.buttonGreen.Size = new System.Drawing.Size(128, 48);
            this.buttonGreen.TabIndex = 3;
            this.buttonGreen.Text = "Verde";
            this.buttonGreen.UseVisualStyleBackColor = false;
            this.buttonGreen.Click += new System.EventHandler(this.buttonGreen_Click);
            // 
            // buttonChangeText
            // 
            this.buttonChangeText.BackColor = System.Drawing.Color.White;
            this.buttonChangeText.Location = new System.Drawing.Point(359, 99);
            this.buttonChangeText.Name = "buttonChangeText";
            this.buttonChangeText.Size = new System.Drawing.Size(128, 48);
            this.buttonChangeText.TabIndex = 4;
            this.buttonChangeText.Text = "Cambiar color";
            this.buttonChangeText.UseVisualStyleBackColor = false;
            this.buttonChangeText.Click += new System.EventHandler(this.buttonChangeText_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(26, 113);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(298, 23);
            this.textBox1.TabIndex = 5;
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(26, 173);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(461, 23);
            this.comboBox1.TabIndex = 6;
            // 
            // buttonDataBox1
            // 
            this.buttonDataBox1.BackColor = System.Drawing.Color.White;
            this.buttonDataBox1.Location = new System.Drawing.Point(132, 202);
            this.buttonDataBox1.Name = "buttonDataBox1";
            this.buttonDataBox1.Size = new System.Drawing.Size(256, 28);
            this.buttonDataBox1.TabIndex = 7;
            this.buttonDataBox1.Text = "Cambiar color";
            this.buttonDataBox1.UseVisualStyleBackColor = false;
            this.buttonDataBox1.Click += new System.EventHandler(this.buttonDataBox1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(524, 422);
            this.Controls.Add(this.buttonDataBox1);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.buttonChangeText);
            this.Controls.Add(this.buttonGreen);
            this.Controls.Add(this.buttonBlue);
            this.Controls.Add(this.buttonRed);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button buttonGreen;
        private System.Windows.Forms.Button buttonBlue;
        private System.Windows.Forms.Button buttonRed;
        private System.Windows.Forms.Button buttonChangeText;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Button buttonDataBox1;
    }
}