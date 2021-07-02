package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import clases.Juego;
import gestores.GestorJuego;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class VentanaJuego extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldJugador;
	private JTextField textFieldDinero;
	private JTextField textFieldJugador2;
	private JTextField textFieldDinero2;
	private JTextField textFieldJugador3;
	private JTextField textFieldDinero3;
	private JTextField textFieldJugador4;
	private JTextField textFieldDinero4;
	private JTextField textFieldJugador5;
	private JTextField textFieldDinero5;
	private JTextField textFieldJugador6;
	private JTextField textFieldDinero6;
	private JTextField montoTextField;
	
	
	private GestorJuego gestorJuego;
	private Juego juego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJuego frame = new VentanaJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ejecutarVentana(Integer nroJugadores, Boolean conPozo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJuego frame = new VentanaJuego(nroJugadores, conPozo);
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
	private VentanaJuego(Integer nroJugadores, Boolean conPozo) {
		setForeground(SystemColor.windowBorder);
		setTitle("Monopoly Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setName("");
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel monopolyLabel = new JLabel("Monopoly");
		monopolyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monopolyLabel.setLabelFor(contentPane);
		monopolyLabel.setToolTipText("");
		monopolyLabel.setFont(new Font("Serif", Font.BOLD, 36));
		monopolyLabel.setBounds(10, 10, 766, 47);
		contentPane.add(monopolyLabel);
		
		JPanel jugadorPanel1 = new JPanel();
		jugadorPanel1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel1.setBounds(81, 67, 137, 60);
		contentPane.add(jugadorPanel1);
		jugadorPanel1.setLayout(null);
		
		JLabel dineroLabel1 = new JLabel("Dinero");
		dineroLabel1.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel1.setBounds(10, 33, 47, 20);
		jugadorPanel1.add(dineroLabel1);
		
		JLabel jugadorLabel1 = new JLabel("Jugador");
		jugadorLabel1.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel1.setBounds(10, 7, 47, 20);
		jugadorPanel1.add(jugadorLabel1);
		
		textFieldJugador = new JTextField();
		textFieldJugador.setText("jugador");
		textFieldJugador.setBounds(67, 7, 60, 20);
		jugadorPanel1.add(textFieldJugador);
		textFieldJugador.setColumns(10);
		
		textFieldDinero = new JTextField();
		textFieldDinero.setEditable(false);
		textFieldDinero.setText("$0");
		textFieldDinero.setBounds(67, 33, 60, 20);
		jugadorPanel1.add(textFieldDinero);
		textFieldDinero.setColumns(10);
		
		JPanel jugadorPanel2 = new JPanel();
		jugadorPanel2.setLayout(null);
		jugadorPanel2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel2.setBounds(81, 137, 137, 60);
		contentPane.add(jugadorPanel2);
		
		JLabel dineroLabel2 = new JLabel("Dinero");
		dineroLabel2.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel2.setBounds(10, 33, 47, 20);
		jugadorPanel2.add(dineroLabel2);
		
		JLabel jugadorLabel2 = new JLabel("Jugador");
		jugadorLabel2.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel2.setBounds(10, 7, 47, 20);
		jugadorPanel2.add(jugadorLabel2);
		
		textFieldJugador2 = new JTextField();
		textFieldJugador2.setText("jugador");
		textFieldJugador2.setColumns(10);
		textFieldJugador2.setBounds(67, 7, 60, 20);
		jugadorPanel2.add(textFieldJugador2);
		
		textFieldDinero2 = new JTextField();
		textFieldDinero2.setText("$0");
		textFieldDinero2.setEditable(false);
		textFieldDinero2.setColumns(10);
		textFieldDinero2.setBounds(67, 33, 60, 20);
		jugadorPanel2.add(textFieldDinero2);
		
		JPanel jugadorPanel3 = new JPanel();
		jugadorPanel3.setLayout(null);
		jugadorPanel3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel3.setBounds(81, 207, 137, 60);
		contentPane.add(jugadorPanel3);
		
		JLabel dineroLabel3 = new JLabel("Dinero");
		dineroLabel3.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel3.setBounds(10, 33, 47, 20);
		jugadorPanel3.add(dineroLabel3);
		
		JLabel jugadorLabel3 = new JLabel("Jugador");
		jugadorLabel3.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel3.setBounds(10, 7, 47, 20);
		jugadorPanel3.add(jugadorLabel3);
		
		textFieldJugador3 = new JTextField();
		textFieldJugador3.setText("jugador");
		textFieldJugador3.setColumns(10);
		textFieldJugador3.setBounds(67, 7, 60, 20);
		jugadorPanel3.add(textFieldJugador3);
		
		textFieldDinero3 = new JTextField();
		textFieldDinero3.setText("$0");
		textFieldDinero3.setEditable(false);
		textFieldDinero3.setColumns(10);
		textFieldDinero3.setBounds(67, 33, 60, 20);
		jugadorPanel3.add(textFieldDinero3);
		
		JPanel jugadorPanel4 = new JPanel();
		jugadorPanel4.setLayout(null);
		jugadorPanel4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel4.setBounds(81, 277, 137, 60);
		contentPane.add(jugadorPanel4);
		
		JLabel dineroLabel4 = new JLabel("Dinero");
		dineroLabel4.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel4.setBounds(10, 33, 47, 20);
		jugadorPanel4.add(dineroLabel4);
		
		JLabel jugadorLabel4 = new JLabel("Jugador");
		jugadorLabel4.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel4.setBounds(10, 7, 47, 20);
		jugadorPanel4.add(jugadorLabel4);
		
		textFieldJugador4 = new JTextField();
		textFieldJugador4.setText("jugador");
		textFieldJugador4.setColumns(10);
		textFieldJugador4.setBounds(67, 7, 60, 20);
		jugadorPanel4.add(textFieldJugador4);
		
		textFieldDinero4 = new JTextField();
		textFieldDinero4.setText("$0");
		textFieldDinero4.setEditable(false);
		textFieldDinero4.setColumns(10);
		textFieldDinero4.setBounds(67, 33, 60, 20);
		jugadorPanel4.add(textFieldDinero4);
		
		JPanel jugadorPanel5 = new JPanel();
		jugadorPanel5.setLayout(null);
		jugadorPanel5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel5.setBounds(81, 347, 137, 60);
		contentPane.add(jugadorPanel5);
		
		JLabel dineroLabel5 = new JLabel("Dinero");
		dineroLabel5.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel5.setBounds(10, 33, 47, 20);
		jugadorPanel5.add(dineroLabel5);
		
		JLabel jugadorLabel5 = new JLabel("Jugador");
		jugadorLabel5.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel5.setBounds(10, 7, 47, 20);
		jugadorPanel5.add(jugadorLabel5);
		
		textFieldJugador5 = new JTextField();
		textFieldJugador5.setText("jugador");
		textFieldJugador5.setColumns(10);
		textFieldJugador5.setBounds(67, 7, 60, 20);
		jugadorPanel5.add(textFieldJugador5);
		
		textFieldDinero5 = new JTextField();
		textFieldDinero5.setText("$0");
		textFieldDinero5.setEditable(false);
		textFieldDinero5.setColumns(10);
		textFieldDinero5.setBounds(67, 33, 60, 20);
		jugadorPanel5.add(textFieldDinero5);
		

		JPanel jugadorPanel6 = new JPanel();
		jugadorPanel6.setLayout(null);
		jugadorPanel6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jugadorPanel6.setBounds(81, 417, 137, 60);
		contentPane.add(jugadorPanel6);
		
		JLabel dineroLabel6 = new JLabel("Dinero");
		dineroLabel6.setFont(new Font("Tahoma", Font.BOLD, 10));
		dineroLabel6.setBounds(10, 33, 47, 20);
		jugadorPanel6.add(dineroLabel6);
		
		JLabel jugadorLabel6 = new JLabel("Jugador");
		jugadorLabel6.setFont(new Font("Tahoma", Font.BOLD, 10));
		jugadorLabel6.setBounds(10, 7, 47, 20);
		jugadorPanel6.add(jugadorLabel6);
		
		textFieldJugador6 = new JTextField();
		textFieldJugador6.setText("jugador");
		textFieldJugador6.setColumns(10);
		textFieldJugador6.setBounds(67, 7, 60, 20);
		jugadorPanel6.add(textFieldJugador6);
		
		textFieldDinero6 = new JTextField();
		textFieldDinero6.setText("$0");
		textFieldDinero6.setEditable(false);
		textFieldDinero6.setColumns(10);
		textFieldDinero6.setBounds(67, 33, 60, 20);
		jugadorPanel6.add(textFieldDinero6);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(101, 497, 100, 21);
		contentPane.add(btnNewButton);
		
		JPanel opComunesPanel = new JPanel();
		opComunesPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		opComunesPanel.setBounds(486, 118, 150, 120);
		contentPane.add(opComunesPanel);
		opComunesPanel.setLayout(null);
		
		JLabel OperacionesComunesLabel = new JLabel("Acciones comunes");
		OperacionesComunesLabel.setBounds(10, 10, 120, 13);
		opComunesPanel.add(OperacionesComunesLabel);
		
		JButton cobrarButton = new JButton("Cobrar");
		cobrarButton.setBounds(20, 33, 110, 21);
		opComunesPanel.add(cobrarButton);
		
		JButton pagarButton = new JButton("Pagar");
		pagarButton.setBounds(20, 60, 110, 21);
		opComunesPanel.add(pagarButton);
		
		JButton transferirButton = new JButton("Transferir");
		transferirButton.setBounds(20, 87, 110, 21);
		opComunesPanel.add(transferirButton);
		
		
		JPanel pozoPanel = new JPanel();
		pozoPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pozoPanel.setBounds(486, 287, 150, 120);
		contentPane.add(pozoPanel);
		pozoPanel.setLayout(null);
			
		JLabel pozoLabel = new JLabel("Pozo");
		pozoLabel.setBounds(10, 10, 45, 13);
		pozoPanel.add(pozoLabel);
			
		JLabel montoLabel = new JLabel("Monto");
		montoLabel.setBounds(20, 32, 45, 13);
		pozoPanel.add(montoLabel);
			
		montoTextField = new JTextField();
		montoTextField.setText("$0");
		montoTextField.setEditable(false);
		montoTextField.setColumns(10);
		montoTextField.setBounds(70, 29, 60, 20);
		pozoPanel.add(montoTextField);
			
		JButton depositarPozoButton = new JButton("Depositar");
		depositarPozoButton.setBounds(20, 57, 110, 21);
		pozoPanel.add(depositarPozoButton);
			
		JButton retirarPozoButton = new JButton("Retirar");
		retirarPozoButton.setBounds(20, 86, 110, 21);
		pozoPanel.add(retirarPozoButton);
			
		// si se selecciona para jugar con pozo se muestra las opciones correspondiente - AUN NO IMPLEMENTADO
		if (!conPozo) {
			pozoPanel.setVisible(false);
		}
		
		
		JButton salirButton = new JButton("Salir");
		salirButton.setBounds(661, 532, 100, 21);
		contentPane.add(salirButton);
		setLocationRelativeTo(null);
		

		gestorJuego = new GestorJuego();
		juego = gestorJuego.nuevoJuego(nroJugadores);
		
		
	}	
}

