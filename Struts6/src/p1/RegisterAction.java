package p1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class RegisterAction implements ServletRequestAware {
	private String username;
	private String userpassword;
	HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest request)
	{
this.request=request;
	}


	
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
int val1=(int)request.getAttribute("val1");
int val2=(int)request.getAttribute("val2");
	System.out.println(val1+" "+val2);
	return "s";
}
}
