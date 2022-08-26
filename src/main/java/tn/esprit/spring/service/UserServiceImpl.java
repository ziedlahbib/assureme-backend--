package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;

import tn.esprit.spring.repository.UserRepository;
@Service
public class UserServiceImpl implements IUserservice {
	@Autowired
	UserRepository userRepo;

	@Override
	public void inscription(User user) {
		userRepo.save(user);
	}

	@Override
	public void updateUser(User user, Long idUser) {
		User u = userRepo.findById(idUser).orElse(null);
		u.setAddress(user.getAddress());
		u.setBirthday(user.getBirthday());
		u.setCity(user.getCity());
		u.setCode_postale(user.getCode_postale());
		u.setDate_obtention_permis(user.getDate_obtention_permis());
		u.setEmail(user.getEmail());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setGender(user.getGender());
		u.setProfession(user.getProfession());
		u.setSit_matr(user.getSit_matr());
		u.setTel(user.getTel());
		userRepo.save(u);
		
	}

	@Override
	public void deleteUser(Long idUser) {

		userRepo.deleteById(idUser);;
		
	}

	@Override
	public User affichDetailUser(Long idUser) {
		// TODO Auto-generated method stub
		return userRepo.findById(idUser).orElse(null);
	}

	@Override
	public List<User> affichUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
