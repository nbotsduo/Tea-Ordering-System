package package1;

public class User {
	private int user_id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String birthdate;
	private boolean valid;
	
	public int getUser_id() {return user_id;}
	public String getName() {return name;}
	public String getUsername() {return username;} 
	public String getPassword() {return password;}
	public String getEmail() {return email;}
	public String getBirthdate() {return birthdate;}
	public boolean isValid() {return valid;}
	
	public void setUser_id(int user_id) {this.user_id=user_id;}
	public void setName(String name) {this.name=name;}
	public void setUsername(String username) {this.username=username;}
	public void setPassword(String password) {this.password=password;}
	public void setEmail(String email) {this.email=email;}
	public void setBirthdate(String birthdate) {this.birthdate=birthdate;}
	public void setValid(boolean valid) {this.valid=valid;}
}
