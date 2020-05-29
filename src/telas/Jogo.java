package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;


import modelo.Peca;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Jogo extends JFrame {

	private JPanel contentPane;
	private int tipo;
	private Boolean btn1Click;
	private ArrayList<ImageIcon> imagens;
	private ArrayList<Peca> pecas;
	private ImageIcon imageCinza;

	public Jogo(int tipo) {

		this.tipo = tipo;
		setTitle("Jogo da Memória");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 268);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		imageCinza = new ImageIcon("src/imagens/logoPeca.png");
		ImageIcon i1;
		ImageIcon i2;
		ImageIcon i3;
		ImageIcon i4;
		ImageIcon i5;

		// 1 = animal
		// 3 = arquitetura
		// 2 = cores
		if (tipo == 1) {
			System.out.println("tipo 1");
			i1 = new ImageIcon("src/imagens/anm1.jpeg");
			i2 = new ImageIcon("src/imagens/anm2.jpeg");
			i3 = new ImageIcon("src/imagens/anm3.jpeg");
			i4 = new ImageIcon("src/imagens/anm4.jpeg");
			i5 = new ImageIcon("src/imagens/anm5.jpeg");
			imagens = new ArrayList<>();
			imagens.add(i1);
			imagens.add(i2);
			imagens.add(i3);
			imagens.add(i4);
			imagens.add(i5);

		} else if (tipo == 2) {
			System.out.println("tipo 2");
			i1 = new ImageIcon("src/imagens/cor1.jpeg");
			i2 = new ImageIcon("src/imagens/cor2.jpeg");
			i3 = new ImageIcon("src/imagens/cor3.jpeg");
			i4 = new ImageIcon("src/imagens/cor4.jpeg");
			i5 = new ImageIcon("src/imagens/cor5.jpeg");
			imagens = new ArrayList<>();
			imagens.add(i1);
			imagens.add(i2);
			imagens.add(i3);
			imagens.add(i4);
			imagens.add(i5);

		} else if (tipo == 3) {
			System.out.println("tipo 3");
			i1 = new ImageIcon("src/imagens/arq1.jpeg");
			i2 = new ImageIcon("src/imagens/arq2.jpeg");
			i3 = new ImageIcon("src/imagens/arq3.jpeg");
			i4 = new ImageIcon("src/imagens/arq4.jpeg");
			i5 = new ImageIcon("src/imagens/arq5.jpeg");
			imagens = new ArrayList<>();
			imagens.add(i1);
			imagens.add(i2);
			imagens.add(i3);
			imagens.add(i4);
			imagens.add(i5);

		}

		JButton btn1 = new JButton();
		btn1.setBounds(10, 11, 100, 100);
		contentPane.add(btn1);

		JButton btn2 = new JButton();
		btn2.setBounds(120, 11, 100, 100);
		contentPane.add(btn2);

		JButton btn3 = new JButton();
		btn3.setBounds(230, 11, 100, 100);
		contentPane.add(btn3);

		JButton btn4 = new JButton();
		btn4.setBounds(340, 11, 100, 100);
		contentPane.add(btn4);

		JButton btn5 = new JButton();
		btn5.setBounds(450, 11, 100, 100);
		contentPane.add(btn5);

		JButton btn6 = new JButton();
		btn6.setBounds(10, 122, 100, 100);
		contentPane.add(btn6);

		JButton btn7 = new JButton();
		btn7.setBounds(120, 122, 100, 100);
		contentPane.add(btn7);

		JButton btn8 = new JButton();
		btn8.setBounds(230, 122, 100, 100);
		contentPane.add(btn8);

		JButton btn9 = new JButton();
		btn9.setBounds(340, 122, 100, 100);
		contentPane.add(btn9);

		JButton btn10 = new JButton();
		btn10.setBounds(450, 122, 100, 100);
		contentPane.add(btn10);

		Peca p1 = new Peca("a", null, false, btn1, false);
		Peca p2 = new Peca("b", null, false, btn2, false);
		Peca p3 = new Peca("c", null, false, btn3, false);
		Peca p4 = new Peca("d", null, false, btn4, false);
		Peca p5 = new Peca("e", null, false, btn5, false);
		Peca p6 = new Peca("f", null, false, btn6, false);
		Peca p7 = new Peca("g", null, false, btn7, false);
		Peca p8 = new Peca("h", null, false, btn8, false);
		Peca p9 = new Peca("i", null, false, btn9, false);
		Peca p10 = new Peca("j", null, false, btn10, false);

		pecas = new ArrayList<>();
		pecas.add(p1);
		pecas.add(p2);
		pecas.add(p3);
		pecas.add(p4);
		pecas.add(p5);
		pecas.add(p6);
		pecas.add(p7);
		pecas.add(p8);
		pecas.add(p9);
		pecas.add(p10);

		Collections.shuffle(pecas);
		int posicao = 0;

		for (ImageIcon imagem : imagens) {

			int aux = posicao;

			if (posicao < pecas.size() - 1) {

				pecas.get(posicao).setImagem(imagem);
				pecas.get(aux).getBotao().setIcon(imagem);
				System.out.println(pecas.get(posicao).getName());
				pecas.get(++posicao).setImagem(imagem);
				pecas.get(++aux).getBotao().setIcon(imagem);
				System.out.println(pecas.get(aux).getName());

			}

			posicao++;

		}

		new SwingWorker() {
			@Override
			protected Object doInBackground() throws Exception {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				btn1.setIcon(imageCinza);
				btn2.setIcon(imageCinza);
				btn3.setIcon(imageCinza);
				btn4.setIcon(imageCinza);
				btn5.setIcon(imageCinza);
				btn6.setIcon(imageCinza);
				btn7.setIcon(imageCinza);
				btn8.setIcon(imageCinza);
				btn9.setIcon(imageCinza);
				btn10.setIcon(imageCinza);

				return null;
			}

		}.execute();

		// botão 1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn1, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn2, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn3, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn4, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn5, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn6, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn7, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn8, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn9, pecas);

						return null;
					}

				}.execute();
			}
		});

		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {

						click(btn10, pecas);

						return null;
					}

				}.execute();
			}
		});
	}

	public void click(JButton botao, ArrayList<Peca> pecas) {

		Peca pecaClicado1 = existClicado(pecas);
		Peca pecaClicado2 = getPeca(botao, pecas);
		
		if (!pecaClicado2.getIsClidado()) {
			if (pecaClicado1 != null) {

				pecaClicado2.getBotao().setIcon(pecaClicado2.getImagem());

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (pecaClicado1.getImagem() == pecaClicado2.getImagem()) {
					pecaClicado2.getBotao().setIcon(pecaClicado2.getImagem());
					pecaClicado1.setAchouPar(true);
					pecaClicado2.setAchouPar(true);
					pecas.remove(pecaClicado1);
					pecas.remove(pecaClicado2);

				} else {
					pecaClicado1.getBotao().setIcon(imageCinza);
					pecaClicado2.getBotao().setIcon(imageCinza);
					pecaClicado1.setIsClidado(false);
					pecaClicado2.setIsClidado(false);
				}

			} else {
				pecaClicado2.setIsClidado(true);
				pecaClicado2.getBotao().setIcon(pecaClicado2.getImagem());
				System.out.println("deu bom 1 ");
			}
		}

	}

	public Peca existClicado(ArrayList<Peca> pecas) {

		for (Peca peca : pecas) {

			if (peca.getIsClidado()) {
				return peca;
			}
		}

		return null;
	}

	public Peca getPeca(JButton button, ArrayList<Peca> pecas) {
		for (Peca peca : pecas) {

			if (peca.getBotao() == button) {
				return peca;
			}
		}
		return null;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
