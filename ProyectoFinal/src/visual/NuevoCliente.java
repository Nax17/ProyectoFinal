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
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel footNewClientLabel;
	private JButton btnNext;
	private JLabel lblContinuar;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			NuevoCliente dialog = new NuevoCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			//dialog.setIconImage(ImageIO.read(getClass().getResourceAsStream("/favicon.png")));
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public NuevoCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoCliente.class.getResource("/favicon.png")));
		setTitle("Nuevo Cliente");
		setBounds(100, 100, 510, 456);
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
				lblCdula.setBounds(25, 72, 56, 16);
				panel.add(lblCdula);
			}
			
			textField = new JTextField();
			textField.setBounds(93, 68, 350, 21);
			panel.add(textField);
			textField.setColumns(10);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(25, 105, 56, 16);
				panel.add(lblNombre);
			}
			{
				JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
				lblDireccin.setBounds(25, 140, 68, 16);
				panel.add(lblDireccin);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(93, 102, 350, 21);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(93, 138, 350, 21);
				panel.add(textField_2);
			}
			
			JLabel lblId = new JLabel("ID:");
			lblId.setBounds(25, 36, 25, 16);
			panel.add(lblId);
			
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(96, 33, 99, 21);
			panel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			footNewClientLabel = new JLabel("");
			Image footimage = new ImageIcon(this.getClass().getResource("/footimage.png")).getImage();
			footNewClientLabel.setIcon(new ImageIcon(footimage));
			footNewClientLabel.setBounds(12, 346, 260, 50);
			contentPanel.add(footNewClientLabel);
		}
		{
			btnNext = new JButton("");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NuevoProyecto project = new NuevoProyecto();
					project.setLocationRelativeTo(null);
					project.setModal(true);
					project.setVisible(true);
				}
			});
			Image nextimage = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
			btnNext.setIcon(new ImageIcon(nextimage));
			btnNext.setBackground(SystemColor.menu);
			btnNext.setBounds(427, 322, 50, 55);
			contentPanel.add(btnNext);
		}
		{
			lblContinuar = new JLabel("Continuar");
			lblContinuar.setBounds(424, 380, 56, 16);
			contentPanel.add(lblContinuar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 213, 468, 96);
			contentPanel.add(scrollPane);
			
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			String[] columnNames = {"ID","Cédula","Nombre"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(columnNames);
			table.setModel(model);
			scrollPane.setViewportView(table);
		}
	}
}
