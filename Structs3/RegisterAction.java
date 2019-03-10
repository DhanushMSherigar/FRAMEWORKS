package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
	private String username;
	private String userpassword;
	private String confirmpassword;
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getUsername() {
		return username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public String getConfirmpassword() {
		return confirmpassword;
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
		if(confirmpassword.length()==0)
		{
			addFieldError("confirmpassword", "confirm Password Cant Be Empty");
		}
		
		if(userpassword.equals(confirmpassword)==false)
		{
			addFieldError("userpassword","password are not matching");
		}
			
	}
	
	public String execute()
	{
		return "s";
	}
	
}
