package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.mysql.jdbc.Driver;

public class ConnectionPool {

	private List<Connection> connections;
	private final static int POOL_CAPACITY = 100;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/yelp";
	private String user = "root";
	private String password = "root";
	private static ConnectionPool singleInstance;
	private static Random randomInstance;
	private int CURRENT_POOL;

	// singleton design pattern implemented hence constructor is private.
	private ConnectionPool() {
		initialize();
	}

	private void initialize() {
		connections = new LinkedList<Connection>();
		randomInstance = new Random();
		for (int j = 0; j < POOL_CAPACITY; j++) {
			Connection localConnection = createConnection();
			if (localConnection != null) {
				connections.add(localConnection);
				CURRENT_POOL++;
			}
		}
	}

	public synchronized static ConnectionPool getInstance() {
		if (singleInstance == null)
			singleInstance = new ConnectionPool();
		return singleInstance;
	}

	private Connection createConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public synchronized void close(Connection con) {
		if (CURRENT_POOL == POOL_CAPACITY) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else { // If pool capacity is not equal to current pool create new
					// pool.
			connections.add(con);
			CURRENT_POOL++;
		}
	}

	public synchronized Connection getConnectionPool() {
		Connection localConnection = null;
		if (CURRENT_POOL != 0) {
			// If current pool is zero get connetion
			int counter = randomInstance.nextInt(CURRENT_POOL);
			localConnection = connections.remove(counter);
			CURRENT_POOL--;
		} else { // New connection is created if current pool is zero
			localConnection = createConnection();
			if (localConnection == null)
				getConnectionPool();
		}
		return localConnection;
	}



}