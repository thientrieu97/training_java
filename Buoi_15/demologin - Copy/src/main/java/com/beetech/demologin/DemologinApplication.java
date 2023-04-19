package com.beetech.demologin;

import com.beetech.demologin.entity.AccountEntity;
import com.beetech.demologin.entity.enums.Role;
import com.beetech.demologin.repository.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
@SpringBootApplication
public class DemologinApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemologinApplication.class, args);

//		AccountEntity account = new AccountEntity();
//		PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
//		AccountRepository accountRepository = context.getBean(AccountRepository.class);
//		account.setUsername("trieu");
//		account.setPassword(passwordEncoder.encode("123456"));
//		account.setEmail("trieu@gmail.com");
//		account.setVerify(true);
//		account.setBlocked(false);
//		account.setRole(Role.ADMIN);
//		accountRepository.save(account);

	}


}
