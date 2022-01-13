package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class MenuDAO {

	static java.sql.Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;

	static int menu_id, admin_id;
	static double price;
	static String name, desc;

//	Create Menu
	public static void createMenu(Menu bean) {
		name = bean.getName();
		desc = bean.getDesc();
		price = bean.getPrice();
		admin_id = bean.getAdmin_id();

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("INSERT INTO menu (name,description,price,admin_id) VALUES (?,?,?,?);");
			ps.setString(1, name);
			ps.setString(2, desc);
			ps.setDouble(3, price);
			ps.setInt(4, admin_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Get Menu
	public static Menu getMenuID(int menu_id) {
		Menu menu = new Menu();
		try {
			currentCon = ConnectionManager.getConnection();
			String sql = "SELECT * FROM menu WHERE menu_id=?";
			ps = currentCon.prepareStatement(sql);
			ps.setInt(1, menu_id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				menu.setName(rs.getString("name"));
				menu.setDesc(rs.getString("description"));
				menu.setPrice(rs.getDouble("price"));
				menu.setAdmin_id(rs.getInt("admin_id"));
				menu.setMenu_id(rs.getInt("menu_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return menu;
	}

//	Update Menu
	public static void updateMenu(Menu bean) {
		name = bean.getName();
		desc = bean.getDesc();
		price = bean.getPrice();
		admin_id = bean.getAdmin_id();
		menu_id = bean.getMenu_id();
		System.out.print(name +" "+ desc+" "+price+" "+menu_id+" "+admin_id);

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("UPDATE menu SET name=?,description=?,price=?,admin_id=? WHERE menu_id=?");
			ps.setString(1, name);
			ps.setString(2, desc);
			ps.setDouble(3, price);
			ps.setInt(4, admin_id);
			ps.setInt(5, menu_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Delete Menu
	public static void deleteMenu(int menu_id) {
		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("delete from menu where menu_id=?");
			ps.setInt(1, menu_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	List of menu
	public static List<Menu> getAll() {
		List<Menu> menuList = new ArrayList<Menu>();
		String sql = "SELECT * FROM menu;";
		Statement stmt = null;
		try {

			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				Menu bean= new Menu();

				bean.setName(rs.getString("name"));
				bean.setDesc(rs.getString("description"));
				bean.setPrice(rs.getDouble("price"));
				bean.setAdmin_id(rs.getInt("admin_id"));
				bean.setMenu_id(rs.getInt("menu_id"));
				menuList.add(bean);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return menuList;
	}
}
