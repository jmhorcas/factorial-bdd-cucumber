package uma.gui2;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FactorialVista extends JFrame {

	private JPanel contentPane;
	private JTextField inputValue;
	private JButton compute;
	private JLabel resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialVista frame = new FactorialVista();
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FactorialVista() {
		setTitle("Factorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("n:");
		panel.add(lblNewLabel);
		
		inputValue = new JTextField();
		panel.add(inputValue);
		inputValue.setColumns(10);
		
		compute = new JButton("Compute");
		panel.add(compute);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		resultado = new JLabel("El factorial de n es:");
		panel_1.add(resultado);
		
		pack();
		setVisible(true);
	}

	public void registerController(ActionListener ctrl) {
		compute.addActionListener(ctrl);
		compute.setActionCommand("Compute");
	}
	
	public int getInputValue() {
		return Integer.parseInt(inputValue.getText());
	}
	
	public void setResultado(int n, int resultado2) {
		resultado.setText("El factorial de " + n + " es: " + resultado2);
	}
}
