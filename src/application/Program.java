package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Clientes;
import entities.Itens;
import entities.Pedidos;
import entities.Produtos;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println("Entre com os dados do cliente:");
	System.out.println("Nome: ");
	String nomecli = sc.nextLine();
	System.out.println("Email: ");
	String email = sc.nextLine();
	System.out.println("Data de aniversário: ");
	Date dataNiver = sdf.parse(sc.next());
	Clientes cliente = new Clientes(nomecli, email, dataNiver);
	
	System.out.println("Entre com os dados do pedido:");
	System.out.println("Status: ");
	String status = sc.next();
	Date momento = new Date();
	Pedidos pedido = new Pedidos(momento, StatusPedido.valueOf(status), cliente);
	
	System.out.println("Quantos itens tem o pedido:");
	int n = sc.nextInt();
	
	for (int i =1 ; i<=n; i++) {
		
	
		System.out.println("Entre com o item " + i);
		System.out.println("Nome do Produto: ");
		sc.nextLine();
		String nomeProd = sc.nextLine();
		System.out.println("Preço do Produto: ");
		Double precoProd = sc.nextDouble();
		System.out.println("Quantidade do Produto: ");
		int quant = sc.nextInt();
		Produtos produto = new Produtos(nomeProd, precoProd);
		Itens itens = new Itens(quant, precoProd, produto);
		pedido.addItens(itens);
		
	}
	
	System.out.println(pedido.toString());
	sc.close();
		
	
	}

}
