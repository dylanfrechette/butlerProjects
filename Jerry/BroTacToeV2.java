import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;

//class RoundButton extends JButton {
//	protected void paintComponent(Graphics g) {
//	     if (getModel().isArmed()) {
//	           g.setColor(Color.PINK);
//	     } else {
//	          g.setColor(Color.PINK);
//	     }
//	     g.fillOval(0, 0, getSize().width-1, getSize().height-1);
//	     super.paintComponent(g);
//	}
//	protected void paintBorder(Graphics g) {
//	     g.setColor(getForeground());
//	     g.drawOval(0, 0, getSize().width-1, getSize().height-1);
//	}
//	Shape shape;
//	public boolean contains(int x, int y) {
//	     if (shape == null || !shape.getBounds().equals(getBounds())) {
//	          shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
//	     }
//	     return shape.contains(x, y);
//	}
//}

public class BroTacToeV2 extends JFrame {

	private JPanel contentPane;
	private String startGame = turn;
	private int xCount = 0;
	private int oCount = 0;
	private JLabel lblCountO;
	private JLabel lblCountX;
	lines backgroundLines;
	private AbstractButton btn1;
	private AbstractButton btn2;
	private AbstractButton btn3;
	private AbstractButton btn4;
	private AbstractButton btn5;
	private AbstractButton btn6;
	private AbstractButton btn7;
	private AbstractButton btn8;
	private AbstractButton btn9;
	private static Component frame;
	private JTextField txtCountX;
	private JTextField txtCountO;
	static String turn;

	class lines extends JPanel {
		public void paintComponent(Graphics g) {
            g.drawLine(120, 180, 470, 650);
			g.drawLine(102, 630, 458, 170);
			g.drawLine(130, 150, 920, 150);
			g.drawLine(112, 640, 920, 640);
			g.drawLine(120, 180, 890, 610);
			g.drawLine(890, 610, 465, 120);
			g.drawLine(900, 195, 112, 610);
			g.drawLine(900, 195, 500, 610);
			g.drawLine(250, 405, 700, 405);
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Object[] options = { "Second", "First" };
		int action = JOptionPane.showOptionDialog(frame, "Welcome to Jerry Tac Toe!\nWould you like to go first or second?",
				"Welcome!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (action == JOptionPane.YES_OPTION)
			turn = "X";
		else if (action == JOptionPane.NO_OPTION)
			turn = "O";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BroTacToeV2 frame = new BroTacToeV2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void gameScore(String player) {
		if (player.equalsIgnoreCase("X"))
			txtCountX.setText(String.valueOf(1 + xCount++));
		if (player == "O")
			txtCountO.setText(String.valueOf(1 + oCount++));
	}

	private void choosePlayer() {
		if (startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		} else {
			startGame = "X";
		}
	}

	private void CPU() {
		int choice = (int) (Math.random() * ((9 - 1) + 1)) + 1;
		if (choice == 1)
			if (btn1.getText() == "") {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn1.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 2)
			if (btn2.getText() == "") {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn2.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 3)
			if (btn3.getText() == "") {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn3.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 4)
			if (btn4.getText() == "") {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn4.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 5)
			if (btn5.getText() == "") {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn5.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 6)
			if (btn6.getText() == "") {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn6.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 7)
			if (btn7.getText() == "") {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn7.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 8)
			if (btn8.getText() == "") {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn8.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
		if (choice == 9)
			if (btn9.getText() == "") {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn9.setForeground(Color.BLUE);
				}
				choosePlayer();
			} else
				CPU();
	}

	private void winningGame() {
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();

		if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) Congratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b1 == ("X") && b4 == ("X") && b8 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) Congratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) Congratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b2 == ("X") && b4 == ("X") && b7 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b2 == ("X") && b6 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			gameScore("X");
            resetwhendone();
		}

