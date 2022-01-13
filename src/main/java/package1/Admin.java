package package1;

public class Admin {
	private int admin_id;
	private String name;
	private String username;
	private String password;
	private boolean valid;
	
	public int getAdmin_id() {return admin_id;}
	public String getName() {return name;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}
	public boolean isValid() {return valid;}
	
	public void setAdmin_id(int admin_id) {this.admin_id=admin_id;}
	public void setName(String name) {this.name=name;}
	public void setUsername(String username) {this.username=username;}
	public void setPassword(String password) {this.password=password;}
	public void setValid(boolean valid) {this.valid=valid;}
	
}
