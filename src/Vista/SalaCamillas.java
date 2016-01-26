package Vista;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import Controlador.ManejadorSalaCamillas;


public class SalaCamillas  extends JFrame{
	
	public JPanel jpPrincipal;
	
	public JButton jbVolver, jbSigi, jbGuardar, jbConsulta;
	
	public JToggleButton jtb1, jtb2, jtb3, jtb4,
	jtb5,  jtb6, jtb7, jtb8, jtb9, jtb10, jtb11, jtb12, 
	jtb13, jtb14, jtb15;
	
	Registro reg;
	
	ManejadorSalaCamillas msc;
	
	
	public SalaCamillas() {
		super("CAMILLAS");
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/blue-home-icon.png"));
		setIconImage(icon);
		
		setLocation(45, 35);
		setLayout(null);
		setSize(1000, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		

		crearGUI();
		//setVisible(true);
	}
	

	public void crearGUI() {
		
		jpPrincipal = new JPanel();
		jpPrincipal.setBounds(0, 0, 1000, 700);
		jpPrincipal.setLayout(null);
		//jpPrincipal.setBackground(Color.WHITE);
	
		
		
		jtb1 = new JToggleButton("");
		jtb1 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//primera fila 1
		jtb1.setBounds(50, 50, 150, 150);

		jtb1.setContentAreaFilled(false);
		jtb1.setBorderPainted(false);
		
		jpPrincipal.add(jtb1);
		
		jtb2 = new JToggleButton("");
		jtb2 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//primera fila2
		jtb2.setBounds(220, 50, 150, 150);
		
		jtb2.setContentAreaFilled(false);
		jtb2.setBorderPainted(false);
		jpPrincipal.add(jtb2);
		
		
		
		jtb3 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//primera fila 3
		jtb3.setBounds(390, 50, 150, 150);
		
		jtb3.setContentAreaFilled(false);
		jtb3.setBorderPainted(false);
		jpPrincipal.add(jtb3);
		 
		jtb4 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//segunda fila 1
		jtb4.setBounds(560, 50, 150, 150);
		
		jtb4.setContentAreaFilled(false);
		jtb4.setBorderPainted(false);
		jpPrincipal.add(jtb4);
		
		jtb5= new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//segunda fila 2
		jtb5.setBounds(730, 50, 150, 150);
		
		jtb5.setContentAreaFilled(false);
		jtb5.setBorderPainted(false);
		jpPrincipal.add(jtb5);
		
		
		jtb6 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//segunda fila 3
		jtb6.setBounds(50, 220, 150, 150);
		
		jtb6.setContentAreaFilled(false);
		jtb6.setBorderPainted(false);
		jpPrincipal.add(jtb6);
		
		
		jtb7 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//tercera fila 1
		jtb7.setBounds(220, 220, 150, 150);
		
		jtb7.setContentAreaFilled(false);
		jtb7.setBorderPainted(false);
		jpPrincipal.add(jtb7);
		
		
		jtb8 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//tercera fila 2
		jtb8.setBounds(390, 220, 150, 150);
		
		jtb8.setContentAreaFilled(false);
		jtb8.setBorderPainted(false);
		jpPrincipal.add(jtb8);
		
		
		jtb9 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//tercera fila 3
		jtb9.setBounds(560, 220, 150, 150);
		
		jtb9.setContentAreaFilled(false);
		jtb9.setBorderPainted(false);
		jpPrincipal.add(jtb9);
		
		
		
		jtb10 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//cuarta fila 1
		jtb10.setBounds(730, 220, 150, 150);
		
		jtb10.setContentAreaFilled(false);
		jtb10.setBorderPainted(false);
		jpPrincipal.add(jtb10);
		
		
		jtb11 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//cuarta fila 2
		jtb11.setBounds(50, 390, 150, 150);
		
		jtb11.setContentAreaFilled(false);
		jtb11.setBorderPainted(false);
		jpPrincipal.add(jtb11);
		
		
		jtb12 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//cuarta fila 3
		jtb12.setBounds(220, 390, 150, 150);
		
		jtb12.setContentAreaFilled(false);
		jtb12.setBorderPainted(false);
		jpPrincipal.add(jtb12);
		
		
		
		jtb13 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//quinta fila 1
		
		jtb13.setBounds(390, 390, 150, 150);
		
		jtb13.setContentAreaFilled(false);
		jtb13.setBorderPainted(false);
		jpPrincipal.add(jtb13);
		
		
		jtb14 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//5 fila 2
		jtb14.setBounds(560, 390, 150, 150);
		
		jtb14.setContentAreaFilled(false);
		jtb14.setBorderPainted(false);
		jpPrincipal.add(jtb14);
		
		
		jtb15 = new JToggleButton
				(
				new ImageIcon(SalaCamillas.class.getResource("/img/bed.png")));//5 fila 3
		jtb15.setBounds(730, 390, 150, 150);
		
		jtb15.setContentAreaFilled(false);
		jtb15.setBorderPainted(false);
		jpPrincipal.add(jtb15);
		
		
		jbSigi = new JButton(
				new ImageIcon(SalaCamillas.class.getResource("/img/siguiente48.png")));
		jbSigi.setRolloverIcon(
				new ImageIcon(SalaCamillas.class.getResource("/img/siguiente64.png")));
		jbSigi.setContentAreaFilled(false);
		jbSigi.setBorderPainted(false);
		jbSigi.setMnemonic('t');
		jbSigi.setBounds(900, 570, 85, 85);
		jpPrincipal.add(jbSigi);
		
		
		
		jbVolver = new JButton(
				new ImageIcon(SalaCamillas.class.getResource("/img/atras48.png")));
		jbVolver.setRolloverIcon(
				new ImageIcon(SalaCamillas.class.getResource("/img/atras64.png")));
		jbVolver.setMnemonic('V');
		jbVolver.setContentAreaFilled(false);
		jbVolver.setBorderPainted(false);
		jbVolver.setBounds(30, 570, 85, 85);
		jpPrincipal.add(jbVolver);
		
		
		jbGuardar = new JButton(
				new ImageIcon(SalaCamillas.class.getResource("/img/Guardar48.png")));
		jbGuardar.setRolloverIcon(
				new ImageIcon(SalaCamillas.class.getResource("/img/Guardar64.png")));
		
		jbGuardar.setContentAreaFilled(false);
		jbGuardar.setBorderPainted(false);
		jbGuardar.setMnemonic('G');
		jbGuardar.setBounds(430, 550, 85, 85);
		jbGuardar.setActionCommand("boton de guardar");
		jpPrincipal.add(jbGuardar);
		
		
		jbConsulta= new JButton(
				new ImageIcon(SalaCamillas.class.getResource("/img/buscar48.png")));
		jbConsulta.setRolloverIcon(
				new ImageIcon(SalaCamillas.class.getResource("/img/buscar64.png")));
		jbConsulta.setContentAreaFilled(false);
		jbConsulta.setBorderPainted(false);	
		jbConsulta.setActionCommand("boton de consultar");
		jbConsulta.setBounds(530, 550, 85, 85);
		jpPrincipal.add(jbConsulta);
		
		
		
		
		
		msc = new ManejadorSalaCamillas(this, reg);
		jbSigi.addActionListener(msc);
		jbVolver.addActionListener(msc);
		jbGuardar.addActionListener(msc);
		jbConsulta.addActionListener(msc);
		jtb1.addActionListener(msc);
		jtb2.addActionListener(msc);
		jtb3.addActionListener(msc);
		jtb4.addActionListener(msc);
		jtb5.addActionListener(msc);
		jtb6.addActionListener(msc);
		jtb7.addActionListener(msc);
		jtb8.addActionListener(msc);
		jtb9.addActionListener(msc);
		jtb10.addActionListener(msc);
		jtb11.addActionListener(msc);
		jtb12.addActionListener(msc);
		jtb13.addActionListener(msc);
		jtb14.addActionListener(msc);
		jtb15.addActionListener(msc);
		add(jpPrincipal);
	}
	
	}
