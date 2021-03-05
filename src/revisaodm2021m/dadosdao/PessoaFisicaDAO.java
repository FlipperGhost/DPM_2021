package revisaodm2021m.dadosdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revisaodm2021m.config.DataSource;
import revisaodm2021m.dadosbean.PessoaFisica;

public class PessoaFisicaDAO extends DataSource {



		public PessoaFisica inserir(PessoaFisica pessoa) {

			Connection con = null;
			PreparedStatement pst = null;
			try {
				con = getConexaoMySQL();

				StringBuilder sql = new StringBuilder();
				int parameter = 0;
				sql.append(" INSERT INTO PESSOA(nome,telefone,cpf )");
				sql.append(" Values ( ?, ?,  ? ) ");

				pst = con.prepareStatement(sql.toString());
				pst.setString(++parameter, pessoa.getNome());
				pst.setString(++parameter, pessoa.getTelefone());
				pst.setString(++parameter, pessoa.getTelefone());

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

		public PessoaFisica alterar(PessoaFisica pessoa) {
			return pessoa;
		}

		public List<PessoaFisica> listar() {
			
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			List<PessoaFisica> listPessoaFisica = new ArrayList<>();
			
			try {
				con = getConexaoMySQL();

				StringBuilder sql = new StringBuilder();
				sql.append(" SELECT id,nome,telefone,cpf ");
				sql.append(" FROM PessoaFisica ");

				pst = con.prepareStatement(sql.toString());
				
				 rs = pst.executeQuery();
				 
				 while (rs.next()) {
					 
					 PessoaFisica pessoa = new PessoaFisica();
					 
					 pessoa.setNome(rs.getString("nome"));
					 pessoa.setId(rs.getInt("id"));
					 pessoa.setTelefone(rs.getString("telefone"));
					 pessoa.setCpf(rs.getString("cpf"));
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
			
			
			
			
			return listPessoaFisica;
		}

		public PessoaFisica buscar(PessoaFisica pessoa) {
			
			
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;

			
			try {
				con = getConexaoMySQL();

				PessoaFisica newPessoaFisica = new PessoaFisica();
				StringBuilder sql = new StringBuilder();
				sql.append(" SELECT id,nome,telefone,cpf ");
				sql.append(" FROM PessoaFisica ");

				pst = con.prepareStatement(sql.toString());
				
				 rs = pst.executeQuery();
				 
				 if (rs.next()) {
					 
					 pessoa.setNome(rs.getString("nome"));
					 pessoa.setId(rs.getInt("id"));
					 pessoa.setTelefone(rs.getString("telefone"));
					 pessoa.setCpf(rs.getString("cpf"));

				 }
				 return newPessoaFisica;

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

		public void excluir(PessoaFisica pessoa) {
			
			
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;

			
			try {
				con = getConexaoMySQL();

				StringBuilder sql = new StringBuilder();
				sql.append(" Delete ");
				sql.append(" FROM PessoaFisica ");
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


