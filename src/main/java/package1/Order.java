package package1;

public class Order {
	private int order_id;
	private double price;
	private String status;
	private String order_time;
	private String pickup_time;
	private String request;
	private String order_name;
	private int user_id;
	private int admin_id;
	private int menu_id;
	
	public int getOrder_id() {return order_id;}
	public double getPrice() {return price;}
	public String getStatus() {return status;}
	public String getOrder_time() {return order_time;}
	public String getPickup_time() {return pickup_time;}
	public String getRequest() {return request;}
	public String getOrder_name() {return order_name;}
	public int getUser_id() {return user_id;}
	public int getAdmin_id() {return admin_id;}
	public int getMenu_id() {return menu_id;}
	
	public void setOrder_id(int order_id) {this.order_id=order_id;}
	public void setPrice (double price) {this.price=price;}
	public void setStatus(String status) {this.status=status;}
	public void setOrder_time(String order_time) {this.order_time=order_time;}
	public void setPickup_time(String pickup_time) {this.pickup_time=pickup_time;}
	public void setRequest(String request) {this.request=request;}
	public void setOrder_name(String order_name) {this.order_name=order_name;}
	public void setUser_id(int user_id) {this.user_id=user_id;}
	public void setAdmin_id(int admin_id) {this.admin_id=admin_id;}
	public void setMenu_id(int menu_id) {this.menu_id=menu_id;}
}
