package fr.emiage.agence.service;

import fr.emiage.agence.entity.User_App;

public interface UserService {
	public Iterable<User_App> listAllUsers();
	public User_App getUserById(Long id);
	public User_App saveUser(User_App product) ;
	public void deleteUser(Long id);
	
}
