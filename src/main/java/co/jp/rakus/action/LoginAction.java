package co.jp.rakus.action;

import org.seasar.struts.annotation.Execute;

public class LoginAction {

	@Execute(validator = false)
	public String index() {
        return "index.jsp";
	}
}
