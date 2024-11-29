package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnectionDB;
import model.Login;

public class DAOUserRepository {

	
	private Connection connection;
	
	public DAOUserRepository() {
		connection = SingleConnectionDB.getConnection();
	}

	
	//save user
	public void save(Login modelLogin) throws SQLException {
		
		
		String sql = "insert into user_login(login, pwd, name, email) values(?, ?, ?, ?);";
		
		PreparedStatement query = connection.prepareStatement(sql);
		query.setString(1, modelLogin.getLogin());
		query.setString(2, modelLogin.getPwd());
		query.setString(3, modelLogin.getUsername());
		query.setString(4, modelLogin.getEmail());
		
		query.execute();
		connection.commit();
	
	
	}
	
	
}
