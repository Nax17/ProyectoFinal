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

import logical.Designer;
import logical.Empresa;
import logical.JefeProyecto;
import logical.Planificador;
import logical.Programador;
import logical.Trabajadores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;

public class NuevosDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private DefaultTableModel cliente;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPanel panelProyecto;
	private JPanel panelCliente;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JPanel panelContrato;
	private JTable tableDisp;
	private JTable tableSelected;
	private JComboBox comboBox_2;
	private static DefaultTableModel model;
	private static DefaultTableModel model2;
	private static Object[] fila;
	private static Object[] fila2;
	private static ArrayList<Trabajadores> tSelected = new ArrayList<>();

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
		cliente = new DefaultTableModel();
		cliente.setColumnIdentifiers(columnNames);
		
		panelContrato = new JPanel();
		panelContrato.setLayout(null);
		panelContrato.setVisible(false);
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(93, 68, 350, 21);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(25, 105, 56, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Direcci\u00F3n: ");
		label_2.setBounds(25, 140, 68, 16);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(93, 102, 350, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setBounds(93, 138, 350, 21);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("ID:");
		label_3.setBounds(25, 36, 25, 16);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setBounds(96, 33, 99, 21);
		panel.add(textField_3);
		
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
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		textField_4.setBounds(90, 34, 116, 21);
		panel_2.add(textField_4);
		
		JLabel label_7 = new JLabel("Nombre:");
		label_7.setBounds(12, 65, 56, 16);
		panel_2.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.inactiveCaptionBorder);
		textField_5.setBounds(90, 63, 225, 21);
		panel_2.add(textField_5);
		
		JLabel label_8 = new JLabel("Lenguaje:");
		label_8.setBounds(358, 65, 62, 16);
		panel_2.add(label_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(426, 63, 194, 21);
		panel_2.add(comboBox);
		
		JLabel label_9 = new JLabel("Descripci\u00F3n:");
		label_9.setBounds(12, 99, 75, 16);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Estado:");
		label_10.setBounds(358, 99, 56, 16);
		panel_2.add(label_10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox_1.setBounds(426, 97, 135, 21);
		panel_2.add(comboBox_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.inactiveCaptionBorder);
		textPane.setBounds(90, 97, 225, 60);
		panel_2.add(textPane);
		
		JLabel label_11 = new JLabel("Cliente:");
		label_11.setBounds(358, 34, 59, 16);
		panel_2.add(label_11);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.inactiveCaptionBorder);
		textField_6.setBounds(426, 33, 267, 21);
		panel_2.add(textField_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 196, 705, 164);
		panel_1.add(panel_3);
		
		JLabel label_12 = new JLabel("Tipo:");
		label_12.setBounds(12, 23, 38, 16);
		panel_3.add(label_12);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Jefes de Proyecto", "Dise\u00F1adores", "Planificadores", "Programadores"}));
		comboBox_2.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox_2.setBounds(62, 21, 159, 21);
		panel_3.add(comboBox_2);
		if(comboBox_2.getSelectedIndex()==1)
			loadTableJefesDisp();
		if(comboBox_2.getSelectedIndex()==2)
			loadTableDiseDisp();
		if(comboBox_2.getSelectedIndex()==3)
			loadTablePlanDisp();
		if(comboBox_2.getSelectedIndex()==4)
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
		panelContrato.setEnabled(false);
		panelContrato.setBackground(Color.WHITE);
		panelContrato.setBounds(0, 0, 483, 368);
		contentPanel.add(panelContrato);
		
		JLabel label_16 = new JLabel("ID Contrato:");
		label_16.setBounds(12, 30, 76, 16);
		panelContrato.add(label_16);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.inactiveCaptionBorder);
		textField_7.setBounds(94, 27, 131, 21);
		panelContrato.add(textField_7);
		
		JLabel label_17 = new JLabel("Cliente: ");
		label_17.setBounds(251, 30, 48, 16);
		panelContrato.add(label_17);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.inactiveCaptionBorder);
		textField_8.setBounds(325, 27, 148, 21);
		panelContrato.add(textField_8);
		
		JLabel label_18 = new JLabel("Fecha Inicial:");
		label_18.setBounds(12, 63, 83, 16);
		panelContrato.add(label_18);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.inactiveCaptionBorder);
		textField_9.setBounds(94, 60, 131, 21);
		panelContrato.add(textField_9);
		
		JLabel label_19 = new JLabel("Fecha Final: ");
		label_19.setBounds(251, 63, 74, 16);
		panelContrato.add(label_19);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.inactiveCaptionBorder);
		textField_10.setBounds(325, 59, 148, 21);
		panelContrato.add(textField_10);
		
		JLabel label_20 = new JLabel("Entrega: ");
		label_20.setBounds(12, 97, 56, 16);
		panelContrato.add(label_20);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.inactiveCaptionBorder);
		textField_11.setBounds(94, 94, 116, 22);
		panelContrato.add(textField_11);
		
		JLabel label_21 = new JLabel("Proyecto: ");
		label_21.setBounds(251, 97, 64, 16);
		panelContrato.add(label_21);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox_3.setBounds(325, 94, 146, 21);
		panelContrato.add(comboBox_3);
		
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
