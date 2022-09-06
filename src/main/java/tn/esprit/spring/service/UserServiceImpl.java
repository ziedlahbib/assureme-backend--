package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.FileDB;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.FileDBRepository;
import tn.esprit.spring.repository.UserRepository;
@Service
public class UserServiceImpl implements IUserservice {
	@Autowired
	UserRepository userRepo;
	@Autowired
	FileDBRepository fileRepo;

	@Override
	public User inscription(User user) {
		 return userRepo.save(user);
	}

	@Override
	public User updateUser(User user, Long idUser) {
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
		return userRepo.save(u);
		
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
	@Override
	public User findbyusername(String username) {
		return userRepo.findByUserName(username);
	}

	@Override
	public User affcterfileauuser(Long iduser,Long idfile) {
		// TODO Auto-generated method stub
		User u = userRepo.findById(iduser).orElse(null);
		FileDB f = fileRepo.findById(idfile).orElse(null);
		f.getUser().add(u);
		fileRepo.save(f);
		return u;
	}

}
