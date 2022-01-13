package package1;

import java.sql.*;


public class AdminDAO {
	static java.sql.Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static String name, username, password;
	static int admin_id;

//	method for login
	public static Admin login(Admin bean) {
		username = bean.getUsername();
		password = bean.getPassword();

		String sql = "select * from admin where username='" + username + "'AND password='" + password + "'";
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(sql);
			boolean more = rs.next();
//			 if user exist, isValid variable returns true
			if (more) {
				String username = rs.getString("username");
				bean.setAdmin_id(rs.getInt("admin_id"));
				bean.setUsername(username);
				bean.setValid(true);
			}
			// if user does not exist set the isValid variable to false
			else if (!more) {
				bean.setValid(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	

}
