package org.findnm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Find extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private CardLayout card;
	private JLabel lbl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Find frame = new Find();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Find");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Find() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		card = new CardLayout();
		contentPane.setLayout(card);
		
		JPanel first = new JPanel();
		contentPane.add(first, "first");
		first.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Number");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 65, 94, 24);
		first.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.LEFT);
		t1.setBounds(114, 65, 152, 24);
		first.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Find");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 124, 94, 24);
		first.add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.LEFT);
		t2.setBounds(114, 128, 152, 20);
		first.add(t2);
		t2.setColumns(10);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = t1.getText();
				String find = t2.getText();
				int count=0;
				String st=null;
				for(int i =0; i<number.length(); i++) {
					char ch = number.charAt(i);
					st=String.valueOf(ch);
					if(st.equals(find)) {
						count++;
					}
					
				}
				//lbl.setText("hi");
				lbl.setText(find +" occurs" +" " +String.valueOf(count) +" times");
				card.show(contentPane, "last");
				
				card.show(contentPane, "last");
				
			}
		});
		btnGo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGo.setBounds(96, 214, 89, 23);
		first.add(btnGo);
		
		JPanel last = new JPanel();
		contentPane.add(last, "last");
		last.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("And I found It");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 11, 226, 29);
		last.add(lblNewLabel_2);
		
		lbl = new JLabel("");
		lbl.setForeground(Color.RED);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl.setBounds(20, 97, 246, 106);
		last.add(lbl);
		
		JButton btnagain = new JButton("AGAIN");
		btnagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText("");
				t2.setText("");
				card.show(contentPane, "first");
			}
		});
		btnagain.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnagain.setBounds(86, 235, 89, 23);
		last.add(btnagain);
	}
}
