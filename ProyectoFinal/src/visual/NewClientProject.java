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

public class NewClientProject extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NewClientProject dialog = new NewClientProject();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NewClientProject() {
		setTitle("Nuevo Proyecto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewClientProject.class.getResource("/favicon.png")));
		setBounds(100, 100, 754, 657);
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
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 51, 705, 170);
				panel.add(panel_1);
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
				JLabel lblCdulaCliente = new JLabel("C\u00E9dula Cliente: ");
				lblCdulaCliente.setBounds(12, 22, 91, 16);
				panel.add(lblCdulaCliente);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(106, 20, 157, 21);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JButton btnFind = new JButton("");
				Image find = new ImageIcon(this.getClass().getResource("/find.png")).getImage();
				btnFind.setIcon(new ImageIcon(find));
				btnFind.setBounds(268, 19, 33, 23);
				panel.add(btnFind);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(null, "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 229, 705, 164);
				panel.add(panel_1);
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
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setEnabled(false);
				scrollPane.setBounds(12, 406, 705, 96);
				panel.add(scrollPane);
			}
			{
				JLabel labelImage = new JLabel("");
				Image image = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
				labelImage.setIcon(new ImageIcon(image));
				labelImage.setBounds(12, 537, 260, 50);
				panel.add(labelImage);
			}
			{
				JButton btnNext = new JButton("");
				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NewClientContract contr = new NewClientContract();
						contr.setLocationRelativeTo(null);
						contr.setModal(true);
						contr.setVisible(true);
						dispose();
					}
				});
				Image nextimage = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
				btnNext.setIcon(new ImageIcon(nextimage));
				btnNext.setBackground(SystemColor.inactiveCaptionBorder);
				btnNext.setBounds(661, 513, 50, 55);
				panel.add(btnNext);
			}
			{
				JLabel label = new JLabel("Continuar");
				label.setBounds(658, 571, 56, 16);
				panel.add(label);
			}
			{
				JButton btnCancel = new JButton("");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				Image salir = new ImageIcon(this.getClass().getResource("/cancel_button.png")).getImage();
				btnCancel.setIcon(new ImageIcon(salir));
				btnCancel.setBackground(SystemColor.inactiveCaptionBorder);
				btnCancel.setBounds(339, 515, 64, 67);
				panel.add(btnCancel);
			}
			{
				JLabel label = new JLabel("Cancelar");
				label.setBounds(345, 579, 56, 16);
				panel.add(label);
			}
		}
	}

}
