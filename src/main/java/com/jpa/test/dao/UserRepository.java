package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.Model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	public List<User> findByNameStartingWith(String prefix);
	
	public List<User> findByCityStartingWith(String prefix);
	
	public List<User> findByCityEndingWith(String suffix);
	
	public List<User> findByNameLike(String urlpattern);
	
	public List<User> findByNameContaining(String name);
	
	//JPQL	
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	@Query("select u from User u where u.name=:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);
	
	//native query
	@Query(value="select * from user",nativeQuery = true)
	public List<User> getUsers();
	
	
	
}

