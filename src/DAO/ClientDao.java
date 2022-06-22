package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.Client;

public class ClientDao {
	private Connection conn;
	public ClientDao() {
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public void register(Client client) throws SQLException {
		try {
			String sql = "INSERT INTO Cliente(name, cpf, email)"
						+ "VALUES (?, ?, ?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, client.getClientName());
			stmt.setString(1, client.getClientCpf());
			stmt.setString(1, client.getClientEmail());
			
			stmt.execute();
			stmt.close();
		} finally {
			conn.close();
		}
	}
}
