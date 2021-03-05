package revisaodm2021m.dadostelas;

import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021m.dadosbean.Departamento;
import revisaodm2021m.dadoscontrole.DepartamentoController;

public class ManterDepartamento {

	static int id;
	static String nome;

	static DepartamentoController contDepart;

	public ManterDepartamento() {
		contDepart = DepartamentoController.getInstance();
	}

	public void Cadastrar() {
		nome = JOptionPane.showInputDialog("NOME");

		Departamento departEntrada = new Departamento(nome);
		Departamento departSaida = contDepart.inserir(departEntrada);
		JOptionPane.showMessageDialog(null, departSaida.toString());
	}

	public void Listar() {
		nome = JOptionPane.showInputDialog("NOME");
		Departamento departEntrada = new Departamento(nome);
		List<Departamento> pssSaida = contDepart.listar(departEntrada);
		JOptionPane.showMessageDialog(null, pssSaida.get(1).toString());
	}

	public void Alterar() {
		id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
		nome = JOptionPane.showInputDialog("NOME");

		Departamento departEntrada = new Departamento(id, nome);
		Departamento departSaida = contDepart.alterar(departEntrada);

		JOptionPane.showMessageDialog(null, departSaida.toString());
	}

	public void Buscar() {
		id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
		Departamento departEntrada = new Departamento(id);
		Departamento departSaida = contDepart.buscar(departEntrada);
		JOptionPane.showMessageDialog(null, departSaida.toString());
	}

	public void Excluir() {
		id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
		Departamento departEntrada = new Departamento(id);
		Departamento departSaida = contDepart.excluir(departEntrada);
		JOptionPane.showMessageDialog(null, departSaida.toString());
	}

}
