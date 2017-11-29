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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoProyectoAdmin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPanel panelContrato;
	private JPanel panelProyecto;
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
					textField = new JTextField();
					textField.setEditable(false);
					textField.setColumns(10);
					textField.setBackground(SystemColor.inactiveCaptionBorder);
					textField.setBounds(90, 34, 116, 21);
					panel_1.add(textField);
				}
				{
					JLabel label = new JLabel("Nombre:");
					label.setBounds(12, 65, 56, 16);
					panel_1.add(label);
				}
				{
					textField_1 = new JTextField();
					textField_1.setEnabled(false);
					textField_1.setColumns(10);
					textField_1.setBackground(SystemColor.inactiveCaptionBorder);
					textField_1.setBounds(90, 63, 225, 21);
					panel_1.add(textField_1);
				}
				{
					JLabel label = new JLabel("Lenguaje:");
					label.setBounds(358, 65, 62, 16);
					panel_1.add(label);
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setEnabled(false);
					comboBox.setBackground(SystemColor.inactiveCaptionBorder);
					comboBox.setBounds(426, 63, 194, 21);
					panel_1.add(comboBox);
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
					JComboBox comboBox = new JComboBox();
					comboBox.setEnabled(false);
					comboBox.setBackground(SystemColor.inactiveCaptionBorder);
					comboBox.setBounds(426, 97, 135, 21);
					panel_1.add(comboBox);
				}
				{
					JTextPane textPane = new JTextPane();
					textPane.setEnabled(false);
					textPane.setBackground(SystemColor.inactiveCaptionBorder);
					textPane.setBounds(90, 97, 225, 60);
					panel_1.add(textPane);
				}
				{
					JLabel label = new JLabel("Cliente:");
					label.setBounds(358, 34, 59, 16);
					panel_1.add(label);
				}
				{
					textField_2 = new JTextField();
					textField_2.setEditable(false);
					textField_2.setColumns(10);
					textField_2.setBackground(SystemColor.inactiveCaptionBorder);
					textField_2.setBounds(426, 33, 267, 21);
					panel_1.add(textField_2);
				}
			}
			{
				JLabel label = new JLabel("C\u00E9dula Cliente: ");
				label.setBounds(12, 22, 91, 16);
				panelProyecto.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(106, 20, 157, 21);
				panelProyecto.add(textField_3);
			}
			{
				JButton btnFind = new JButton("");
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
					JComboBox comboBox = new JComboBox();
					comboBox.setEnabled(false);
					comboBox.setBackground(SystemColor.inactiveCaptionBorder);
					comboBox.setBounds(62, 21, 159, 21);
					panel_1.add(comboBox);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setEnabled(false);
					scrollPane.setBounds(12, 52, 307, 99);
					panel_1.add(scrollPane);
				}
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setEnabled(false);
					scrollPane.setBounds(386, 52, 307, 99);
					panel_1.add(scrollPane);
				}
				{
					JButton btnDer = new JButton("");
					btnDer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					Image der = new ImageIcon(this.getClass().getResource("/derTable.png")).getImage();
					btnDer.setIcon(new ImageIcon(der));
					btnDer.setEnabled(false);
					btnDer.setBackground(SystemColor.inactiveCaptionBorder);
					btnDer.setBounds(336, 69, 38, 25);
					panel_1.add(btnDer);
				}
				{
					JButton btnIzq = new JButton("");
					Image izq = new ImageIcon(this.getClass().getResource("/izqTable.png")).getImage();
					btnIzq.setIcon(new ImageIcon(izq));
					btnIzq.setEnabled(false);
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
						setBounds(100, 100, 520, 330);
						setLocationRelativeTo(null);
						setTitle("Nuevo contrato");
						panelProyecto.setEnabled(false);
						panelProyecto.setVisible(false);
						panelContrato.setEnabled(true);
						panelContrato.setVisible(true);
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
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBackground(SystemColor.inactiveCaptionBorder);
			textField_4.setBounds(94, 27, 131, 21);
			panelContrato.add(textField_4);
		}
		{
			JLabel label = new JLabel("Cliente: ");
			label.setBounds(251, 30, 48, 16);
			panelContrato.add(label);
		}
		{
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBackground(SystemColor.inactiveCaptionBorder);
			textField_5.setBounds(325, 27, 148, 21);
			panelContrato.add(textField_5);
		}
		{
			JLabel label = new JLabel("Fecha Inicial:");
			label.setBounds(12, 63, 83, 16);
			panelContrato.add(label);
		}
		{
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBackground(SystemColor.inactiveCaptionBorder);
			textField_6.setBounds(94, 60, 131, 21);
			panelContrato.add(textField_6);
		}
		{
			JLabel label = new JLabel("Fecha Final: ");
			label.setBounds(251, 63, 74, 16);
			panelContrato.add(label);
		}
		{
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBackground(SystemColor.inactiveCaptionBorder);
			textField_7.setBounds(325, 59, 148, 21);
			panelContrato.add(textField_7);
		}
		{
			JLabel label = new JLabel("Entrega: ");
			label.setBounds(12, 97, 56, 16);
			panelContrato.add(label);
		}
		{
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBackground(SystemColor.inactiveCaptionBorder);
			textField_8.setBounds(94, 94, 116, 22);
			panelContrato.add(textField_8);
		}
		{
			JLabel label = new JLabel("Proyecto: ");
			label.setBounds(251, 97, 64, 16);
			panelContrato.add(label);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox.setBounds(325, 94, 146, 21);
			panelContrato.add(comboBox);
		}
		{
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
		}
		{
			JLabel label = new JLabel("Anterior");
			label.setBounds(12, 196, 56, 16);
			panelContrato.add(label);
		}
		{
			JButton btnSave = new JButton("");
			Image save = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
			btnSave.setIcon(new ImageIcon(save));
			btnSave.setBackground(SystemColor.inactiveCaptionBorder);
			btnSave.setBounds(406, 126, 64, 67);
			panelContrato.add(btnSave);
		}
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
	}

}
