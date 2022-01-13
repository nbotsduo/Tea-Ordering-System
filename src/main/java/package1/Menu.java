package package1;

public class Menu {
	private int menu_id;
	private String name;
	private String desc;
	private double price;
	private int admin_id;
	
	public int getMenu_id() {return menu_id;}
	public String getName() {return name;}
	public String getDesc() {return desc;}
	public double getPrice() {return price;}
	public int getAdmin_id() {return admin_id;}
	
	public void setMenu_id(int menu_id) {this.menu_id=menu_id;}
	public void setName(String name) {this.name=name;}
	public void setDesc(String desc) {this.desc=desc;}
	public void setPrice(double price) {this.price=price;}
	public void setAdmin_id(int admin_id) {this.admin_id=admin_id;}
}
