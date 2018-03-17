package br.com.yaman.quitanda.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gabriel.melo
 *
 */
@Entity
@Table(name = "PRODUTO")
@SequenceGenerator(name = "ProdutoSeq", sequenceName = "SEQ_COD_PRODUTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProdutoSeq")
	@Column(name = "COD_PRODUTO")
	private Integer id;

	@Column(name = "NOME")
	private String nome;

	@ManyToOne
	@NotBlank
	@JoinColumn(name = "COD_TIPO_PRODUTO")
	private TipoProduto tipoProduto;

	@NotBlank
	@Column(name = "DESCRICAO")
	private String descricao;

	@NotBlank
	@Column(name = "CALORIAS")
	private Double calorias;

	@NotBlank
	@Column(name = "PESO_MEDIO")
	private Double pesoMedio;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer id, String nome, TipoProduto tipoProduto, String descricao, Double calorias,
			Double pesoMedio) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.calorias = calorias;
		this.pesoMedio = pesoMedio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	public Double getPesoMedio() {
		return pesoMedio;
	}

	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
	}

}
