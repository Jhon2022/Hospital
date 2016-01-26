package Modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.ResultSet;

public class Operaciones {
	
	public static void guardarPaciente(String ced, String nombre, String afiliacion, String urgencia, 
			String fecha, Conexion con){
		
		boolean error = con.actualizar(
				"INSERT INTO paciente (cedula, nombre, afiliacion, urgencia, fecha) " + 
		         "VALUES ('"  + ced + "', '" + nombre + "', '" + afiliacion + "', '" + urgencia + "','"+fecha+"')");
		
		if(!error){
			JOptionPane.showMessageDialog(null, "Se almaceno con exito la información del paciente");
		}
	}
	
	

	
	
	
}
