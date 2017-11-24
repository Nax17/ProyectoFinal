package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel logoLabel;
	private JButton btnCliente;
	private JButton btnAdmin;
	private JButton btnList;
	private JLabel lblCliente;
	private JLabel lblAdministracin;
	private JLabel lblListas;
	private JPanel panelClient;
	private JButton btnNewClient;
	private JButton btnEditClient;
	private JButton btnLogClient;
	private JLabel lblNuevoCliente;
	private JLabel lblEditarCliente;
	private JLabel lblHistorialDeCliente;
	private JPanel panelAdmin;
	private JButton btnNewWorker;
	private JButton btnNewContract;
	private JButton btnModifyContract;
	private JLabel lblNuevoTrabajador;
	private JLabel lblNuevoContrato;
	private JLabel lblEditarContrato;
	private JPanel panelList;
	private JButton btnListClient;
	private JButton btnListWorker;
	private JButton btnListProject;
	private JLabel lblListaDeClientes;
	private JLabel lblListaDeTrabajadores;
	private JLabel lblListaDeProyectos;
	private JPanel panelInfo;
	private JLabel lblEscojaLaOpcin;
	private JLabel nameLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/favicon.png")));
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("ISC Solutions");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel barraAzul = new JPanel();
		barraAzul.setBackground(SystemColor.activeCaption);
		barraAzul.setBounds(294, 39, 3, 499);
		panel.add(barraAzul);
		
		logoLabel = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/logoimage.png")).getImage();
		logoLabel.setIcon(new ImageIcon(logo));
		logoLabel.setBounds(792, 13, 130, 130);
		panel.add(logoLabel);
		
		btnCliente = new JButton("");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelClient.setVisible(true);
				panelAdmin.setVisible(false);
				panelList.setVisible(false);
				panelInfo.setVisible(false);
			}
		});
		Image client = new ImageIcon(this.getClass().getResource("/client_button.png")).getImage();
		btnCliente.setIcon(new ImageIcon(client));
		btnCliente.setBounds(369, 250, 104, 75);
		panel.add(btnCliente);
		
		btnAdmin = new JButton("");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClient.setVisible(false);
				panelAdmin.setVisible(true);
				panelList.setVisible(false);
				panelInfo.setVisible(false);
			}
		});
		Image admin = new ImageIcon(this.getClass().getResource("/admin_button.png")).getImage();
		btnAdmin.setIcon(new ImageIcon(admin));
		btnAdmin.setBounds(568, 250, 104, 75);
		panel.add(btnAdmin);
		
		btnList = new JButton("");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClient.setVisible(false);
				panelAdmin.setVisible(false);
				panelList.setVisible(true);
				panelInfo.setVisible(false);
			}
		});
		Image list = new ImageIcon(this.getClass().getResource("/list_button.png")).getImage();
		btnList.setIcon(new ImageIcon(list));
		btnList.setBounds(756, 250, 104, 75);
		panel.add(btnList);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(399, 327, 45, 16);
		panel.add(lblCliente);
		
		lblAdministracin = new JLabel("Administraci\u00F3n");
		lblAdministracin.setBounds(573, 327, 94, 16);
		panel.add(lblAdministracin);
		
		lblListas = new JLabel("Listas");
		lblListas.setBounds(786, 327, 45, 16);
		panel.add(lblListas);
		
		panelInfo = new JPanel();
		panelInfo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelInfo.setBounds(319, 383, 565, 155);
		panel.add(panelInfo);
		panelInfo.setLayout(null);
		
		lblEscojaLaOpcin = new JLabel("Escoja la opci\u00F3n con la cual desea operar.");
		lblEscojaLaOpcin.setEnabled(false);
		lblEscojaLaOpcin.setBounds(142, 62, 253, 16);
		panelInfo.add(lblEscojaLaOpcin);
		
		panelList = new JPanel();
		panelList.setLayout(null);
		panelList.setVisible(false);
		panelList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelList.setBounds(319, 383, 565, 155);
		panel.add(panelList);
		
		btnListClient = new JButton("");
		Image ListClient = new ImageIcon(this.getClass().getResource("/list_client.png")).getImage();
		btnListClient.setIcon(new ImageIcon(ListClient));
		btnListClient.setBackground(SystemColor.scrollbar);
		btnListClient.setBounds(64, 31, 78, 73);
		panelList.add(btnListClient);
		
		btnListWorker = new JButton("");
		Image ListWorker = new ImageIcon(this.getClass().getResource("/list_worker.png")).getImage();
		btnListWorker.setIcon(new ImageIcon(ListWorker));
		btnListWorker.setBackground(SystemColor.scrollbar);
		btnListWorker.setBounds(241, 31, 78, 73);
		panelList.add(btnListWorker);
		
		btnListProject = new JButton("");
		Image ListProject = new ImageIcon(this.getClass().getResource("/list_project.png")).getImage();
		btnListProject.setIcon(new ImageIcon(ListProject));
		btnListProject.setBackground(SystemColor.scrollbar);
		btnListProject.setBounds(414, 31, 78, 73);
		panelList.add(btnListProject);
		
		lblListaDeClientes = new JLabel("Lista de Clientes");
		lblListaDeClientes.setBounds(52, 104, 102, 16);
		panelList.add(lblListaDeClientes);
		
		lblListaDeTrabajadores = new JLabel("Lista de Trabajadores");
		lblListaDeTrabajadores.setBounds(214, 104, 132, 16);
		panelList.add(lblListaDeTrabajadores);
		
		lblListaDeProyectos = new JLabel("Lista de Proyectos");
		lblListaDeProyectos.setBounds(399, 104, 109, 16);
		panelList.add(lblListaDeProyectos);
		
		panelAdmin = new JPanel();
		panelAdmin.setVisible(false);
		panelAdmin.setBounds(319, 383, 565, 155);
		panel.add(panelAdmin);
		panelAdmin.setLayout(null);
		panelAdmin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		btnNewWorker = new JButton("");
		Image newWorker = new ImageIcon(this.getClass().getResource("/add_worker.png")).getImage();
		btnNewWorker.setIcon(new ImageIcon(newWorker));
		btnNewWorker.setBackground(SystemColor.scrollbar);
		btnNewWorker.setBounds(64, 31, 78, 73);
		panelAdmin.add(btnNewWorker);
		
		btnNewContract = new JButton("");
		Image newContract = new ImageIcon(this.getClass().getResource("/add_contract.png")).getImage();
		btnNewContract.setIcon(new ImageIcon(newContract));
		btnNewContract.setBackground(SystemColor.scrollbar);
		btnNewContract.setBounds(241, 31, 78, 73);
		panelAdmin.add(btnNewContract);
		
		btnModifyContract = new JButton("");
		Image EditContract = new ImageIcon(this.getClass().getResource("/edit_contract.png")).getImage();
		btnModifyContract.setIcon(new ImageIcon(EditContract));
		btnModifyContract.setBackground(SystemColor.scrollbar);
		btnModifyContract.setBounds(414, 31, 78, 73);
		panelAdmin.add(btnModifyContract);
		
		lblNuevoTrabajador = new JLabel("Nuevo Trabajador\r\n");
		lblNuevoTrabajador.setBounds(45, 104, 116, 16);
		panelAdmin.add(lblNuevoTrabajador);
		
		lblNuevoContrato = new JLabel("Nuevo Contrato\r\n");
		lblNuevoContrato.setBounds(231, 104, 98, 16);
		panelAdmin.add(lblNuevoContrato);
		
		lblEditarContrato = new JLabel("Editar Contrato\r\n");
		lblEditarContrato.setBounds(404, 104, 98, 16);
		panelAdmin.add(lblEditarContrato);
		
		panelClient = new JPanel();
		panelClient.setVisible(false);
		panelClient.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelClient.setBounds(319, 383, 565, 155);
		panel.add(panelClient);
		panelClient.setLayout(null);
		
		btnNewClient = new JButton("");
		btnNewClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NuevoCliente cli = new NuevoCliente();
				cli.setLocationRelativeTo(null);
				cli.setModal(true);
				cli.setVisible(true);
			}
		});
		btnNewClient.setBackground(SystemColor.scrollbar);
		Image newClient = new ImageIcon(this.getClass().getResource("/add_client.png")).getImage();
		btnNewClient.setIcon(new ImageIcon(newClient));
		btnNewClient.setBounds(64, 31, 78, 73);
		panelClient.add(btnNewClient);
		
		btnEditClient = new JButton("");
		btnEditClient.setBackground(SystemColor.scrollbar);
		Image editClient = new ImageIcon(this.getClass().getResource("/edit_client.png")).getImage();
		btnEditClient.setIcon(new ImageIcon(editClient));
		btnEditClient.setBounds(241, 31, 78, 73);
		panelClient.add(btnEditClient);
		
		btnLogClient = new JButton("");
		btnLogClient.setBackground(SystemColor.scrollbar);
		Image logClient = new ImageIcon(this.getClass().getResource("/history_client.png")).getImage();
		btnLogClient.setIcon(new ImageIcon(logClient));
		btnLogClient.setBounds(414, 31, 78, 73);
		panelClient.add(btnLogClient);
		
		lblNuevoCliente = new JLabel("Nuevo Cliente");
		lblNuevoCliente.setBounds(64, 104, 78, 16);
		panelClient.add(lblNuevoCliente);
		
		lblEditarCliente = new JLabel("Editar Cliente");
		lblEditarCliente.setBounds(238, 104, 85, 16);
		panelClient.add(lblEditarCliente);
		
		lblHistorialDeCliente = new JLabel("Historial de Cliente");
		lblHistorialDeCliente.setBounds(395, 104, 116, 16);
		panelClient.add(lblHistorialDeCliente);
		
		nameLabel = new JLabel("");
		Image nameimage = new ImageIcon(this.getClass().getResource("/nameimage.png")).getImage();
		nameLabel.setIcon(new ImageIcon(nameimage));
		nameLabel.setBounds(319, 23, 290, 50);
		panel.add(nameLabel);
		
		
	

	}
}
