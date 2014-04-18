package edu.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogin extends ActionSupport {
	@Override
	public String execute() throws Exception {
		String mail = getMail();
		String password = getPassword();
		if(userLogin(mail,password))
			return SUCCESS;
		else
			return INPUT;
	}
	
	private boolean userLogin(String mail, String password) {
		if(mail.equals("well")&&password.equals("1234"))
			return true;
		else
			return false;
	}

	private String mail;
	private String password;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
