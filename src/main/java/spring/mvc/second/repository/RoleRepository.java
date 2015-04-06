package spring.mvc.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.second.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
