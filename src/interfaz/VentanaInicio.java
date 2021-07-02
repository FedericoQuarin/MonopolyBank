package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Juego;
import gestores.GestorJuego;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private SalirDialog ventanaSalir;
	private JFrame ventanaJuego;
	private GestorJuego gestorJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setTitle("Monopoly Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel monopolyLabel = new JLabel("Monopoly");
		monopolyLabel.setToolTipText("");
		monopolyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monopolyLabel.setFont(new Font("Serif", Font.BOLD, 36));
		monopolyLabel.setBounds(10, 10, 766, 47);
		contentPane.add(monopolyLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(295, 194, 190, 140);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel cantJugPanel = new JLabel("Cantidad jugadores");
		cantJugPanel.setBounds(12, 26, 120, 13);
		panel.add(cantJugPanel);
		
		JSpinner jugadoresSpinner = new JSpinner();
		jugadoresSpinner.setModel(new SpinnerNumberModel(2, 2, 6, 1));
		jugadoresSpinner.setBounds(138, 23, 40, 20);
		panel.add(jugadoresSpinner);
		
		JCheckBox pozoCheckBox = new JCheckBox("Jugar con pozo");
		pozoCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		pozoCheckBox.setBounds(24, 59, 135, 21);
		panel.add(pozoCheckBox);
		
		JButton jugarButton = new JButton("Jugar");
		jugarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJuego.ejecutarVentana((int) jugadoresSpinner.getValue(), true);
				dispose();				
			}
		});
		jugarButton.setBounds(45, 96, 100, 21);
		panel.add(jugarButton);
		
		JButton salirButton = new JButton("Salir");
		salirButton.addActionListener(new ActionListener() {
			// Al presionar boton salir
			public void actionPerformed(ActionEvent e) {
				ventanaSalir.setVisible(true);
			}
		});
		salirButton.setBounds(660, 532, 100, 21);
		contentPane.add(salirButton);
		
		// Ventana salir
		ventanaSalir = new SalirDialog(this);
		ventanaSalir.setLocationRelativeTo(null);
		
		// GestorJuego
		gestorJuego = new GestorJuego();
		

		setLocationRelativeTo(null);
	}
}
