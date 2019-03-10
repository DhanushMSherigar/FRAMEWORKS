package p1;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport
{
	private String username;
	private String userpassword;
	
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void validate()
	{
		if(username.length()==0)
		{
			addFieldError("username", "User Name Cant Be Empty");
		}
		if(userpassword.length()==0)
		{
			addFieldError("userpassword", "User Password Cant Be Empty");
		}
	}
	
	public String execute()
	{
		return "s";
	}
	

}
