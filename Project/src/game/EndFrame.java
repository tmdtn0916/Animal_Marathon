package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Label;

public class EndFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public EndFrame() {
		setTitle("Congratulations");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Congratulations Penguin Win!");
		label.setBounds(43, 40, 188, 47);
		contentPane.add(label);
	}

}
