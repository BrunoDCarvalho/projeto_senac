package br.com.senac.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long>{
	
	@Column(name = "bairro", nullable = false, unique = false, length = 255)
	private String bairro;
	
	@Column(name = "cep", nullable = false, unique = false, length = 9)
	private String cep;
	
	@Column(name = "cidade", nullable = false, unique = false, length = 255)
	private String cidade;
	
	@Column(name = "complemento", unique = false, length = 255)
	private String complemento;
	
	@Column(name = "logradouro", nullable = false, unique = false, length = 255)
	private String logradouro;
	
	@Column(name = "numero", nullable = false, unique = false, length = 255, columnDefinition = "")
	private Integer numero;
	
	@Column(name = "cep", nullable = false, unique = false, length = 2)
	private String uf;

}
