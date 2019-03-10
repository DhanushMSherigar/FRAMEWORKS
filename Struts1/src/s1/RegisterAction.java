package s1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
	private String username;
	private String usercity;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	
	public void validate()
	{
		if(username.length()==0)
		{
			addFieldError("username", "User Name Cant Be Empty");
		}
		if(usercity.length()==0)
		{
			addFieldError("usercity", "User City Cant Be Empty");
		}
	}
	
	public String execute()
	{
		return "s";
	}
	
	
}
