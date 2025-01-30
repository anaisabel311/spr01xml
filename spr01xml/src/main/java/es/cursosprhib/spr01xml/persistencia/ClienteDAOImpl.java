package es.cursosprhib.spr01xml.persistencia;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class ClienteDAOImpl implements ClienteDAO{
	
	private DataSource ds; // para la conexión con la bbdd
	
//Constructor	
	public ClienteDAOImpl (DataSource ds) {
		this.ds = ds;	
	}
	
	/*
	 * public ClienteDAOImpl () {
	 * 
	 * BasicDataSource bds = new BasicDataSource(); Properties pro = new
	 * Properties();
	 * 
	 * try { FileReader fr = new FileReader ("src/main/resources/app.properties");
	 * pro.load(fr);
	 * 
	 * } catch (IOException e) { e.printStackTrace(); }
	 * bds.setUrl(pro.getProperty("bbdd.url"));
	 * bds.setDriverClassName(pro.getProperty("bbdd.driver"));
	 * bds.setUsername(pro.getProperty("bbdd.user"));
	 * bds.setPassword(pro.getProperty("bbdd.password"));
	 * 
	 * ds = bds;
	 * 
	 * } TODO ESTE MÉTODO ESTÁ INJECTADO Y CONFIGURADO EN a03applicationContext, LO CONFIGURA SPRING
	 */

	@Override
	public void consulta() {
		String sql = "select * from personas";
		try (Connection con = ds.getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("apellidos"));
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
