package entities;

public class Itens {
	private Integer quant;
	private Double precoItem;
	private Produtos produto;
	
	public Itens() {
		
	}
	public Itens(Integer quant, Double precoItem, Produtos produto) {
		this.quant = quant;
		this.precoItem = precoItem;
		this.produto = produto;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	public Double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}
	public Produtos getProduto() {
		return produto;
	}
	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quant * precoItem;
	}
	
}


