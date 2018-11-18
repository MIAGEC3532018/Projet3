package fr.emiage.agence.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.emiage.agence.dao.UserAppRepository;
import fr.emiage.agence.entity.User_App;

@Service
public class UserServiceImpl implements UserService {

		@Autowired
		private UserAppRepository userRepository;
		
		@Override
		public Iterable<User_App> listAllUsers() {
			return userRepository.findAll();
		}

		@Override
		public User_App  getUserById(Long id) {
			return userRepository.findById(id).get();
		}

		@Override
		public User_App saveUser(User_App product) {
			return userRepository.save(product);
		}

		@Override
		public void deleteUser(Long id) {
			userRepository.deleteById(id);
		}
	}