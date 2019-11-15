package security.controller;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import network.Urls;
import security.entity.User;

public class UserController {
	
	private Urls urls = new Urls();
	private String baseUrl = urls.getBaseURL();
	
	private UserController userController = new UserController();
	
	private Client client = ClientBuilder.newClient();
	
	private WebTarget webTarget = client.target(baseUrl);
	
	public ArrayList<User> getUsers() {
		
		WebTarget userTarget = webTarget.path("/user");
		
		return null;
		
		
	}
	
	
	
	
}
