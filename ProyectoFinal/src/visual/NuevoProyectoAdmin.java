package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logical.Cliente;
import logical.Contrato;
import logical.Designer;
import logical.Empresa;
import logical.JefeProyecto;
import logical.Planificador;
import logical.Programador;
import logical.Proyecto;
import logical.Trabajadores;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import com.toedter.calendar.JDateChooser;

public class NuevoProyectoAdmin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtCliente;
	private JTextField txtFind;
	private JTextField txtIDCont;
	private JTextField txtClienteCont;
	private JPanel panelContrato;
	private JPanel panelProyecto;
	private static ArrayList<Programador> proSeleccionables = new ArrayList<>();
	private static DefaultTableModel model;
	private static DefaultTableModel model2;
	private static Object[] fila;
	private static Object[] fila2;
	private static ArrayList<Trabajadores> tSelected = new ArrayList<>();
	private JTable tableDisp;
	private JTable tableSelected;
	private JComboBox cmbxTipo;
	private JComboBox cmbxLenguaje;
	private JTextPane txtPaneDesc;
	private Cliente cli;
	private JTextField textField;
	private Date fechaInicio;
	private Date fechaFinal;

	
	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NuevoProyectoAdmin dialog = new NuevoProyectoAdmin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevoProyectoAdmin() {
		setTitle("Nuevo Proyecto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoProyectoAdmin.class.getResource("/favicon.png")));
		setBounds(100, 100, 764, 559);
		String[] columnNamesdisp = {"Nombre", "Evaluación"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNamesdisp);
		String[] columnNamesSelected = {"Nombre", "Evaluación"};
		model2 = new DefaultTableModel();
		model2.setColumnIdentifiers(columnNamesSelected);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			 panelProyecto = new JPanel();
			panelProyecto.setLayout(null);
			panelProyecto.setBackground(Color.WHITE);
			panelProyecto.setBounds(12, 13, 726, 492);
			contentPanel.add(panelProyecto);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 51, 705, 170);
				panelProyecto.add(panel_1);
				{
					JLabel label = new JLabel("ID:");
					label.setBounds(12, 36, 26, 16);
					panel_1.add(label);
				}
				{
					txtID = new JTextField();
					txtID.setEditable(false);
					txtID.setColumns(10);
					txtID.setBackground(SystemColor.inactiveCaptionBorder);
					txtID.setBounds(90, 34, 116, 21);
					txtID.setText("P-" + (Empresa.getInstance().getMisProyectos().size() + 1));
					panel_1.add(txtID);
				}
				{
					JLabel label = new JLabel("Nombre:");
					label.setBounds(12, 65, 56, 16);
					panel_1.add(label);
				}
				{
					txtNombre = new JTextField();
					txtNombre.setColumns(10);
					txtNombre.setBackground(SystemColor.inactiveCaptionBorder);
					txtNombre.setBounds(90, 63, 225, 21);
					panel_1.add(txtNombre);
				}
				{
					JLabel label = new JLabel("Lenguaje:");
					label.setBounds(358, 65, 62, 16);
					panel_1.add(label);
				}
				{
					JComboBox cmbxLenguaje = new JComboBox();
					cmbxLenguaje.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							for (Trabajadores t : Empresa.getInstance().getMisTrabajadores()) {
								if(t instanceof Programador){
									Programador p = (Programador) t;
									if(p.getLenguajes().equalsIgnoreCase((String)cmbxLenguaje.getSelectedItem())){
										proSeleccionables.add(p);
									}
								}
							}
						}
					});
					cmbxLenguaje.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "C", "C++", "C#", "Java", "JavaScript", "Python"}));
					cmbxLenguaje.setBackground(SystemColor.inactiveCaptionBorder);
					cmbxLenguaje.setBounds(426, 63, 194, 21);
					panel_1.add(cmbxLenguaje);
				}
				{
					JLabel label = new JLabel("Descripci\u00F3n:");
					label.setBounds(12, 99, 75, 16);
					panel_1.add(label);
				}
				{
					JLabel label = new JLabel("Estado:");
					label.setBounds(358, 99, 56, 16);
					panel_1.add(label);
				}
				{
					JComboBox cmbxEstado = new JComboBox();
					cmbxEstado.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "En proceso"}));
					cmbxEstado.setBackground(SystemColor.inactiveCaptionBorder);
					cmbxEstado.setBounds(426, 97, 135, 21);
					panel_1.add(cmbxEstado);
				}
				{
					txtPaneDesc = new JTextPane();
					txtPaneDesc.setBackground(SystemColor.inactiveCaptionBorder);
					txtPaneDesc.setBounds(90, 97, 225, 60);
					panel_1.add(txtPaneDesc);
				}
				{
					JLabel label = new JLabel("Cliente:");
					label.setBounds(358, 34, 59, 16);
					panel_1.add(label);
				}
				{
					txtCliente = new JTextField();
					txtCliente.setEditable(false);
					txtCliente.setColumns(10);
					txtCliente.setBackground(SystemColor.inactiveCaptionBorder);
					txtCliente.setBounds(426, 33, 267, 21);
					panel_1.add(txtCliente);
				}
			}
			{
				JLabel label = new JLabel("C\u00E9dula Cliente: ");
				label.setBounds(12, 22, 91, 16);
				panelProyecto.add(label);
			}
			{
				txtFind = new JTextField();
				txtFind.setColumns(10);
				txtFind.setBounds(106, 20, 157, 21);
				panelProyecto.add(txtFind);
			}
			{
				JButton btnFind = new JButton("");
				btnFind.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cli = Empresa.getInstance().findClienteByCed(txtFind.getText());
						txtCliente.setText(cli.getNombre());
					}
				});
				Image find = new ImageIcon(this.getClass().getResource("/find.png")).getImage();
				btnFind.setIcon(new ImageIcon(find));
				btnFind.setBounds(268, 19, 33, 23);
				panelProyecto.add(btnFind);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(null, "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 229, 705, 164);
				panelProyecto.add(panel_1);
				{
					JLabel label = new JLabel("Tipo:");
					label.setBounds(12, 23, 38, 16);
					panel_1.add(label);
				}
				{
					cmbxTipo = new JComboBox();
					cmbxTipo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(cmbxTipo.getSelectedIndex()==1)
								loadTableJefesDisp();
							if(cmbxTipo.getSelectedIndex()==2)
								loadTableDiseDisp();
							if(cmbxTipo.getSelectedIndex()==3)
								loadTablePlanDisp();
							if(cmbxTipo.getSelectedIndex()==4)
								loadTablePrograDisp();
						}
					});
					cmbxTipo.setBackground(SystemColor.inactiveCaptionBorder);
					cmbxTipo.setBounds(62, 21, 159, 21);
					panel_1.add(cmbxTipo);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(12, 52, 307, 99);
					panel_1.add(scrollPane);
					
					tableDisp = new JTable();
					tableDisp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					tableDisp.setModel(model);
					scrollPane.setViewportView(tableDisp);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(386, 52, 307, 99);
					panel_1.add(scrollPane);
					{
						tableSelected = new JTable();
						tableSelected.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						tableSelected.setModel(model2);
						scrollPane.setViewportView(tableSelected);
					}
				}
				{
					JButton btnDer = new JButton("");
					btnDer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(tSelected.size() == 5){
								JOptionPane.showMessageDialog(null, "Máximo de trabajadores alcanzado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
							}else{
							int index = tableDisp.getSelectedRow();
							String nombre = (String) tableDisp.getModel().getValueAt(index, 0);
							Trabajadores t = Empresa.getInstance().findTrabajadorByNombre(nombre);
							tSelected.add(t);
							loadTableSelected();
							}
						}
					});
					Image der = new ImageIcon(this.getClass().getResource("/derTable.png")).getImage();
					btnDer.setIcon(new ImageIcon(der));
					btnDer.setBackground(SystemColor.inactiveCaptionBorder);
					btnDer.setBounds(336, 69, 38, 25);
					panel_1.add(btnDer);
				}
				{
					JButton btnIzq = new JButton("");
					btnIzq.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int index = tableSelected.getSelectedRow();
							String nombre = (String) tableSelected.getModel().getValueAt(index, 0);
							Trabajadores t = Empresa.getInstance().findTrabajadorByNombre(nombre);
							tSelected.remove(t);
							loadTableSelected();
						}
					});
					Image izq = new ImageIcon(this.getClass().getResource("/izqTable.png")).getImage();
					btnIzq.setIcon(new ImageIcon(izq));
					btnIzq.setBackground(SystemColor.inactiveCaptionBorder);
					btnIzq.setBounds(336, 107, 38, 25);
					panel_1.add(btnIzq);
				}
			}
			{
				JLabel label = new JLabel("");
				Image foot = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
				label.setIcon(new ImageIcon(foot));
				label.setBounds(15, 430, 260, 50);
				panelProyecto.add(label);
			}
			{
				JButton btnNext = new JButton("");
				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtCliente.getText().equalsIgnoreCase("") || txtNombre.getText().equalsIgnoreCase("") || cmbxLenguaje.getSelectedIndex() == 0 || txtPaneDesc.getText().equalsIgnoreCase("")){
							JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else if(tSelected.size() < 4){
							JOptionPane.showMessageDialog(null, "Seleccione al menos 4 trabajadores.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else{
						setBounds(100, 100, 520, 330);
						setLocationRelativeTo(null);
						setTitle("Nuevo contrato");
						panelProyecto.setEnabled(false);
						panelProyecto.setVisible(false);
						panelContrato.setEnabled(true);
						panelContrato.setVisible(true);
						}
					}
				});
				Image next1 = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
				btnNext.setIcon(new ImageIcon(next1));
				btnNext.setBackground(SystemColor.inactiveCaptionBorder);
				btnNext.setBounds(664, 406, 50, 55);
				panelProyecto.add(btnNext);
			}
			{
				JLabel label = new JLabel("Continuar");
				label.setBounds(661, 464, 56, 16);
				panelProyecto.add(label);
			}
			{
				JButton btnCancel = new JButton("");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				Image cancel = new ImageIcon(this.getClass().getResource("/cancel_button.png")).getImage();
				btnCancel.setIcon(new ImageIcon(cancel));
				btnCancel.setBackground(SystemColor.inactiveCaptionBorder);
				btnCancel.setBounds(342, 408, 64, 67);
				panelProyecto.add(btnCancel);
			}
			{
				JLabel label = new JLabel("Cancelar");
				label.setBounds(348, 472, 56, 16);
				panelProyecto.add(label);
			}
		}
		panelContrato = new JPanel();
		panelContrato.setEnabled(false);
		panelContrato.setVisible(false);
		panelContrato.setBounds(12, 13, 511, 271);
		contentPanel.add(panelContrato);
		panelContrato.setLayout(null);
		panelContrato.setBackground(Color.WHITE);
		{
			JLabel label = new JLabel("ID Contrato:");
			label.setBounds(12, 30, 76, 16);
			panelContrato.add(label);
		}
		{
			txtIDCont = new JTextField();
			txtIDCont.setEditable(false);
			txtIDCont.setColumns(10);
			txtIDCont.setBackground(SystemColor.inactiveCaptionBorder);
			txtIDCont.setBounds(94, 27, 131, 21);
			txtIDCont.setText("C-" + (Empresa.getInstance().getMisContratos().size() + 1));
			panelContrato.add(txtIDCont);
		}
		{
			JLabel label = new JLabel("Cliente: ");
			label.setBounds(251, 30, 48, 16);
			panelContrato.add(label);
		}
		{
			txtClienteCont = new JTextField();
			txtClienteCont.setEditable(false);
			txtClienteCont.setColumns(10);
			txtClienteCont.setBackground(SystemColor.inactiveCaptionBorder);
			txtClienteCont.setBounds(325, 27, 148, 21);
			panelContrato.add(txtClienteCont);
		}
		{
			JLabel label = new JLabel("Fecha Inicial:");
			label.setBounds(12, 63, 83, 16);
			panelContrato.add(label);
		}
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(94, 59, 131, 21);
		panelContrato.add(dateChooser);
		{
			JLabel label = new JLabel("Fecha Final: ");
			label.setBounds(251, 63, 74, 16);
			panelContrato.add(label);
		}
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(325, 59, 148, 21);
		panelContrato.add(dateChooser_1);
		{
			JLabel label = new JLabel("Proyecto: ");
			label.setBounds(12, 95, 64, 16);
			panelContrato.add(label);
		}
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 764, 559);
				setLocationRelativeTo(null);
				setTitle("Nuevo Proyecto");
				panelProyecto.setEnabled(true);
				panelProyecto.setVisible(true);
				panelContrato.setEnabled(false);
				panelContrato.setVisible(false);
			}
		});
		Image back = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
		btnBack.setIcon(new ImageIcon(back));
		btnBack.setBackground(SystemColor.inactiveCaptionBorder);
		btnBack.setBounds(15, 138, 50, 55);
		panelContrato.add(btnBack);
		{
			JLabel label = new JLabel("Anterior");
			label.setBounds(12, 196, 56, 16);
			panelContrato.add(label);
			
		}
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fechaInicio == null || fechaFinal == null){
					JOptionPane.showMessageDialog(null, "Por favor elija las fechas correspondientes.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					/////////////Proyecto///////////////
					String id = txtID.getText();
					String nombreProyecto = txtNombre.getText();
					String descripcion = txtPaneDesc.getText();
					String lenguaje = (String)cmbxLenguaje.getSelectedItem();
					String estado = null;
					
					Proyecto proyecto = new Proyecto(id, nombreProyecto, descripcion, tSelected, lenguaje, estado);
					cli.addProyecto(proyecto);
					Empresa.getInstance().getMisProyectos().add(proyecto);	
					/////////////Contrato///////////////
					
					String idcon  = txtIDCont.getText();
					fechaInicio = dateChooser.getDate();
					fechaFinal = dateChooser_1.getDate();
					long moto = 0;
					for (Trabajadores t : tSelected) {
						moto += t.getSalario();
					}
					int tiempo = (int) ((fechaFinal.getTime() - fechaInicio.getTime()) / (1000*60*60*24));
					long monto = (long) ((tiempo*model2.getRowCount()*8*moto)*1.15);
				
					Contrato contrato = new Contrato(fechaInicio, fechaFinal, idcon, cli, proyecto, monto);
					Empresa.getInstance().getMisContratos().add(contrato);	
					JOptionPane.showMessageDialog(null, "Operación Realizada Satisfactoriamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		Image save = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
		btnSave.setIcon(new ImageIcon(save));
		btnSave.setBackground(SystemColor.inactiveCaptionBorder);
		btnSave.setBounds(406, 126, 64, 67);
		panelContrato.add(btnSave);
		{
			JLabel label = new JLabel("Guardar");
			label.setBounds(417, 196, 56, 16);
			panelContrato.add(label);
			
		}
		JLabel label_1 = new JLabel("");
		Image foot = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
		label_1.setIcon(new ImageIcon(foot));
		label_1.setBounds(12, 217, 260, 50);
		panelContrato.add(label_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(94, 93, 131, 21);
		textField.setText("P-" + (Empresa.getInstance().getMisProyectos().size() + 1));
		panelContrato.add(textField);
		textField.setColumns(10);
		
	}
	public static void loadTableJefesDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Empresa.getInstance().getMisTrabajadores().size(); i++) {
			if(Empresa.getInstance().getMisTrabajadores().get(i) instanceof JefeProyecto){
				JefeProyecto jefe = (JefeProyecto) Empresa.getInstance().getMisTrabajadores().get(i);

					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
			}
			model.addRow(fila);
		}
		
	}
	public static void loadTableDiseDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Empresa.getInstance().getMisTrabajadores().size(); i++) {
			if(Empresa.getInstance().getMisTrabajadores().get(i) instanceof Designer){
				Designer jefe = (Designer) Empresa.getInstance().getMisTrabajadores().get(i);

					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
			}
			model.addRow(fila);
		}
		
	}
	public static void loadTablePlanDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Empresa.getInstance().getMisTrabajadores().size(); i++) {
			if(Empresa.getInstance().getMisTrabajadores().get(i) instanceof Planificador){
				Planificador jefe = (Planificador) Empresa.getInstance().getMisTrabajadores().get(i);
					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
			}
			model.addRow(fila);
		}
		
	}
	public static void loadTablePrograDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (Programador p : proSeleccionables) {
			if(p.getProyecto() == null){
				fila[0] = p.getNombre();
				fila[1] = p.getEvaluacion();
			}
			model.addRow(fila);
		}
		
	}
	public static void loadTableSelected(){
		model2.setRowCount(0);
		fila2 = new Object[model2.getColumnCount()];
		for (Trabajadores t : tSelected){
			fila2[0] = t.getNombre();
			fila2[1] = t.getEvaluacion();
			model2.addRow(fila2);
		}
	}
}
