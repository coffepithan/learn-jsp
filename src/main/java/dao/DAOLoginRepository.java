package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnectionDB;
import model.Login;

public class DAOLoginRepository {

	private Connection conn;
	
	public DAOLoginRepository() {

		conn = SingleConnectionDB.getConnection();
	
	}
	
	
	//verify if received login and password exists in db
	public boolean AuthLogin(Login login) throws Exception {
		
		String sql = "select * from user_login where upper(login)= upper(?) and pwd = ?";
		
		PreparedStatement state = conn.prepareStatement(sql);
		state.setString(1, login.getLogin());
		state.setString(2, login.getPwd());
		
		ResultSet result = state.executeQuery();
		
		if(result.next()) return true;
		
		return false;
		
	}
	
	
	
}
