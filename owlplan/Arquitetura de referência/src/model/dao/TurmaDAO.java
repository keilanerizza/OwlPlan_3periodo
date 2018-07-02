package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.javabean.Turma;
import model.javabean.Usuario;

public class TurmaDAO implements DAO{
	HttpServletRequest request;

	public TurmaDAO(HttpServletRequest request) {
		super();
		this.request = request;
	}

	public Usuario busca(String nome, String email, String senha) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		Usuario usuario = null;
		try {
			stmt = con.createStatement();
			String sql = "SELECT nome FROM usuarios where usuario='" + nome + "' and senha='" + senha + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				nome = rs.getString("nome");
				usuario = new Usuario(nome, email, senha);
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
		int Id = 0;
		try {
			stmt = con.createStatement();
			HttpSession session = this.request.getSession();
			
			String email_session = (String) session.getAttribute("email");
			
			System.out.println(email_session);
			
			String sqlIdPedagoga = "select id_pedagoga as id_ped from pedagoga p inner join usuario u on p.id_user = u.id_user where u.email='" + email_session + "';";      
			
			ResultSet rs = stmt.executeQuery(sqlIdPedagoga);
			if (rs.next()) {
				Id = rs.getInt("id_ped");
			}
			
			System.out.println("id ped = " + Id);
			System.out.println(((Turma)entidade).getEscola());

			String sql = "insert into turma(apelido,serie,periodo,id_pedagoga,id_escola) values('"+((Turma)entidade).getApelido()+"','"
					+((Turma)entidade).getSerie()+"','"+((Turma)entidade).getPeriodo()+"',"+ Id + "," +((Turma)entidade).getEscola() +");";
			stmt.executeUpdate(sql);
			
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
	public List listarTodos() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM usuarios;";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				usuarios.add(new Usuario(rs.getString("nome"),rs.getString("usuario"),rs.getString("senha")));
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
		return usuarios;
	}

}
