import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameTarjeta extends JFrame {

	private JPanel contentPane;
	private JTextField txtTarjeta;
	private JTextField txtCedula;
	private JTextField txtFechaEmision;
	private JLabel lblCodigoSeguridad;
	private JTextField txtCodigoSeguridad;
	private JLabel lblSaldoColones;
	private JTextField txtSaldoColones;
	private JLabel lblSaldoDlares;
	private JTextField txtSaldoDolares;
	private JLabel lblMarca;
	private JLabel lblImagen;
	private JButton btnRegresar;

	
	public FrameTarjeta(String tituloFrame, String tituloBoton) {
		setTitle(tituloFrame);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		
		JLabel lblNumTarjeta = new JLabel("N\u00FAmero de Tarjeta:");
		lblNumTarjeta.setBounds(26, 29, 113, 14);
		contentPane.add(lblNumTarjeta);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(148, 26, 86, 20);
		contentPane.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		JLabel lblCdula = new JLabel("C\u00E9dula:");
		lblCdula.setBounds(26, 71, 46, 14);
		contentPane.add(lblCdula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(148, 68, 86, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblFechaDeEmisin = new JLabel("Fecha de emisi\u00F3n:");
		lblFechaDeEmisin.setBounds(26, 116, 103, 14);
		contentPane.add(lblFechaDeEmisin);
		
		txtFechaEmision = new JTextField();
		txtFechaEmision.setBounds(148, 113, 86, 20);
		contentPane.add(txtFechaEmision);
		txtFechaEmision.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha de vencimiento:");
		lblFecha.setBounds(26, 159, 145, 14);
		contentPane.add(lblFecha);
		
		lblCodigoSeguridad = new JLabel("Codigo Seguridad:");
		lblCodigoSeguridad.setBounds(26, 197, 113, 14);
		contentPane.add(lblCodigoSeguridad);
		
		txtCodigoSeguridad = new JTextField();
		txtCodigoSeguridad.setBounds(148, 194, 86, 20);
		contentPane.add(txtCodigoSeguridad);
		txtCodigoSeguridad.setColumns(10);
		
		lblSaldoColones = new JLabel("Saldo Colones:");
		lblSaldoColones.setBounds(26, 247, 103, 14);
		contentPane.add(lblSaldoColones);
		
		txtSaldoColones = new JTextField();
		txtSaldoColones.setBounds(148, 244, 86, 20);
		contentPane.add(txtSaldoColones);
		txtSaldoColones.setColumns(10);
		
		lblSaldoDlares = new JLabel("Saldo D\u00F3lares:");
		lblSaldoDlares.setBounds(26, 288, 103, 14);
		contentPane.add(lblSaldoDlares);
		
		txtSaldoDolares = new JTextField();
		txtSaldoDolares.setBounds(148, 285, 86, 20);
		contentPane.add(txtSaldoDolares);
		txtSaldoDolares.setColumns(10);
		
		lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(26, 332, 64, 14);
		contentPane.add(lblMarca);
		
		JComboBox cmbxMarca = new JComboBox();
		cmbxMarca.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD", "AMERICAN EXPRESS"}));
		cmbxMarca.setBounds(148, 329, 113, 20);
		contentPane.add(cmbxMarca);
		
		JButton btnIngresar = new JButton(tituloBoton);
		btnIngresar.setBounds(21, 377, 118, 23);
		contentPane.add(btnIngresar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRegresar.setIcon(new ImageIcon(FrameTarjeta.class.getResource("/Imagenes/back.png")));
		btnRegresar.setBounds(321, 386, 113, 23);
		contentPane.add(btnRegresar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 272, 398);
		panel.setOpaque(false);
		contentPane.add(panel);
		
		lblImagen = new JLabel("New label");
		lblImagen.setIcon(new ImageIcon(FrameTarjeta.class.getResource("/Imagenes/FondoFrame.jpg")));
		lblImagen.setBounds(-13, -14, 472, 437);
		contentPane.add(lblImagen);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
