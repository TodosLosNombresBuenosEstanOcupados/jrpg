package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connection.Mensaje;
import utilities.Loggin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private Login login;
	Mensaje msj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal(null);
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
	public MenuPrincipal(Login login) {
		setTitle("BloodyWars");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.login = login;
		this.login.setVisible(false);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnPersonaje = new JButton("Crear / Editar Personaje");
		btnPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearPersonaje();
			}
		});
		btnPersonaje.setBounds(97, 26, 221, 69);
		panel.add(btnPersonaje);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				seleccionarMapa();
			}
		});
		btnJugar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnJugar.setBounds(97, 124, 221, 60);
		panel.add(btnJugar);
		
		JButton btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnCerrarSesin.setBounds(97, 195, 221, 45);
		panel.add(btnCerrarSesin);
		
		this.setVisible(true);
	}
	
	private void crearPersonaje() {
		new CrearPersonaje(login, this);
	}
	
	private void seleccionarMapa(){
		new SeleccionarMapa(this);
	}
	
	private void salir() {
		login.visible(true);
		this.dispose();
	}
}
