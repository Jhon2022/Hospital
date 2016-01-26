package Modelo;

import com.mysql.jdbc.ResultSet;

public class BDConsulta {
	
	
	
public static ResultSet consultaPanciente(String n, Conexion con){
	
	
	java.sql.ResultSet rs = con.consulta("SELECT * FROM paciente WHERE cedula  ='"+n+"'");
	
	return (ResultSet) rs;
}






}
