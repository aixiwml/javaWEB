package class03;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
