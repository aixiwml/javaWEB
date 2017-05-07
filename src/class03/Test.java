package class03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	private static Connection connection;
	public static void main(String[] args) {
		connection=DBUtil.getConnection();
		String sql="insert into t_users(user_name,password_md5,email) values(?,?,?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, "王梅李");
			prepareStatement.setString(2, "123456");
			prepareStatement.setString(3, "123456@qq.com");
			prepareStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
