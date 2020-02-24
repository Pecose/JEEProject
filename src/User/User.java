package User;

public class User{
	private String name;
	private String mail;
	private String password;

	public User(String name, String mail, String password){
		this.name = name;
		this.mail = mail;
		this.password = password;
	}

	public String getName(){
		return this.name;
	}

	public String getMail(){
		return this.mail;
	}

	public String getPassword(){
		return this.password;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setMail(String mail){
		this.mail = mail;
	}

	public void setPassword(String password){
		this.password = password;
	}

}
