package Controlador;

import java.awt.event.ActionEvent;import java.awt.event.ActionListener;
import java.sql.SQLException;

import Modelo.BDConsulta;
import Modelo.Conexion;
import Vista.Consultas;
import Vista.FechaHoraSalida;

import com.mysql.jdbc.ResultSet;
public class ManejadorConsulta implements ActionListener{

	Consultas Cons;
	
	String cedula= "";
	String nombre= "";
	String afiliacion="";
	String urgencia="";
	String fecha = "";
	
	public ManejadorConsulta(Consultas consultas) {
		this.Cons = consultas;
	}

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getActionCommand().equals("boton de consultar")){
			
			Conexion con = new Conexion();
			boolean error = con.conectarMySQL("hospital", "root", "", "localhost");
			if(!error){
				ResultSet rs = BDConsulta.consultaPanciente(Cons.jtConsultaCed.getText(), con);
				
				try{
					while(rs.next()){
						cedula=rs.getString(1);
						nombre=rs.getString(2);
					afiliacion=rs.getString(3);
					urgencia=rs.getString(4);
					fecha=rs.getString(5);
					}
				}catch(SQLException e1){
					
				}
				
				finally{
					con.desconectar();
				}
				
			}
			}
		
		if(ae.getSource().equals(Cons.jbConsulta)){
			Cons.jtResulConCed.setText(cedula);
			Cons.jtResulConNom.setText(nombre);
			Cons.jtResulConAfi.setText(afiliacion);
			Cons.jtResulConUrg.setText(urgencia);
			Cons.jtResulConFecha.setText(fecha);
			
		}
		
		if(ae.getSource().equals(Cons.jbVolver)){
			FechaHoraSalida fhs= new FechaHoraSalida();
			Cons.setVisible(false);
			fhs.setVisible(true);
		}
		
		
	
		
	}

}
