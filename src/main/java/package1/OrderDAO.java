package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OrderDAO {
	static java.sql.Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;

	static int order_id, user_id, admin_id, menu_id;
	static String status, order_time, pickup_time, request,order_name;
	static double price;

//	Create order
	public static void createOrder(Order bean) {
		user_id = bean.getUser_id();
		admin_id = bean.getAdmin_id();
		menu_id = bean.getMenu_id();
		status = bean.getStatus();
		order_time = bean.getOrder_time();
		pickup_time = bean.getPickup_time();
		request = bean.getRequest();
		price = bean.getPrice();
		order_name=bean.getOrder_name();
		
		System.out.print(user_id+" "+admin_id+" "+menu_id+" "+status+" "+order_time+" "+pickup_time+" "+request+" "+price);

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("INSERT INTO order_menu (tot_price,status,order_time,pickup_time,additional_request,user_id,admin_id,menu_id,order_name) VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setDouble(1, price);
			ps.setString(2, status);
			ps.setString(3, order_time);
			ps.setString(4, pickup_time);
			ps.setString(5, request);
			ps.setInt(6, user_id);
			ps.setInt(7, admin_id);
			ps.setInt(8, menu_id);
			ps.setString(9, order_name);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Get Order
	public static Order getOrder(int order_id) {
		Order od = new Order();
		try {
			currentCon = ConnectionManager.getConnection();
			String sql = "SELECT * FROM order_menu WHERE order_id=?";
			ps = currentCon.prepareStatement(sql);
			ps.setInt(1, order_id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				od.setAdmin_id(rs.getInt("admin_id"));
				od.setMenu_id(rs.getInt("menu_id"));
				od.setOrder_time(rs.getString("order_time"));
				od.setPickup_time(rs.getString("pickup_time"));
				od.setPrice(rs.getDouble("tot_price"));
				od.setRequest(rs.getString("additional_request"));
				od.setStatus(rs.getString("status"));
				od.setUser_id(rs.getInt("user_id"));
				od.setOrder_id(rs.getInt("order_id"));
				od.setOrder_name(rs.getString("order_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return od;
	}

//	Update Order
	public static void updateOrder(Order bean) {

		order_id = bean.getOrder_id();
		user_id = bean.getUser_id();
		admin_id = bean.getAdmin_id();
		menu_id = bean.getMenu_id();
		status = bean.getStatus();
		order_time = bean.getOrder_time();
		pickup_time = bean.getPickup_time();
		request = bean.getRequest();
		price = bean.getPrice();
		order_name=bean.getOrder_name();

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement(
					"UPDATE order_menu SET tot_price=?,status=?,order_time=?,pickup_time=?,additional_request=?,user_id=?,admin_id=?,menu_id=?,order_name=? WHERE order_id=?");
			ps.setDouble(1, price);
			ps.setString(2, status);
			ps.setString(3, order_time);
			ps.setString(4, pickup_time);
			ps.setString(5, request);
			ps.setInt(6, user_id);
			ps.setInt(7, admin_id);
			ps.setInt(8, menu_id);
			ps.setString(9, order_name);
			ps.setInt(10, order_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	Update order status
	public static void updateOrderStatus(Order bean) {

		order_id = bean.getOrder_id();
		admin_id = bean.getAdmin_id();
		status = bean.getStatus();

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement(
					"UPDATE order_menu SET admin_id=?,status=? WHERE order_id=?");
			
			ps.setString(2, status);
			ps.setInt(1, admin_id);
			ps.setInt(3, order_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Delete order
	public static void deleteOrder(int order_id) {

		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("delete from order_menu where order_id=?");
			ps.setInt(1, order_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	List Order
	public static List<Order> getAll(){
		List<Order> or = new ArrayList<Order>();
		
		String sql = "select * from order_menu";
		Statement stmt = null;
		
		try {
			
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				Order od = new Order();
                
				od.setAdmin_id(rs.getInt("admin_id"));
				od.setMenu_id(rs.getInt("menu_id"));
				od.setOrder_time(rs.getString("order_time"));
				od.setPickup_time(rs.getString("pickup_time"));
				od.setPrice(rs.getDouble("tot_price"));
				od.setRequest(rs.getString("additional_request"));
				od.setStatus(rs.getString("status"));
				od.setUser_id(rs.getInt("user_id"));
				od.setOrder_id(rs.getInt("order_id"));
				od.setOrder_name(rs.getString("order_name"));
				or.add(od);
			}
		}	catch(Exception ex) {
			System.out.println(ex);
		} 
		
		return or;
	}
	
//	List order for selected user
	public static List<Order> getUserAll(int user_id){
		List<Order> or = new ArrayList<Order>();
		
		String sql = "select * from order_menu WHERE user_id="+user_id;
		Statement stmt = null;
		
		try {
			
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				Order od = new Order();
                
				od.setAdmin_id(rs.getInt("admin_id"));
				od.setMenu_id(rs.getInt("menu_id"));
				od.setOrder_time(rs.getString("order_time"));
				od.setPickup_time(rs.getString("pickup_time"));
				od.setPrice(rs.getDouble("tot_price"));
				od.setRequest(rs.getString("additional_request"));
				od.setStatus(rs.getString("status"));
				od.setUser_id(rs.getInt("user_id"));
				od.setOrder_id(rs.getInt("order_id"));
				od.setOrder_name(rs.getString("order_name"));
				or.add(od);
			}
		}	catch(Exception ex) {
			System.out.println(ex);
		} 
		
		return or;
	}
}
