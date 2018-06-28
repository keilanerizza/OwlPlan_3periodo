package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Pedagoga;
import model.javabean.Usuario;

public class PedagogaDAO implements DAO {

	public Usuario busca(String email, String senha) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		Usuario usuario = null;
		
		try {
			stmt = con.createStatement();
			String sql = "SELECT nome, email, senha FROM usuario where email='" + email + "' and senha='" + senha + "';";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				usuario = new Usuario(rs.getString("nome"), email);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return usuario;
	}

	@Override
	public Object recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			int lastId = 0;
			
			String sqlUser = "insert into usuario(nome,email,senha) values('"+((Usuario)entidade).getNome()+"','"+((Usuario)entidade).getEmail()+"','"+((Usuario)entidade).getSenha()+"');";
			stmt.executeUpdate(sqlUser);
			
			String sqlLastId = "select max(id_user) as id_user from usuario;";
			ResultSet rs = stmt.executeQuery(sqlLastId);
			if (rs.next()) {
				lastId = rs.getInt("id_user");
			}

			String sqlPed = "insert into pedagoga(sexo,nasc,id_user) values('"+((Pedagoga)entidade).getSexo()+"','"+((Pedagoga)entidade).getNascimento()+"',"+ lastId +");";
			stmt.executeUpdate(sqlPed);
			
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pedagoga> listarTodos() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Pedagoga> pedagogas = new ArrayList<Pedagoga>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM pedagoga, usuario where pedagoga.id_user = usuario.id_user;";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				pedagogas.add(new Pedagoga(rs.getString("nome"),rs.getString("email"),rs.getString("senha"),rs.getString("sexo"),rs.getString("nascimento")));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return pedagogas;
	}

}