		else if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b3 == ("X") && b6 == ("X") && b8 == ("X")) {
			JOptionPane.showMessageDialog(frame,
					"BTT Bot wins (PS. BTT totally doesn't stand for butt.) \nCongratulations! You have won! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// xCount++;
			gameScore("X");
            resetwhendone();
		}

		else if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b1 == ("O") && b4 == ("O") && b8 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b2 == ("O") && b4 == ("O") && b7 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b2 == ("O") && b6 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b3 == ("O") && b6 == ("O") && b8 == ("O")) {
			JOptionPane.showMessageDialog(frame,
					"Aw man, the guys with dad bods won :( ugh! Press 'Reset' to play again",
					"Bro Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			// oCount++;
			gameScore("O");
            resetwhendone();
		}

		else if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != ""
				&& b9 != "") {
			JOptionPane.showMessageDialog(frame, "None of y'all won. You still get points tho.", "Bro Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			gameScore("O");
			gameScore("X");
            resetwhendone();
		}
	}

    private void resetwhendone() {
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
    }

	/**
	 * Create the frame.
	 */
	public BroTacToeV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1200);
		contentPane = new lines();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// backgroundLines = new lines ();

        btn1 = new RoundButton();
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn1.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();

			}
		});
		btn1.setBounds(33, 98, 100, 100);
		contentPane.add(btn1);

        btn2 = new RoundButton();
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn2.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();

			}
		});
		btn2.setBounds(429, 98, 100, 100);
		contentPane.add(btn2);

        btn3 = new RoundButton();
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn3.setForeground(Color.BLUE);
				}
                winningGame();
                choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn3.setBounds(862, 98, 100, 100);
		contentPane.add(btn3);

        btn4 = new RoundButton();
		btn4.setOpaque(false);
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn4.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn4.setBounds(223, 353, 100, 100);
		contentPane.add(btn4);

        btn5 = new RoundButton();
		btn5.setOpaque(false);
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn5.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn5.setBounds(443, 353, 100, 100);
		contentPane.add(btn5);

        btn6 = new RoundButton();
		btn6.setOpaque(false);
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn6.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn6.setBounds(641, 353, 100, 100);
		contentPane.add(btn6);

        btn7 = new RoundButton();
		btn7.setOpaque(false);
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn7.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn7.setBounds(33, 590, 100, 100);
		contentPane.add(btn7);

        btn8 = new RoundButton();
		btn8.setOpaque(false);
		btn8.setContentAreaFilled(false);
		btn8.setBorderPainted(false);
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn8.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn8.setBounds(429, 590, 100, 100);
		contentPane.add(btn8);

        btn9 = new RoundButton();
		btn9.setOpaque(false);
		btn9.setContentAreaFilled(false);
		btn9.setBorderPainted(false);
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
				} else if (startGame.equalsIgnoreCase("O")) {
					btn9.setForeground(Color.BLUE);
				}
                winningGame();
				choosePlayer();
				CPU();
                winningGame();
			}
		});
		btn9.setBounds(862, 590, 100, 100);
		contentPane.add(btn9);

		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.BLUE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");

			}
		});
		btnReset.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnReset.setBounds(898, 858, 200, 120);
		contentPane.add(btnReset);

		JButton btnEXT = new JButton("Exit");
		btnEXT.setForeground(Color.RED);
		btnEXT.setBackground(Color.RED);
		btnEXT.addActionListener((ActionListener) new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm you want to exit", "Bro Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnEXT.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		btnEXT.setBounds(1094, 858, 200, 120);
		contentPane.add(btnEXT);

		JLabel label_1 = new JLabel("TeamDadBods");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		label_1.setBounds(967, 410, 200, 120);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Player 1");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		label_2.setBounds(967, 333, 200, 120);
		contentPane.add(label_2);

		txtCountX = new JTextField();
		txtCountX.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		txtCountX.setBounds(1164, 353, 75, 75);
		contentPane.add(txtCountX);
		txtCountX.setColumns(10);

		txtCountO = new JTextField();
		txtCountO.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		txtCountO.setBounds(1164, 427, 75, 75);
		contentPane.add(txtCountO);
		txtCountO.setColumns(10);
	}
}
