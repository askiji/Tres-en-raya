import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtTurnoDe;
	private String turnoJugador = "X";
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnGanador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/* 
	 * Metodos
	 */
		
	private void cambiarTurno() {
		
		/*
		 * Sonido editado para que no de errores 
				reproducirSonido(".//res//click.wav");
		 */
		if(turnoJugador.equals("X")) {
			txtTurnoDe.setText("TURNO DE O");
			turnoJugador = "O";
		}
		else {
			txtTurnoDe.setText("TURNO DE X");
			turnoJugador = "X";
		}
	}
	
	private void checkCombinaciones() {
		if(btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
			btnGanador.setText("Ganador X");

		}
		if(btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		if(btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") {
			btnGanador.setText("Ganador X");
		}
		
		/// j2 
		
		if(btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
		if(btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") {
			btnGanador.setText("Ganador O");
		}
	}
	
	public void isEmpate() {
		if(!btn1.getText().equals(" ") && !btn2.getText().equals(" ") && !btn3.getText().equals(" ") 
			&& !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ") 
			&& !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")
			&& !btnGanador.getText().equals("Ganador O") && !btnGanador.getText().equals("Ganador X")) {
//				btnGanador.setText("EMPATE ");
		}
		if(!btn1.getText().equals(" ") && !btn2.getText().equals(" ") && !btn3.getText().equals(" ") 
				&& !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ") 
				&& !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
//			Los sonidos estan editados para que no den errores  
//			reproducirSonido(".//res/final.wav");
			}
	}
	
	public void reinicio() {
		btn1.setText(" ");
		btn2.setText(" ");
		btn3.setText(" ");
		btn4.setText(" ");
		btn5.setText(" ");
		btn6.setText(" ");
		btn7.setText(" ");
		btn8.setText(" ");
		btn9.setText(" ");
		btnGanador.setText(" ");
		turnoJugador = "X";
		txtTurnoDe.setText("TURNO DE X");
	}
	
	public void reproducirSonido(String nombreSonido) {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			System.out.println("Error al reproducir el sonido.");
		}
	}
	
	/**
	 * Create the frame.
	 */
	
	public Principal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 476);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		
		btn1 = new JButton(" ");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getText().equalsIgnoreCase(" ")) {
					btn1.setText(turnoJugador);
					if (turnoJugador.equalsIgnoreCase("X")) {
						btn1.setForeground(Color.red);
					} else {
						btn1.setForeground(Color.BLUE);
					}
					checkCombinaciones();
					cambiarTurno();
					isEmpate();
				}
			}
		});
		
		btn2 = new JButton(" ");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getText().equalsIgnoreCase(" ")) {
				btn2.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.red);
				}
				else {
					btn2.setForeground(Color.BLUE);
				}
				checkCombinaciones();
				cambiarTurno();
				isEmpate();
				}
			}
		});
		
		btn3 = new JButton(" ");		
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getText().equalsIgnoreCase(" ")) {
				
				btn3.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.red);
				}
				else {
					btn3.setForeground(Color.BLUE);
				}
				checkCombinaciones();
				cambiarTurno();
				isEmpate();
				}
				
			}
		});
		
		btn4 = new JButton(" ");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getText().equalsIgnoreCase(" ")) {
				btn4.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.red);
				}
				else {
					btn4.setForeground(Color.BLUE);
				}
				checkCombinaciones();
				cambiarTurno();
				isEmpate();
				}
			}
		});
		
		btn5 = new JButton(" ");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn5.getText().equalsIgnoreCase(" ")) {
				btn5.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.red);
				}
				else {
					btn5.setForeground(Color.BLUE);
				}
				checkCombinaciones();
				cambiarTurno();
				isEmpate();
				}
			}
		});
		
		btn6 = new JButton(" ");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getText().equalsIgnoreCase(" ")) {
				btn6.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.red);
				}
				else {
					btn6.setForeground(Color.BLUE);
				}
				cambiarTurno();
				checkCombinaciones();
				isEmpate();
				}
			}
		});
		
		btn7 = new JButton(" ");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getText().equalsIgnoreCase(" ")) {
				btn7.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.red);
				}
				else {
					btn7.setForeground(Color.BLUE);
				}
				cambiarTurno();
				checkCombinaciones();
				isEmpate();
				}
			}
		});
		
		btn8 = new JButton(" ");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getText().equalsIgnoreCase(" ")) {
				btn8.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.red);
				}
				else {
					btn8.setForeground(Color.BLUE);
				}
				cambiarTurno();
				checkCombinaciones();
				isEmpate();
				}
			}
		});
		
		btn9 = new JButton(" ");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 80));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getText().equalsIgnoreCase(" ")) {
				btn9.setText(turnoJugador);
				if(turnoJugador.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.red);
				}
				else {
					btn9.setForeground(Color.BLUE);
				}
				cambiarTurno();
				checkCombinaciones();
				isEmpate();
				}
			}
		});
		
		JButton btnNueva = new JButton("Nueva partida");
		btnNueva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reinicio();
			}
		});
		
		btnGanador = new JButton("");
		btnGanador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTurnoDe = new JTextField();
		txtTurnoDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTurnoDe.setText("TURNO DE ");
		txtTurnoDe.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(txtTurnoDe, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(338)
							.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(172)
							.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(165)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(172)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(338)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(172)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnGanador, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(btnNueva, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTurnoDe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnGanador, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNueva, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
