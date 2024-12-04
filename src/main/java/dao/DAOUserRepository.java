package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.SingleConnectionDB;
import model.Login;

public class DAOUserRepository {

	
	private Connection connection;
	
	public DAOUserRepository() {
		connection = SingleConnectionDB.getConnection();
	}

	
	//save user
	public Login save(Login modelLogin) throws Exception {
		
		if(modelLogin.isNew()) {
			String sql = "insert into user_login(login, pwd, name, email) values(?, ?, ?, ?);";
			
			PreparedStatement query = connection.prepareStatement(sql);
			query.setString(1, modelLogin.getLogin());
			query.setString(2, modelLogin.getPwd());
			query.setString(3, modelLogin.getUsername());
			query.setString(4, modelLogin.getEmail());
			
			query.execute();
			connection.commit();
		
			return this.getUser(modelLogin.getLogin());
		}
		
		return update(modelLogin);
	}
	
	public Login update(Login modelLogin) throws Exception {
		

		String sql = "update user_login set login=?, pwd=?, name=?, email=? where id='"+modelLogin.getId()+"';";
		
		PreparedStatement query = connection.prepareStatement(sql);
		query.setString(1, modelLogin.getLogin());
		query.setString(2, modelLogin.getPwd());
		query.setString(3, modelLogin.getUsername());
		query.setString(4, modelLogin.getEmail());
		
		query.executeUpdate();
		connection.commit();
		return this.getUser(modelLogin.getLogin());

		
	}
	
	//search for user by login
	public Login getUser(String userLogin) throws SQLException {
		
		Login user = new Login();
		
		String sql = "select * from user_login where login=?";
		
		PreparedStatement query = connection.prepareStatement(sql);
		query.setString(1, userLogin);
		ResultSet result = query.executeQuery();
		
		while(result.next()) {
			
			user.setLogin(result.getString(1));
			user.setPwd(result.getString(2));
			user.setId(result.getLong(3));
			user.setUsername(result.getString(4));
			user.setEmail(result.getString(5));
			
		}
		
		return user;
		
	}
	
	public boolean isValid(String login) throws Exception{
		
		String sql = "select count(1) > 0 as exist from user_login where upper(login) = upper('"+login+"')";
		
		PreparedStatement query = connection.prepareStatement(sql);
		
		ResultSet result = query.executeQuery();
		
		if(result.next()) {
			return result.getBoolean("exist");
		}
		
		return false;
	}
	
}
