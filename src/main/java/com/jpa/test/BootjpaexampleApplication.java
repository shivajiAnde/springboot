package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Model.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("angada");
//		user.setCity("parvata");
//		user.setStatus("he is a son of sugreeva");
//		
//		User user2=new User();
//		user2.setName("shivaji");
//		user2.setCity("kadapa");
//		user2.setStatus("right now small developer");
//		
//		User user3=new User();
//		user3.setName("hari mama");
//		user3.setCity("rajampeta");
//		user3.setStatus("right now simple developer");
//		
//		List<User> users = List.of(user2,user3);
//		userRepository.saveAll(users);
//		users.forEach(i->{
//			System.out.println(i);
//		});
		
		//finding a single object
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		System.out.println(user);
		
		//all objects in the given table 
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user->{
//			System.out.println(user);
//		});
		
		//we get objects which we decided by ids
//		List<Integer> ids = List.of(1,2,52);
//		Iterable<User> alluser = userRepository.findAllById(ids);
//		alluser.forEach(i->{
//			System.out.println(i);
//		});
		
		//updating object
//		Optional<User> optional = userRepository.findById(54);
//		User user = optional.get();
//		user.setCity("ram surroundings");
//		userRepository.save(user);
//		System.out.println(user);
		
		//deleting using id single object
//		userRepository.deleteById(52);
//		System.out.println("deleted");
		
		//deleting using delete(entity)
//		Optional<User> optional = userRepository.findById(53);
//		User user = optional.get();
//		userRepository.delete(user);
//		System.out.println("deleted using delete(entity)");
		
		//deleting multiple objects using delete(entities)
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		Optional<User> optional2 = userRepository.findById(54);
//		User user2 = optional2.get();
//		List<User> entities = List.of(user,user2);
//		userRepository.deleteAll(entities);
//		System.out.println("deleted using deleteAll(entities)");
		
		List<User> users = userRepository.findByName("shivaji");
		users.forEach(user->System.out.println(user));
		System.out.println("*************************************");
//		List<User> list = userRepository.findByNameAndCity("hari mama","rajampeta");
//		list.forEach(user->System.out.println(user));
//		System.out.println("*************************************");
//		List<User> list2 = userRepository.findByNameStartingWith("s");
//		list2.forEach(user->System.out.println(user));
//		System.out.println("*************************************");
//		
//		
//		List<User> list3 = userRepository.findByNameStartingWith("s");
//		list3.forEach(user->System.out.println(user));
//		
//		System.out.println("*************************************");
//		
//		List<User> list4 = userRepository.findByCityStartingWith("a");
//		list4.forEach(user->System.out.println(user));
//		System.out.println("*************************************");
//		
//		List<User> list5 = userRepository.findByNameContaining("hi");
//		list5.forEach(user->System.out.println(user));
//		System.out.println("*************************************");
		
//		List<User> list6 = userRepository.findByNameLike("%i");
//		list6.forEach(user->System.out.println(user));
//		System.out.println("*************************************");
		
		List<User> allUsers = userRepository.getAllUsers();
		allUsers.forEach(user->System.out.println(user));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		List<User> list = userRepository.getUserByNameAndCity("adivi","nallamalla");
		list.forEach(user->System.out.println(user));
		System.out.println("-----------------------------------------");
		List<User> users2 = userRepository.getUsers();
		users2.forEach(user->System.out.println(user));
		
		
		
		
		
		
	}

}
