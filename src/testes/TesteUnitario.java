package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.junit.jupiter.api.Test;

import modelo.Peca;
import telas.Jogo;

class TesteUnitario{
	
	@Test
	public void clicarCarta() {
		
		ImageIcon i1 = new ImageIcon("src/imagens/arq1.jpeg");
		
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		
		Peca p1 = new Peca("pecaTeste", i1, false, btn1, false);
		Peca p2 = new Peca("pecaTeste", i1, false, btn2, false);
		
		ArrayList<Peca> pecas = new ArrayList<Peca>();
		pecas.add(p1);
		pecas.add(p2);
		
		Jogo jogo = new Jogo(1);
		jogo.click(btn1, pecas);
		jogo.click(btn2, pecas);
		
		assertEquals(true, p1.getAchouPar());
		assertEquals(true, p2.getAchouPar());
		
	}

	@Test
	public void existeClicado() {
		
		ImageIcon i1 = new ImageIcon("src/imagens/arq1.jpeg");
		
		JButton btn1 = new JButton();
		
		
		Peca p1 = new Peca("pecaTeste", i1, false, btn1, true);
		
		ArrayList<Peca> pecas = new ArrayList<Peca>();
		pecas.add(p1);
		
		Jogo jogo = new Jogo(1);
		Peca peca = jogo.existClicado(pecas);
		
		assertEquals(p1, peca);
	}
	
	
	@Test
	public void pegarPecaBotao() {
		
		ImageIcon i1 = new ImageIcon("src/imagens/arq1.jpeg");
		
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		
		Peca p1 = new Peca("pecaTeste", i1, false, btn1, true);
		Peca p2 = new Peca("pecaTeste", i1, false, btn2, false);
		
		ArrayList<Peca> pecas = new ArrayList<Peca>();
		pecas.add(p1);
		pecas.add(p2);
		
		Jogo jogo = new Jogo(1);
		Peca peca = jogo.getPeca(btn2, pecas);
		
		assertEquals(p2, peca);
	}
	
	

}
