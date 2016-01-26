package Controlador;

import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Modelo.BDMedicamentos;
import Modelo.Conexion;
import Vista.FechaHoraSalida;
import Vista.Medicamentos;
import Vista.SalaCamillas;
public class ManejadorMedicamentos implements ActionListener, ItemListener {
	
	Medicamentos med;
	 SalaCamillas salac;

	int cod;
	
	public ManejadorMedicamentos(Medicamentos med , SalaCamillas salac) {
		this.med = med;
		this.salac = salac;
		}

	@Override
	public void actionPerformed(ActionEvent ae) {
	
		if(ae.getActionCommand().equals("boton de guardar")){
			Conexion con = new Conexion();
			boolean error = con.conectarMySQL("hospital", "root", "", "localhost");
																	//"127.0.0.1"
			if(!error){
				BDMedicamentos.guardarMedicamentos(med.jtCed.getText(),med.jtMedicamentos.getText(),(String) med.medicamentos.getSelectedItem(), con); 

				
				con.desconectar();
			}
		}
	
		
		if(ae.getSource().equals(med.jbSig)){
			FechaHoraSalida fhs = new FechaHoraSalida();
			med.setVisible(false);
			fhs.setVisible(true);
		}
		
		
		
		
		if(ae.getSource().equals(med.jbVolvere)){
			SalaCamillas salac = new SalaCamillas();
			med.setVisible(false);
			salac.setVisible(true);
		}
	
	}

	
public void itemStateChanged(ItemEvent e) {
	  if (e.getSource().equals(med.medicamentos)) {
    String seleccionado=(String)med.medicamentos.getSelectedItem();
          System.out.println(seleccionado);
    }
  
}




}