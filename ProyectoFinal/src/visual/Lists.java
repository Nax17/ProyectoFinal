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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lists extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		setBounds(100, 100, 802, 513);
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
				panel_1.setBounds(12, 13, 321, 52);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JButton btnClientes = new JButton("Clientes");
					btnClientes.setBackground(SystemColor.inactiveCaptionBorder);
					btnClientes.setBounds(14, 19, 81, 25);
					panel_1.add(btnClientes);
				}
				{
					JButton btnProyectos = new JButton("Proyectos");
					btnProyectos.setBackground(SystemColor.inactiveCaptionBorder);
					btnProyectos.setBounds(113, 19, 87, 25);
					panel_1.add(btnProyectos);
				}
				{
					JButton btnContratos = new JButton("Contratos");
					btnContratos.setBackground(SystemColor.inactiveCaptionBorder);
					btnContratos.setBounds(212, 19, 97, 25);
					panel_1.add(btnContratos);
				}
			}
			{
				JScrollPane scrPaneClient = new JScrollPane();
				scrPaneClient.setBounds(12, 78, 750, 317);
				panel.add(scrPaneClient);
				{
					table = new JTable();
					scrPaneClient.setViewportView(table);
				}
			}
			{
				JScrollPane scrPaneProyect = new JScrollPane();
				scrPaneProyect.setBounds(12, 78, 750, 317);
				panel.add(scrPaneProyect);
				{
					table_1 = new JTable();
					scrPaneProyect.setViewportView(table_1);
				}
			}
			{
				JScrollPane scrPaneContract = new JScrollPane();
				scrPaneContract.setBounds(12, 78, 750, 317);
				panel.add(scrPaneContract);
				
				table_2 = new JTable();
				scrPaneContract.setViewportView(table_2);
			}
			{
				JPanel panelFiltro = new JPanel();
				panelFiltro.setBackground(SystemColor.inactiveCaptionBorder);
				panelFiltro.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelFiltro.setBounds(435, 13, 327, 52);
				panel.add(panelFiltro);
			}
		}
	}
}
