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
@Table(name = "ESTOQUE")
@SequenceGenerator(name = "EstoqueSeq", sequenceName = "SEQ_COD_ESTOQUE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estoque{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EstoqueSeq")
	@Column(name = "COD_ESTOQUE")
//	@NotBlank
	private Integer id;

//	@NotBlank
	@ManyToOne
	@JoinColumn(name = "COD_PRODUTO")
	private Produto produto;
	
//	@NotBlank
	@Column(name = "QTD_DISPONIVEL")
	private Integer quantidadeDisponivel;

//	@NotBlank
	@Column(name = "QTD_TOTAL")
	private Integer quantidadeTotal;

	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	public Estoque(Integer id, Produto produto, Integer quantidadeDisponivel, Integer quantidadeTotal) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quantidadeTotal = quantidadeTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(Integer quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

}
