package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ListSelectionModel;
import java.awt.SystemColor;

public class NuevoProyecto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private DefaultTableModel tableAvailable;
	private DefaultTableModel tableSelected;
	private JTable table_1;
	private JTable table_2;
	private DefaultTableModel model;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NuevoProyecto dialog = new NuevoProyecto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevoProyecto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoProyecto.class.getResource("/favicon.png")));
		setTitle("Nuevo Proyecto");
		setBounds(100, 100, 757, 616);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.textHighlightText);
			panel.setForeground(SystemColor.desktop);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.textHighlightText);
			panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(12, 13, 705, 170);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblId = new JLabel("ID:");
			lblId.setBounds(12, 36, 26, 16);
			panel_1.add(lblId);
			
			textField = new JTextField();
			textField.setBackground(SystemColor.inactiveCaptionBorder);
			textField.setEditable(false);
			textField.setBounds(90, 34, 116, 21);
			panel_1.add(textField);
			textField.setColumns(10);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(12, 65, 56, 16);
			panel_1.add(lblNombre);
			
			textField_1 = new JTextField();
			textField_1.setBackground(SystemColor.inactiveCaptionBorder);
			textField_1.setBounds(90, 63, 225, 21);
			panel_1.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblLenguaje = new JLabel("Lenguaje:");
			lblLenguaje.setBounds(358, 65, 62, 16);
			panel_1.add(lblLenguaje);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox.setBounds(426, 63, 194, 21);
			panel_1.add(comboBox);
			
			JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
			lblDescripcin.setBounds(12, 99, 75, 16);
			panel_1.add(lblDescripcin);
			
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(358, 99, 56, 16);
			panel_1.add(lblEstado);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox_1.setBounds(426, 97, 135, 21);
			panel_1.add(comboBox_1);
			
			JTextPane textPane = new JTextPane();
			textPane.setBackground(SystemColor.inactiveCaptionBorder);
			textPane.setBounds(90, 97, 225, 60);
			panel_1.add(textPane);
			
			JLabel lblCliente = new JLabel("Cliente:");
			lblCliente.setBounds(358, 34, 59, 16);
			panel_1.add(lblCliente);
			
			textField_2 = new JTextField();
			textField_2.setBackground(SystemColor.inactiveCaptionBorder);
			textField_2.setEditable(false);
			textField_2.setBounds(426, 33, 267, 21);
			panel_1.add(textField_2);
			textField_2.setColumns(10);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(SystemColor.textHighlightText);
			panel_2.setBorder(new TitledBorder(null, "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(12, 196, 705, 164);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblTrabajador = new JLabel("Tipo:");
			lblTrabajador.setBounds(12, 23, 38, 16);
			panel_2.add(lblTrabajador);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox_2.setBounds(62, 21, 159, 21);
			panel_2.add(comboBox_2);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 52, 307, 99);
			panel_2.add(scrollPane);
			
			table = new JTable();
			String[] columnAvailable = {"ID","Nombre","Evaluación"};
			tableAvailable = new DefaultTableModel();
			tableAvailable.setColumnIdentifiers(columnAvailable);
			table.setModel(tableAvailable);
			scrollPane.setViewportView(table);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(386, 52, 307, 99);
			panel_2.add(scrollPane_1);
			
			table_1 = new JTable();
			String[] columnSelected = {"ID","Nombre","Evaluación"};
			tableSelected = new DefaultTableModel();
			tableSelected.setColumnIdentifiers(columnSelected);
			table_1.setModel(tableSelected);
			scrollPane_1.setViewportView(table_1);
			
			JButton btnDerecha = new JButton("");
			btnDerecha.setBackground(SystemColor.inactiveCaptionBorder);
			Image der = new ImageIcon(this.getClass().getResource("/derTable.png")).getImage();
			btnDerecha.setIcon(new ImageIcon(der));
			btnDerecha.setBounds(336, 69, 38, 25);
			panel_2.add(btnDerecha);
			
			JButton btnIzquierda = new JButton("");
			btnIzquierda.setBackground(SystemColor.inactiveCaptionBorder);
			Image izq = new ImageIcon(this.getClass().getResource("/izqTable.png")).getImage();
			btnIzquierda.setIcon(new ImageIcon(izq));
			btnIzquierda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnIzquierda.setBounds(336, 107, 38, 25);
			panel_2.add(btnIzquierda);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(12, 373, 705, 96);
			panel.add(scrollPane_2);
			
			table_2 = new JTable();
			String[] columnNames = {"ID","Nombre","Lenguaje","Estado","Cliente"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(columnNames);
			table_2.setModel(model);
			table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			scrollPane_2.setViewportView(table_2);
			
			JButton btnNext = new JButton("");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					NuevoContrato contr = new NuevoContrato();
					contr.setLocationRelativeTo(null);
					contr.setModal(true);
					contr.setVisible(true);
				}
			});
			Image nextimage = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
			btnNext.setIcon(new ImageIcon(nextimage));
			btnNext.setBackground(SystemColor.inactiveCaptionBorder);
			btnNext.setBounds(664, 472, 50, 55);
			panel.add(btnNext);
			
			JLabel label = new JLabel("Continuar");
			label.setBounds(661, 530, 56, 16);
			panel.add(label);
			
			JButton btnBack = new JButton("");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					NuevoCliente cli = new NuevoCliente();
					cli.setLocationRelativeTo(null);
					cli.setModal(true);
					cli.setVisible(true);
				}
			});
			Image backImage = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
			btnBack.setIcon(new ImageIcon(backImage));
			btnBack.setBackground(SystemColor.inactiveCaptionBorder);
			btnBack.setBounds(295, 472, 50, 55);
			panel.add(btnBack);
			
			JLabel lblAnterior = new JLabel("Anterior");
			lblAnterior.setBounds(292, 530, 56, 16);
			panel.add(lblAnterior);
			
			JLabel labelLogo = new JLabel("");
			Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
			labelLogo.setIcon(new ImageIcon(footimage));
			labelLogo.setBounds(12, 496, 260, 50);
			panel.add(labelLogo);
			
		}
	}
}
