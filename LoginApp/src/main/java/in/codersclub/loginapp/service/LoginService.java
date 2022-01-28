package in.codersclub.loginapp.service;

import java.util.HashMap;

import in.codersclub.loginapp.gto.User;

public class LoginService 
{
	HashMap<String,String> hash = new HashMap<String,String>();
	public LoginService()
	{
		hash.put("nish","NISHANTH");
		hash.put("hema","HEMA K");
		hash.put("prakash","PRAKASH R");
	}
	
	public boolean getAuthentication(String password)
	{
		if(password == null ||password.trim()=="")
		{
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userid)
	{
		User user = new User();
		user.setUserid(userid);
		if(hash.get(userid)!=null)
		{
			user.setUsername(hash.get(userid));
		}
		else
		{
			user.setUsername("NEW USER");
		}
		return user;
	}
}
