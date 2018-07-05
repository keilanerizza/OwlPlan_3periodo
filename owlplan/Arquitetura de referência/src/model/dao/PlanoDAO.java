package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.javabean.Plano;
import model.javabean.Turma;

public class PlanoDAO implements DAO {

	@Override
	public Object recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Plano> listarTodos() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		
		List<Plano> planos = new ArrayList<Plano>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * from planejamento;";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				planos.add(new Plano(rs.getString("id_plan"), rs.getString("imagem"), rs.getString("id_turma"), rs.getString("id_layout")));
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
		return planos;
	}

	@Override
	public void atualizar(Object entidade) {
		// TODO Auto-generated method stub
		
	}

}
