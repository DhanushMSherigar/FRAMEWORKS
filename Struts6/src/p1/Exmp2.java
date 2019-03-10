package p1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp2 implements Interceptor,StrutsStatics {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception
	{
		ActionContext ac=ai.getInvocationContext();
		HttpServletRequest request=(HttpServletRequest)ac.get(HTTP_REQUEST);
		request.setAttribute("val2", 20);
		String temp=ai.invoke();
		
			return temp;
		
	}

}
