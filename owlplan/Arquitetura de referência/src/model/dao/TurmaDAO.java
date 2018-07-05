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
	
	public String getEmailSession() {
		HttpSession session = this.request.getSession();
		
		return (String) session.getAttribute("email");

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
			
			String sqlIdPedagoga = "select id_pedagoga as id_ped from pedagoga p inner join usuario u on p.id_user = u.id_user where u.email='" + getEmailSession() + "';";      
			
			ResultSet rs = stmt.executeQuery(sqlIdPedagoga);
			if (rs.next()) {
				Id = rs.getInt("id_ped");
			}

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
	public void excluir(Object entidade) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		
		String apelido = ((Turma) entidade).getApelido();
		
		try {
			stmt = con.createStatement();
			String sql = "delete from turma where apelido = '" + apelido + "';";

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
	public List<Turma> listarTodos() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Turma> turmas = new ArrayList<Turma>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT t.id_turma, t.apelido, t.serie, t.periodo, t.id_pedagoga, e.nome FROM turma t, pedagoga p, usuario u, escola e "
					+ "where e.id_escola = t.id_escola and t.id_pedagoga = p.id_pedagoga and p.id_user = u.id_user and u.email='" + getEmailSession() + "';";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				turmas.add(new Turma(rs.getString("t.id_turma"),rs.getString("t.apelido"),rs.getString("t.serie"),rs.getString("t.periodo"),rs.getString("t.id_pedagoga"),rs.getString("e.nome")));
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
		return turmas;
	}

	@Override
	public void atualizar(Object entidade) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		
		try {
			String apelido = ((Turma) entidade).getApelido();
			String novoApelido = ((Turma) entidade).getNovoApelido();
			String periodo = ((Turma) entidade).getPeriodo();
			String escola = ((Turma) entidade).getEscola();
			String serie = ((Turma) entidade).getSerie();
			
			stmt = con.createStatement();
			String sql = "UPDATE turma SET apelido = '" + novoApelido + "', periodo ='" + periodo + "', serie = '"
					+ serie + "', id_escola = " + escola + " WHERE apelido = '" + apelido + "';";
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

}
