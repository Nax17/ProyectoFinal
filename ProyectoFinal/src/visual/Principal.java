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
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel logoLabel;
	private JButton btnCliente;
	private JButton btnAdmin;
	private JLabel lblCliente;
	private JLabel lblAdministracin;
	private JPanel panelClient;
	private JButton btnNewClient;
	private JLabel lblNuevoCliente;
	private JPanel panelAdmin;
	private JButton btnNewWorker;
	private JButton btnNewContract;
	private JButton btnModifyContract;
	private JLabel lblNuevoTrabajador;
	private JLabel lblNuevoProyecto;
	private JLabel lblEditarContrato;
	private JPanel panelInfo;
	private JLabel lblEscojaLaOpcin;
	private JLabel nameLabel;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblGrficaPastel;
	private JLabel lblGrficad;
	private JLabel lblInformacinBsicaO;
	private JLabel lblLaAplicacinDesarrollada;

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
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Login login = new Login();
		login.setLocationRelativeTo(null);
		login.setModal(true);
		login.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlightText);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel barraAzul = new JPanel();
		barraAzul.setBackground(SystemColor.activeCaption);
		barraAzul.setBounds(380, 39, 3, 499);
		panel.add(barraAzul);
		
		logoLabel = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/logoimage.png")).getImage();
		logoLabel.setIcon(new ImageIcon(logo));
		logoLabel.setBounds(878, 13, 130, 130);
		panel.add(logoLabel);
		
		btnCliente = new JButton("");
		btnCliente.setBackground(SystemColor.inactiveCaptionBorder);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelClient.setVisible(true);
				panelAdmin.setVisible(false);
				panelInfo.setVisible(false);
			}
		});
		Image client = new ImageIcon(this.getClass().getResource("/client_button.png")).getImage();
		btnCliente.setIcon(new ImageIcon(client));
		btnCliente.setBounds(524, 250, 104, 75);
		panel.add(btnCliente);
		
		btnAdmin = new JButton("");
		btnAdmin.setBackground(SystemColor.inactiveCaptionBorder);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClient.setVisible(false);
				panelAdmin.setVisible(true);
				panelInfo.setVisible(false);
			}
		});
		Image admin = new ImageIcon(this.getClass().getResource("/admin_button.png")).getImage();
		btnAdmin.setIcon(new ImageIcon(admin));
		btnAdmin.setBounds(723, 250, 104, 75);
		panel.add(btnAdmin);
		Image list = new ImageIcon(this.getClass().getResource("/list_button.png")).getImage();
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(554, 327, 45, 16);
		panel.add(lblCliente);
		
		lblAdministracin = new JLabel("Administraci\u00F3n");
		lblAdministracin.setBounds(728, 327, 94, 16);
		panel.add(lblAdministracin);
		
		panelInfo = new JPanel();
		panelInfo.setBackground(SystemColor.control);
		panelInfo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelInfo.setBounds(405, 383, 565, 155);
		panel.add(panelInfo);
		panelInfo.setLayout(null);
		
		lblEscojaLaOpcin = new JLabel("Escoja la opci\u00F3n con la cual desea operar.");
		lblEscojaLaOpcin.setEnabled(false);
		lblEscojaLaOpcin.setBounds(142, 62, 253, 16);
		panelInfo.add(lblEscojaLaOpcin);
		Image ListClient = new ImageIcon(this.getClass().getResource("/list_client.png")).getImage();
		Image ListWorker = new ImageIcon(this.getClass().getResource("/list_worker.png")).getImage();
		Image ListProject = new ImageIcon(this.getClass().getResource("/list_project.png")).getImage();
		
		panelAdmin = new JPanel();
		panelAdmin.setVisible(false);
		panelAdmin.setBounds(405, 383, 565, 155);
		panel.add(panelAdmin);
		panelAdmin.setLayout(null);
		panelAdmin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		btnNewWorker = new JButton("");
		btnNewWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoTrabajador worker = new NuevoTrabajador();
				worker.setLocationRelativeTo(null);
				worker.setModal(true);
				worker.setVisible(true);
			}
		});
		Image newWorker = new ImageIcon(this.getClass().getResource("/add_worker.png")).getImage();
		btnNewWorker.setIcon(new ImageIcon(newWorker));
		btnNewWorker.setBackground(new Color(255, 255, 255));
		btnNewWorker.setBounds(64, 31, 78, 73);
		panelAdmin.add(btnNewWorker);
		
		btnNewContract = new JButton("");
		btnNewContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoProyectoAdmin worker = new NuevoProyectoAdmin();
				worker.setLocationRelativeTo(null);
				worker.setModal(true);
				worker.setVisible(true);
				
			}
		});
		Image newContract = new ImageIcon(this.getClass().getResource("/add_contract.png")).getImage();
		btnNewContract.setIcon(new ImageIcon(newContract));
		btnNewContract.setBackground(new Color(255, 255, 255));
		btnNewContract.setBounds(241, 31, 78, 73);
		panelAdmin.add(btnNewContract);
		
		btnModifyContract = new JButton("");
		btnModifyContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lists list = new Lists(null, null, null, null, null);
				list.setLocationRelativeTo(null);
				list.setModal(true);
				list.setVisible(true);
			}
		});
		Image EditContract = new ImageIcon(this.getClass().getResource("/list_client.png")).getImage();
		btnModifyContract.setIcon(new ImageIcon(EditContract));
		btnModifyContract.setBackground(new Color(255, 255, 255));
		btnModifyContract.setBounds(414, 31, 78, 73);
		panelAdmin.add(btnModifyContract);
		
		lblNuevoTrabajador = new JLabel("Nuevo Trabajador\r\n");
		lblNuevoTrabajador.setBounds(45, 104, 116, 16);
		panelAdmin.add(lblNuevoTrabajador);
		
		lblNuevoProyecto = new JLabel("Nuevo Proyecto\r\n");
		lblNuevoProyecto.setBounds(231, 104, 98, 16);
		panelAdmin.add(lblNuevoProyecto);
		
		lblEditarContrato = new JLabel("Manejo de Datos");
		lblEditarContrato.setBounds(404, 104, 98, 16);
		panelAdmin.add(lblEditarContrato);
		
		panelClient = new JPanel();
		panelClient.setVisible(false);
		panelClient.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelClient.setBounds(405, 383, 565, 155);
		panel.add(panelClient);
		panelClient.setLayout(null);
		
		btnNewClient = new JButton("");
		btnNewClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NuevosDatos cli = new NuevosDatos();
				cli.setLocationRelativeTo(null);
				cli.setModal(true);
				cli.setVisible(true);
			}
		});
		btnNewClient.setBackground(new Color(255, 255, 255));
		Image newClient = new ImageIcon(this.getClass().getResource("/add_client.png")).getImage();
		btnNewClient.setIcon(new ImageIcon(newClient));
		btnNewClient.setBounds(230, 31, 78, 73);
		panelClient.add(btnNewClient);
		Image editClient = new ImageIcon(this.getClass().getResource("/edit_client.png")).getImage();
		Image logClient = new ImageIcon(this.getClass().getResource("/history_client.png")).getImage();
		
		lblNuevoCliente = new JLabel("Nuevo Cliente");
		lblNuevoCliente.setBounds(230, 104, 78, 16);
		panelClient.add(lblNuevoCliente);
		
		nameLabel = new JLabel("");
		Image nameimage = new ImageIcon(this.getClass().getResource("/nameimage.png")).getImage();
		nameLabel.setIcon(new ImageIcon(nameimage));
		nameLabel.setBounds(405, 23, 290, 50);
		panel.add(nameLabel);
		
		lblNewLabel = new JLabel("");
		Image pastel = new ImageIcon(this.getClass().getResource("/pastelGraph.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(pastel));
		lblNewLabel.setBounds(83, 58, 209, 202);
		panel.add(lblNewLabel);
		
		label = new JLabel("");
		Image graph = new ImageIcon(this.getClass().getResource("/2dGraph.png")).getImage();
		label.setIcon(new ImageIcon(graph));
		label.setBounds(11, 327, 357, 202);
		panel.add(label);
		
		lblGrficaPastel = new JLabel("Gr\u00E1fica Pastel");
		lblGrficaPastel.setBounds(144, 254, 87, 16);
		panel.add(lblGrficaPastel);
		
		lblGrficad = new JLabel("Gr\u00E1fica 2D");
		lblGrficad.setBounds(128, 520, 75, 16);
		panel.add(lblGrficad);
		
		lblInformacinBsicaO = new JLabel("Informaci\u00F3n b\u00E1sica o descripci\u00F3n de ");
		lblInformacinBsicaO.setBounds(455, 109, 227, 16);
		panel.add(lblInformacinBsicaO);
		
		lblLaAplicacinDesarrollada = new JLabel("la aplicaci\u00F3n desarrollada para ISC Solutions.");
		lblLaAplicacinDesarrollada.setBounds(455, 127, 277, 16);
		panel.add(lblLaAplicacinDesarrollada);
		
		
	

	}
}
