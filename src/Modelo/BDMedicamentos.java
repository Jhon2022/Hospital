package Modelo;


import javax.swing.JOptionPane;

public class BDMedicamentos {
	
public static void guardarMedicamentos(String ced, String canmedicamentos,String medicamento, Conexion con){
		
		boolean error = con.actualizar(
				"INSERT INTO medicamentosPaciente (cedula, cantidad, medicamento) " + 
		         "VALUES ('"  + ced + "', '" + canmedicamentos+"','" +medicamento+ "')");
		
		if(!error){
			JOptionPane.showMessageDialog(null, "Se almacenaron los medicamentos");
		}
	}


}
