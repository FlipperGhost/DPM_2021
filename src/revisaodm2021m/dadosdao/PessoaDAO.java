/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021m.dadosdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revisaodm2021m.config.DataSource;
import revisaodm2021m.dadosbean.Pessoa;

/**
 *
 * @author User
 */
public class PessoaDAO extends DataSource {

	public Pessoa inserir(Pessoa pessoa) {

		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = getConexaoMySQL();

			StringBuilder sql = new StringBuilder();
			int parameter = 0;
			sql.append(" INSERT INTO PESSOA(nome,idade,genero,peso,altura )");
			sql.append(" Values ( ?, ?, ?, ?, ? ) ");

			pst = con.prepareStatement(sql.toString());
			pst.setString(++parameter, pessoa.getNome());
			pst.setInt(++parameter, Integer.parseInt(pessoa.getIdade()));
			pst.setString(++parameter, pessoa.getGenero());
			pst.setDouble(++parameter, Double.parseDouble(pessoa.getPeso()));
			pst.setDouble(++parameter, Double.parseDouble(pessoa.getAltura()));

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return pessoa;
	}

	public Pessoa alterar(Pessoa pessoa) {
		return pessoa;
	}

	public List<Pessoa> listar() {
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Pessoa> listPessoa = new ArrayList<>();
		
		try {
			con = getConexaoMySQL();

			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT nome,idade,genero,peso,altura ");
			sql.append(" FROM Pessoa ");

			pst = con.prepareStatement(sql.toString());
			
			 rs = pst.executeQuery();
			 
			 while (rs.next()) {
				 
				 Pessoa pessoa = new Pessoa();
				 
				 pessoa.setNome(rs.getString("nome"));
				 pessoa.setId(rs.getInt("idade"));
				 pessoa.setGenero(rs.getString("genero"));
				 pessoa.setPeso(rs.getString("peso"));
				 pessoa.setPeso(rs.getString("altura"));
			 }
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		return listPessoa;
	}

	public Pessoa buscar(Pessoa pessoa) {
		
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		
		try {
			con = getConexaoMySQL();

			Pessoa newPessoa = new Pessoa();
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT nome,idade,genero,peso,altura ");
			sql.append(" FROM Pessoa ");

			pst = con.prepareStatement(sql.toString());
			
			 rs = pst.executeQuery();
			 
			 if (rs.next()) {
				 
				 
				 pessoa.setNome(rs.getString("nome"));
				 pessoa.setId(rs.getInt("idade"));
				 pessoa.setGenero(rs.getString("genero"));
				 pessoa.setPeso(rs.getString("peso"));
				 pessoa.setPeso(rs.getString("altura"));
			 }
			 return newPessoa;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		return pessoa;
	}

	public void excluir(Pessoa pessoa) {
		
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		
		try {
			con = getConexaoMySQL();

			Pessoa newPessoa = new Pessoa();
			StringBuilder sql = new StringBuilder();
			sql.append(" Delete ");
			sql.append(" FROM Pessoa ");
			sql.append("WHERE nome like ? ");
			
			pst = con.prepareStatement(sql.toString());
			pst.setString(1, "%"+pessoa.getNome()+"%");
			pst.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
	}

}
