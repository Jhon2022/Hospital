package Vista;

import java.awt.Color;import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controlador.ManejadorFechaHoraSalida;

public class FechaHoraSalida  extends JFrame {
	
	
	public JPanel jpPrincipal;
	public JTextField  jtHora, jtFecha;
	public JButton jbGuardar, jbVolvere, jbSiguiente;

	
	SalaCamillas salac;
	Registro reg;
	Medicamentos med;
	Consultas cons;
	
	Date fechaActual = new Date();
	Date horaActual = new Date();
	
	DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	
	

	
	public FechaHoraSalida() {
		
		super("PACIENTES DADOS DE ALTA");
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/blue-home-icon.png"));
		setIconImage(icon);
		setSize(1000, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		crearGUI();
		
			}

	private void crearGUI() {
		jpPrincipal = new JPanel();
		jpPrincipal.setBounds(0, 0, 1000, 700);
		jpPrincipal.setLayout(null);
		add(jpPrincipal);
		
		
		JLabel jlTitulo = new JLabel("PACIENTES DADOS DE ALTA"); 
		jlTitulo.setBounds(310, 20, 300, 40);
		Font fuente = new Font("Tahoma", Font.BOLD, 18);
		jlTitulo.setForeground(Color.RED);
		jlTitulo.setFont(fuente);
		jpPrincipal.add(jlTitulo);
		
		
		JLabel jlFecha = new JLabel("Fecha De Salida");
		Font fuente2 = new Font("Tahoma", Font.BOLD, 14);
		jlFecha.setFont(fuente2);
		jlFecha.setForeground(Color.RED);
		jlFecha.setBounds(20, 50, 300, 40);
		jpPrincipal.add(jlFecha);
		
		jtFecha = new JTextField(formatoFecha.format(fechaActual));
		jtFecha.setBounds(20, 80, 150, 30);
		jtFecha.setFont(new Font("Verdana", Font.ITALIC, 15));
		jtFecha.setEnabled(false);
		jpPrincipal.add(jtFecha);
		
		
		JLabel jlHora = new JLabel("Hora De Salida");
		jlHora.setFont(fuente2);
		jlHora.setForeground(Color.RED);
		jlHora.setBounds(20, 110, 150, 30);
		jpPrincipal.add(jlHora);
		
		jtHora = new JTextField(formatoHora.format(horaActual));
		jtHora.setBounds(20, 140, 150, 30);
		jtHora.setFont(new Font("Verdana", Font.ITALIC, 15));
		jtHora.setEnabled(false);
		jpPrincipal.add(jtHora);
		
		
		
		
		jbGuardar = new JButton(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/Guardar48.png")));
		jbGuardar.setRolloverIcon(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/Guardar64.png")));
		
		jbGuardar.setContentAreaFilled(false);
		jbGuardar.setBorderPainted(false);
		jbGuardar.setMnemonic('G');
		jbGuardar.setBounds(550, 550, 85, 85);
		jbGuardar.setActionCommand("boton de guardar");
		jpPrincipal.add(jbGuardar);
		
		

		jbVolvere = new JButton(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/atras48.png")));
		jbVolvere.setRolloverIcon(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/atras64.png")));
		jbVolvere.setContentAreaFilled(false);
		jbVolvere.setBorderPainted(false);
		jbVolvere.setMnemonic('V');
		
		jbVolvere.setBounds(30, 570, 85, 85);
		jpPrincipal.add(jbVolvere);
		
		
		jbSiguiente = new JButton(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/siguiente48.png")));
		jbSiguiente.setRolloverIcon(
				new ImageIcon(FechaHoraSalida.class.getResource("/img/siguiente64.png")));
		jbSiguiente.setContentAreaFilled(false);
		jbSiguiente.setBorderPainted(false);
		jbSiguiente.setMnemonic('V');
		
		jbSiguiente.setBounds(900, 570, 85, 85);
		jpPrincipal.add(jbSiguiente);
		
		
		
		
		
	ManejadorFechaHoraSalida mfhs = new ManejadorFechaHoraSalida(this,med,cons);
		
		
		jbGuardar.addActionListener(mfhs);
		jbVolvere.addActionListener(mfhs);
		jbSiguiente.addActionListener(mfhs);
		add(jpPrincipal);
		

		
	

		

	}
}
