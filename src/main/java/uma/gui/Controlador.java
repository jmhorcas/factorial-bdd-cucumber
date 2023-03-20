package uma.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uma.Factorial;
import uma.NegativeValueException;

public class Controlador implements ActionListener {
	
	private Factorial modelo;
	private Vista1 vista;
	
	public Controlador(Factorial modelo, Vista1 vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("Calcular")) {
			// Calcular factorial
			int n = vista.getInputValue();
			try {
				int resultado = modelo.compute(n);	
				vista.setResutado(resultado);
			} catch (NegativeValueException error) {
				vista.error("Introduce un número positivo.");
			}
			
		}
	}

}
