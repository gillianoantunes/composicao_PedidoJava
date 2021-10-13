package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {
	private String nomeCli;
	private String email;
	private Date dataNiver;
	
	public Clientes() {
		
	}
	
	public Clientes(String nomeCli, String email, Date dataNiver) {
		this.nomeCli = nomeCli;
		this.email = email;
		this.dataNiver =dataNiver;
	}

	public String getNomeCli() {
		return nomeCli;
	}

	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNiver() {
		return dataNiver;
	}

	public void setDataNiver(Date dataNiver) {
		this.dataNiver = dataNiver;
	}
	
	
	
}


