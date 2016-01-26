package Vista;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controlador.ManejadorConsulta;

public class Consultas extends JFrame{
	
	public JPanel Panel;
	public JTextField jtConsultaCed;
	public JTextField jtResulConCed, jtResulConNom, jtResulConAfi, jtResulConFecha;
	public JTextArea jtResulConUrg;
	public JButton jbConsulta, jbSiguiente, jbVolver;
	
	
	
	
	
	
	
	
	public Consultas(){
		super("Consultas");
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/blue-home-icon.png"));
		setIconImage(icon);
		setSize(1000, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		crearGUI();
		setVisible(true);
	}

	private void crearGUI() {
		
		Panel = new JPanel();
		Panel.setBounds(0, 0, 1000, 700);
		Panel.setLayout(null);
		//Panel.setBackground(Color.WHITE);
		
		
		JLabel jlTitulo = new JLabel("CONSULTAS DE PACIENTES");
		jlTitulo.setBounds(300, 20, 400, 30);
		jlTitulo.setFont(new Font("Arial", Font.BOLD,25));
		jlTitulo.setForeground(Color.ORANGE);
		Panel.add(jlTitulo);
		
		JLabel jlTitulo2 = new JLabel("RESULTADO DE CONSULTAS");
		jlTitulo2.setBounds(50, 50, 300, 30);
		jlTitulo2.setFont(new Font("Arial",Font.BOLD,18));
		jlTitulo2.setForeground(Color.green);
		Panel.add(jlTitulo2);
		
		
		JLabel jlConCedula = new JLabel("Digite Cedula");
		jlConCedula.setBounds(50, 100, 150, 30);
		Panel.add(jlConCedula);
		
		jtConsultaCed = new JTextField("");
	
		jtConsultaCed.setBounds(150, 100,210, 30);
		jtConsultaCed.setFont(new Font("Arial",Font.BOLD,15));
		Panel.add(jtConsultaCed);
		
		JLabel jlResulCed = new JLabel("Cedula");
		jlResulCed.setBounds(50, 150, 150, 30);
		Panel.add(jlResulCed);
		
		jtResulConCed = new JTextField("");

		jtResulConCed.setBounds(150, 150, 210, 30);
		Panel.add(jtResulConCed);
		
		JLabel jlResulNom = new JLabel("Nombre");
		jlResulNom.setBounds(50, 200, 150, 30);
		Panel.add(jlResulNom);
		
		jtResulConNom = new JTextField("");
	
		jtResulConNom.setBounds(150, 200, 210, 30);
		Panel.add(jtResulConNom);
		
		
		JLabel jlResulAfi = new JLabel("Afilicion");
		jlResulAfi.setBounds(50, 250, 150, 30);
		Panel.add(jlResulAfi);
		
		jtResulConAfi = new JTextField("");
	
		jtResulConAfi.setBounds(150, 250, 210, 30);
		Panel.add(jtResulConAfi);
		
		
		JLabel jlResulUrg = new JLabel("Urgencia");
		jlResulUrg.setBounds(50, 300, 150, 30);
		Panel.add(jlResulUrg);
		
		jtResulConUrg = new JTextArea();
		jtResulConUrg.setLineWrap(true);
		jtResulConUrg.setWrapStyleWord(true);
		

		
		JScrollPane js =new JScrollPane(jtResulConUrg);
		js.setBounds(150,300, 300, 50);
		Panel.add(js);
	
		
		JLabel jlResulFecha = new JLabel("Fecha");
		jlResulFecha.setBounds(50, 400, 150, 30);
		Panel.add(jlResulFecha);
		
		jtResulConFecha = new JTextField("");
	
		jtResulConFecha.setBounds(150, 400, 210, 30);
		Panel.add(jtResulConFecha);
		
		
		jbConsulta= new JButton(
				new ImageIcon(Consultas.class.getResource("/img/buscar48.png")));
		jbConsulta.setRolloverIcon(
				new ImageIcon(Consultas.class.getResource("/img/buscar64.png")));
		jbConsulta.setContentAreaFilled(false);
		jbConsulta.setBorderPainted(false);	
		jbConsulta.setActionCommand("boton de consultar");
		jbConsulta.setBounds(830, 450, 85, 85);
		Panel.add(jbConsulta);
		
		

		jbVolver = new JButton(
				new ImageIcon(Consultas.class.getResource("/img/atras48.png")));
		jbVolver.setRolloverIcon(
				new ImageIcon(Consultas.class.getResource("/img/atras64.png")));
		jbVolver.setMnemonic('V');
		jbVolver.setContentAreaFilled(false);
		jbVolver.setBorderPainted(false);
		jbVolver.setBounds(30, 570, 85, 85);
		Panel.add(jbVolver);
		
		
		
		
		

		jbSiguiente = new JButton(
				new ImageIcon(Consultas.class.getResource("/img/siguiente48.png")));
		jbSiguiente.setRolloverIcon(
				new ImageIcon(Consultas.class.getResource("/img/siguiente64.png")));
		jbSiguiente.setContentAreaFilled(false);
		jbSiguiente.setBorderPainted(false);
		jbSiguiente.setMnemonic('t');
		jbSiguiente.setBounds(900, 570, 85, 85);
		Panel.add(jbSiguiente);
		
		
		
		
		ManejadorConsulta mc = new ManejadorConsulta(this);
		
		jbConsulta.addActionListener(mc);
		jbVolver.addActionListener(mc);
	
		
		
		add(Panel);
		
	
	}

	
	
}
