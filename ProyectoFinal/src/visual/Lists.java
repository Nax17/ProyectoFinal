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
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lists extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Lists dialog = new Lists();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Lists() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Lists.class.getResource("/favicon.png")));
		setBounds(100, 100, 846, 555);
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
				panel_1.setBounds(12, 13, 321, 79);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JButton btnClientes = new JButton("Clientes");
					btnClientes.setBackground(SystemColor.inactiveCaptionBorder);
					btnClientes.setBounds(14, 19, 81, 21);
					panel_1.add(btnClientes);
				}
				{
					JButton btnProyectos = new JButton("Proyectos");
					btnProyectos.setBackground(SystemColor.inactiveCaptionBorder);
					btnProyectos.setBounds(113, 19, 87, 21);
					panel_1.add(btnProyectos);
				}
				{
					JButton btnContratos = new JButton("Contratos");
					btnContratos.setBackground(SystemColor.inactiveCaptionBorder);
					btnContratos.setBounds(212, 19, 97, 21);
					panel_1.add(btnContratos);
				}
				{
					JButton btnTrabajadores = new JButton("Trabajadores");
					btnTrabajadores.setBackground(SystemColor.inactiveCaptionBorder);
					btnTrabajadores.setBounds(14, 48, 109, 21);
					panel_1.add(btnTrabajadores);
				}
			}
			{
				JScrollPane scrPaneWorker = new JScrollPane();
				scrPaneWorker.setBounds(36, 130, 750, 317);
				panel.add(scrPaneWorker);
				{
					table_3 = new JTable();
					scrPaneWorker.setViewportView(table_3);
				}
			}
			{
				JScrollPane scrPaneClient = new JScrollPane();
				scrPaneClient.setBounds(36, 130, 750, 317);
				panel.add(scrPaneClient);
				{
					table = new JTable();
					String[] columnNames = {"ID","Cédula","Nombre","Dirección","Cantidad de proyectos"};
					cli = new DefaultTableModel();
					cli.setColumnIdentifiers(columnNames);
					table.setModel(cli);
					scrPaneClient.setViewportView(table);
				}
			}
			{
				JScrollPane scrPaneProyect = new JScrollPane();
				scrPaneProyect.setBounds(36, 130, 750, 317);
				panel.add(scrPaneProyect);
				{
					table_1 = new JTable();
					String[] columnNames = {"ID","Nombre","Descripción","Lenguaje","Trabajadores"};
					pro = new DefaultTableModel();
					pro.setColumnIdentifiers(columnNames);
					table.setModel(pro);
					scrPaneProyect.setViewportView(table_1);
				}
			}
			{
				JScrollPane scrPaneContract = new JScrollPane();
				scrPaneContract.setBounds(36, 130, 750, 317);
				panel.add(scrPaneContract);
				
				table_2 = new JTable();
				String[] columnNames = {"ID","Cliente","Proyecto","Fecha Inicial","Fecha Final", "Monto"};
				contr = new DefaultTableModel();
				contr.setColumnIdentifiers(columnNames);
				table.setModel(contr);
				scrPaneContract.setViewportView(table_2);
			}
			{
				JPanel panelFiltContrato = new JPanel();
				panelFiltContrato.setLayout(null);
				panelFiltContrato.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelFiltContrato.setBackground(SystemColor.inactiveCaptionBorder);
				panelFiltContrato.setBounds(435, 13, 358, 79);
				panel.add(panelFiltContrato);
				{
					JPanel filtroContract = new JPanel();
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
					JPanel filtroWorker = new JPanel();
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
				JPanel panelFiltro = new JPanel();
				panelFiltro.setBackground(SystemColor.inactiveCaptionBorder);
				panelFiltro.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelFiltro.setBounds(435, 13, 358, 52);
				panel.add(panelFiltro);
				panelFiltro.setLayout(null);
				{
					JPanel filtroProyecto = new JPanel();
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
				
				JPanel filtroCliente = new JPanel();
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
}
