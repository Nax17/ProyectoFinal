package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import logical.LoginAdmin;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private boolean entrada = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(false);
		setTitle("Ingresar");
		setBounds(100, 100, 207, 198);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 190, 124);
		contentPanel.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 24, 65, 14);
		contentPanel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(10, 40, 170, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 74, 89, 14);
		contentPanel.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 90, 170, 23);
		contentPanel.add(passwordField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 124, 190, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Ingresar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!(textField.getText().equalsIgnoreCase(LoginAdmin.getNombre()))){
							JOptionPane.showMessageDialog(null, "Nombre de usuario Incorrecto.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else if(!(passwordField.getText().equalsIgnoreCase(LoginAdmin.getContra()))){
							JOptionPane.showMessageDialog(null, "Contraseña Incorrecta.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else{
							entrada = true;
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public boolean isEntrada() {
		return entrada;
	}
}
