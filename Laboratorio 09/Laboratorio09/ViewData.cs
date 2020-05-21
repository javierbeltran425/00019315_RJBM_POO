using System;
using System.Windows.Forms;

namespace Laboratorio09
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se pueden dejar campos vacios");
            }
            else
            {
                try
                {
                    var dt = ConectionDB.ExecuteQuery($"SELECT mat.idMateria, mat.nombre " +
                                                      $"FROM INSCRIPCION ins, MATERIA mat, ESTUDIANTE est " +
                                                      $"WHERE ins.carnet = '{textBox1.Text}' " + 
                                                      $"AND ins.carnet = est.carnet " +
                                                      $"AND ins.idMateria = mat.idMateria ");

                    dataGridView1.DataSource = dt;
                    MessageBox.Show("Datos obtenidos exitosamente");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ha ocurrido un problema");
                }
            }
        }
    }
}