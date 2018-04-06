package br.com.pizzariamaster.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cli_id;

	private String cli_nome;
	private String cli_rua;
	private String cli_bairro;
	private String cli_telefone;
	private Calendar cli_Data_cad;
	public Integer getCli_id() {
		return cli_id;
	}
	public void setCli_id(Integer cli_id) {
		this.cli_id = cli_id;
	}
	public String getCli_nome() {
		return cli_nome;
	}
	public void setCli_nome(String cli_nome) {
		this.cli_nome = cli_nome;
	}
	public String getCli_rua() {
		return cli_rua;
	}
	public void setCli_rua(String cli_rua) {
		this.cli_rua = cli_rua;
	}
	public String getCli_bairro() {
		return cli_bairro;
	}
	public void setCli_bairro(String cli_bairro) {
		this.cli_bairro = cli_bairro;
	}
	public String getCli_telefone() {
		return cli_telefone;
	}
	public void setCli_telefone(String cli_telefone) {
		this.cli_telefone = cli_telefone;
	}
	public Calendar getCli_Data_cad() {
		return cli_Data_cad;
	}
	public void setCli_Data_cad(Calendar cli_Data_cad) {
		this.cli_Data_cad = cli_Data_cad;
	}
	
	

}
