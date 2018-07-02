package model.dao;

import java.util.List;

import model.javabean.Escola;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EscolaDAO implements DAO{

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
	public List<Escola> listarTodos() {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		List<Escola> escolas = new ArrayList<Escola>();
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM escola;";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				escolas.add(new Escola(rs.getString("nome"), rs.getString("id_escola")));
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
		return escolas;
	}

}
