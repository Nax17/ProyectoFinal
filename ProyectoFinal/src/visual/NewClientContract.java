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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewClientContract extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NewClientContract dialog = new NewClientContract();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NewClientContract() {
		setTitle("Nuevo Contrato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewClientContract.class.getResource("/favicon.png")));
		setBounds(100, 100, 516, 432);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.WHITE);
			panel.setBounds(8, 8, 483, 368);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("ID Contrato:");
				label.setBounds(12, 30, 76, 16);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBackground(SystemColor.inactiveCaptionBorder);
				textField.setBounds(94, 27, 131, 21);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("Cliente: ");
				label.setBounds(251, 30, 48, 16);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBackground(SystemColor.inactiveCaptionBorder);
				textField_1.setBounds(325, 27, 148, 21);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("Fecha Inicial:");
				label.setBounds(12, 63, 83, 16);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBackground(SystemColor.inactiveCaptionBorder);
				textField_2.setBounds(94, 60, 131, 21);
				panel.add(textField_2);
			}
			{
				JLabel label = new JLabel("Fecha Final: ");
				label.setBounds(251, 63, 74, 16);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBackground(SystemColor.inactiveCaptionBorder);
				textField_3.setBounds(325, 59, 148, 21);
				panel.add(textField_3);
			}
			{
				JLabel label = new JLabel("Entrega: ");
				label.setBounds(12, 97, 56, 16);
				panel.add(label);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBackground(SystemColor.inactiveCaptionBorder);
				textField_4.setBounds(94, 94, 116, 22);
				panel.add(textField_4);
			}
			{
				JLabel label = new JLabel("Proyecto: ");
				label.setBounds(251, 97, 64, 16);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(SystemColor.inactiveCaptionBorder);
				comboBox.setBounds(325, 94, 146, 21);
				panel.add(comboBox);
			}
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						NewClientProject proy = new NewClientProject();
						proy.setLocationRelativeTo(null);
						proy.setModal(true);
						proy.setVisible(true);
					}
				});
				Image back = new ImageIcon(this.getClass().getResource("/backicon.png")).getImage();
				button.setIcon(new ImageIcon(back));
				button.setBackground(SystemColor.inactiveCaptionBorder);
				button.setBounds(15, 241, 50, 55);
				panel.add(button);
			}
			{
				JLabel label = new JLabel("Anterior");
				label.setBounds(12, 299, 56, 16);
				panel.add(label);
			}
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				Image save = new ImageIcon(this.getClass().getResource("/save_button.png")).getImage();
				button.setIcon(new ImageIcon(save));
				button.setBackground(SystemColor.inactiveCaptionBorder);
				button.setBounds(406, 229, 64, 67);
				panel.add(button);
			}
			{
				JLabel label = new JLabel("Guardar");
				label.setBounds(417, 299, 56, 16);
				panel.add(label);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 136, 459, 88);
				panel.add(scrollPane);
			}
			{
				JLabel label = new JLabel("");
				Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
				label.setIcon(new ImageIcon(footimage));
				label.setBounds(12, 320, 260, 50);
				panel.add(label);
			}
		}
	}

}
