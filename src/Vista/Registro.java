package Vista;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import javax.swing.UIManager;

import Controlador.LimitadorCaracteres;
import Controlador.ManejadorRegistro;


public class Registro extends JFrame{
	
	public JPanel jpPrincipal;
	public JTextField jtCed, jtNom, jtFecha,jtConCed, jtResulCon;
	public JTextArea jtMotu;
	public JButton jbGuardar, jbLimpiar, jbSalir, jbSig,jbConsulta;
	public JRadioButton jbAfi;
	

	Date fechaActual = new Date();
	DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
	
	
	
	public Registro() {	
		super("HOSPITAL ANDREA");
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
		
		jpPrincipal = new JPanel();
		jpPrincipal.setBounds(0, 0, 1000, 700);
		jpPrincipal.setLayout(null);
			
		
		
//*****************************************************************************************	
		//Imagenes

		ImageIcon andrea = new ImageIcon(Registro.class.getResource("/img/andrea.gif"));		
		ImageIcon andrea_redim = new ImageIcon(
				andrea.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));
	   		
		JLabel jlAndrea = new JLabel(andrea_redim);
		jlAndrea.setBounds(0, 0, 200, 150);
		jpPrincipal.add(jlAndrea);
		
		
		ImageIcon andrea2 = new ImageIcon(Registro.class.getResource("/img/2.gif"));		
		ImageIcon andrea2_redim2 = new ImageIcon(
				andrea2.getImage().getScaledInstance(340, 140, Image.SCALE_DEFAULT));
	   		
