package modelo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Peca {
	
	private String name;
	private ImageIcon imagem;
	private Boolean achouPar;
	private JButton botao;
	private Boolean isClidado;
	
	
	public Peca(String nome , ImageIcon imagem, Boolean achouPar, JButton botao, Boolean isClicado) {
		super();
		this.name = nome;
		this.imagem = imagem;
		this.achouPar = achouPar;
		this.botao = botao;
		this.isClidado = isClicado;
	}


	

	public Boolean getIsClidado() {
		return isClidado;
	}




	public void setIsClidado(Boolean isClidado) {
		this.isClidado = isClidado;
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public ImageIcon getImagem() {
		return imagem;
	}

	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}


	public Boolean getAchouPar() {
		return achouPar;
	}


	public void setAchouPar(Boolean achouPar) {
		this.achouPar = achouPar;
	}


	public JButton getBotao() {
		return botao;
	}


	public void setBotao(JButton botao) {
		this.botao = botao;
	}

	

	
	
	
	
}
