/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021m.dadosbean;

public class Pessoa {

	private Integer id;
	private String nome;
	private String idade;
	private String genero;
	private String peso;
	private String altura;
	private Departamento departamento;

	public Pessoa() {

	}

	public Pessoa(int id) {
		this.id = id;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String idade, String genero, String peso, String altura) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(int id, String nome, String idade, String genero, String peso, String altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", peso=" + peso + ", altura="
				+ altura + '}';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
