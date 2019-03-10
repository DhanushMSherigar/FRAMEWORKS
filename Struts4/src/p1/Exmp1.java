package p1;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp1 implements Interceptor ,StrutsStatics{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception
	{
Object o=ai.getAction();
String username=((RegisterAction) o).getUsername();
String userpassword=((RegisterAction) o).getUserpassword();
ActionContext ac=ai.getInvocationContext();
HttpServletResponse y=(HttpServletResponse)ac.get(HTTP_RESPONSE);
if(username.length()==0||userpassword.length()==0)
{
	y.sendRedirect("/Struts4/RegisterActionError.jsp");
}
String temp=ai.invoke();


return temp;
	}
}

