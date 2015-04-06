package spring.mvc.second.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.second.entity.Blog;
import spring.mvc.second.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByUser(User user);
}
