package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logical.Designer;
import logical.Empresa;
import logical.JefeProyecto;
import logical.Planificador;
import logical.Programador;
import logical.Proyecto;
import logical.Trabajadores;


import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NuevoTrabajador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIDWorker;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtSalario;
	private JTextField txtEdad;
	private DefaultTableModel model;
	private JTextField txtFrecuencia;
	private JLabel lblFrecuenciaDe;
	private JLabel lblDias;
	private JLabel lblLenguaje;
	private JComboBox cmbxLenguaje;
	private Trabajadores trab;
	private Designer WDis;
	private JefeProyecto WJefe;
	private Planificador WPlan;
	private Programador WProg;
	private JComboBox cmbxEspecializacion;
	private JComboBox cmbxSexo;

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
				txtIDWorker = new JTextField();
				txtIDWorker.setBackground(SystemColor.inactiveCaptionBorder);
				txtIDWorker.setEditable(false);
				txtIDWorker.setBounds(82, 13, 179, 21);
				txtIDWorker.setText("W-" + (Empresa.getInstance().getMisTrabajadores().size() + 1));
				panel.add(txtIDWorker);
				txtIDWorker.setColumns(10);
			}
			{
				JLabel lblCdula = new JLabel("C\u00E9dula:");
				lblCdula.setBounds(12, 52, 51, 16);
				panel.add(lblCdula);
			}
			{
				txtCedula = new JTextField();
				txtCedula.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
					      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != '-')){
					         e.consume();
					      }
					}
				});
				txtCedula.setBackground(SystemColor.inactiveCaptionBorder);
				txtCedula.setColumns(10);
				txtCedula.setBounds(82, 49, 201, 21);
				panel.add(txtCedula);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(12, 83, 56, 16);
				panel.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBackground(SystemColor.inactiveCaptionBorder);
				txtNombre.setColumns(10);
				txtNombre.setBounds(82, 80, 201, 21);
				panel.add(txtNombre);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
				lblDireccin.setBounds(12, 112, 61, 16);
				panel.add(lblDireccin);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setBackground(SystemColor.inactiveCaptionBorder);
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(82, 109, 201, 21);
				panel.add(txtDireccion);
			}
			{
				JLabel lblTelfono = new JLabel("Salario: ");
				lblTelfono.setBounds(343, 83, 61, 16);
				panel.add(lblTelfono);
			}
			{
				txtSalario = new JTextField();
				txtSalario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
					      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b')){
					         e.consume();
					      }
					}
				});
				txtSalario.setBackground(SystemColor.inactiveCaptionBorder);
				txtSalario.setColumns(10);
				txtSalario.setBounds(438, 81, 100, 21);
				panel.add(txtSalario);
			}
			{
				JLabel lblEdad = new JLabel("Edad: ");
				lblEdad.setBounds(343, 52, 56, 16);
				panel.add(lblEdad);
			}
			
			txtEdad = new JTextField();
			txtEdad.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char caracter = e.getKeyChar();
				      if(((caracter < '0') || (caracter > '9')) && ((caracter != '\b'))){
				         e.consume();
				      }
				}
			});
			txtEdad.setBackground(SystemColor.inactiveCaptionBorder);
			txtEdad.setBounds(438, 49, 39, 22);
			panel.add(txtEdad);
			txtEdad.setColumns(10);
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
				JComboBox cmbxEvaluacion = new JComboBox();
				cmbxEvaluacion.setBackground(SystemColor.inactiveCaptionBorder);
				cmbxEvaluacion.setEnabled(false);
				cmbxEvaluacion.setModel(new DefaultComboBoxModel(new String[] {"Sin evaluar (Por defecto)"}));
				cmbxEvaluacion.setBounds(82, 139, 179, 21);
				panel.add(cmbxEvaluacion);
			}
			{
				JLabel lblEspecializacin = new JLabel("Especializaci\u00F3n:");
				lblEspecializacin.setBounds(343, 112, 96, 16);
				panel.add(lblEspecializacin);
			}
			{
				cmbxEspecializacion = new JComboBox();
				cmbxEspecializacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(cmbxEspecializacion.getSelectedIndex() == 3){
							lblLenguaje.setEnabled(true);
							lblLenguaje.setVisible(true);
							cmbxLenguaje.setVisible(true);
							cmbxLenguaje.setEnabled(true);
							
							lblFrecuenciaDe.setEnabled(false);
							lblFrecuenciaDe.setVisible(false);
							txtFrecuencia.setVisible(false);
							txtFrecuencia.setEnabled(false);
							lblDias.setVisible(false);
							lblDias.setEnabled(false);
						}
						else if(cmbxEspecializacion.getSelectedIndex() == 4){
							lblFrecuenciaDe.setEnabled(true);
							lblFrecuenciaDe.setVisible(true);
							txtFrecuencia.setVisible(true);
							txtFrecuencia.setEnabled(true);
							lblDias.setVisible(true);
							lblDias.setEnabled(true);
							
							lblLenguaje.setEnabled(false);
							lblLenguaje.setVisible(false);
							cmbxLenguaje.setVisible(false);
							cmbxLenguaje.setEnabled(false);
							
						}
						else{
							lblFrecuenciaDe.setEnabled(false);
							lblFrecuenciaDe.setVisible(false);
							txtFrecuencia.setVisible(false);
							txtFrecuencia.setEnabled(false);
							lblDias.setVisible(false);
							lblDias.setEnabled(false);
							lblLenguaje.setEnabled(false);
							lblLenguaje.setVisible(false);
							cmbxLenguaje.setVisible(false);
							cmbxLenguaje.setEnabled(false);
						}
					}
				});
				cmbxEspecializacion.setBackground(SystemColor.inactiveCaptionBorder);
				cmbxEspecializacion.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Jefe de Proyecto", "Dise\u00F1ador", "Programador", "Planificador"}));
				cmbxEspecializacion.setBounds(438, 110, 179, 21);
				panel.add(cmbxEspecializacion);
			}
			{
				{
					String[] columnNames = {"ID","Cédula","Nombre","Especialización"};
					model = new DefaultTableModel();
					model.setColumnIdentifiers(columnNames);
				}
			}
			{
				lblFrecuenciaDe = new JLabel("Frecuencia:  ");
				lblFrecuenciaDe.setBounds(343, 141, 83, 16);
				lblFrecuenciaDe.setVisible(false);
				lblFrecuenciaDe.setEnabled(false);
				panel.add(lblFrecuenciaDe);
			}
			{
				txtFrecuencia = new JTextField();
				txtFrecuencia.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char caracter = e.getKeyChar();
					      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b')){
					         e.consume();
					      }
					}
				});
				txtFrecuencia.setBackground(SystemColor.inactiveCaptionBorder);
				txtFrecuencia.setColumns(10);
				txtFrecuencia.setVisible(false);
				txtFrecuencia.setEnabled(false);
				txtFrecuencia.setBounds(438, 138, 67, 22);
				panel.add(txtFrecuencia);
			}
			{
				lblDias = new JLabel("d\u00EDas");
				lblDias.setBounds(508, 141, 56, 16);
				lblDias.setVisible(false);
				lblDias.setEnabled(false);
				panel.add(lblDias);
			}
			{
				lblLenguaje = new JLabel("Lenguaje: ");
				lblLenguaje.setEnabled(false);
				lblLenguaje.setVisible(false);
				lblLenguaje.setBounds(343, 141, 61, 16);
				panel.add(lblLenguaje);
			}
			{
				cmbxLenguaje = new JComboBox();
				cmbxLenguaje.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "C", "C++", "C#", "Java", "JavaScript", "Python"}));
				cmbxLenguaje.setBackground(SystemColor.inactiveCaptionBorder);
				cmbxLenguaje.setEnabled(false);
				cmbxLenguaje.setVisible(false);
				cmbxLenguaje.setBounds(438, 139, 179, 21);
				panel.add(cmbxLenguaje);
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
						if(txtCedula.getText().equalsIgnoreCase("") || txtNombre.getText().equalsIgnoreCase("") || txtEdad.getText().equalsIgnoreCase("") || txtDireccion.getText().equalsIgnoreCase("") || txtSalario.getText().equalsIgnoreCase("") || cmbxEspecializacion.getSelectedIndex() == 0){
							JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos.", "ERROR", JOptionPane.WARNING_MESSAGE);
						}else if(Integer.valueOf(txtEdad.getText()) < 18 || Integer.valueOf(txtEdad.getText()) > 50){
							JOptionPane.showMessageDialog(null, "Edad del trabajador fuera del rango aceptable (18-50).", "ERROR", JOptionPane.WARNING_MESSAGE);
						}
						else{
						if(cmbxEspecializacion.getSelectedIndex() == 1){
							
							String id = txtIDWorker.getText();
							String cedula = txtCedula.getText();
							String nombre = txtNombre.getText();
							String direccion = txtDireccion.getText();
							String sexo = (String) cmbxSexo.getSelectedItem();
							Integer edad = Integer.valueOf(txtEdad.getText());
							Long salario  = Long.valueOf(txtSalario.getText());
							String evaluacion = "Sin Evaluar";
							int cantWorker = 0;
							ArrayList<Proyecto> misProyectos = null;
							JefeProyecto jefe = new JefeProyecto(id, cedula, nombre, direccion, sexo, edad, salario, evaluacion, cantWorker, misProyectos);
							Empresa.getInstance().getMisTrabajadores().add(jefe);
							System.out.println(jefe.getCedula());
						}
						
						if(cmbxEspecializacion.getSelectedIndex() == 2){
							
							String id = txtIDWorker.getText();
							String cedula = txtCedula.getText();
							String nombre = txtNombre.getText();
							String direccion = txtDireccion.getText();
							String sexo = (String) cmbxSexo.getSelectedItem();
							Integer edad = Integer.valueOf(txtEdad.getText());
							Long salario  = Long.valueOf(txtSalario.getText());
							String evaluacion = "Sin Evaluar";
							ArrayList<Proyecto> misProyectos = null;
							Designer des = new Designer(id, cedula, nombre, direccion, sexo, edad, salario, evaluacion, misProyectos);
							Empresa.getInstance().getMisTrabajadores().add(des);
							
						}
						
						if(cmbxEspecializacion.getSelectedIndex() == 3){
							if(cmbxLenguaje.getSelectedIndex() == 0){
								JOptionPane.showMessageDialog(null, "Seleccione lenguaje del programador.", "ERROR", JOptionPane.WARNING_MESSAGE);
							}else{
							String id = txtIDWorker.getText();
							String cedula = txtCedula.getText();
							String nombre = txtNombre.getText();
							String direccion = txtDireccion.getText();
							String sexo = (String) cmbxSexo.getSelectedItem();
							Integer edad = Integer.valueOf(txtEdad.getText());
							Long salario  = Long.valueOf(txtSalario.getText());
							String evaluacion = "Sin Evaluar";
							String lenguajes = (String) cmbxLenguaje.getSelectedItem();
							Proyecto proyecto = null;
							Programador prog = new Programador(id, cedula, nombre, direccion, sexo, edad, salario, evaluacion, lenguajes, proyecto);
							Empresa.getInstance().getMisTrabajadores().add(prog);
							}
						}
						
						if(cmbxEspecializacion.getSelectedIndex() == 4){
							if(txtFrecuencia.getText().equalsIgnoreCase("")){
								JOptionPane.showMessageDialog(null, "Ingrese la frecuencia del planificador.", "ERROR", JOptionPane.WARNING_MESSAGE);
							}else{
							String id = txtIDWorker.getText();
							String cedula = txtCedula.getText();
							String nombre = txtNombre.getText();
							String direccion = txtDireccion.getText();
							String sexo = (String) cmbxSexo.getSelectedItem();
							Integer edad = Integer.valueOf(txtEdad.getText());
							Long salario  = Long.valueOf(txtSalario.getText());
							String evaluacion = "Sin Evaluar";
							Integer diasFrecuencia = Integer.valueOf(txtFrecuencia.getText());
							ArrayList<Proyecto> misProyectos = null;
							Planificador plan = new Planificador(id, cedula, nombre, direccion, sexo, edad, salario, evaluacion, diasFrecuencia, misProyectos);
							Empresa.getInstance().getMisTrabajadores().add(plan);
							}
						}
						JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						}
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
			{
				JLabel lblSexo = new JLabel("Sexo:");
				lblSexo.setBounds(489, 52, 39, 16);
				panel.add(lblSexo);
			}
			{
				cmbxSexo = new JComboBox();
				cmbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Elegir>", "M", "F"}));
				cmbxSexo.setBackground(SystemColor.inactiveCaptionBorder);
				cmbxSexo.setBounds(534, 50, 83, 21);
				panel.add(cmbxSexo);
			}
		}
	}
}