		JLabel jlAndrea2 = new JLabel(andrea2_redim2);
		jlAndrea2.setBounds(640, 0, 350, 140);
		jpPrincipal.add(jlAndrea2);
		
		
		ImageIcon corazon = new ImageIcon(Registro.class.getResource("/img/corazon.gif"));		
		ImageIcon corazon_redim = new ImageIcon(
				corazon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	   		
		JLabel jlCorazon = new JLabel(corazon_redim);
	    jlCorazon.setBounds(50, 350, 200, 200);
		jpPrincipal.add(jlCorazon);
		
		
		ImageIcon frase = new ImageIcon(Registro.class.getResource("/img/frase.gif"));		
		ImageIcon frase_redim = new ImageIcon(
				frase.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
	   		
		JLabel jlfrase = new JLabel(frase_redim);
	    jlfrase.setBounds(200, 350, 300, 200);
		jpPrincipal.add(jlfrase);
		
		ImageIcon infinito = new ImageIcon(Registro.class.getResource("/img/infinito.gif"));		
		ImageIcon infinito_redim = new ImageIcon(
				infinito.getImage().getScaledInstance(270, 200, Image.SCALE_DEFAULT));
	   		
		JLabel jlinfinito = new JLabel(infinito_redim);
	    jlinfinito.setBounds(420, 350, 270, 200);
		jpPrincipal.add(jlinfinito);
		
		
		
		ImageIcon fotoandrea = new ImageIcon(Registro.class.getResource("/img/fotoandrea.jpg"));		
		ImageIcon foto_redim = new ImageIcon(
				fotoandrea.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
	   		
		JLabel jlfoto = new JLabel(foto_redim);
	    jlfoto.setBounds(695, 250, 300, 300);
		jpPrincipal.add(jlfoto);
		
	
		
		
//*******************************************************************************************		
// Etiquetas y campos de texto	
		
		JLabel jlTitulo = new JLabel("REGISTRO DE PACIENTES"); 
		jlTitulo.setBounds(280, 20, 300, 40);
		jlTitulo.setForeground(Color.red);
		Font fuente = new Font("Tahoma", Font.BOLD, 18);
		jlTitulo.setFont(fuente);
		jpPrincipal.add(jlTitulo);
		
		
		JLabel jlCedula = new JLabel("CEDULA");
		jlCedula.setBounds(230, 80, 150, 30);
		jlCedula.setForeground(Color.RED);
		jpPrincipal.add(jlCedula);
		
		jtCed = new JTextField("");
		jtCed.setDocument(new LimitadorCaracteres(jtCed, 10, 0));
		jtCed.setBounds(340, 80, 150, 30);
		jtCed.setFont(new Font("Verdana", Font.ITALIC, 15));
		jpPrincipal.add(jtCed);
		
		JLabel jlNom = new JLabel("NOMBRE");
		jlNom.setBounds(230, 120, 150, 30);
		jlNom.setForeground(Color.RED);
		jpPrincipal.add(jlNom);
		
		jtNom = new JTextField("");
		jtNom.setDocument(new LimitadorCaracteres(jtNom, 60, 1));
		jtNom.setBounds(340, 120, 300, 30);
		jpPrincipal.add(jtNom);
		
		JLabel jlAfi = new JLabel("TIPO DE AFILIACION");
		jlAfi.setBounds(210, 170, 180, 30);
		jlAfi.setForeground(Color.RED);
		jpPrincipal.add(jlAfi);
		
		JLabel jlMotu = new JLabel("MOTIVO DE URGENCIA");
		jlMotu.setForeground(Color.RED);
		jlMotu.setBounds(210, 200, 180, 30);
		jpPrincipal.add(jlMotu);
		
		jtMotu = new JTextArea();
		jtMotu.setLineWrap(true);
		jtMotu.setWrapStyleWord(true);
		
		JScrollPane js = new JScrollPane(jtMotu);
		js.setBounds(390, 210, 300, 50);
		jpPrincipal.add(js);
		
		
	
		

		JLabel jlFecha = new JLabel("FECHA DE INGRESO");
		jlFecha.setForeground(Color.RED);
		jlFecha.setBounds(210, 270, 150, 30);
		jpPrincipal.add(jlFecha);
		
		jtFecha = new JTextField(formatoFecha.format(fechaActual));
		jtFecha.setEnabled(false);
		jtFecha.setBounds(370, 270, 250, 30);
		jtFecha.setFont(new Font("Verdana", Font.ITALIC, 15));
		jtFecha.setForeground(Color.RED);
		jpPrincipal.add(jtFecha);
		
//**************************************************************************************
//		Botones
		
		jbAfi = new JRadioButton("MEDICINA PREPAGADA");
		jbAfi.setBounds(390, 170, 250, 30);
		jpPrincipal.add(jbAfi);
		
		
		
		jbGuardar = new JButton(
				new ImageIcon(Registro.class.getResource("/img/Guardar48.png")));
		jbGuardar.setRolloverIcon(
				new ImageIcon(Registro.class.getResource("/img/Guardar64.png")));
		
		jbGuardar.setContentAreaFilled(false);
		jbGuardar.setBorderPainted(false);
		jbGuardar.setMnemonic('G');
		jbGuardar.setBounds(100, 550, 85, 85);
		jbGuardar.setActionCommand("boton de guardar");
		jpPrincipal.add(jbGuardar);
		
		
		jbLimpiar = new JButton(
				new ImageIcon(Registro.class.getResource("/img/papelera48.png")));
		jbLimpiar.setRolloverIcon(
				new ImageIcon(Registro.class.getResource("/img/papelera64.png")));
		jbLimpiar.setContentAreaFilled(false);
		jbLimpiar.setBorderPainted(false);
		
		jbLimpiar.setMnemonic('L');// atajo para limpiar campos de texto
		jbLimpiar.setBounds(350, 550, 85, 85);
		jpPrincipal.add(jbLimpiar);
		
		jbSalir = new JButton(
				new ImageIcon(Registro.class.getResource("/img/salir48.png")));
		jbSalir.setRolloverIcon(
				new ImageIcon(Registro.class.getResource("/img/salir64.png")));
		jbSalir.setContentAreaFilled(false);
		jbSalir.setBorderPainted(false);
		
		jbSalir.setMnemonic('S');
		jbSalir.setBounds(550, 550, 85, 85);
		jpPrincipal.add(jbSalir);
		
		jbSig = new JButton(
				new ImageIcon(Registro.class.getResource("/img/siguiente48.png")));
		jbSig.setRolloverIcon(
				new ImageIcon(Registro.class.getResource("/img/siguiente64.png")));
		jbSig.setContentAreaFilled(false);
		jbSig.setBorderPainted(false);
		jbSig.setMnemonic('t');
		jbSig.setBounds(850, 550, 85, 85);
		jpPrincipal.add(jbSig);
		

		ManejadorRegistro mr = new ManejadorRegistro(this);
		jbGuardar.addActionListener(mr);
		jbLimpiar.addActionListener(mr);
		jbSalir.addActionListener(mr);
		jbSig.addActionListener(mr);
		add(jpPrincipal);
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
	try{
		UIManager.setLookAndFeel(
		 //"com.jtattoo.plaf.acryl.AcrylLookAndFeel"
		//"com.jtattoo.plaf.aero.AeroLookAndFeel"
		//"com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"
		//"com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"  
		//"com.jtattoo.plaf.fast.FastLookAndFeel"  
		//"com.jtattoo.plaf.hifi.HiFiLookAndFeel" 
		//"com.jtattoo.plaf.luna.LunaLookAndFeel"   	 	  
		"com.jtattoo.plaf.mcwin.McWinLookAndFeel" 
		//"com.jtattoo.plaf.mint.MintLookAndFeel"  	  
		//"com.jtattoo.plaf.noire.NoireLookAndFeel"
		//"com.jtattoo.plaf.smart.SmartLookAndFeel"
		//"com.jtattoo.plaf.graphite.GraphiteLookAndFeel"
	   // "com.jtattoo.plaf.texture.TextureLookAndFeel"
		);
	}catch(Exception e){
			
	}
		
	
		
	Registro ob = new Registro();
		
	}
}
