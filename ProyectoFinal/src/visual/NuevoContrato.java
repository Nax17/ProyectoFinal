package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoContrato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NuevoContrato dialog = new NuevoContrato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevoContrato() {
		setTitle("Nuevo Contrato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoContrato.class.getResource("/favicon.png")));
		setBounds(100, 100, 511, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.textHighlightText);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblId = new JLabel("ID Contrato:");
			lblId.setBounds(12, 30, 76, 16);
			panel.add(lblId);
			
			textField = new JTextField();
			textField.setBackground(SystemColor.inactiveCaptionBorder);
			textField.setEditable(false);
			textField.setBounds(94, 27, 131, 21);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblCliente = new JLabel("Cliente: ");
			lblCliente.setBounds(251, 30, 48, 16);
			panel.add(lblCliente);
			
			textField_1 = new JTextField();
			textField_1.setBackground(SystemColor.inactiveCaptionBorder);
			textField_1.setEditable(false);
			textField_1.setBounds(325, 27, 148, 21);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblFechaInicial = new JLabel("Fecha Inicial:");
			lblFechaInicial.setBounds(12, 63, 83, 16);
			panel.add(lblFechaInicial);
			
			textField_2 = new JTextField();
			textField_2.setBackground(SystemColor.inactiveCaptionBorder);
			textField_2.setBounds(94, 60, 131, 21);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblFechaFinal = new JLabel("Fecha Final: ");
			lblFechaFinal.setBounds(251, 63, 74, 16);
			panel.add(lblFechaFinal);
			
			textField_3 = new JTextField();
			textField_3.setBackground(SystemColor.inactiveCaptionBorder);
			textField_3.setColumns(10);
			textField_3.setBounds(325, 59, 148, 21);
			panel.add(textField_3);
			
			JLabel lblEntrega = new JLabel("Entrega: ");
			lblEntrega.setBounds(12, 97, 56, 16);
			panel.add(lblEntrega);
			
			textField_4 = new JTextField();
			textField_4.setBackground(SystemColor.inactiveCaptionBorder);
			textField_4.setBounds(94, 94, 116, 22);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblProyecto = new JLabel("Proyecto: ");
			lblProyecto.setBounds(251, 97, 64, 16);
			panel.add(lblProyecto);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox.setBounds(325, 94, 146, 21);
			panel.add(comboBox);
			
			JButton btnBack = new JButton("");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					NuevoProyecto proy = new NuevoProyecto();
					proy.setLocationRelativeTo(null);
					proy.setModal(true);
					proy.setVisible(true);
				}
			});
			Image backImage = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
			btnBack.setIcon(new ImageIcon(backImage));
			btnBack.setBackground(SystemColor.inactiveCaptionBorder);
			btnBack.setBounds(15, 241, 50, 55);
			panel.add(btnBack);
			
			JLabel label = new JLabel("Anterior");
			label.setBounds(12, 299, 56, 16);
			panel.add(label);
			
			JButton btnNext = new JButton("");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			Image nextimage = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
			btnNext.setIcon(new ImageIcon(nextimage));
			btnNext.setBackground(SystemColor.inactiveCaptionBorder);
			btnNext.setBounds(406, 229, 64, 67);
			panel.add(btnNext);
			
			JLabel lblGuardar = new JLabel("Guardar");
			lblGuardar.setBounds(417, 299, 56, 16);
			panel.add(lblGuardar);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 136, 459, 88);
			panel.add(scrollPane);
			
			table = new JTable();
			String[] columnNames = {"ID","Cliente","Proyecto"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(columnNames);
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			JLabel label_2 = new JLabel("");
			Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
			label_2.setIcon(new ImageIcon(footimage));
			label_2.setBounds(12, 320, 260, 50);
			panel.add(label_2);
		}
	}
}
