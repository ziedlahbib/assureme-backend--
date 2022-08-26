package tn.esprit.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.IUserservice;

@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserservice userServ;
	@PostMapping("/inscription")
	@ResponseBody
	public void addUser(@RequestBody User u) {
		userServ.inscription(u);

	}
	

	@PutMapping("/update-utilisateur/{id-user}")
	@ResponseBody
	public void affecterutilisateur(@RequestBody User u,@PathVariable("id-user") Long iduser) {
		userServ.updateUser(u, iduser);

	}
	@DeleteMapping("/delete-user/{id-user}")
	@ResponseBody
	public void deletetrip(@PathVariable("id-user") Long iduser) {
		userServ.deleteUser(iduser);

	}
	@GetMapping("/get-user/{id-user}")
	@ResponseBody
	public User gettripbyid(@PathVariable("id-user") Long iduser) {
		return userServ.affichDetailUser(iduser);

	}
	@GetMapping("/get-users")
	@ResponseBody
	public List<User> gettrips() {
		return userServ.affichUser();

	}

}