package tn.esprit.spring.service;



import java.util.List;


import tn.esprit.spring.entity.User;

public interface IUserservice {
	public void inscription(User user);
	public void updateUser(User user, Long idUser);
	public void deleteUser(Long idUser);
	public User affichDetailUser(Long idUser);
	public List<User> affichUser();

}
