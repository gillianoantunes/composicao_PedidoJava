package entities;

public class Produtos {
	private String nomeProd;
	private Double preco;
	
	public Produtos() {
		
	}

	public Produtos(String nomeProd, Double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
