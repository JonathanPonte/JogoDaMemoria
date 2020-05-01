package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SelecionarImagens extends JFrame {

	private JPanel contentPane;

	public SelecionarImagens() {
		setTitle("Jogo da Memória");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 353);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Selecione a categoria do jogo: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(30, 23, 234, 42);
		contentPane.add(lblNewLabel);

		JRadioButton animal = new JRadioButton("Animais");
		animal.setFont(new Font("Tahoma", Font.BOLD, 11));
		animal.setHorizontalAlignment(SwingConstants.CENTER);
		animal.setBackground(Color.WHITE);
		animal.setBounds(67, 100, 122, 23);
		contentPane.add(animal);

		JRadioButton camps = new JRadioButton("Arquitetura");
		camps.setFont(new Font("Tahoma", Font.BOLD, 11));
		camps.setHorizontalAlignment(SwingConstants.CENTER);
		camps.setBackground(Color.WHITE);
		camps.setForeground(Color.BLACK);
		camps.setBounds(67, 142, 122, 23);
		contentPane.add(camps);

		JRadioButton arquitetura = new JRadioButton("Cor");
		arquitetura.setBackground(Color.WHITE);
		arquitetura.setFont(new Font("Tahoma", Font.BOLD, 11));
		arquitetura.setHorizontalAlignment(SwingConstants.CENTER);
		arquitetura.setBounds(69, 184, 120, 23);
		contentPane.add(arquitetura);

		ButtonGroup group = new ButtonGroup();
		group.add(animal);
		group.add(camps);
		group.add(arquitetura);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo;
				if (animal.isSelected()) {

					jogo = new Jogo(1);
					jogo.setVisible(true);

				} else if (arquitetura.isSelected()) {

					jogo = new Jogo(2);
					jogo.setVisible(true);

				} else if (camps.isSelected()) {

					jogo = new Jogo(3);
					jogo.setVisible(true);

				}

				dispose();
				
			}
		});
		btnNewButton.setBounds(67, 258, 122, 23);
		btnNewButton.setBorder(new RoundedBorder(10));
		contentPane.add(btnNewButton);

	}
}
