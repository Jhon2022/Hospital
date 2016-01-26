package Modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.ResultSet;

public class BDCamillas {
	
public static void guardarCamilla(int cod, int estado, Conexion con){
		
		boolean error = con.actualizar(
				"INSERT INTO camilla (codigo, estado) " + 
		         "VALUES ("  + cod + ", " + estado + ")");
		
		if(!error){
			JOptionPane.showMessageDialog(null, "Se almaceno Camilla");
		}
	}

public static ResultSet consultaCamilla(int cod, int estado, Conexion con){
	java.sql.ResultSet rs = con.consulta("SELECT * FROM camilla WHERE cedula  ='"+cod+"''"+estado+"'");
	
	return (ResultSet) rs;
}




}
