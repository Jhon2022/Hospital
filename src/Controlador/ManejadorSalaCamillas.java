package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.mysql.jdbc.ResultSet;

import Modelo.BDCamillas;
import Modelo.BDConsulta;
import Modelo.Conexion;
import Vista.Medicamentos;
import Vista.Registro;
import Vista.SalaCamillas;


public class ManejadorSalaCamillas implements ActionListener{

	SalaCamillas salac;
	Registro reg;
	
	int cod;
	int estado;
	
	ImageIcon bed2 = new ImageIcon(ManejadorSalaCamillas.class.getResource("/img/bed2.png"));
	ImageIcon bed = new ImageIcon(ManejadorSalaCamillas .class.getResource("/img/bed.png"));
	
	
	
	public ManejadorSalaCamillas(SalaCamillas salac, Registro reg) {
		this.salac = salac;
		this.reg = reg;
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getActionCommand().equals("boton de guardar")){
			Conexion con = new Conexion();
			boolean error = con.conectarMySQL("hospital", "root", "", "localhost");
																	//"127.0.0.1"
			if(!error){
				BDCamillas.guardarCamilla(cod,estado,con); 

				
				con.desconectar();
			}
		}
		
		
		
if(ae.getActionCommand().equals("boton de consultar")){
	
			
			Conexion con = new Conexion();
			boolean error = con.conectarMySQL("hospital", "root", "", "localhost");
			if(!error){
				ResultSet rs = BDConsulta.consultaPanciente(salac.jtb1.getText(), con);
				
				//BDConsulta.consultaPanciente(consulta.jtConsultaCed.getText(), co
				try{
					while(rs.next()){
						cod=rs.getInt(1);
						estado=rs.getInt(2);
						
					}
				}catch(SQLException e1){
					
				}
				
				finally{
					con.desconectar();
				}
				
			}
			}
System.out.println("Codigo de cama: "+cod);
System.out.println("El estado de la cama es: "+estado);
	
		if(ae.getSource().equals(salac.jbSigi)){
			Medicamentos med = new Medicamentos();
			salac.setVisible(false);
			med.setVisible(true);
		}
		
		if(ae.getSource().equals(salac.jbVolver)){
			Registro reg = new Registro();
			salac.setVisible(false);
			reg.setVisible(true);
		}
		
		if(ae.getSource().equals(salac.jtb1)){
			if(salac.jtb1.isSelected()){
				
				salac.jtb1.setIcon(bed2);
				cod=1;
				estado=1;
				//poner codigo de guardar aqui
				
			}else{
				
				estado=0;
				salac.jtb1.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb2)){
			if(salac.jtb2.isSelected()){
				cod=2;
				estado=1;
				salac.jtb2.setIcon(bed2);
				
			}else{
	
				estado=0;
				salac.jtb2.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb3)){
			if(salac.jtb3.isSelected()){
				cod=3;
				estado=1;
				salac.jtb3.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb3.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb4)){
			if(salac.jtb4.isSelected()){
				
				cod=4;
				estado=1;
				
				salac.jtb4.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb4.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb5)){
			if(salac.jtb5.isSelected()){
				
				cod=5;
				estado=1;
				
				salac.jtb5.setIcon(bed2);
				
			}else{
				
				estado=0;
				
				salac.jtb5.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb6)){
			if(salac.jtb6.isSelected()){
				cod=6;
				estado=1;
				salac.jtb6.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb6.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb7)){
			if(salac.jtb7.isSelected()){
				
				cod=7;
				estado=1;
				salac.jtb7.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb7.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb8)){
			if(salac.jtb8.isSelected()){
				cod=8;
				estado=1;
				
				salac.jtb8.setIcon(bed2);
				
			}else{
				
				estado=0;
				salac.jtb8.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb9)){
			if(salac.jtb9.isSelected()){
				cod=9;
				estado=1;
				salac.jtb9.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb9.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb10)){
			if(salac.jtb10.isSelected()){
				cod=10;
				estado=1;
				
				salac.jtb10.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb10.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb11)){
			if(salac.jtb11.isSelected()){
				cod=11;
				estado=1;
				salac.jtb11.setIcon(bed2);	
			}
			else{
				estado=0;
				
				salac.jtb11.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb12)){
			if(salac.jtb12.isSelected()){
				cod=12;
				estado=1;
				salac.jtb12.setIcon(bed2);
				
			}
			else{
			
				estado=0;
				
				salac.jtb12.setIcon(bed);
			}
		}
		
		if(ae.getSource().equals(salac.jtb13)){
			if(salac.jtb13.isSelected()){
				
				cod=13;
				estado=1;
				
				salac.jtb13.setIcon(bed2);
				
			}
			else{
				cod=1;
				estado=0;
				salac.jtb13.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb14)){
			if(salac.jtb14.isSelected()){
				cod=14;
				estado=1;
				salac.jtb14.setIcon(bed2);
			}else{
			
				estado=0;
				salac.jtb14.setIcon(bed);
			}
		}
		
		
		if(ae.getSource().equals(salac.jtb15)){
			if(salac.jtb15.isSelected()){
				
				cod=15;
				estado=1;
				salac.jtb15.setIcon(bed2);
				
			}else{
				estado=0;
				salac.jtb15.setIcon(bed);
			}
		}
		
		
	}
}
