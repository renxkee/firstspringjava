package spring.mvc.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.second.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
