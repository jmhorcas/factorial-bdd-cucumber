package uma.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vista1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfInputValue;
	private JLabel lblResultado;
	private JButton btnCalcular;
	
	/**
	 * Create the frame.
	 */
	public Vista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblResultado = new JLabel("El factorial de n es:");
		contentPane.add(lblResultado, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("n:");
		panel.add(lblNewLabel);
		
		tfInputValue = new JTextField();
		panel.add(tfInputValue);
		tfInputValue.setColumns(10);
		
		btnCalcular = new JButton("Calc");
		panel.add(btnCalcular);
		
		pack();
		setVisible(true);
	}

	public int getInputValue() {
		try {
			return Integer.parseInt(tfInputValue.getText());	
		} catch (NumberFormatException e) {
			lblResultado.setText("Introduce un numero valido.");
			return -1;
		}
	}
	
	public void setResutado(int res) {
		lblResultado.setText("El factorial de " + getInputValue() + " es: " + res);
	}
	
	public void registrarControlador(ActionListener ctrl) {
		btnCalcular.addActionListener(ctrl);
		btnCalcular.setActionCommand("Calcular");
	}
	
	public void error(String msg) {
		lblResultado.setText(msg);
	}
}
