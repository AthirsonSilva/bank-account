package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
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
			String sql = "INSERT INTO Cliente(name, cpf, email)";
		} finally {
			conn.close();
		}
	}
}
