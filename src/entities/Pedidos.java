package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedidos {
	
	private Date momento;
	private StatusPedido status;
	private Clientes clientes; //relaçaõ 1, todo pedido é de 1 cliente
	private List<Itens> itens = new ArrayList<>(); // relação varios, um pedido tem varios itens - usa a lista

	public Pedidos() {
		
	}

	public Pedidos(Date momento, StatusPedido status, Clientes clientes) {
		
		this.momento = momento;
		this.status = status;
		this.clientes = clientes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public List<Itens> getItens() {
		return itens;
	}

	// apagaguei o set de lista itens e vou gerar o add e remove da lista de itens manual
	
	public void addItens(Itens itens) {
		//usei o this pois nome ficou igual do parametro
		this.itens.add(itens); //a lista recebe o item passado no parametro
	}
	public void removeItens(Itens itens) {
		//usei o this pois nome ficou igual do parametro
		this.itens.remove(itens); //a lista recebe o item passado no parametro
	}

	public String toString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Sumário dos Pedidos: \n");
		sb.append("Momento do Pedido: " + sdf1.format(getMomento()));
		sb.append(" Status do Pedido: " + getStatus());
		
		sb.append(" Cliente: "+ getClientes().getNomeCli() 
				+ "("+ sdf1.format(getClientes().getDataNiver()) + ")" 
				+ "-" + getClientes().getEmail()+ "\n");
		
		sb.append("Itens do Pedido: \n");
		Double totalPreco = 0.0;
		for (Itens  i : itens) {
			sb.append(i.getProduto().getNomeProd() + ", $"
					 + i.getPrecoItem() + ", Quantidade: "
					 + i.getQuant()+ ", Subtotal: $" 
					 + (String.format("%.2f" , i.subTotal()))+"\n");
			 totalPreco += i.subTotal();
	   }
		sb.append("\n Preço Total: $" + String.format("%.2f", totalPreco));
		
		return sb.toString();
	}
	
}
	

