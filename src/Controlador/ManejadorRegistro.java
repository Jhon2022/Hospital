package Controlador;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Modelo.Conexion;
import Modelo.Operaciones;
import Vista.Registro;
import Vista.SalaCamillas;



public class ManejadorRegistro implements ActionListener{

	Registro reg;
	Date fechaActual = new Date();
	DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	public ManejadorRegistro(Registro reg) {
		this.reg = reg;
	
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getActionCommand().equals("boton de guardar")){
			Conexion con = new Conexion();
			boolean error = con.conectarMySQL("hospital", "root", "", "localhost");
																	//"127.0.0.1"
			if(!error){
				Operaciones.guardarPaciente(reg.jtCed.getText(), reg.jtNom.getText(), 
						reg.jbAfi.getText(), reg.jtMotu.getText(), reg.jtFecha.getText(), con); 

				
				con.desconectar();
			}
		}
		

		if(ae.getSource().equals(reg.jbSig)){
		SalaCamillas	salac = new SalaCamillas();
			reg.setVisible(false);
			salac.setVisible(true);
		}
		
	
		if(ae.getSource().equals(reg.jbLimpiar)){
			reg.jtCed.setText("");
			reg.jtNom.setText(""); 
			reg.jbAfi.setSelected(false);
			reg.jtMotu.setText("");
			reg.jtCed.requestFocus();
			
		}
		
		
		
		
		if(ae.getSource().equals(reg.jbSalir)){
			System.exit(0);
		}
	}

}
