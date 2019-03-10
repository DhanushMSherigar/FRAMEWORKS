package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
private String username;
private String userpassword;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public String execute()
{
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	System.out.println(getText("ABC"));
	
return "s";
}

}

