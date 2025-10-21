package Beans;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class B2UsoBeanPropio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B2UsoBeanPropio frame = new B2UsoBeanPropio();
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
	public B2UsoBeanPropio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 800, 600);
		contentPane = new JPanel();
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		B1VisorDeImagenes b1VisorDeImagenes = new B1VisorDeImagenes();
		b1VisorDeImagenes.setEscogeImagen("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Graficos\\Nacional.jpg");
		b1VisorDeImagenes.setBounds(46, 11, 600, 400);
		contentPane.add(b1VisorDeImagenes);
	}
}
