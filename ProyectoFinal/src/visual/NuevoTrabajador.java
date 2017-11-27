package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoTrabajador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private DefaultTableModel model;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevoTrabajador dialog = new NuevoTrabajador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevoTrabajador() {
		setTitle("Nuevo Trabajador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoTrabajador.class.getResource("/favicon.png")));
		setBounds(100, 100, 657, 318);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.textHighlightText);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblId = new JLabel("ID: ");
				lblId.setBounds(12, 13, 39, 16);
				panel.add(lblId);
			}
			{
				textField = new JTextField();
				textField.setBackground(SystemColor.inactiveCaptionBorder);
				textField.setEditable(false);
				textField.setBounds(82, 13, 179, 21);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblCdula = new JLabel("C\u00E9dula:");
				lblCdula.setBounds(12, 52, 51, 16);
				panel.add(lblCdula);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBackground(SystemColor.inactiveCaptionBorder);
				textField_1.setColumns(10);
				textField_1.setBounds(82, 49, 201, 21);
				panel.add(textField_1);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(12, 83, 56, 16);
				panel.add(lblNombre);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBackground(SystemColor.inactiveCaptionBorder);
				textField_2.setColumns(10);
				textField_2.setBounds(82, 80, 201, 21);
				panel.add(textField_2);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
				lblDireccin.setBounds(12, 112, 61, 16);
				panel.add(lblDireccin);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBackground(SystemColor.inactiveCaptionBorder);
				textField_3.setColumns(10);
				textField_3.setBounds(82, 109, 201, 21);
				panel.add(textField_3);
			}
			{
				JLabel lblTelfono = new JLabel("Salario: ");
				lblTelfono.setBounds(343, 83, 61, 16);
				panel.add(lblTelfono);
			}
			{
				textField_4 = new JTextField();
				textField_4.setBackground(SystemColor.inactiveCaptionBorder);
				textField_4.setColumns(10);
				textField_4.setBounds(438, 81, 100, 21);
				panel.add(textField_4);
			}
			{
				JLabel lblEdad = new JLabel("Edad: ");
				lblEdad.setBounds(343, 52, 56, 16);
				panel.add(lblEdad);
			}
			
			textField_5 = new JTextField();
			textField_5.setBackground(SystemColor.inactiveCaptionBorder);
			textField_5.setBounds(438, 49, 67, 22);
			panel.add(textField_5);
			textField_5.setColumns(10);
			{
				JLabel lblRd = new JLabel("RD$");
				lblRd.setBounds(539, 83, 33, 16);
				panel.add(lblRd);
			}
			{
				JLabel lblEvaluacin = new JLabel("Evaluaci\u00F3n: ");
				lblEvaluacin.setBounds(12, 141, 69, 16);
				panel.add(lblEvaluacin);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(SystemColor.inactiveCaptionBorder);
				comboBox.setEnabled(false);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sin evaluar (Por defecto)"}));
				comboBox.setBounds(82, 139, 179, 21);
				panel.add(comboBox);
			}
			{
				JLabel lblEspecializacin = new JLabel("Especializaci\u00F3n:");
				lblEspecializacin.setBounds(343, 112, 96, 16);
				panel.add(lblEspecializacin);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(SystemColor.inactiveCaptionBorder);
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Jefe de Proyecto", "Dise\u00F1ador", "Programador", "Planificador"}));
				comboBox.setBounds(438, 110, 179, 21);
				panel.add(comboBox);
			}
			{
				{
					String[] columnNames = {"ID","Cédula","Nombre","Especialización"};
					model = new DefaultTableModel();
					model.setColumnIdentifiers(columnNames);
				}
			}
			{
				JLabel lblFrecuenciaDe = new JLabel("Frecuencia:  ");
				lblFrecuenciaDe.setBounds(343, 141, 83, 16);
				panel.add(lblFrecuenciaDe);
			}
			{
				textField_6 = new JTextField();
				textField_6.setBackground(SystemColor.inactiveCaptionBorder);
				textField_6.setColumns(10);
				textField_6.setBounds(438, 138, 67, 22);
				panel.add(textField_6);
			}
			{
				JLabel lblNewLabel = new JLabel("d\u00EDas");
				lblNewLabel.setBounds(508, 141, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblLenguaje = new JLabel("Lenguaje: ");
				lblLenguaje.setEnabled(false);
				lblLenguaje.setBounds(343, 141, 61, 16);
				panel.add(lblLenguaje);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(SystemColor.inactiveCaptionBorder);
				comboBox.setEnabled(false);
				comboBox.setBounds(438, 139, 179, 21);
				panel.add(comboBox);
			}
			{
				JLabel label = new JLabel("");
				Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
				label.setIcon(new ImageIcon(footimage));
				label.setBounds(12, 207, 260, 50);
				panel.add(label);
			}
			{
				JButton btnSave = new JButton("");
				btnSave.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				Image save = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
				btnSave.setIcon(new ImageIcon(save));
				btnSave.setBackground(SystemColor.inactiveCaptionBorder);
				btnSave.setBounds(550, 173, 64, 67);
				panel.add(btnSave);
			}
			{
				JLabel label = new JLabel("Guardar");
				label.setBounds(561, 243, 56, 16);
				panel.add(label);
			}
			{
				JButton btnSalir = new JButton("");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				Image salir = new ImageIcon(this.getClass().getResource("/cancel_button.png")).getImage();
				btnSalir.setIcon(new ImageIcon(salir));
				btnSalir.setBackground(SystemColor.inactiveCaptionBorder);
				btnSalir.setBounds(438, 173, 64, 67);
				panel.add(btnSalir);
			}
			{
				JLabel lblCancelar = new JLabel("Cancelar");
				lblCancelar.setBounds(442, 243, 56, 16);
				panel.add(lblCancelar);
			}
		}
	}
}
