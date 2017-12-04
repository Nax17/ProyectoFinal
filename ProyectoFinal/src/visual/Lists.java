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
import javax.swing.JTextField;

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
	private static Object[] filapro;
	private static Object[] filacont;
	private static Object[] filawor;
	private JTextField txtDato;
	private JLabel lblDato;

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
							lblDato.setEnabled(false);
							lblDato.setVisible(false);
							txtDato.setVisible(false);
							txtDato.setEnabled(false);
							
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
							lblDato.setEnabled(false);
							lblDato.setVisible(false);
							txtDato.setVisible(false);
							txtDato.setEnabled(false);
							
							loadProyectTable();
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
							lblDato.setEnabled(false);
							lblDato.setVisible(false);
							txtDato.setVisible(false);
							txtDato.setEnabled(false);
							
							loadContractTable();
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
							lblDato.setEnabled(false);
							lblDato.setVisible(false);
							txtDato.setVisible(false);
							txtDato.setEnabled(false);
							
							loadWorkerTable();
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
					String[] columnNames = {"ID","Cédula","Nombre","Dirección","Sexo","Edad","Salario","Evaluación"};
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
					String[] columnNames = {"ID","Cédula","Nombre","Dirección","Proyectos"};
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
					String[] columnNames = {"ID","Nombre","Descripción","Lenguaje","Trabajadores"};
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
						button.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
							}
						});
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
				btnId.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblDato.setEnabled(true);
						lblDato.setVisible(true);
						txtDato.setVisible(true);
						txtDato.setEnabled(true);
					}
				});
				btnId.setBackground(SystemColor.inactiveCaptionBorder);
				btnId.setBounds(36, 5, 45, 21);
				filtroCliente.add(btnId);
				{
					JButton btnCdula = new JButton("Nombre");
					btnCdula.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblDato.setEnabled(true);
							lblDato.setVisible(true);
							txtDato.setVisible(true);
							txtDato.setEnabled(true);
						}
					});
					btnCdula.setBackground(SystemColor.inactiveCaptionBorder);
					btnCdula.setBounds(103, 5, 83, 21);
					filtroCliente.add(btnCdula);
				}
				{
					JButton btnCantProyectos = new JButton("Cant Proyectos");
					btnCantProyectos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblDato.setEnabled(true);
							lblDato.setVisible(true);
							txtDato.setVisible(true);
							txtDato.setEnabled(true);
						}
					});
					btnCantProyectos.setBackground(SystemColor.inactiveCaptionBorder);
					btnCantProyectos.setBounds(200, 5, 122, 21);
					filtroCliente.add(btnCantProyectos);
				}
			}
			{
				lblDato = new JLabel("Dato:");
				lblDato.setEnabled(false);
				lblDato.setVisible(false);
				lblDato.setBounds(435, 96, 39, 16);
				panel.add(lblDato);
			}
			
			txtDato = new JTextField();
			txtDato.setVisible(false);
			txtDato.setEnabled(false);
			txtDato.setBackground(SystemColor.inactiveCaptionBorder);
			txtDato.setBounds(474, 94, 116, 21);
			panel.add(txtDato);
			txtDato.setColumns(10);
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
				
				filacli[0] = Empresa.getInstance().getMisClientes().get(j).getIdcli();
				filacli[1] = Empresa.getInstance().getMisClientes().get(j).getCedula();
				filacli[2] = Empresa.getInstance().getMisClientes().get(j).getNombre();
				filacli[3] = Empresa.getInstance().getMisClientes().get(j).getDireccion();
				filacli[4] = Empresa.getInstance().getMisClientes().get(j).getMisProyectos();
				
				cli.addRow(filacli);
			}
			
			clientTable.setModel(cli);
			clientTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			clientTable.getTableHeader().setReorderingAllowed(false);
			TableColumnModel columnModel = clientTable.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(120);
			columnModel.getColumn(1).setPreferredWidth(200);
			columnModel.getColumn(2).setPreferredWidth(180);
			columnModel.getColumn(3).setPreferredWidth(167);
			columnModel.getColumn(4).setPreferredWidth(80);
		
	}
	}
	
	private void loadProyectTable() {
		
		{
			pro.setRowCount(0);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			
			proyectTable.getColumnModel().getColumn(0).setCellRenderer(tcr);
			proyectTable.getColumnModel().getColumn(1).setCellRenderer(tcr);
			proyectTable.getColumnModel().getColumn(2).setCellRenderer(tcr);
			proyectTable.getColumnModel().getColumn(3).setCellRenderer(tcr);
			proyectTable.getColumnModel().getColumn(4).setCellRenderer(tcr);
			
			filapro = new Object[pro.getColumnCount()];
			for (int j = 0; j < Empresa.getInstance().getMisProyectos().size(); j++) {
				
				filapro[0] = Empresa.getInstance().getMisProyectos().get(j).getId();
				filapro[1] = Empresa.getInstance().getMisProyectos().get(j).getNombre();
				filapro[2] = Empresa.getInstance().getMisProyectos().get(j).getDescripcion();
				filapro[3] = Empresa.getInstance().getMisProyectos().get(j).getLenguaje();
				filapro[4] = Empresa.getInstance().getMisProyectos().get(j).getMisTrabajadores();
				
				pro.addRow(filapro);
			}
			
			proyectTable.setModel(pro);
			proyectTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			proyectTable.getTableHeader().setReorderingAllowed(false);
			TableColumnModel columnModel = proyectTable.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(120);
			columnModel.getColumn(1).setPreferredWidth(200);
			columnModel.getColumn(2).setPreferredWidth(180);
			columnModel.getColumn(3).setPreferredWidth(100);
			columnModel.getColumn(4).setPreferredWidth(147);
		
	}
	}
	
	private void loadContractTable() {
		
		{
			contr.setRowCount(0);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			
			contractTable.getColumnModel().getColumn(0).setCellRenderer(tcr);
			contractTable.getColumnModel().getColumn(1).setCellRenderer(tcr);
			contractTable.getColumnModel().getColumn(2).setCellRenderer(tcr);
			contractTable.getColumnModel().getColumn(3).setCellRenderer(tcr);
			contractTable.getColumnModel().getColumn(4).setCellRenderer(tcr);
			contractTable.getColumnModel().getColumn(5).setCellRenderer(tcr);
			
			filacont = new Object[contr.getColumnCount()];
			for (int j = 0; j < Empresa.getInstance().getMisContratos().size(); j++) {
				
				filacont[0] = Empresa.getInstance().getMisContratos().get(j).getIdcon();
				filacont[1] = Empresa.getInstance().getMisContratos().get(j).getCliente();
				filacont[2] = Empresa.getInstance().getMisContratos().get(j).getProyecto();
				filacont[3] = Empresa.getInstance().getMisContratos().get(j).getFechaInicio();
				filacont[4] = Empresa.getInstance().getMisContratos().get(j).getFechaFinal();
				filacont[5] = Empresa.getInstance().getMisContratos().get(j).getMonto();
				
				contr.addRow(filacont);
			}
			
			contractTable.setModel(contr);
			contractTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			contractTable.getTableHeader().setReorderingAllowed(false);
			TableColumnModel columnModel = contractTable.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(120);
			columnModel.getColumn(1).setPreferredWidth(170);
			columnModel.getColumn(2).setPreferredWidth(130);
			columnModel.getColumn(3).setPreferredWidth(120);
			columnModel.getColumn(4).setPreferredWidth(120);
			columnModel.getColumn(5).setPreferredWidth(87);
		
	}
	}
	
	private void loadWorkerTable() {
		
		{
			worker.setRowCount(0);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			
			workerTable.getColumnModel().getColumn(0).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(1).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(2).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(3).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(4).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(5).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(6).setCellRenderer(tcr);
			workerTable.getColumnModel().getColumn(7).setCellRenderer(tcr);
			
			filawor = new Object[worker.getColumnCount()];
			for (int j = 0; j < Empresa.getInstance().getMisTrabajadores().size(); j++) {
				
				filawor[0] = Empresa.getInstance().getMisTrabajadores().get(j).getId();
				filawor[1] = Empresa.getInstance().getMisTrabajadores().get(j).getCedula();
				filawor[2] = Empresa.getInstance().getMisTrabajadores().get(j).getNombre();
				filawor[3] = Empresa.getInstance().getMisTrabajadores().get(j).getDireccion();
				filawor[4] = Empresa.getInstance().getMisTrabajadores().get(j).getSexo();
				filawor[5] = Empresa.getInstance().getMisTrabajadores().get(j).getEdad();
				filawor[6] = Empresa.getInstance().getMisTrabajadores().get(j).getSalario();
				filawor[7] = Empresa.getInstance().getMisTrabajadores().get(j).getEvaluacion();
				
				worker.addRow(filawor);
			}
			
			
			workerTable.setModel(worker);
			workerTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			workerTable.getTableHeader().setReorderingAllowed(false);
			TableColumnModel columnModel = workerTable.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(70);
			columnModel.getColumn(1).setPreferredWidth(130);
			columnModel.getColumn(2).setPreferredWidth(136);
			columnModel.getColumn(3).setPreferredWidth(136);
			columnModel.getColumn(4).setPreferredWidth(50);
			columnModel.getColumn(5).setPreferredWidth(50);
			columnModel.getColumn(6).setPreferredWidth(90);
			columnModel.getColumn(7).setPreferredWidth(85);
		
	}
	}
}
