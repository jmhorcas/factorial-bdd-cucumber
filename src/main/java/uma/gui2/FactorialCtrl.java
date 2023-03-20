package uma.gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uma.Factorial;

public class FactorialCtrl implements ActionListener {

	private Factorial factorial;
	private FactorialVista vista;
	
	
	public FactorialCtrl(Factorial factorial, FactorialVista vista) {
		this.factorial = factorial;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("compute")) {
			int n = vista.getInputValue();
			int resultado = factorial.compute(n);
			vista.setResultado(n, resultado);
		}
	}

}
