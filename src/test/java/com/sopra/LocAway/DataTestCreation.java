package com.sopra.LocAway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sopra.LocAway.model.User;
import com.sopra.LocAway.repository.IUserRepository;

@SpringBootTest
class DataTestCreation {

	@Autowired
	private IUserRepository userRepo;
	
	@Test
	void run() {
		
		
		
		User u =new User();
		u.setAdmin(false);
		u.setEmail("gmail@gmail.com");
		u.setPassword("motdepasse");
		u.setPhoneNumber("0560606060");
		u.setFirstName("Steve");
		u.setLastName("Jobs");
		
		User u1 = new User();
		u1.setAdmin(true);
		u1.setEmail("yaou@yahoo.com");
		u1.setPassword("topsecret");
		u1.setPhoneNumber("0567891234");
		u1.setFirstName("Super");
		u1.setLastName("Admin");		

		User u2 = new User();
		u.setAdmin(true);
		u.setEmail("yaou@yahoo.com");
		u.setPassword("topsecret");
		u.setPhoneNumber("0567891234");
		u.setFirstName("Super");
		u.setLastName("Admin");		
		
	}

}
