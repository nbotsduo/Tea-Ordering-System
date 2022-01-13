package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	static java.sql.Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;

	static int user_id;
	static String name, username, password, email, birthdate;

//	method for login
	public static User login(User bean) {
		username = bean.getUsername();
		password = bean.getPassword();

		String sql = "select * from user where username='" + username + "'AND password='" + password + "'";
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(sql);
			boolean more = rs.next();
//			 if user exist, isValid variable returns true
			if (more) {
				String username = rs.getString("username");
				bean.setUser_id(rs.getInt("user_id"));
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

//	Register new User
	public static void registerUser(User bean) {
		name = bean.getName();
		username = bean.getUsername();
		password = bean.getPassword();
		email = bean.getEmail();
		birthdate = bean.getBirthdate();

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon
					.prepareStatement("INSERT INTO user (name,username,password,email,birthdate) VALUES (?,?,?,?,?);");
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setString(5, birthdate);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
//	Get user
	public static User getUser(int user_id) {
		User us = new User();
		try {
			currentCon = ConnectionManager.getConnection();
			String sql = "SELECT * FROM user WHERE user_id=?";
			ps = currentCon.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				us.setName(rs.getString("name"));
				us.setUsername(rs.getString("username"));
				us.setPassword(rs.getString("password"));
				us.setEmail(rs.getString("email"));
				us.setBirthdate(rs.getString("birthdate"));
				us.setUser_id(rs.getInt("user_id"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}

//	Update user
	public static void updateUser(User bean) {
		name = bean.getName();
		username = bean.getUsername();
		password = bean.getPassword();
		email = bean.getEmail();
		birthdate = bean.getBirthdate();
		user_id = bean.getUser_id();

		System.out.print(name+" "+username+" "+password+" "+email+" "+birthdate+" "+user_id);
		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement(
					"UPDATE user SET name=?,username=?,password=?,email=?,birthdate=? WHERE user_id=?;");
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setString(5, birthdate);
			ps.setInt(6, user_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

//	Delete user
	public static void deleteUser(int user_id) {

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("delete from user where user_id=?");
			ps.setInt(1, user_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
