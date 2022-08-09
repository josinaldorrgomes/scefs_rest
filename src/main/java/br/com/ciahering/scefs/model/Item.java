package br.com.ciahering.scefs.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item {

	private Integer id;
	private LocalDate data_de_aquisicao;
	private LocalDate data_de_cadastro;
	private String marca;
	private String modelo;
	private Integer patrimonio;
	private Local local;
	private List<Movimentacao> movimentacoes = new ArrayList<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getData_de_aquisicao() {
		return data_de_aquisicao;
	}
	public void setData_de_aquisicao(LocalDate data_de_aquisicao) {
		this.data_de_aquisicao = data_de_aquisicao;
	}
	public LocalDate getData_de_cadastro() {
		return data_de_cadastro;
	}
	public void setData_de_cadastro(LocalDate data_de_cadastro) {
		this.data_de_cadastro = data_de_cadastro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(Integer patrimonio) {
		this.patrimonio = patrimonio;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id);
	}
	
}
