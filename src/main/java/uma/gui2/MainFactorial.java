package uma.gui2;

import java.awt.EventQueue;

import uma.Factorial;

public class MainFactorial {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial model = new Factorial();
					FactorialVista view = new FactorialVista();
					FactorialCtrl controller = new FactorialCtrl(model, view);
					view.registerController(controller);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
