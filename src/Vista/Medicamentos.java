package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.LimitadorCaracteres;
import Controlador.ManejadorMedicamentos;


public class Medicamentos extends JFrame{

	public JPanel jpPrincipal;
	public JButton jbVolvere, jbSig, jbGuardar;
	public JComboBox<String> medicamentos; 
	public JTextField jtMedicamentos, jtCed, jtCod;
	
	SalaCamillas  salac;
	Medicamentos med;
	FechaHoraSalida fechahoraS;

	
	public Medicamentos( ) {
		super("MEDICAMENTOS");
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/blue-home-icon.png"));
		setIconImage(icon);
		setSize(1000, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		crearGUI();
		
		//setVisible(true);
	}
	
	private void crearGUI() {
		
		jpPrincipal = new JPanel();
		jpPrincipal.setBounds(0, 0, 1000, 700);
		jpPrincipal.setLayout(null);
	
//*******************Etiquetas y campos de textos********************//	
		
		JLabel jlTitulo = new JLabel("MEDICAMENTOS"); 
		jlTitulo.setBounds(410, 10, 300, 40);
		jlTitulo.setForeground(Color.BLUE);
		Font fuente = new Font("Tahoma", Font.BOLD, 18);
		jlTitulo.setFont(fuente);
		jpPrincipal.add(jlTitulo);
	
		
		
		JLabel jlNumeroMedicamentos= new JLabel("NÚMERO DE MEDICAMENTOS"); 
		jlNumeroMedicamentos.setBounds(20, 50, 300, 40);
		Font fuente2 = new Font("Tahoma", Font.BOLD, 12);
		jlNumeroMedicamentos.setForeground(Color.BLUE);
		jlNumeroMedicamentos.setFont(fuente2);
		jpPrincipal.add(jlNumeroMedicamentos);
		
		jtMedicamentos = new JTextField("");
		jtMedicamentos.setDocument(new LimitadorCaracteres(jtMedicamentos, 3, 0));
		jtMedicamentos.setBounds(20, 80, 150, 30);
		jtMedicamentos.setFont(new Font("Tahoma", Font.ITALIC, 15));
		jpPrincipal.add(jtMedicamentos);
		
		
		JLabel jlCedula = new JLabel("CEDULA");
		jlCedula.setForeground(Color.BLUE);
		jlCedula.setFont(fuente2);
		jlCedula.setBounds(20, 110, 150, 30);
		jpPrincipal.add(jlCedula);
		
		jtCed = new JTextField("");
		jtCed.setDocument(new LimitadorCaracteres(jtCed, 10, 0));
		jtCed.setBounds(20, 140, 150, 30);
		jtCed.setFont(new Font("Verdana", Font.ITALIC, 15));
		jpPrincipal.add(jtCed);
		
		JLabel escogermed = new JLabel("MEDICAMENTOS");
		escogermed.setForeground(Color.BLUE);
		escogermed.setFont(fuente2);
		escogermed.setBounds(20, 180, 150, 30);
		jpPrincipal.add(escogermed);
		
		medicamentos = new JComboBox<String>();
		medicamentos.addItem("Ninguno");//0
		medicamentos.addItem( "Dolex");//1
		medicamentos.addItem("Acetaminofen");//2
		medicamentos.addItem("Advil");//3
		medicamentos.addItem("Aspirina");//4
		medicamentos.setBounds(20, 220, 150, 30);
		medicamentos.setToolTipText("Medicamentos");
		jpPrincipal.add(medicamentos);
		
//		******************************************************************************
//		Botones
		
		
		jbVolvere = new JButton(
				new ImageIcon(Medicamentos.class.getResource("/img/atras48.png")));
		jbVolvere.setRolloverIcon(
				new ImageIcon(Medicamentos.class.getResource("/img/atras64.png")));
		jbVolvere.setContentAreaFilled(false);
		jbVolvere.setBorderPainted(false);
		jbVolvere.setMnemonic('V');
		
		jbVolvere.setBounds(30, 570, 85, 85);
		jpPrincipal.add(jbVolvere);
		
		jbSig = new JButton(
				new ImageIcon(Medicamentos.class.getResource("/img/siguiente48.png")));
		jbSig.setRolloverIcon(
				new ImageIcon(Medicamentos.class.getResource("/img/siguiente64.png")));
		jbSig.setContentAreaFilled(false);
		jbSig.setBorderPainted(false);
		jbSig.setMnemonic('V');
		
		jbSig.setBounds(900, 570, 85, 85);
		jpPrincipal.add(jbSig);
		
	
		jbGuardar = new JButton(
				new ImageIcon(Medicamentos.class.getResource("/img/Guardar48.png")));
		jbGuardar.setRolloverIcon(
				new ImageIcon(Medicamentos.class.getResource("/img/Guardar64.png")));
		
		jbGuardar.setContentAreaFilled(false);
		jbGuardar.setBorderPainted(false);
		jbGuardar.setMnemonic('G');
		jbGuardar.setBounds(430, 570, 85, 85);
		jbGuardar.setActionCommand("boton de guardar");
		jpPrincipal.add(jbGuardar);
		
//		***********************************************************************************
		
		
		
		
		ManejadorMedicamentos med = new ManejadorMedicamentos(this, salac);
		jbVolvere.addActionListener(med);
		medicamentos.addItemListener(med);
		jbSig.addActionListener(med);
		jbGuardar.addActionListener(med);
		
		add(jpPrincipal);
		
	}



	

}