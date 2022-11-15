import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

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
	
	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 10, 45, 45);
		contentPane.add(btnNewButton);
		
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
					cambiarTurno();
					checkCombinaciones();
				}
			}
		});
		btn1.setBounds(10, 86, 173, 92);
		contentPane.add(btn1);
		
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
				cambiarTurno();
				checkCombinaciones();
				}
			}
		});
		btn2.setBounds(182, 86, 173, 92);
		contentPane.add(btn2);
		
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
				cambiarTurno();
				checkCombinaciones();
				}
				
			}
		});
		btn3.setBounds(348, 86, 173, 92);
		contentPane.add(btn3);
		
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
				cambiarTurno();
				checkCombinaciones();
				}
			}
		});
		btn4.setBounds(10, 178, 173, 92);
		contentPane.add(btn4);
		
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
				cambiarTurno();
				checkCombinaciones();
				}
			}
		});
		btn5.setBounds(182, 178, 173, 92);
		contentPane.add(btn5);
		
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
				}
			}
		});
		btn6.setBounds(348, 178, 173, 92);
		contentPane.add(btn6);
		
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
				}
			}
		});
		btn7.setBounds(10, 270, 173, 92);
		contentPane.add(btn7);
		
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
				}
			}
		});
		btn8.setBounds(182, 270, 173, 92);
		contentPane.add(btn8);
		
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
				}
			}
		});
		btn9.setBounds(348, 270, 173, 92);
		contentPane.add(btn9);
		
		JButton btnNueva = new JButton("Nueva partida");
		btnNueva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reinicio();
			}
		});
		btnNueva.setBounds(283, 372, 261, 50);
		contentPane.add(btnNueva);
		
		btnGanador = new JButton("");
		btnGanador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGanador.setBounds(10, 372, 261, 50);
		contentPane.add(btnGanador);
		
		txtTurnoDe = new JTextField();
		txtTurnoDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTurnoDe.setText("TURNO DE ");
		txtTurnoDe.setBounds(54, 10, 301, 45);
		contentPane.add(txtTurnoDe);
		txtTurnoDe.setColumns(10);
	}
}
