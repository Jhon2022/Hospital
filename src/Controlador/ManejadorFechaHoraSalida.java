package Controlador;
import java.awt.event.ActionEvent;import java.awt.event.ActionListener;


import Vista.Consultas;
import Vista.FechaHoraSalida;
import Vista.Medicamentos;

public class ManejadorFechaHoraSalida implements ActionListener {
	Medicamentos med;
	FechaHoraSalida  fechahoraS;
	Consultas cons;


	public ManejadorFechaHoraSalida(FechaHoraSalida fechahoraS, Medicamentos med, Consultas cons) {
		this.fechahoraS = fechahoraS;
		this.med = med;
		this.cons = cons;
		
	}



	@Override
	public void actionPerformed(ActionEvent ae) {
		
		

		if(ae.getSource().equals(fechahoraS.jbVolvere)){
//			JOptionPane.showMessageDialog(null, "Holaaaaaaa");
			Medicamentos med = new Medicamentos();
			fechahoraS.setVisible(false);
			med.setVisible(true);
		}
		
		if(ae.getSource().equals(fechahoraS.jbSiguiente)){
//		JOptionPane.showMessageDialog(null, "Holaaaaaaa");
		    Consultas cons = new Consultas();
			
			fechahoraS.setVisible(false);
			cons.setVisible(true);
		
		}
		
	
	}}
