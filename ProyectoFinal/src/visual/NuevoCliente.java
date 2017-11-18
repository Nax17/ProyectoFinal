package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel footNewClientLabel;
	private JButton btnNext;
	private JLabel lblContinuar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoCliente dialog = new NuevoCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			//dialog.setIconImage(ImageIO.read(getClass().getResourceAsStream("/favicon.png")));
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoCliente.class.getResource("/favicon.png")));
		setTitle("Nuevo Cliente");
		setBounds(100, 100, 510, 348);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n B\u00E1sica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 470, 188);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCdula = new JLabel("C\u00E9dula:");
				lblCdula.setBounds(29, 49, 56, 16);
				panel.add(lblCdula);
			}
			
			textField = new JTextField();
			textField.setBounds(97, 46, 350, 21);
			panel.add(textField);
			textField.setColumns(10);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(29, 94, 56, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
				lblDireccin.setBounds(29, 137, 68, 16);
				panel.add(lblDireccin);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(97, 92, 350, 21);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(97, 135, 350, 21);
				panel.add(textField_2);
			}
		}
		{
			footNewClientLabel = new JLabel("");
			Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
			footNewClientLabel.setIcon(new ImageIcon(footimage));
			footNewClientLabel.setBounds(12, 240, 260, 50);
			contentPanel.add(footNewClientLabel);
		}
		{
			btnNext = new JButton("");
			Image nextimage = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
			btnNext.setIcon(new ImageIcon(nextimage));
			btnNext.setBackground(SystemColor.menu);
			btnNext.setBounds(421, 214, 50, 55);
			contentPanel.add(btnNext);
		}
		{
			lblContinuar = new JLabel("Continuar");
			lblContinuar.setBounds(418, 272, 56, 16);
			contentPanel.add(lblContinuar);
		}
	}
}
