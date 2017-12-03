package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logical.Cliente;
import logical.Contrato;
import logical.Empresa;
import logical.Proyecto;
import logical.Trabajadores;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lists extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable clientTable;
	private JTable proyectTable;
	private JTable contractTable;
	private JTable workerTable;
	private DefaultTableModel cli;
	private DefaultTableModel pro;
	private DefaultTableModel contr;
	private DefaultTableModel worker;
	private JPanel panelFiltContrato;
	private JPanel panelFiltro;
	private JScrollPane scrPaneWorker;
	private JScrollPane scrPaneClient;
	private JScrollPane scrPaneProyect;
	private JScrollPane scrPaneContract;
	private JPanel filtroCliente;
	private JPanel filtroProyecto;
	private JPanel filtroContract;
	private JPanel filtroWorker;
	private JPanel panelInfo;
	private static Cliente client;
	private static Empresa emp;
	private static Trabajadores trab;
	private static Contrato cont;
	private static Proyecto project;
	private static Object[] filacli;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		try {
			Lists dialog = new Lists();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */

	/**
	 * Create the dialog.
	 */
	public Lists(Empresa empresa, Cliente c, Trabajadores work, Contrato contrato, Proyecto proy) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Lists.class.getResource("/favicon.png")));
		setBounds(100, 100, 846, 555);
		client = c;
		emp = empresa;
		trab = work;
		cont = contrato;
		project = proy;
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
				panel_1.setBorder(new TitledBorder(null, "Tipos de Listas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBackground(SystemColor.inactiveCaptionBorder);
				panel_1.setBounds(12, 13, 328, 79);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JButton btnClientes = new JButton("Clientes");
					btnClientes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							scrPaneClient.setEnabled(true);
							scrPaneClient.setVisible(true);
							scrPaneContract.setVisible(false);
							scrPaneContract.setEnabled(false);
							scrPaneProyect.setVisible(false);
							scrPaneProyect.setEnabled(false);
							scrPaneWorker.setVisible(false);
							scrPaneWorker.setEnabled(false);
							filtroCliente.setVisible(true);
							filtroCliente.setEnabled(true);
							filtroContract.setVisible(false);
							filtroContract.setEnabled(false);
							filtroProyecto.setVisible(false);
							filtroProyecto.setEnabled(false);
							filtroWorker.setVisible(false);
							filtroWorker.setEnabled(false);
							panelFiltContrato.setVisible(false);
							panelFiltContrato.setEnabled(false);
							panelFiltro.setVisible(true);
							panelFiltro.setEnabled(true);
							panelInfo.setVisible(false);
							panelInfo.setEnabled(false);
							
							loadClientTable();
						}

					});
					btnClientes.setBackground(SystemColor.inactiveCaptionBorder);
					btnClientes.setBounds(14, 19, 81, 21);
					panel_1.add(btnClientes);
				}
				{
					JButton btnProyectos = new JButton("Proyectos");
					btnProyectos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							scrPaneClient.setEnabled(false);
							scrPaneClient.setVisible(false);
							scrPaneContract.setVisible(false);
							scrPaneContract.setEnabled(false);
							scrPaneProyect.setVisible(true);
							scrPaneProyect.setEnabled(true);
							scrPaneWorker.setVisible(false);
							scrPaneWorker.setEnabled(false);
							filtroCliente.setVisible(false);
							filtroCliente.setEnabled(false);
							filtroContract.setVisible(false);
							filtroContract.setEnabled(false);
							filtroProyecto.setVisible(true);
							filtroProyecto.setEnabled(true);
							filtroWorker.setVisible(false);
							filtroWorker.setEnabled(false);
							panelFiltContrato.setVisible(false);
							panelFiltContrato.setEnabled(false);
							panelFiltro.setVisible(true);
							panelFiltro.setEnabled(true);
							panelInfo.setVisible(false);
							panelInfo.setEnabled(false);
						}
					});
					btnProyectos.setBackground(SystemColor.inactiveCaptionBorder);
					btnProyectos.setBounds(113, 19, 94, 21);
					panel_1.add(btnProyectos);
				}
				{
					JButton btnContratos = new JButton("Contratos");
					btnContratos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							scrPaneClient.setEnabled(false);
							scrPaneClient.setVisible(false);
							scrPaneContract.setVisible(true);
							scrPaneContract.setEnabled(true);
							scrPaneProyect.setVisible(false);
							scrPaneProyect.setEnabled(false);
							scrPaneWorker.setVisible(false);
							scrPaneWorker.setEnabled(false);
							filtroCliente.setVisible(false);
							filtroCliente.setEnabled(false);
							filtroContract.setVisible(true);
							filtroContract.setEnabled(true);
							filtroProyecto.setVisible(false);
							filtroProyecto.setEnabled(false);
							filtroWorker.setVisible(false);
							filtroWorker.setEnabled(false);
							panelFiltContrato.setVisible(true);
							panelFiltContrato.setEnabled(true);
							panelFiltro.setVisible(false);
							panelFiltro.setEnabled(false);
							panelInfo.setVisible(false);
							panelInfo.setEnabled(false);
						}
					});
					btnContratos.setBackground(SystemColor.inactiveCaptionBorder);
					btnContratos.setBounds(219, 19, 97, 21);
					panel_1.add(btnContratos);
				}
				{
					JButton btnTrabajadores = new JButton("Trabajadores");
					btnTrabajadores.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							scrPaneClient.setEnabled(false);
							scrPaneClient.setVisible(false);
							scrPaneContract.setVisible(false);
							scrPaneContract.setEnabled(false);
							scrPaneProyect.setVisible(false);
							scrPaneProyect.setEnabled(false);
							scrPaneWorker.setVisible(true);
							scrPaneWorker.setEnabled(true);
							filtroCliente.setVisible(false);
							filtroCliente.setEnabled(false);
							filtroContract.setVisible(false);
							filtroContract.setEnabled(false);
							filtroProyecto.setVisible(false);
							filtroProyecto.setEnabled(false);
							filtroWorker.setVisible(true);
							filtroWorker.setEnabled(true);
							panelFiltContrato.setVisible(true);
							panelFiltContrato.setEnabled(true);
							panelFiltro.setVisible(false);
							panelFiltro.setEnabled(false);
							panelInfo.setVisible(false);
							panelInfo.setEnabled(false);
						}
					});
					btnTrabajadores.setBackground(SystemColor.inactiveCaptionBorder);
					btnTrabajadores.setBounds(14, 48, 115, 21);
					panel_1.add(btnTrabajadores);
				}
			}
			
			panelInfo = new JPanel();
			panelInfo.setBackground(SystemColor.inactiveCaptionBorder);
			panelInfo.setBounds(27, 123, 766, 334);
			panel.add(panelInfo);
			panelInfo.setLayout(null);
			{
				JLabel lblEligeUnTipo = new JLabel("Elige un tipo de Lista para ver la informaci\u00F3n de las tablas.");
				lblEligeUnTipo.setEnabled(false);
				lblEligeUnTipo.setBounds(177, 152, 352, 16);
				panelInfo.add(lblEligeUnTipo);
			}
			{
				scrPaneWorker = new JScrollPane();
				scrPaneWorker.setBounds(36, 130, 750, 317);
				scrPaneWorker.setEnabled(false);
				scrPaneWorker.setVisible(false);
				panel.add(scrPaneWorker);
				{
					workerTable = new JTable();
					String[] columnNames = {"ID","C�dula","Nombre","Direcci�n","Sexo","Edad","Salario","Cantidad de proyectos","Evaluaci�n"};
					worker = new DefaultTableModel();
					worker.setColumnIdentifiers(columnNames);
					workerTable.setModel(worker);
					scrPaneWorker.setViewportView(workerTable);
				}
			}
			{
				scrPaneClient = new JScrollPane();
				scrPaneClient.setBounds(36, 130, 750, 317);
				scrPaneClient.setEnabled(false);
				scrPaneClient.setEnabled(false);
				panel.add(scrPaneClient);
				{
					clientTable = new JTable();
					String[] columnNames = {"ID","C�dula","Nombre","Direcci�n","Cantidad de proyectos"};
					cli = new DefaultTableModel();
					cli.setColumnIdentifiers(columnNames);
					clientTable.setModel(cli);
					scrPaneClient.setViewportView(clientTable);
				}
			}
			{
				scrPaneProyect = new JScrollPane();
				scrPaneProyect.setBounds(36, 130, 750, 317);
				scrPaneProyect.setEnabled(false);
				scrPaneProyect.setVisible(false);
				panel.add(scrPaneProyect);
				{
					proyectTable = new JTable();
					String[] columnNames = {"ID","Nombre","Descripci�n","Lenguaje","Trabajadores"};
					pro = new DefaultTableModel();
					pro.setColumnIdentifiers(columnNames);
					proyectTable.setModel(pro);
					scrPaneProyect.setViewportView(proyectTable);
				}
			}
			{
				scrPaneContract = new JScrollPane();
				scrPaneContract.setBounds(36, 130, 750, 317);
				scrPaneContract.setEnabled(false);
				scrPaneContract.setVisible(false);
				panel.add(scrPaneContract);
				
				contractTable = new JTable();
				String[] columnNames = {"ID","Cliente","Proyecto","Fecha Inicial","Fecha Final", "Monto"};
				contr = new DefaultTableModel();
				contr.setColumnIdentifiers(columnNames);
				contractTable.setModel(contr);
				scrPaneContract.setViewportView(contractTable);
			}
			{
				panelFiltContrato = new JPanel();
				panelFiltContrato.setLayout(null);
				panelFiltContrato.setEnabled(false);
				panelFiltContrato.setVisible(false);
				panelFiltContrato.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelFiltContrato.setBackground(SystemColor.inactiveCaptionBorder);
				panelFiltContrato.setBounds(435, 13, 358, 79);
				panel.add(panelFiltContrato);
				{
					filtroContract = new JPanel();
					filtroContract.setLayout(null);
					filtroContract.setBackground(SystemColor.inactiveCaptionBorder);
					filtroContract.setBounds(12, 13, 334, 53);
					panelFiltContrato.add(filtroContract);
					{
						JButton button = new JButton("ID");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(39, 5, 45, 21);
						filtroContract.add(button);
					}
					{
						JButton btnFechaIni = new JButton("Tipo");
						btnFechaIni.setBackground(SystemColor.inactiveCaptionBorder);
						btnFechaIni.setBounds(111, 5, 70, 21);
						filtroContract.add(btnFechaIni);
					}
					{
						JButton btnFechaFin = new JButton("Sexo");
						btnFechaFin.setBackground(SystemColor.inactiveCaptionBorder);
						btnFechaFin.setBounds(214, 5, 70, 21);
						filtroContract.add(btnFechaFin);
					}
					{
						JButton btnCliente = new JButton("Evaluaci\u00F3n");
						btnCliente.setBackground(SystemColor.inactiveCaptionBorder);
						btnCliente.setBounds(39, 32, 119, 21);
						filtroContract.add(btnCliente);
					}
				}
				{
					filtroWorker = new JPanel();
					filtroWorker.setLayout(null);
					filtroWorker.setBackground(SystemColor.inactiveCaptionBorder);
					filtroWorker.setBounds(12, 13, 334, 53);
					panelFiltContrato.add(filtroWorker);
					{
						JButton button = new JButton("ID");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(25, 5, 45, 21);
						filtroWorker.add(button);
					}
					{
						JButton button = new JButton("Fecha Ini");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(91, 5, 95, 21);
						filtroWorker.add(button);
					}
					{
						JButton button = new JButton("Fecha Fin");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(200, 5, 122, 21);
						filtroWorker.add(button);
					}
					{
						JButton button = new JButton("Cliente");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(35, 32, 84, 21);
						filtroWorker.add(button);
					}
					{
						JButton button = new JButton("Proyecto");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(155, 32, 87, 21);
						filtroWorker.add(button);
					}
				}
			}
			{
				panelFiltro = new JPanel();
				panelFiltro.setEnabled(false);
				panelFiltro.setVisible(false);
				panelFiltro.setBackground(SystemColor.inactiveCaptionBorder);
				panelFiltro.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelFiltro.setBounds(435, 13, 358, 52);
				panel.add(panelFiltro);
				panelFiltro.setLayout(null);
				{
					filtroProyecto = new JPanel();
					filtroProyecto.setLayout(null);
					filtroProyecto.setBackground(SystemColor.inactiveCaptionBorder);
					filtroProyecto.setBounds(12, 13, 334, 26);
					panelFiltro.add(filtroProyecto);
					{
						JButton button = new JButton("ID");
						button.setBackground(SystemColor.inactiveCaptionBorder);
						button.setBounds(36, 5, 45, 21);
						filtroProyecto.add(button);
					}
					{
						JButton btnLenguaje = new JButton("Nombre");
						btnLenguaje.setBackground(SystemColor.inactiveCaptionBorder);
						btnLenguaje.setBounds(103, 5, 83, 21);
						filtroProyecto.add(btnLenguaje);
					}
					{
						JButton btnLenguaje_1 = new JButton("Lenguaje");
						btnLenguaje_1.setBackground(SystemColor.inactiveCaptionBorder);
						btnLenguaje_1.setBounds(200, 5, 122, 21);
						filtroProyecto.add(btnLenguaje_1);
					}
				}
				
				filtroCliente = new JPanel();
				filtroCliente.setBackground(SystemColor.inactiveCaptionBorder);
				filtroCliente.setBounds(12, 13, 334, 26);
				panelFiltro.add(filtroCliente);
				filtroCliente.setLayout(null);
				
				JButton btnId = new JButton("ID");
				btnId.setBackground(SystemColor.inactiveCaptionBorder);
				btnId.setBounds(36, 5, 45, 21);
				filtroCliente.add(btnId);
				{
					JButton btnCdula = new JButton("Nombre");
					btnCdula.setBackground(SystemColor.inactiveCaptionBorder);
					btnCdula.setBounds(103, 5, 83, 21);
					filtroCliente.add(btnCdula);
				}
				{
					JButton btnCantProyectos = new JButton("Cant Proyectos");
					btnCantProyectos.setBackground(SystemColor.inactiveCaptionBorder);
					btnCantProyectos.setBounds(200, 5, 122, 21);
					filtroCliente.add(btnCantProyectos);
				}
			}
		}
	}
	private void loadClientTable() {
		
		{
			cli.setRowCount(0);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			
			clientTable.getColumnModel().getColumn(0).setCellRenderer(tcr);
			clientTable.getColumnModel().getColumn(1).setCellRenderer(tcr);
			clientTable.getColumnModel().getColumn(2).setCellRenderer(tcr);
			clientTable.getColumnModel().getColumn(3).setCellRenderer(tcr);
			clientTable.getColumnModel().getColumn(4).setCellRenderer(tcr);
			
			filacli = new Object[cli.getColumnCount()];
			for (int j = 0; j < Empresa.getInstance().getMisClientes().size(); j++) {
				
				filacli[0] = Empresa.getInstance().getMisClientes().get(j).getCedula();
				
				cli.addRow(filacli);
			}
			
			clientTable.setModel(cli);
			clientTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			clientTable.getTableHeader().setReorderingAllowed(false);
			TableColumnModel columnModel = clientTable.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(180);
			columnModel.getColumn(1).setPreferredWidth(200);
			columnModel.getColumn(2).setPreferredWidth(180);
			columnModel.getColumn(3).setPreferredWidth(130);
			columnModel.getColumn(4).setPreferredWidth(80);
		
	}
	}
}
