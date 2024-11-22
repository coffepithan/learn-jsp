package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionDB {
 
	private static String url = "jdbc:postgresql://localhost:5432/learn-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String pwd = "root";

	private static Connection conn = null;
	
	static {
		connect();
	}
	
	public static Connection getConnection() {

		return conn;
	
	}
	
	private static void connect() {
		
		try {
			if(conn == null) {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, user, pwd);
				conn.setAutoCommit(false);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
