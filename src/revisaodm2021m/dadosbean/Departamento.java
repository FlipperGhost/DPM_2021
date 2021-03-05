package revisaodm2021m.dadosbean;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private Integer id;
	private String descricao;
	private List<Pessoa> pessoas = new ArrayList<>();;
	
	public Departamento() {

	}

	public Departamento(Integer id) {
		super();
		this.id = id;
	}

	public Departamento(String descricao) {

		this.descricao = descricao;
	}
	public Departamento(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	

}
