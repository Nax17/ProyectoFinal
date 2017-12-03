package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.security.ntlm.Client;

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
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;

public class NuevosDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtIDCli;
	private DefaultTableModel cli;
	private JTextField txtIDProy;
	private JTextField txtNombrePro;
	private JTextField txtCliente;
	private JPanel panelProyecto;
	private JPanel panelCliente;
	private JTextField txtIDCont;
	private JTextField txtClienteCont;
	private JTextField txtFechaIni;
	private JTextField txtFechaFin;
	private JPanel panelContrato;
	private JTable tableDisp;
	private JTable tableSelected;
	private JComboBox cmbxTipo;
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private Date fechaActual = new Date();
	private static DefaultTableModel model;
	private static DefaultTableModel model2;
	private static Object[] fila;
	private static Object[] fila2;
	private static ArrayList<Trabajadores> tSelected = new ArrayList<>();
	ArrayList<Proyecto> pro = new ArrayList<>();
	ArrayList<Contrato> cont = new ArrayList<>();
	private JTextField txtProyecto;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevosDatos dialog = new NuevosDatos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevosDatos() {
		setTitle("Nuevo Cliente");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevosDatos.class.getResource("/favicon.png")));
		setBounds(100, 100, 510, 330);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.textHighlightText);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		Image back2 = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
		Image save = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
		Image logo2 = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
		Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
		Image nextimage = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
		String[] columnNames = {"ID","Cédula","Nombre"};
		cli = new DefaultTableModel();
		cli.setColumnIdentifiers(columnNames);
		String[] columnNamesdisp = {"Nombre", "Evaluación"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNamesdisp);
		String[] columnNamesSelected = {"Nombre", "Evaluación"};
		model2 = new DefaultTableModel();
		model2.setColumnIdentifiers(columnNamesSelected);
		
		panelCliente = new JPanel();
		panelCliente.setBackground(SystemColor.textHighlightText);
		panelCliente.setBounds(0, 0, 492, 409);
		contentPanel.add(panelCliente);
		panelCliente.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 13, 470, 188);
		panelCliente.add(panel);
		
		JLabel label = new JLabel("C\u00E9dula:");
		label.setBounds(25, 72, 56, 16);
		panel.add(label);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBackground(SystemColor.inactiveCaptionBorder);
		txtCedula.setBounds(93, 68, 350, 21);
		panel.add(txtCedula);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(25, 105, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Direcci\u00F3n: ");
		label_2.setBounds(25, 140, 68, 16);
		panel.add(label_2);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBackground(SystemColor.inactiveCaptionBorder);
		txtNombre.setBounds(93, 102, 350, 21);
		panel.add(txtNombre);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBackground(SystemColor.inactiveCaptionBorder);
		txtDireccion.setBounds(93, 138, 350, 21);
		panel.add(txtDireccion);
		
		JLabel label_3 = new JLabel("ID:");
		label_3.setBounds(25, 36, 25, 16);
		panel.add(label_3);
		
		txtIDCli = new JTextField();
		txtIDCli.setEditable(false);
		txtIDCli.setColumns(10);
		txtIDCli.setBackground(SystemColor.inactiveCaptionBorder);
		txtIDCli.setBounds(96, 33, 99, 21);
		txtIDCli.setText("CL-" + Empresa.getInstance().getMisClientes().size() + 1);
		panel.add(txtIDCli);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(footimage));
		label_4.setBounds(12, 238, 260, 50);
		panelCliente.add(label_4);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBounds(100, 100, 737, 494);
				setLocationRelativeTo(null);
				setTitle("Nuevo Proyecto");
				panelCliente.setVisible(false);
				panelCliente.setEnabled(false);
				panelProyecto.setEnabled(true);
				panelProyecto.setVisible(true);
				panelContrato.setVisible(false);
				panelContrato.setEnabled(false);
				
			}
		});
		btnNext.setIcon(new ImageIcon(nextimage));
		btnNext.setBackground(SystemColor.inactiveCaptionBorder);
		btnNext.setBounds(427, 214, 50, 55);
		panelCliente.add(btnNext);
		
		JLabel label_5 = new JLabel("Continuar");
		label_5.setBounds(424, 272, 56, 16);
		panelCliente.add(label_5);
		
		Image der = new ImageIcon(this.getClass().getResource("/derTable.png")).getImage();
		Image izq = new ImageIcon(this.getClass().getResource("/izqTable.png")).getImage();
		Image nextP = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
		Image back1 = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
		Image footimage2 = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
		
		panelProyecto = new JPanel();
		panelProyecto.setEnabled(false);
		panelProyecto.setVisible(false);
		panelProyecto.setBounds(0, 0, 739, 571);
		contentPanel.add(panelProyecto);
		panelProyecto.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(5, 7, 729, 559);
		panelProyecto.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(12, 13, 705, 170);
		panel_1.add(panel_2);
		
		JLabel label_6 = new JLabel("ID:");
		label_6.setBounds(12, 36, 26, 16);
		panel_2.add(label_6);
		
		txtIDProy = new JTextField();
		txtIDProy.setEditable(false);
		txtIDProy.setColumns(10);
		txtIDProy.setBackground(SystemColor.inactiveCaptionBorder);
		txtIDProy.setBounds(90, 34, 116, 21);
		txtIDProy.setText("P-" + Empresa.getInstance().getMisClientes().size() + 1);
		panel_2.add(txtIDProy);
		
		JLabel label_7 = new JLabel("Nombre:");
		label_7.setBounds(12, 65, 56, 16);
		panel_2.add(label_7);
		
		txtNombrePro = new JTextField();
		txtNombrePro.setColumns(10);
		txtNombrePro.setBackground(SystemColor.inactiveCaptionBorder);
		txtNombrePro.setBounds(90, 63, 225, 21);
		panel_2.add(txtNombrePro);
		
		JLabel label_8 = new JLabel("Lenguaje:");
		label_8.setBounds(358, 65, 62, 16);
		panel_2.add(label_8);
		
		JComboBox cmbxLenguaje = new JComboBox();
		cmbxLenguaje.setBackground(SystemColor.inactiveCaptionBorder);
		cmbxLenguaje.setBounds(426, 63, 194, 21);
		panel_2.add(cmbxLenguaje);
		
		JLabel label_9 = new JLabel("Descripci\u00F3n:");
		label_9.setBounds(12, 99, 75, 16);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Estado:");
		label_10.setBounds(358, 99, 56, 16);
		panel_2.add(label_10);
		
		JComboBox cbmxEstado = new JComboBox();
		cbmxEstado.setBackground(SystemColor.inactiveCaptionBorder);
		cbmxEstado.setBounds(426, 97, 135, 21);
		panel_2.add(cbmxEstado);
		
		JTextPane txtPaneDesc = new JTextPane();
		txtPaneDesc.setBackground(SystemColor.inactiveCaptionBorder);
		txtPaneDesc.setBounds(90, 97, 225, 60);
		panel_2.add(txtPaneDesc);
		
		JLabel label_11 = new JLabel("Cliente:");
		label_11.setBounds(358, 34, 59, 16);
		panel_2.add(label_11);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setColumns(10);
		txtCliente.setBackground(SystemColor.inactiveCaptionBorder);
		txtCliente.setBounds(426, 33, 267, 21);
		panel_2.add(txtCliente);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 196, 705, 164);
		panel_1.add(panel_3);
		
		JLabel label_12 = new JLabel("Tipo:");
		label_12.setBounds(12, 23, 38, 16);
		panel_3.add(label_12);
		
		cmbxTipo = new JComboBox();
		cmbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Jefes de Proyecto", "Dise\u00F1adores", "Planificadores", "Programadores"}));
		cmbxTipo.setBackground(SystemColor.inactiveCaptionBorder);
		cmbxTipo.setBounds(62, 21, 159, 21);
		panel_3.add(cmbxTipo);
		if(cmbxTipo.getSelectedIndex()==1)
			loadTableJefesDisp();
		if(cmbxTipo.getSelectedIndex()==2)
			loadTableDiseDisp();
		if(cmbxTipo.getSelectedIndex()==3)
			loadTablePlanDisp();
		if(cmbxTipo.getSelectedIndex()==4)
			loadTablePrograDisp();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 52, 307, 99);
		panel_3.add(scrollPane);
		
		tableDisp = new JTable();
		tableDisp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableDisp.setModel(model);
		scrollPane.setViewportView(tableDisp);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(386, 52, 307, 99);
		panel_3.add(scrollPane_1);
		
		tableSelected = new JTable();
		tableSelected.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableSelected.setModel(model2);
		scrollPane_1.setViewportView(tableSelected);
		
		JButton btnDer = new JButton("");
		btnDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = tableDisp.getSelectedRow();
				String nombre = (String) tableDisp.getModel().getValueAt(index, 0);
				Trabajadores t = Empresa.getInstance().findTrabajadorByNombre(nombre);
				tSelected.add(t);
				loadTableSelected();
			}
		});
		btnDer.setIcon(new ImageIcon(der));
		btnDer.setBackground(SystemColor.inactiveCaptionBorder);
		btnDer.setBounds(336, 69, 38, 25);
		panel_3.add(btnDer);
		
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
		btnIzq.setIcon(new ImageIcon(izq));
		btnIzq.setBackground(SystemColor.inactiveCaptionBorder);
		btnIzq.setBounds(336, 107, 38, 25);
		panel_3.add(btnIzq);
		
		JButton btnNextProyect = new JButton("");
		btnNextProyect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 495, 303);
				setLocationRelativeTo(null);
				setTitle("Nuevo Contrato");
				panelCliente.setVisible(false);
				panelCliente.setEnabled(false);
				panelProyecto.setEnabled(false);
				panelProyecto.setVisible(false);
				panelContrato.setVisible(true);
				panelContrato.setEnabled(true);
			}
		});
		btnNextProyect.setIcon(new ImageIcon(nextP));
		btnNextProyect.setBackground(SystemColor.inactiveCaptionBorder);
		btnNextProyect.setBounds(664, 373, 50, 55);
		panel_1.add(btnNextProyect);
		
		JLabel label_13 = new JLabel("Continuar");
		label_13.setBounds(661, 431, 56, 16);
		panel_1.add(label_13);
		
		JButton btnBackProyect = new JButton("");
		btnBackProyect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBounds(100, 100, 510, 330);
				setLocationRelativeTo(null);
				setTitle("Nuevo Cliente");
				panelCliente.setVisible(true);
				panelCliente.setEnabled(true);
				panelProyecto.setEnabled(false);
				panelProyecto.setVisible(false);
				panelContrato.setVisible(false);
				panelContrato.setEnabled(false);
			}
		});
		btnBackProyect.setIcon(new ImageIcon(back1));
		btnBackProyect.setBackground(SystemColor.inactiveCaptionBorder);
		btnBackProyect.setBounds(295, 373, 50, 55);
		panel_1.add(btnBackProyect);
		
		JLabel label_14 = new JLabel("Anterior");
		label_14.setBounds(292, 431, 56, 16);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(footimage2));
		label_15.setBounds(12, 386, 260, 50);
		panel_1.add(label_15);
		
		panelContrato = new JPanel();
		panelContrato.setLayout(null);
		panelContrato.setVisible(false);
		panelContrato.setEnabled(false);
		panelContrato.setBackground(Color.WHITE);
		panelContrato.setBounds(0, 0, 483, 368);
		contentPanel.add(panelContrato);
		
		JLabel label_16 = new JLabel("ID Contrato:");
		label_16.setBounds(12, 30, 76, 16);
		panelContrato.add(label_16);
		
		txtIDCont = new JTextField();
		txtIDCont.setEditable(false);
		txtIDCont.setColumns(10);
		txtIDCont.setBackground(SystemColor.inactiveCaptionBorder);
		txtIDCont.setBounds(94, 27, 131, 21);
		txtIDCont.setText("C-" + Empresa.getInstance().getMisClientes().size() + 1);
		panelContrato.add(txtIDCont);
		
		JLabel label_17 = new JLabel("Cliente: ");
		label_17.setBounds(251, 30, 48, 16);
		panelContrato.add(label_17);
		
		txtClienteCont = new JTextField();
		txtClienteCont.setEditable(false);
		txtClienteCont.setColumns(10);
		txtClienteCont.setBackground(SystemColor.inactiveCaptionBorder);
		txtClienteCont.setBounds(325, 27, 148, 21);
		panelContrato.add(txtClienteCont);
		
		JLabel label_18 = new JLabel("Fecha Inicial:");
		label_18.setBounds(12, 63, 83, 16);
		panelContrato.add(label_18);
		
		txtFechaIni = new JTextField();
		txtFechaIni.setEnabled(false);
		txtFechaIni.setEditable(false);
		txtFechaIni.setColumns(10);
		txtFechaIni.setBackground(SystemColor.inactiveCaptionBorder);
		txtFechaIni.setBounds(94, 60, 131, 21);
		txtFechaIni.setText(dateFormat.format(fechaActual));
		panelContrato.add(txtFechaIni);
		
		JLabel label_19 = new JLabel("Fecha Final: ");
		label_19.setBounds(251, 63, 74, 16);
		panelContrato.add(label_19);
		
		txtFechaFin = new JTextField();
		txtFechaFin.setColumns(10);
		txtFechaFin.setBackground(SystemColor.inactiveCaptionBorder);
		txtFechaFin.setBounds(325, 59, 148, 21);
		panelContrato.add(txtFechaFin);
		
		JLabel label_21 = new JLabel("Proyecto: ");
		label_21.setBounds(12, 95, 64, 16);
		panelContrato.add(label_21);
		
		txtProyecto = new JTextField();
		txtProyecto.setEditable(false);
		txtProyecto.setBounds(94, 92, 120, 21);
		panelContrato.add(txtProyecto);
		txtProyecto.setText(txtIDProy.getText());
		txtProyecto.setColumns(10);
		
		JButton btnBackContracto = new JButton("");
		btnBackContracto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 737, 494);
				setLocationRelativeTo(null);
				setTitle("Nuevo Proyecto");
				panelCliente.setVisible(false);
				panelCliente.setEnabled(false);
				panelProyecto.setEnabled(true);
				panelProyecto.setVisible(true);
				panelContrato.setVisible(false);
				panelContrato.setEnabled(false);
			}
		});
		btnBackContracto.setIcon(new ImageIcon(back2));
		btnBackContracto.setBackground(SystemColor.inactiveCaptionBorder);
		btnBackContracto.setBounds(15, 138, 50, 55);
		panelContrato.add(btnBackContracto);
		
		JLabel label_22 = new JLabel("Anterior");
		label_22.setBounds(12, 196, 56, 16);
		panelContrato.add(label_22);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/////////////Cliente///////////////
				String idcli = txtIDCli.getText();
				String cedula = txtCedula.getText();
				String nombre = txtNombre.getText();
				String direccion = txtDireccion.getText();
				ArrayList misProyectos = null;
				
				Cliente cli = new Cliente(idcli, cedula, nombre, direccion, misProyectos);
				Empresa.getInstance().getMisClientes().add(cli);
				/////////////Proyecto///////////////
				String id = txtIDProy.getText();
				String nombreProyecto = txtNombrePro.getText();
				String descripcion = txtPaneDesc.getText();
				String lenguaje = (String)cmbxLenguaje.getSelectedItem();
				String estado = null;
				ArrayList misTrabajadores = null;
				
				Proyecto proyecto = new Proyecto(id, nombreProyecto, descripcion, misTrabajadores, lenguaje, estado);
				Empresa.getInstance().getMisProyectos().add(proyecto);	
				/////////////Contrato///////////////
				
				String idcon  = txtIDCont.getText();
				Date fechaInicio = new Date();
				Date fechaFinal = new Date();
				long moto = 0;
				for (Trabajadores t : tSelected) {
					moto += t.getSalario();
				}
				int tiempo = (int) ((fechaFinal.getTime() - fechaInicio.getTime()) / (1000*60*60*24));
				long monto = (long) ((tiempo*model2.getRowCount()*8*moto)*1.15);
			
				//Contrato contrato = new Contrato(fechaInicio, fechaFinal, idcon, cliente, proyecto, monto);
				//Empresa.getInstance().getMisContratos().add(contrato);	
			}
		});
		btnSave.setIcon(new ImageIcon(save));
		btnSave.setBackground(SystemColor.inactiveCaptionBorder);
		btnSave.setBounds(406, 126, 64, 67);
		panelContrato.add(btnSave);
		
		JLabel label_23 = new JLabel("Guardar");
		label_23.setBounds(417, 196, 56, 16);
		panelContrato.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon(logo2));
		label_24.setBounds(12, 217, 260, 50);
		panelContrato.add(label_24);
		
		JLabel label_20 = new JLabel("Monto:");
		label_20.setBounds(251, 94, 56, 16);
		panelContrato.add(label_20);
		
		txtMonto = new JTextField();
		txtMonto.setEditable(false);
		txtMonto.setColumns(10);
		txtMonto.setBackground(SystemColor.inactiveCaptionBorder);
		txtMonto.setBounds(325, 92, 98, 21);
		//txtMonto.setText(t);
		panelContrato.add(txtMonto);
		
		JLabel label_25 = new JLabel("RD$");
		label_25.setBounds(424, 94, 32, 16);
		panelContrato.add(label_25);
	}
	public static void loadTableJefesDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Empresa.getInstance().getMisTrabajadores().size(); i++) {
			if(Empresa.getInstance().getMisTrabajadores().get(i) instanceof JefeProyecto){
				JefeProyecto jefe = (JefeProyecto) Empresa.getInstance().getMisTrabajadores().get(i);
				if(jefe.getMisProyectos().size() < 2){
					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
				}
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
				if(jefe.getMisProyectos().size() < 2){
					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
				}
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
				if(jefe.getMisProyectos().size() < 2){
					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
				}
			}
			model.addRow(fila);
		}
		
	}
	public static void loadTablePrograDisp() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Empresa.getInstance().getMisTrabajadores().size(); i++) {
			if(Empresa.getInstance().getMisTrabajadores().get(i) instanceof Programador){
				Programador jefe = (Programador) Empresa.getInstance().getMisTrabajadores().get(i);
				if(jefe.getProyecto() != null){
					fila[0] = jefe.getNombre();
					fila[1] = jefe.getEvaluacion();
				}
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
