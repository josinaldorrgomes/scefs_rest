package br.com.ciahering.scefs.model.enums;

public enum TipoUsuario {

	DIRETOR("DIRETOR"),
	GERENTE("GERENTE"),
	COORDENADOR("COORDENADOR"),
	TEAM_LEADER("TEAM LEADER"),
	ANALISTA("ANALISTA"),
	TECNICO("TÉCNICO");

	private String descricao;

	private TipoUsuario(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
